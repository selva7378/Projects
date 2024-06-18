package com.example.architectureuilayer.guesstheword.screens.score

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


class ScoreViewModelFactory(private val finalScore: Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ScoreViewModel::class.java)) {
            return ScoreViewModel(finalScore) as? T // Use safe cast operator as?
                ?: throw IllegalArgumentException("Unknown ViewModel class")
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}

