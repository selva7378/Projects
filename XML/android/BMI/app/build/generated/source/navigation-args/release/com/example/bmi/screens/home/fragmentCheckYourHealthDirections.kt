package com.example.bmi.screens.home

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.bmi.R

public class fragmentCheckYourHealthDirections private constructor() {
  public companion object {
    public fun actionFragmentCheckYourHealthToMain2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_fragmentCheckYourHealth_to_main2)
  }
}
