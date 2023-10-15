package com.example.myownframework.compose_navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.myownframework.compose_navigation.ui.theme.MyOwnFrameWorkTheme

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

