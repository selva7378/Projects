package com.example.bmi.screens.result

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.bmi.R

public class resultDirections private constructor() {
  public companion object {
    public fun actionResultToMain2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_result_to_main2)
  }
}
