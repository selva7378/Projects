package com.example.news.screens.newslisting

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.news.R
import kotlin.Int
import kotlin.String

public class newsListingScreenDirections private constructor() {
  private data class ActionNewsListingScreenToWebViewScreen(
    public val url: String,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_newsListingScreen_to_webViewScreen

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("url", this.url)
        return result
      }
  }

  public companion object {
    public fun actionNewsListingScreenToWebViewScreen(url: String): NavDirections =
        ActionNewsListingScreenToWebViewScreen(url)
  }
}
