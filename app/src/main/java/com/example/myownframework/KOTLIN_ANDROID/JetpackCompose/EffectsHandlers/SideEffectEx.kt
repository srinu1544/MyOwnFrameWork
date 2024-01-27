package com.example.myownframework.Kotlin_Android.JetpackCompose.EffectsHandlers

import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect


/*

SideEffect :
------------

It calls when ever composable successfully recompose
use kind for some non composable code let integer below it is not compose state
it get from api or some else



*/

@Composable
fun SideEffectEx(firebaseUserId : Int) {

    SideEffect {
        println("call after every successful recomposition ")
    }



}


