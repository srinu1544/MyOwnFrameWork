package com.example.myownframework.Kotlin_Android.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import com.example.myownframework.KOTLIN_ANDROID.compose.ui.theme.MyOwnFrameWorkTheme


class Compose : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyOwnFrameWorkTheme {
              AddNameEx()
            }
        }
    }
}



