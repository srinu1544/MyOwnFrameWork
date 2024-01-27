package com.example.myownframework.Kotlin_Android.JetpackCompose.EffectsHandlers

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver

@Composable
fun DisposableEffectEx(){


    val lifecycleowner =  LocalLifecycleOwner.current
    val observer = LifecycleEventObserver {_, event ->
        if (event == Lifecycle.Event.ON_CREATE) {
            println("event")
        }
    }
    lifecycleowner.lifecycle.addObserver(observer)

    lifecycleowner.lifecycle.removeObserver(observer)


}