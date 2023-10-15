package com.example.myownframework

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import com.example.myownframework.retrofit.api.ApiInterface
import com.example.myownframework.retrofit.api.RetrofitInstance
import com.example.myownframework.retrofit.repository.UsersRepository
import com.example.myownframework.retrofit.viewmodel.UserViewModel
import com.example.myownframework.retrofit.viewmodel.UserViewModelFactory
import com.example.myownframework.ui.theme.MyOwnFrameWorkTheme
import retrofit2.Retrofit

class MainActivity : ComponentActivity() {

    private lateinit var viewModel: UserViewModel
    var result : String = "" 
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyOwnFrameWorkTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    val retrofit = RetrofitInstance.getRetrofitInstance()
                        .create(ApiInterface::class.java)
                    val repository = UsersRepository(retrofit)
                    viewModel = ViewModelProvider(this,UserViewModelFactory(repository))[UserViewModel :: class.java]

                    viewModel.getAllUsers() //this method is needed to add our "users" since we are observing the value below
                    viewModel.users.observe(this){
                        result = it.toString()
                    }
                     Greeting(name = result)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyOwnFrameWorkTheme {
        Greeting("Android")
    }
}