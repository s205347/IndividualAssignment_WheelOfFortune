package com.example.individualassignment_wheeloffortune

import kotlin.random.Random

class GameControl {


    private val lives = 5
    private var tries = 0
    private lateinit var guessTheWord: String
    private var lettersAlreadyUsed: String = ""
    private lateinit var secretSentence: String

    fun startGame(): GameState {
//        lettersAlreadyUsed = ""
//        tries = 0
        val randomIndex = Random.nextInt(0, Sentences.secretSentence.size)



    }




}