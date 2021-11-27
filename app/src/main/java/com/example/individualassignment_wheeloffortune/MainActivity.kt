package com.example.individualassignment_wheeloffortune

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    ImageView luckyWheel;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        luckyWheel = findViewById<R.id.wheel>();

    }
}