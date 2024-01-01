package com.example.myownframework.Kotlin_Android.compose_navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.myownframework.KOTLIN_ANDROID.compose_navigation.ui.theme.MyOwnFrameWorkTheme
import com.example.myownframework.kotlin_Android.bottomNavBar.Nav


class NavCompose : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyOwnFrameWorkTheme {
                Nav()
            }
        }
    }
}

