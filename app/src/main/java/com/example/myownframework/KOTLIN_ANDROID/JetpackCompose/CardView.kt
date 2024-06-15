package com.example.myownframework.Kotlin_Android.JetpackCompose

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun CardViewExample(){

    Card(
        elevation  = CardDefaults.cardElevation( defaultElevation = 10. dp ),
        modifier = Modifier.padding(12.dp)
    ) {

    }
}