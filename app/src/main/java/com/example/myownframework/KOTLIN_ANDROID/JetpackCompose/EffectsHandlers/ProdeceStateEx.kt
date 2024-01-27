package com.example.myownframework.Kotlin_Android.JetpackCompose.EffectsHandlers

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.produceState
import kotlinx.coroutines.delay

/*

produce state :
---------------

This function purpose is just to produce some kind of state that changes
over time  it similer to flow


*/

@Composable
fun ProduceStateEx(countUpTo : Int) : State<Int> {

    return produceState(initialValue = 0){
        while(value < countUpTo){
            delay(1000)
            value++
        }
    }


}