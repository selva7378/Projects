package com.example.newsweather.screens

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.newsweather.R
import kotlin.Int
import kotlin.String

public class ListingscreenDirections private constructor() {
  private data class ActionListingscreen3ToWebView(
    public val url: String,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_listingscreen3_to_webView

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("url", this.url)
        return result
      }
  }

  public companion object {
    public fun actionListingscreen3ToWebView(url: String): NavDirections =
        ActionListingscreen3ToWebView(url)
  }
}
