package com.example.myownframework.Kotlin_Android.compose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import com.example.myownframework.KOTLIN_ANDROID.compose.ui.theme.MyOwnFrameWorkTheme

class SideEffects : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyOwnFrameWorkTheme {
                Greeting(name = "srinivas")
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    val context = LocalContext.current

    var state by remember{
        mutableStateOf(false)

    }

    LaunchedEffect(key1 = state){
        Toast.makeText(context,"hello",Toast.LENGTH_SHORT).show()
    }



    Text(
        text = "Hello $name!",
        modifier = modifier.clickable { state = !state }
    )
}

