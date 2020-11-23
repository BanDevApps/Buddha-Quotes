package org.bandev.buddhaquotes

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat
import androidx.core.view.updatePadding
import androidx.preference.ListPreference
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.PreferenceManager
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.color.colorChooser
import org.bandev.buddhaquotes.core.Colours
import org.bandev.buddhaquotes.core.Compatibility
import org.bandev.buddhaquotes.core.Languages

class Settings : AppCompatActivity() {

    private var quotenumber: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Colours().setAccentColor(this, window)
        Compatibility().setNavigationBarColour(this, window, resources)
        Languages().setLanguage(this)
        setContentView(R.layout.activity_settings)

        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        if ((intent.extras ?: return).getBoolean("lang")) {
            this.overridePendingTransition(0, 0)
        }

        if ((intent.extras ?: return).getBoolean("switch")) {
            val sharedPreferences = getSharedPreferences("Settings", 0)
            val darkmode = sharedPreferences.getBoolean("dark_mode", false)
            val sys = sharedPreferences.getBoolean("sys", true)
            when {
                sys -> {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
                    overridePendingTransition(
                        R.anim.fade_out,
                        R.anim.fade_in
                    )
                }
                darkmode -> {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                    overridePendingTransition(
                        R.anim.fade_out,
                        R.anim.fade_in
                    )
                }
                else -> {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                    overridePendingTransition(
                        R.anim.fade_out,
                        R.anim.fade_in
                    )
                }
            }
        }

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.settings, SettingsFragment())
            .commit()
        val myToolbar = findViewById<Toolbar>(R.id.my_toolbar)

        setSupportActionBar(myToolbar)
        (supportActionBar ?: return).setDisplayShowTitleEnabled(false)
        (supportActionBar ?: return).setDisplayHomeAsUpEnabled(true)
        (supportActionBar ?: return).setHomeAsUpIndicator(R.drawable.ic_arrow_back)

        WindowCompat.setDecorFitsSystemWindows(window, false)

        var statusBarHeight = 0
        val resourceId = resources.getIdentifier("status_bar_height", "dimen", "android")
        if (resourceId > 0) {
            statusBarHeight = resources.getDimensionPixelSize(resourceId)
        }

        val param = (myToolbar ?: return).layoutParams as ViewGroup.MarginLayoutParams
        param.setMargins(0, statusBarHeight, 0, 0)
        myToolbar.layoutParams = param

        val view = View(this)

        view.setOnApplyWindowInsetsListener { view, insets ->
            view.updatePadding(bottom = insets.systemWindowInsetBottom)
            insets
        }
    }

    class SettingsFragment : PreferenceFragmentCompat() {

        override fun onPreferenceTreeClick(preference: Preference?): Boolean {
            when (preference?.key) {
                "About" -> {
                    val i = Intent(activity, About::class.java)
                    startActivity(i)
                }
                "Help" -> {
                    val i = Intent(activity, AppIntro::class.java)
                    startActivity(i)
                }
                "License" -> {
                    val i = Intent(activity, License::class.java)
                    startActivity(i)
                }
                "AboutLibraries" -> {
                    val i = Intent(activity, AboutLibraries::class.java)
                    startActivity(i)
                }
            }
            return true
        }

        override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
            val pref = requireContext().getSharedPreferences("Settings", 0)
            val editor = pref.edit()



            val dark = pref.getBoolean("dark_mode", false)
            val sys = pref.getBoolean("sys", false)

            setPreferencesFromResource(R.xml.root_preferences, rootKey)
            val screen = preferenceScreen

            val listPreference = findPreference<Preference>("theme") as ListPreference?

            updateColorSummary()

            when {
                sys -> {
                    listPreference?.setValueIndex(2)
                }
                dark -> {
                    listPreference?.setValueIndex(1) // Set to index of your default value
                    listPreference?.setIcon(R.drawable.ic_night_settings)
                }
                else -> {
                    listPreference?.setValueIndex(0)
                    listPreference?.setIcon(R.drawable.ic_day_settings)
                }
            }

            val accentColorButton = findPreference<Preference>("accent_color") as Preference?
            accentColorButton!!.setOnPreferenceClickListener(Preference.OnPreferenceClickListener {
                showColorPopup()
                true
            })

            val lang = findPreference<Preference>("app_language") as ListPreference?

            (lang ?: return).onPreferenceChangeListener =
                Preference.OnPreferenceChangeListener { preference, newValue ->
                    listPreference!!.value = newValue.toString()
                    val intent2 = Intent(context, Settings::class.java)
                    val mBundle = Bundle()
                    mBundle.putBoolean("lang", true)
                    intent2.putExtras(mBundle)

                    startActivity(intent2)

                    true
                }

            (listPreference ?: return).onPreferenceChangeListener =
                Preference.OnPreferenceChangeListener { preference, newValue ->
                    listPreference.value = newValue.toString()
                    val theme = listPreference.value.toString()
                    Log.d("debug", theme)
                    when (theme) {
                        "light" -> {
                            editor.putBoolean("dark_mode", false)
                            editor.putBoolean("sys", false)
                            editor.apply()

                            val intent2 = Intent(context, Settings::class.java)
                            val mBundle = Bundle()
                            mBundle.putBoolean("switch", true)
                            intent2.putExtras(mBundle)

                            startActivity(intent2)
                            //AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                        }
                        "dark" -> {
                            editor.putBoolean("dark_mode", true)
                            editor.putBoolean("sys", false)
                            editor.commit()

                            val intent2 = Intent(context, Settings::class.java)
                            val mBundle = Bundle()
                            mBundle.putBoolean("switch", true)
                            intent2.putExtras(mBundle)

                            startActivity(intent2)

                            //AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                        }
                        "sys" -> {
                            editor.putBoolean("dark_mode", false)
                            editor.putBoolean("sys", true)
                            editor.commit()

                            val intent2 = Intent(context, Settings::class.java)
                            val mBundle = Bundle()
                            mBundle.putBoolean("switch", true)
                            intent2.putExtras(mBundle)

                            startActivity(intent2)

                            //AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
                        }
                    }
                    true
                }

            val textSize = findPreference<Preference>("size") as ListPreference?

            when (pref.getString("text_size", "md")) {
                "md" -> {
                    textSize?.setValueIndex(1) // Set to index of your default value
                }
                "sm" -> {
                    textSize?.setValueIndex(0)
                }
                "lg" -> {
                    textSize?.setValueIndex(2)
                }
            }

            textSize?.onPreferenceChangeListener =
                Preference.OnPreferenceChangeListener { preference, newValue ->
                    textSize?.value = newValue.toString()
                    val size = textSize?.entry.toString()
                    Log.d("debug", size)
                    when (size) {
                        "Small" -> {
                            editor.putString("text_size", "sm")
                            editor.commit()
                        }
                        "Medium" -> {
                            editor.putString("text_size", "md")
                            editor.commit()
                        }
                        "Large" -> {
                            editor.putString("text_size", "lg")
                            editor.commit()
                        }
                    }
                    true
                }
        }

        fun updateColorSummary(){
            val accent_color = findPreference<Preference>("accent_color")
            val color = Colours().getColor(requireContext())
            when(color){
                "blue" -> accent_color!!.summary = getString(R.string.blue)
                "green" -> accent_color!!.summary = getString(R.string.green)
                "orange" -> accent_color!!.summary = getString(R.string.orange)
                "yellow" -> accent_color!!.summary = getString(R.string.yellow)
                "teal" -> accent_color!!.summary = getString(R.string.teal)
                "violet" -> accent_color!!.summary = getString(R.string.violet)
                "pink" -> accent_color!!.summary = getString(R.string.pink)
                "lightBlue" -> accent_color!!.summary = getString(R.string.lightBlue)
                "red" -> accent_color!!.summary = getString(R.string.red)
                "lime" -> accent_color!!.summary = getString(R.string.lime)
                "crimson" -> accent_color!!.summary = getString(R.string.crimson)
                else -> accent_color!!.summary = getString(R.string.original)
            }
        }

        fun showColorPopup() {
            val colors = intArrayOf(
                ContextCompat.getColor(requireContext(), R.color.blueAccent),
                ContextCompat.getColor(requireContext(), R.color.greenAccent),
                ContextCompat.getColor(requireContext(), R.color.yellowAccent),
                ContextCompat.getColor(requireContext(), R.color.orangeAccent),
                ContextCompat.getColor(requireContext(), R.color.tealAccent),
                ContextCompat.getColor(requireContext(), R.color.violetAccent),
                ContextCompat.getColor(requireContext(), R.color.lightBlueAccent),
                ContextCompat.getColor(requireContext(), R.color.redAccent),
                ContextCompat.getColor(requireContext(), R.color.limeAccent),
                ContextCompat.getColor(requireContext(), R.color.crimsonAccent),
                ContextCompat.getColor(requireContext(), R.color.colorPrimary)
            )

            MaterialDialog(requireContext()).show {
                title(R.string.settings_accent_colour)
                colorChooser(colors) { dialog, color ->
                    // Use color integer
                    var colorOut = "original"
                    when(color){
                        ContextCompat.getColor(requireContext(), R.color.blueAccent) -> {
                            colorOut = "blue"
                        }
                        ContextCompat.getColor(requireContext(), R.color.greenAccent) -> {
                            colorOut = "green"
                        }
                        ContextCompat.getColor(requireContext(), R.color.yellowAccent) -> {
                            colorOut = "yellow"
                        }
                        ContextCompat.getColor(requireContext(), R.color.orangeAccent) -> {
                            colorOut = "orange"
                        }
                        ContextCompat.getColor(requireContext(), R.color.tealAccent) -> {
                            colorOut = "teal"
                        }
                        ContextCompat.getColor(requireContext(), R.color.violetAccent) -> {
                            colorOut = "violet"
                        }
                        ContextCompat.getColor(requireContext(), R.color.lightBlueAccent) -> {
                            colorOut = "lightBlue"
                        }
                        ContextCompat.getColor(requireContext(), R.color.redAccent) -> {
                            colorOut = "red"
                        }
                        ContextCompat.getColor(requireContext(), R.color.limeAccent) -> {
                            colorOut = "lime"
                        }
                        ContextCompat.getColor(requireContext(), R.color.crimsonAccent) -> {
                            colorOut = "crimson"
                        }
                    }
                    val sharedPrefs = PreferenceManager.getDefaultSharedPreferences(context)
                    val editor = sharedPrefs.edit()
                    editor.putString("accent_color", colorOut)
                    editor.commit()

                    updateColorSummary()

                    val intent2 = Intent(context, Settings::class.java)
                    val mBundle = Bundle()
                    mBundle.putBoolean("switch", true)
                    intent2.putExtras(mBundle)

                    startActivity(intent2)
                }
                positiveButton(R.string.configure)
            }

        }
    }


    override fun onSupportNavigateUp(): Boolean {
        val myIntent = Intent(this@Settings, MainActivity::class.java)
        val mBundle = Bundle()
        mBundle.putString("quote", quotenumber.toString())
        myIntent.putExtras(mBundle)
        this@Settings.startActivity(myIntent)
        overridePendingTransition(
            R.anim.anim_slide_in_right,
            R.anim.anim_slide_out_right
        )
        finish()
        return true
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val myIntent = Intent(this@Settings, MainActivity::class.java)
        val mBundle = Bundle()
        mBundle.putString("quote", quotenumber.toString())
        myIntent.putExtras(mBundle)
        this@Settings.startActivity(myIntent)

        overridePendingTransition(
            R.anim.anim_slide_in_right,
            R.anim.anim_slide_out_right
        )
        finish()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                val i = Intent(this, MainActivity::class.java)
                val mBundle = Bundle()
                mBundle.putString("quote", quotenumber.toString())
                i.putExtras(mBundle)
                startActivity(i)
                overridePendingTransition(
                    R.anim.anim_slide_in_right,
                    R.anim.anim_slide_out_right
                )
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
