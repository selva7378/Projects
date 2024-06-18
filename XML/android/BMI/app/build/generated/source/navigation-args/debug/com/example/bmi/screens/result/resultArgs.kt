package com.example.bmi.screens.result

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Float
import kotlin.jvm.JvmStatic

public data class resultArgs(
  public val bmiResult: Float,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putFloat("bmiResult", this.bmiResult)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("bmiResult", this.bmiResult)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): resultArgs {
      bundle.setClassLoader(resultArgs::class.java.classLoader)
      val __bmiResult : Float
      if (bundle.containsKey("bmiResult")) {
        __bmiResult = bundle.getFloat("bmiResult")
      } else {
        throw IllegalArgumentException("Required argument \"bmiResult\" is missing and does not have an android:defaultValue")
      }
      return resultArgs(__bmiResult)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): resultArgs {
      val __bmiResult : Float?
      if (savedStateHandle.contains("bmiResult")) {
        __bmiResult = savedStateHandle["bmiResult"]
        if (__bmiResult == null) {
          throw IllegalArgumentException("Argument \"bmiResult\" of type float does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"bmiResult\" is missing and does not have an android:defaultValue")
      }
      return resultArgs(__bmiResult)
    }
  }
}
