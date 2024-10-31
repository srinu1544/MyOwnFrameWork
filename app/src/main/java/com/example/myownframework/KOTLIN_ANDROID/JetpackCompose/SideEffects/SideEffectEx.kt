package com.example.myownframework.Kotlin_Android.JetpackCompose.EffectsHandlers

import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect


/*

SideEffect :
------------

It calls when ever composable successfully recompose
use kind for some non composable code let integer below it is not compose state
it get from api or some else

In Jetpack Compose, the SideEffect function is a simple utility that allows you to run code after the
composition phase of a Composable function. It's specifically designed for operations that do not impact
the UI state but need to be executed whenever the composable is recomposed.



*/

@Composable
fun SideEffectEx(firebaseUserId : Int) {

    SideEffect {
        println("call after every successful recomposition ")
    }



}


