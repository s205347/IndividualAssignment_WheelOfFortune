package com.example.individualassignment_wheeloffortune


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.children
import com.example.individualassignment_wheeloffortune.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    private val gameControl = GameControl
    private lateinit var lettersLayout: ConstraintLayout
    private lateinit var newGameButton: Button
    private lateinit var lettersUsedTextView: TextView
    private lateinit var wordTextView: TextView
    private lateinit var gameLostTextView: TextView
    private lateinit var gameWonTextView: TextView
    private lateinit var livesTextView: TextView

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        wordTextView = binding.wordTextView
        lettersUsedTextView = binding.lettersUsedTextView
        lettersLayout = binding.lettersLayout
        newGameButton = binding.startNewGameButton
        gameLostTextView = binding.gameLostTextView
        gameWonTextView = binding.gameWonTextView
        livesTextView = binding.livesView
        livesTextView.text = "Lives: " + GameControl.lives

        newGameButton.setOnClickListener {
            startNewGame()

        }
        val gameCondition = gameControl.startNewGame()
        updateUI(gameCondition)

        lettersLayout.children.forEach { letterView ->
            if (letterView is TextView) {
                letterView.setOnClickListener {
                    val gameCondition = gameControl.play((letterView).text[0])
                    updateUI(gameCondition)
                    letterView.visibility = View.GONE
                }
            }
        }
        val view = binding.root
        return view
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

    private fun showGameLost(guessTheWord: String) {
        wordTextView.text = guessTheWord
        gameLostTextView.visibility = View.VISIBLE
        lettersLayout.visibility = View.GONE
    }

    private fun showGameWon(guessTheWord: String) {
        wordTextView.text = guessTheWord
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

