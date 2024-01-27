package com.example.myownframework.Kotlin_Android.JetpackCompose

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

/**/

@Composable
fun DerivedStateOfEx(){

    var counter by remember {
        mutableStateOf(0)
    }


    val counterText by derivedStateOf {
        "The countet is $counter"
    }
    Button(onClick = { counter++ }) {

        Text(text = counterText)
    }
}