package com.amzesmoro.cc_chp5

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.amzesmoro.cc_chp5.activity.MainActivity
import com.amzesmoro.cc_chp5.fragment.InputUserFragment
import com.github.appintro.AppIntro
import com.github.appintro.AppIntroFragment

class MyAppIntro : AppIntro() {
    private val inputUserFragment: InputUserFragment by lazy {
        InputUserFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        addSlide(AppIntroFragment.createInstance(
            description = "Bermain suit melawan\nsesama pemain",
            imageDrawable = R.drawable.landing_page1,
            descriptionColorRes = R.color.black,
            backgroundColorRes = R.color.backgroundColor,
            descriptionTypefaceFontRes = R.font.poppins_medium
        ))
        addSlide(AppIntroFragment.createInstance(
            title = "",
            description = "Bermain suit melawan\nkomputer",
            imageDrawable = R.drawable.landing_page2,
            descriptionColorRes = R.color.black,
            backgroundColorRes = R.color.backgroundColor,
            descriptionTypefaceFontRes = R.font.poppins_medium
        ))
        addSlide(inputUserFragment)

        setIndicatorColor(Color.BLUE, Color.GRAY)
        setNextArrowColor(Color.BLUE)
        isSkipButtonEnabled = false

    }

    override fun onDonePressed(currentFragment: Fragment?) {
        super.onDonePressed(currentFragment)
        val fragmentListener = inputUserFragment as FragmentListener
        val name = fragmentListener.getTextValue()
        if (name.isEmpty()) {
            Toast.makeText(this, "Masukkan nama Anda", Toast.LENGTH_SHORT).show()
        } else {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("name", name)
            Toast.makeText(this, "Selamat Datang $name", Toast.LENGTH_SHORT).show()
            startActivity(intent)
            finish()
        }
    }
}