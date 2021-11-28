package com.example.individualassignment_wheeloffortune

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startscreenFragment =
        val mainscreenFragmentFragment = MainscreenFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.mainscreenFragment, fra)
        }



    }
}