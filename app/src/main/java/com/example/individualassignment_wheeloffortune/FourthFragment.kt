package com.example.individualassignment_wheeloffortune

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_fourth.view.*
import kotlinx.android.synthetic.main.fragment_third.view.*

class FourthFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_fourth, container, false)

        view.Btn4.setOnClickListener{ Navigation.findNavController(view).navigate(R.id.navigateToSecondFragment)}

        return view

    }
}