package com.example.myownframework.compose_examples

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
fun RowExample(){

    Row() {

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
