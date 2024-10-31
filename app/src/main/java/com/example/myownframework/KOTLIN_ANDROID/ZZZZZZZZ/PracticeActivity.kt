package com.example.myownframework.Kotlin_Android.ZZZZZZZZ

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myownframework.BuildConfig
import com.example.myownframework.Kotlin_Android.ZZZZZZZZ.ui.theme.MyOwnFrameWorkTheme

class PracticeActivity : ComponentActivity() {

    val LocalGreeting = staticCompositionLocalOf { "Hello, Guest!" }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val apikey = BuildConfig.API_KEY
        setContent {
            CompositionLocalProvider(LocalGreeting provides "Hello, Srinivas!") {
                GreetingScreen()
            }
        }
    }
}


@Composable
fun GreetingScreen() {
    // Step 3: Access the CompositionLocal value

    // Display the greeting in the UI

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    // Preview with a default value for LocalGreeting
}
