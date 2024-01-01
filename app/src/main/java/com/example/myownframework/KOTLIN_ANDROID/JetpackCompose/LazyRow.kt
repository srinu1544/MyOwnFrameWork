package com.example.myownframework.Kotlin_Android.JetpackCompose

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LazyRowEx(){
    LazyRow (modifier = Modifier.fillMaxSize()){
        items(10) { i ->
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = i.toString(),
                modifier = Modifier.size(100.dp)
            )

            Text(text = "$i")
        }
    }


}