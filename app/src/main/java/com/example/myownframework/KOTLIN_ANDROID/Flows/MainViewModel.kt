package com.example.myownframework.Kotlin_Android.Flows

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {


    // flow


    val countDownFlow = flow<Int> {

        val startingValue = 10
        var currentValue = startingValue
        emit(startingValue)
        while (currentValue > 0) {
            delay(1000L)
            currentValue--
            emit(currentValue)

        }

    }


    private fun collectFlow() {
        viewModelScope.launch {
            countDownFlow.collect { time ->
                println("The current time is $time")
            }
        }
    }


   // stateflow

    private val _stateFlow = MutableStateFlow(0)
    val stateFlow = _stateFlow.asStateFlow()


    fun incrementCounter() {
        _stateFlow.value  += 1
    }


    //shared flow
    private val _sharedFlow = MutableSharedFlow<Int>(replay = 5)
    val sharedFlow = _sharedFlow.asSharedFlow()

    fun squareNumber(number : Int) {
        viewModelScope.launch {
            _sharedFlow.emit(number * number)
        }
    }


    init {

      viewModelScope.launch {
          sharedFlow.collect{
          delay(2000L)
          println("Receive the number is $it")
          }
      }

        viewModelScope.launch {
            sharedFlow.collect{
                delay(3000L)
                println("Receive the number is $it")
            }
        }

        squareNumber(3)
    }








}