package com.example.myownframework.Kotlin_Android.Flows

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.myownframework.Kotlin_Android.ZZZZZZZZ.ui.theme.MyOwnFrameWorkTheme


import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class FlowEx : ComponentActivity() {

    //for noncompose
     val viewModelll : MainViewModel by viewModels()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // this block of code for only non compose
 
        
        collectLatestLifeCycleFlow(viewModelll.stateFlow) { number ->
          //  binding.tvCounter.text = number
        }


        setContent {
            val viewModel = viewModel<MainViewModel>()
            val time = viewModel.countDownFlow.collectAsState(initial = 10)

            val count = viewModel.stateFlow.collectAsState(0)


            MyOwnFrameWorkTheme {

                Box(modifier = Modifier.fillMaxSize()){
                 /*   Text(text = time.value.toString(),
                        fontSize = 30.sp,
                        modifier  = Modifier.align(Alignment.Center) )*/

                    Button(onClick = { viewModel.incrementCounter() }) {
                        Text(text = "counter ${count.value}" )
                        
                    }
                }



            }
        }
    }
}

fun <T> ComponentActivity.collectLatestLifeCycleFlow(
    flow : Flow<T>, collect : suspend (T) -> Unit) {

    lifecycleScope.launch {
        repeatOnLifecycle(Lifecycle.State.CREATED) {
            flow.collectLatest { collect }
        }
    }


    fun <T> ComponentActivity.collectLifeCycleFlow(
        flow: Flow<T>, collect: suspend (T) -> Unit
    ) {

        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.CREATED) {
                flow.collect { collect }
            }
        }


    }
}

