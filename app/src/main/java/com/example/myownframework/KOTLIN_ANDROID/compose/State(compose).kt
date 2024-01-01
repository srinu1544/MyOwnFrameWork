package com.example.myownframework.Kotlin_Android.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp



@Preview
@Composable
fun StateEx (){

    var count by remember {
        mutableStateOf(0)
    }


    Column(modifier = Modifier.fillMaxSize(),
           verticalArrangement = Arrangement.Center,
           horizontalAlignment = Alignment.CenterHorizontally) {
           
        Text(text = count.toString(),
            color= Color.Red,
            fontSize = 30.sp
        )
        Button(
            onClick = {
                count++
            },
        ) {
            Text(text = "Click me!")
        }
    }
}