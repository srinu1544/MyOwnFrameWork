package com.example.myownframework.Kotlin_Android.configuration_changes

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


   /* Create three layouts
   ----------------------
    Create three layouts, each defining the navigation elements and view hierarchy for a different device
     configuration. The layout file's directory structure determines which configuration it applies to.

    Set the android:configChanges flag
    ----------------------------------
    Set this flag on your Activity in AndroidManifest.xml to prevent your Activities from being recreated. This ensures that all your views and data remain after an orientation change.

    Save and restore activity state
    --------------------------------
    You can also save and restore fragment state, retain fragments, and properly handle list state.

    Use ViewModels
    ---------------
    You can use ViewModels to store UI state and observe LiveData changes.

    A configuration change occurs when you modify component information that is subject to change control.
    When a configuration change occurs, the system recreates an Activity. It calls onDestroy() to destroy
    the existing Activity instance and then creates a new instance using onCreate(). The new Activity
     instance is initialized with the new, updated configuration.

*/

    //private val viewModel by viewModels<ContactsViewModel>()


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