package com.example.individualassignment_wheeloffortune

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var score = 0
    val lives = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (lives > 0) {

        }

        else {
        }

//        var hemmeligSætning: String = "wheel of fortune "
//        Scanner scan
//        scan = new Scanner(System.in)
//        var spillerGæt: String = " "
//        var ikkeFærdig = true
//
//        while (score !=-1) {
//            ikkeFærdig = false;
//            for(char hemmeligtBogstav : hemmeligSætning.toCharArray()) {
//                if (spillerGæt.indexOf(hemmeligtBogstav) == -1) {
//                    System.out.print("*");
//                    ikkeFærdig = true;
//                } else {
//                    System.out.print(hemmeligtBogstav);
//                }
//
//            }
//            System.out.println("\nIndtast venligt det bogstav du gætter på");
//            val bogstav = scan.next();
//            spillerGæt += bogstav;
//        }
    }



}


