package com.example.myownframework.Kotlin_Android.JetpackCompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.myownframework.R


@Preview
@Composable
fun ImageExample(){
    
    Image(painter = painterResource(id = R.drawable.ic_launcher_foreground),
        contentDescription = null,
        modifier = Modifier.background(Color.Black)
    )
    
}


@Preview(showBackground = true)
@Composable
fun IconExample(){


    //visible
    val isVisible = false
    if (isVisible){
    Icon(imageVector = Icons.Default.Add,
        contentDescription = null )
    }

    Row {
        for (i in 1..10) {
            Icon(imageVector = Icons.Default.Add,
                contentDescription = null )
        }
    }

    Column {
        for (i in 1..10) {
            Icon(imageVector = Icons.Default.Add,
                contentDescription = null )
        }
    }



}
