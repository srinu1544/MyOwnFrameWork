package com.example.myownframework.Kotlin_Android.JetpackCompose.EffectsHandlers

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.produceState
import kotlinx.coroutines.delay

/*

produce state :
---------------

This function purpose is just to produce some kind of state that changes
over time  it similer to flow

produceState is a powerful API for creating and managing state derived from side effects.
 It launches a coroutine to produce state and can be more straightforward than using LaunchedEffect
 combined with remember for certain asynchronous operations
*/

@Composable
fun UserScreen(userId: String) {
    val userData by produceState<String>("Loading...") {
        value = fetchUserData(userId) // update value as data arrives
    }

    Text(text = userData)
}

suspend fun fetchUserData(userId: String): String {
    delay(2000) // Simulate network call
    return "User data for $userId"
}
