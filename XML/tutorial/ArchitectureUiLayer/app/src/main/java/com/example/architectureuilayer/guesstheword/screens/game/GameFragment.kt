/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.guesstheword.screens.game

import android.content.Context
import android.os.Build
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.architectureuilayer.R
import com.example.architectureuilayer.databinding.GameFragmentBinding
import com.example.architectureuilayer.guesstheword.screens.game.GameViewModel


/**
 * Fragment where the game is played
 */
class GameFragment : Fragment() {

    private val viewModel: GameViewModel by viewModels()



    private lateinit var binding: GameFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate view and obtain an instance of the binding class
        binding = DataBindingUtil.inflate(
                inflater,
                R.layout.game_fragment,
                container,
                false
        )

        binding.gameViewModel = viewModel
        binding.lifecycleOwner = this
        viewModel.run { println("hi sleva") }

//        viewModel.score.observe(viewLifecycleOwner, Observer { newScore ->
//            binding.scoreText.text = newScore.toString()
//        })

        viewModel.eventGameFinish.observe(viewLifecycleOwner, Observer{hasFinished ->
            if(hasFinished){
//                gameFinished()
                val currentScore = viewModel.score.value ?: 0
                val action = GameFragmentDirections.actionGameToScore(currentScore)
                findNavController().navigate(action)
                viewModel.onGameFinishComplete()
                Toast.makeText(this.requireContext(), "selva", Toast.LENGTH_SHORT).show()
            }
        })

//        viewModel.currentTime.observe(viewLifecycleOwner, Observer { time ->
//            binding.timerText.text = DateUtils.formatElapsedTime(time)
//
//        })

//        viewModel.word.observe(viewLifecycleOwner, Observer { newWord ->
//            binding.wordText.text = newWord.toString()
//        })
        // Buzzes when triggered with different buzz events
        viewModel.eventBuzz.observe(viewLifecycleOwner, Observer { buzzType ->
            if (buzzType != GameViewModel.BuzzType.NO_BUZZ) {
                buzz(buzzType.pattern)
                viewModel.onBuzzComplete()
            }
        })

        return binding.root
    }


    /**
     * Given a pattern, this method makes sure the device buzzes
     */
//    private fun buzz(pattern: LongArray) {
//        val buzzer = activity?.getSystemService<Vibrator>()
//        buzzer?.let {
//            // Vibrate for 500 milliseconds
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//                buzzer.vibrate(VibrationEffect.createWaveform(pattern, -1))
//            } else {
//                //deprecated in API 26
//                buzzer.vibrate(pattern, -1)
//            }
//        }
//    }
    private fun buzz(pattern: LongArray) {
        val buzzer = activity?.getSystemService(Context.VIBRATOR_SERVICE) as? Vibrator
        buzzer?.let {
            // Vibrate using the appropriate method based on Android version
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                buzzer.vibrate(VibrationEffect.createWaveform(pattern, -1))
            } else {
                // Deprecated in API 26
                @Suppress("DEPRECATION")
                buzzer.vibrate(pattern, -1)
            }
        }
    }

    /**
     * Called when the game is finished
     */
//    private fun gameFinished() {
//        val action = GameFragmentDirections.actionGameToScore(viewModel.score.value ?: 0)
//        findNavController().navigate(action)
//        Toast.makeText(this.requireContext(), "selva", Toast.LENGTH_SHORT).show()
//    }

}
