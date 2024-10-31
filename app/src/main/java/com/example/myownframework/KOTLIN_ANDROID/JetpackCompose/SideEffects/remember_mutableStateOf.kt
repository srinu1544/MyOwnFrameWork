package com.example.myownframework.KOTLIN_ANDROID.JetpackCompose.SideEffects

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

/*
remember
remember is a Compose function that remembers a value across recompositions.
You use remember to persist a value in memory while the composable is in composition.
 Without remember, the state would reset on every recomposition, making it unsuitable for storing mutable data.*/

@Composable
fun CounterWithRemember() {
    val count = remember { mutableStateOf(0) }

    Button(onClick = { count.value++ }) {
        Text("Count: ${count.value}")
    }
}

/*mutableStateOf
mutableStateOf is a function that creates a mutable state object that Compose observes for changes.
When the value inside mutableStateOf changes, any composable reading it will recompose,
 ensuring the UI always reflects the latest data.*/

@Composable
fun SimpleCounter() {
    var count by remember { mutableStateOf(0) }

    Button(onClick = { count++ }) {
        Text("Count: $count")
    }
}
