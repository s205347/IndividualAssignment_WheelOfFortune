package com.example.individualassignment_wheeloffortune

import kotlin.random.Random
import kotlin.text.StringBuilder

object GameControl {

    private val lives = 5
    private var tries = 0
    private lateinit var guessTheWord: String
    private var lettersAlreadyUsed: String = ""
    private lateinit var hiddenSentence: String

    fun startNewGame(): GameCondition {
        lettersAlreadyUsed = ""
        tries = 0
        val randomIndex = Random.nextInt(0, Sentences.secretSentence.size)
        guessTheWord = Sentences.secretSentence[randomIndex]
        createUnderscores(guessTheWord)
        return getGameCondition()
    }

    private fun getGameCondition(): GameCondition {
        if (hiddenSentence.equals(guessTheWord, true)) {
            return GameCondition.Won(guessTheWord)
        }

        if (tries == lives) {
            return GameCondition.Lost(guessTheWord)
        }

        return GameCondition.Undergoing(lettersAlreadyUsed, hiddenSentence)
    }


    fun play(letter: Char): GameCondition {
        if (lettersAlreadyUsed.contains(letter)) {
            return GameCondition.Undergoing(lettersAlreadyUsed, hiddenSentence)
        }

        lettersAlreadyUsed += letter
        val indexes = mutableListOf<Int>()

        guessTheWord.forEachIndexed { index, char ->
            if (char.equals(letter, true)) {
                indexes.add(index)
            }
        }

        var finalUnderscoreWord = "" + hiddenSentence
        indexes.forEach { index ->
            val sb = StringBuilder(finalUnderscoreWord).also { it.setCharAt(index, letter) }
            finalUnderscoreWord = sb.toString()
        }

        if (indexes.isEmpty()) {
            tries++
        }

        guessTheWord = finalUnderscoreWord
        return getGameCondition()
    }


    fun createUnderscores(secretSentence: String) {
        val buildString = StringBuilder()
        secretSentence.forEach { char ->
            if (char == '/') { buildString.append('/')
            } else { buildString.append('_')
            }
        }
        hiddenSentence = buildString.toString()
    }


}