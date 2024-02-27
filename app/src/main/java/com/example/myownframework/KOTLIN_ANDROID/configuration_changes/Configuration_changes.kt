package com.example.myownframework.Kotlin_Android.Configuration_Changes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.myownframework.KOTLIN_ANDROID.CameraX.ui.theme.MyOwnFrameWorkTheme


class Configuration_changes : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyOwnFrameWorkTheme {
                val viewModel = viewModel<ContactsViewModel>(
                    factory = object : ViewModelProvider.Factory{
                        override fun <T : ViewModel> create(modelClass: Class<T>): T {
                            return ContactsViewModel(helloword = "hello ") as T
                        }
                    }
                )
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color =  viewModel.backgroundcolor
                ) {
                    Button(onClick = {
                     viewModel.changeBackgroundColor()
                    }) {
                      Text(text = "change color")
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting3(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    MyOwnFrameWorkTheme {
        Greeting3("Android")
    }
}