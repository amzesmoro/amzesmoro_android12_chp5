package com.amzesmoro.cc_chp5.activity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.amzesmoro.cc_chp5.MyAppIntro
import com.amzesmoro.cc_chp5.R

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({
            val mainIntent = Intent(this, MyAppIntro::class.java)
            startActivity(mainIntent)
            finish()
        }, 3000)
    }
}