package com.example.myownframework.Kotlin_Android.compose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview
@Composable
fun BoxExample(){

    Box(
         modifier = Modifier.size(400.dp)
    ) {

        Text(text = "Hellloo!",
            color = Color.Red,
            fontSize = 30.sp,
            modifier = Modifier.align(Alignment.BottomEnd
            )
        )

        Text(text = "Hello kotlin!",
            color = Color.Green,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Center
        )

    }

}
