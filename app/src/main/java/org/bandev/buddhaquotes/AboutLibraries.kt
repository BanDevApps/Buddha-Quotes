package org.bandev.buddhaquotes

import android.content.pm.ActivityInfo
import android.os.Build
import android.os.Bundle
import android.text.Html
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mikepenz.aboutlibraries.Libs
import com.mikepenz.aboutlibraries.entity.Library
import org.bandev.buddhaquotes.core.Colours
import org.bandev.buddhaquotes.core.Compatibility
import org.bandev.buddhaquotes.core.Languages
import org.bandev.buddhaquotes.databinding.ActivityAboutLibrariesBinding
import org.bandev.buddhaquotes.databinding.LayoutItemLibraryBinding

class AboutLibraries : AppCompatActivity() {

    private lateinit var binding: ActivityAboutLibrariesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Colours().setAccentColor(this, window)
        Compatibility().setNavigationBar(this, window, resources)
        Languages().setLanguage(this)
        binding = ActivityAboutLibrariesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        val myToolbar = findViewById<View>(R.id.my_toolbar) as Toolbar
        setSupportActionBar(myToolbar)
        (supportActionBar ?: return).setDisplayShowTitleEnabled(false)
        (supportActionBar ?: return).setDisplayHomeAsUpEnabled(true)
        (supportActionBar ?: return).setHomeAsUpIndicator(R.drawable.ic_arrow_back)

        with(binding.recyclerView) {
            layoutManager = LinearLayoutManager(context)
            adapter = LibraryAdapter(Libs(context).libraries)
        }
    }

    class LibraryAdapter(private val itemList: List<Library>) :
        RecyclerView.Adapter<LibraryAdapter.LibraryViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LibraryViewHolder {
            val rowView: View = LayoutInflater.from(parent.context).inflate(
                R.layout.layout_item_library,
                parent, false
            )
            return LibraryViewHolder(rowView)
        }

        override fun onBindViewHolder(holder: LibraryViewHolder, position: Int) {
            holder.onBind(itemList[position])
        }

        override fun getItemCount(): Int = itemList.size

        class LibraryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

            private val binding = LayoutItemLibraryBinding.bind(itemView)

            fun onBind(library: Library) {

                binding.nameTextView.text = library.libraryName
                binding.versionTextView.text = library.libraryVersion

                if (library.author.isNotEmpty()) {
                    binding.authorTextView.text = library.author
                } else {
                    binding.authorTextView.visibility = View.GONE
                }

                val license = library.licenses?.firstOrNull()
                if (license != null) {
                    binding.licenseNameTextView.text = license.licenseName
                    binding.licenseDescriptionTextView.text =
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                            Html.fromHtml(
                                license.licenseShortDescription,
                                Html.FROM_HTML_MODE_COMPACT
                            )
                        } else {
                            @Suppress("DEPRECATION")
                            Html.fromHtml(license.licenseShortDescription)
                        }
                } else {
                    binding.licenseNameTextView.visibility = View.GONE
                    binding.licenseDescriptionTextView.visibility = View.GONE
                }
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}