package com.example.mynavapp.screens.result

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.mynavapp.R

public class resultDirections private constructor() {
  public companion object {
    public fun actionResultToStartScreen(): NavDirections =
        ActionOnlyNavDirections(R.id.action_result_to_start_screen)
  }
}
