package com.example.individualassignment_wheeloffortune

sealed class GameCondition {
    class Undergoing(val lettersAlreadyUsed: String, val secretSentence: String) : GameCondition()
    class Lost(val sentenceReveal: String) : GameCondition()
    class Won(val sentenceReveal: String) : GameCondition()
}