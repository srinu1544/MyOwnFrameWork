package com.example.myownframework.kotlin_Android.liveData

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.myownframework.KOTLIN_ANDROID.liveData.ui.theme.MyOwnFrameWorkTheme


class LiveDataEx : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val viewModel = viewModel<MyLiveData>()
            MyOwnFrameWorkTheme {
                // A surface container using the 'background' color from the theme
                Column(
                    modifier = Modifier.fillMaxSize(),
                    ) {
                    Button(onClick = {
                        viewModel.setUserData("sai srinivas Ramoju")
                    }) {
                        Text(text = "click me")
                    }
                    Greeting6("Android"+viewModel.user.observeAsState().value)
                }
            }
        }
    }
}

@Composable
fun Greeting6(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello nani $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview4() {
    MyOwnFrameWorkTheme {
        Greeting6("Android")
    }
}