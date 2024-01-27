package com.example.myownframework.Kotlin_Android.JetpackCompose.EffectsHandlers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.example.myownframework.Kotlin_Android.ZZZZZZZZ.ui.theme.MyOwnFrameWorkTheme


/*

LaunchedEffect :
rememberUpdatedState
rememberCoroutineScope
sideEffect

*

*/


class EffectsMA : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SideEffectEx(firebaseUserId = 233)
        }
    }
}



