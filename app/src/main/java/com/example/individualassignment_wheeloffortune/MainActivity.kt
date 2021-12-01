package com.example.individualassignment_wheeloffortune

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.children
import kotlinx.android.synthetic.main.fragment_second.*

class MainActivity : AppCompatActivity() {

    private val gameControl = GameControl
    private lateinit var lettersLayout: ConstraintLayout
    private lateinit var newGameButton: Button
    private lateinit var imageView: ImageView
    private lateinit var lettersUsedTextView: TextView
    private lateinit var wordTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = imageView.findViewById(R.id.imageView)
        wordTextView = imageView.findViewById(R.id.wordTextView)
        lettersUsedTextView = imageView.findViewById(R.id.lettersUsedTextView)
        lettersLayout = imageView.findViewById(R.id.lettersLayout)

        newGameButton.setOnClickListener {
            startNewGame()

        }
        val gameState = gameControl.startNewGame()
        updateUI(gameState)

        lettersLayout.children.forEach { letterView ->
            if (letterView is TextView) {
                letterView.setOnClickListener {
                    val gameState = gameControl.play((letterView).text[0])
                    updateUI(gameState)
                    letterView.visibility = View.GONE
                }
            }
        }
    }


    private fun updateUI(gameCondition: GameCondition) {
        when (gameCondition) {
            is GameCondition.Lost -> showGameLost(gameCondition.sentenceReveal)
            is GameCondition.Undergoing -> {
                wordTextView.text = gameCondition.secretSentence
                lettersUsedTextView.text = "Letters used: ${gameCondition.lettersAlreadyUsed}"
            }
            is GameCondition.Won -> showGameWon(gameCondition.sentenceReveal)
        }
    }

    private fun showGameLost(wordToGuess: String) {
        wordTextView.text = wordToGuess
        gameLostTextView.visibility = View.VISIBLE
        lettersLayout.visibility = View.GONE
    }

    private fun showGameWon(wordToGuess: String) {
        wordTextView.text = wordToGuess
        gameWonTextView.visibility = View.VISIBLE
        lettersLayout.visibility = View.GONE
    }

    private fun startNewGame() {
        gameLostTextView.visibility = View.GONE
        gameWonTextView.visibility = View.GONE
        val gameCondition = gameControl.startNewGame()
        lettersLayout.visibility = View.VISIBLE
        lettersLayout.children.forEach { letterView ->
            letterView.visibility = View.VISIBLE
        }
        updateUI(gameCondition)
    }
}






