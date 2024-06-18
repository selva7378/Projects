package com.example.mynavapp.screens.start

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.mynavapp.R

public class start_screenDirections private constructor() {
  public companion object {
    public fun actionStartScreenToGameScreen(): NavDirections =
        ActionOnlyNavDirections(R.id.action_start_screen_to_game_screen)
  }
}
