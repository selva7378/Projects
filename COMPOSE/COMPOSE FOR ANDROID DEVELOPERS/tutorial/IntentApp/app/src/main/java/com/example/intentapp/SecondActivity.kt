package com.example.intentapp

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.intentapp.ui.theme.IntentAppTheme

class SecondActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IntentAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    IntentToYoutube(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun IntentToYoutube(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Column() {
            Text(text = "EXPLICIT INTENT", modifier = Modifier.align(Alignment.CenterHorizontally))
            ElevatedButton(onClick = {
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Orw3hagXGH4")).also {
                    it.`package` = "com.google.android.youtube"
                    try{
                        context.startActivity(it)
                    }catch (e: ActivityNotFoundException){
                        e.printStackTrace()
                    }

                }
            }) {
                Text(text = "GOJO VS SUKUNA MANGA FIGHT")
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun IntentDemoPreview() {
    IntentAppTheme {
        IntentToYoutube()
    }
}