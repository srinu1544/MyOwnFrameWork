package com.example.myownframework.Kotlin_Android.JetpackCompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/*Rows: A row is a horizontal layout component in Jetpack Compose.
It is used to position UI elements horizontally.*/



@Composable
fun RowExample() {

    Row(horizontalArrangement = Arrangement.Center) {

        Text(text = "Hellloo!",
            color = Color.Red,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Center)

        Text(text = "Hello kotlin!",
            color = Color.Green,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Center)

    }

}

@Preview
@Composable
fun defaultPrewview(){
    RowExample()
}

