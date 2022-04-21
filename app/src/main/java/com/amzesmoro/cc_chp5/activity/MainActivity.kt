package com.amzesmoro.cc_chp5.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.amzesmoro.cc_chp5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        val username = intent.getStringExtra("name")
        mainBinding.apply {
            tvUserVsUser.text = "$username vs Pemain"
            tvUserVsCpu.text = "$username vs CPU"
            ibUserVsUser.setOnClickListener {
                Toast.makeText(applicationContext, "Anda click user vs pemain", Toast.LENGTH_SHORT).show()
            }
            ibUserVsCpu.setOnClickListener {
                Toast.makeText(applicationContext, "Anda click user vs cpu", Toast.LENGTH_SHORT).show()
            }
        }

    }
}