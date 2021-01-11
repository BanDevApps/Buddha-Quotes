/**

Buddha Quotes
Copyright (C) 2021  BanDev

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <https://www.gnu.org/licenses/>.

 */

package org.bandev.buddhaquotes.fragments

import android.content.Intent
import android.os.Bundle
import android.view.HapticFeedbackConstants
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import com.maxkeppeler.sheets.options.DisplayMode
import com.maxkeppeler.sheets.options.Option
import com.maxkeppeler.sheets.options.OptionsSheet
import org.bandev.buddhaquotes.R
import org.bandev.buddhaquotes.core.Colours
import org.bandev.buddhaquotes.core.Lists
import org.bandev.buddhaquotes.core.Quotes
import org.bandev.buddhaquotes.core.Store
import org.bandev.buddhaquotes.custom.OnDoubleClickListener
import org.bandev.buddhaquotes.databinding.FragmentQuoteBinding

/**
 * QuoteFragment shows quotes to the user with refresh, like & share buttons.
 * It is the first item in the [FragmentAdapter] on MainActivity
 * @author jack.txt
 * @since 1.7.0
 * @updated 09/12/2020
 */

class QuoteFragment : Fragment() {

    private var _binding: FragmentQuoteBinding? = null
    private val binding get() = _binding!!
    private var quotes = Quotes()
    private var liked = false
    private var options = mutableListOf<Option>()
    private var options_str = mutableListOf<String>()

    /**
     * Sets the correct view of the Fragment
     * @param inflater [LayoutInflater]
     * @param container [ViewGroup]
     * @param savedInstanceState [Bundle]
     * @return [View]
     */

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentQuoteBinding.inflate(inflater, container, false)
        return binding.root
    }

    /**
     * Called when view is full made
     * @param view [View]
     * @param savedInstanceState [Bundle]
     */

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        newQuote(Store(requireContext()).quoteID)
        with(binding.swipeRefresh) {
            setColorSchemeColors(Colours().getAccentColourAsInt(context))
            setOnRefreshListener { newQuote(0); binding.swipeRefresh.isRefreshing = false }
        }

        // Toggles the quote in favourites (If favourited, unfavourite. If unfavourited, favourite)
        binding.like.setOnClickListener {
            toggleFavouriteQuote()
        }


        // Shows the options bottom sheet
        binding.more.setOnClickListener {
            OptionsSheet().show(requireContext()) {
                displayMode(DisplayMode.LIST)
                title(R.string.more)
                with(
                    Option(R.drawable.ic_share, R.string.share),
                    Option(R.drawable.ic_add_circle, R.string.addToList)
                )
                onPositive { index: Int, option: Option ->
                    binding.root.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY)
                    if (index == 0) {
                        val sendIntent: Intent = Intent().apply {
                            action = Intent.ACTION_SEND
                            val text = binding.quote.text.toString() + R.string.attribution_buddha
                            putExtra(Intent.EXTRA_TEXT, text)
                            type = "text/plain"
                        }
                        val shareIntent = Intent.createChooser(sendIntent, null)
                        startActivity(shareIntent)
                    } else {
                        showSecondBottomSheet()
                    }
                }
            }
        }

        // Favourites the quote on double click
        binding.content.setOnClickListener(object : OnDoubleClickListener() {
            override fun onDoubleClick(v: View?) {
                doubleClickFavouriteQuote()
            }
        })
    }

    private fun showSecondBottomSheet() {
        updateOptionsList()
        OptionsSheet().show(requireContext()) {
            displayMode(DisplayMode.LIST)
            title(R.string.addToList)
            with(
                options
            )
            onPositive { index: Int, option: Option ->
                binding.root.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY)
                val quote = quotes.getQuote(Store(requireContext()).quoteID, requireContext())
                if (!Lists().queryInList(quote, options_str[index], requireContext())) {
                    Lists().addToList(quote, options_str[index], requireContext())
                    Snackbar.make(
                        binding.root,
                        getString(R.string.added) + " " + options_str[index],
                        Snackbar.LENGTH_LONG
                    )
                        .show()
                    if (options_str[index] == "Favourites") {
                        binding.like.setImageDrawable(
                            ContextCompat.getDrawable(
                                requireContext(),
                                R.drawable.heart_full_red
                            )
                        )
                    }
                } else {
                    Snackbar.make(
                        binding.root,
                        getString(R.string.exists) + " " + options_str[index],
                        Snackbar.LENGTH_LONG
                    )
                        .show()
                }

            }
        }
    }

    /**
     * Refreshes the quote on screen
     */

    private fun newQuote(quoteId: Int) {
        val quote = quotes.getQuote(quoteId, requireContext())
        binding.quote.text = quote
        binding.number.text = getString(R.string.quote_number) + " #" + quotes.quotenumberglobal
        Store(requireContext()).quoteID = quotes.quotenumberglobal
        val icon = if (Lists().queryInList(quote, "Favourites", context)) {
            liked = true
            R.drawable.heart_full_red
        } else {
            liked = false
            R.drawable.like
        }
        binding.like.setImageDrawable(
            ContextCompat.getDrawable(
                requireContext(),
                icon
            )
        )
    }

    /**
     * Adds the quote to "Favourites" list using [Lists.toggleInList]
     */

    private fun toggleFavouriteQuote() {
        val quote = binding.quote.text.toString()
        if (Lists().toggleInList(quote, "Favourites", requireContext())) {
            binding.like.setImageDrawable(
                ContextCompat.getDrawable(
                    requireContext(),
                    R.drawable.heart_full_red
                )
            )
            binding.likeAnimator.likeAnimation()
        } else {
            binding.like.setImageDrawable(
                ContextCompat.getDrawable(
                    requireContext(),
                    R.drawable.like
                )
            )
        }
    }

    /**
     * Adds the quote to favourites through double clicking using [Lists.queryInList] and [Lists.addToList]
     */

    internal fun doubleClickFavouriteQuote() {
        val quote = binding.quote.text.toString()
        if (!Lists().queryInList(quote, "Favourites", requireContext())) {
            Lists().addToList(quote, "Favourites", requireContext())
            binding.like.setImageDrawable(
                ContextCompat.getDrawable(
                    requireContext(),
                    R.drawable.heart_full_red
                )
            )
            binding.likeAnimator.likeAnimation()
        }
    }

    private fun updateOptionsList() {
        options.clear()
        options_str.clear()
        for (list in Lists().getMasterList(requireContext())) {
            val drawable = if (list == "Favourites") {
                R.drawable.ic_heart_octicons
            } else {
                R.drawable.ic_list_octicons
            }
            options.add(Option(drawable, list))
            options_str.add(list)
        }
    }

    companion object {

        /**
         * Called on new instance request
         * @param position [Int]
         * @return [QuoteFragment]
         */

        fun newInstance(position: Int): QuoteFragment {
            val instance = QuoteFragment()
            val args = Bundle()
            args.putInt("position", position)
            instance.arguments = args
            return instance
        }
    }
}