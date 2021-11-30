package com.example.individualassignment_wheeloffortune

import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_first.view.*
import kotlinx.android.synthetic.main.fragment_second.view.*
import java.util.*

class SecondFragment : Fragment() {

    var score = 0
    val lives = 6

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)

        return view

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