package com.example.individualassignment_wheeloffortune

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var score = 0
    val lives = 6

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val hemmeligSætning = "wheel of fortune "
//        val scan: Scanner
//        scan = Scanner(System.`in`)
//        var spillerGæt = " "
//
//        while (lives > 0) {
//            for (hemmeligtBogstav in hemmeligSætning.toCharArray()) {
//                if (spillerGæt.indexOf(hemmeligtBogstav) == -1) {
//                    print("*")
//                    lives-1
//                } else {
//                    print(hemmeligtBogstav)
//                }
//            }
//            println("\nIndtast venligt det bogstav du gætter på")
//            val bogstav = scan.next()
//            spillerGæt += bogstav
//        }
//        println("Tillykke du er færdig og har vundet spillet! ;)")
    }



}


