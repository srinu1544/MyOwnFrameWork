package com.example.myownframework.Kotlin_Android.compose


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true)
@Composable
fun LazyColumnEx (){
    
    LazyColumn(modifier = Modifier.fillMaxSize()){
        items(10) { i ->
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = i.toString(),
                modifier = Modifier.size(100.dp)
            )
        }
    }
}