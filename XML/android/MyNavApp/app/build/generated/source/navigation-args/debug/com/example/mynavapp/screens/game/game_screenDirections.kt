package com.example.mynavapp.screens.game

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.mynavapp.R
import kotlin.Int
import kotlin.String

public class game_screenDirections private constructor() {
  private data class ActionGameScreenToResult(
    public val flamesResult: String,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_game_screen_to_result

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("flamesResult", this.flamesResult)
        return result
      }
  }

  private data class GamescreenExit(
    public val flamesResult: String,
  ) : NavDirections {
    public override val actionId: Int = R.id.gamescreen_exit

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("flamesResult", this.flamesResult)
        return result
      }
  }

  public companion object {
    public fun actionGameScreenToResult(flamesResult: String): NavDirections =
        ActionGameScreenToResult(flamesResult)

    public fun gamescreenExit(flamesResult: String): NavDirections = GamescreenExit(flamesResult)
  }
}
