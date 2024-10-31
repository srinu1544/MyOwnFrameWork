package com.example.myownframework.KOTLIN_ANDROID.JetpackCompose.SideEffects

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/*remember coroutine scope

In Jetpack Compose, rememberCoroutineScope is a useful function for handling side effects that
involve launching coroutines. It provides a coroutine scope that is tied to the composable’s
lifecycle, allowing you to run asynchronous tasks in response to user interactions or other
events without using LaunchedEffect. This function is particularly handy for event-driven
 coroutines that don't need to be triggered immediately upon entering the composition






*/

@Composable
fun FetchDataButton() {
    // UI state for displaying data
    var data by remember { mutableStateOf("No data yet") }

    // Coroutine scope tied to the composable's lifecycle
    val coroutineScope = rememberCoroutineScope()

    // UI button that launches a coroutine on click
    Button(onClick = {
        // Launching a coroutine within the scope provided by rememberCoroutineScope
        coroutineScope.launch {
            data = fetchDataFromNetwork() // Suspend function
        }
    }) {
        Text(text = "Fetch Data")
    }

    // Display the fetched data
    Text(text = data)
}

// Simulated network fetch
suspend fun fetchDataFromNetwork(): String {
    delay(2000) // Simulate a network delay
    return "Fetched data from network!"
}
