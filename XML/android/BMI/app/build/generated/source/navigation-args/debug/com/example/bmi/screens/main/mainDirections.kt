package com.example.bmi.screens.main

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.bmi.R
import kotlin.Float
import kotlin.Int

public class mainDirections private constructor() {
  private data class ActionMain2ToResult(
    public val bmiResult: Float,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_main2_to_result

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putFloat("bmiResult", this.bmiResult)
        return result
      }
  }

  public companion object {
    public fun actionMain2ToResult(bmiResult: Float): NavDirections = ActionMain2ToResult(bmiResult)
  }
}
