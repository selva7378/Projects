package com.example.mynavapp.screens.result

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class resultArgs(
  public val flamesResult: String,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("flamesResult", this.flamesResult)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("flamesResult", this.flamesResult)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): resultArgs {
      bundle.setClassLoader(resultArgs::class.java.classLoader)
      val __flamesResult : String?
      if (bundle.containsKey("flamesResult")) {
        __flamesResult = bundle.getString("flamesResult")
        if (__flamesResult == null) {
          throw IllegalArgumentException("Argument \"flamesResult\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"flamesResult\" is missing and does not have an android:defaultValue")
      }
      return resultArgs(__flamesResult)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): resultArgs {
      val __flamesResult : String?
      if (savedStateHandle.contains("flamesResult")) {
        __flamesResult = savedStateHandle["flamesResult"]
        if (__flamesResult == null) {
          throw IllegalArgumentException("Argument \"flamesResult\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"flamesResult\" is missing and does not have an android:defaultValue")
      }
      return resultArgs(__flamesResult)
    }
  }
}
