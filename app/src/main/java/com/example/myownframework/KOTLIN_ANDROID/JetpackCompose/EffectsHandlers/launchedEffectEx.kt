package com.example.myownframework.Kotlin_Android.JetpackCompose.EffectsHandlers

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

@Composable
fun LaunchedEffectEx(){

    val context = LocalContext.current


    var state by remember{
        mutableStateOf(false)

    }

    LaunchedEffect(key1 = state){
        Toast.makeText(context,"hello", Toast.LENGTH_SHORT).show()
    }



    Text(
        text = "Hello",
        modifier = Modifier.clickable { state = !state }
    )


}