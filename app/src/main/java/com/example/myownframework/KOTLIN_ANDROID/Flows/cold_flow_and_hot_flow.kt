package com.example.myownframework.KOTLIN_ANDROID.Flows

/*cold flow :

1. Cold Flow
-------------
Definition: A cold flow is a flow that does not start emitting values until it is collected.
Each collector gets its own separate sequence of emissions.

Key Characteristics:
A new instance of data is created for each collection.
If there are multiple collectors, each collector receives a fresh stream of data.
Example of cold flows: Flow, flowOf(), and sequence

 */

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking {
    val coldFlow = flow {
        println("Flow started")
        for (i in 1..3) {
            delay(100)  // Simulate some work
            emit(i)
        }
    }

    println("Collector 1")
    coldFlow.collect { value -> println(value) }  // Collection starts here, flow emits values

    println("Collector 2")
    coldFlow.collect { value -> println(value) }  // New collection, flow starts emitting again
}

/*
output
-------
Collector 1
Flow started
1
2
3
Collector 2
Flow started
1
2
3

2. Hot Flow
Definition:
A hot flow starts emitting values immediately, whether or not it has collectors.
All collectors share the same stream of data.
It’s like a broadcast; once it starts, all collectors receive the same values at the same time.
Key Characteristics:
Hot flows emit data continuously regardless of whether collectors are present.
Examples of hot flows: SharedFlow, StateFlow.




import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking {
    val hotFlow = MutableSharedFlow<Int>()  // SharedFlow, a type of hot flow

    // Producer coroutine
    launch {
        repeat(3) {
            delay(100)
            println("Emitting $it")
            hotFlow.emit(it)
        }
    }

    // Collector 1
    launch {
        println("Collector 1 starts collecting")
        hotFlow.collect { value -> println("Collector 1: $value") }
    }

    // Collector 2
    launch {
        delay(200)  // Collector 2 starts late
        println("Collector 2 starts collecting")
        hotFlow.collect { value -> println("Collector 2: $value") }
    }

    delay(1000)  // Wait for the flow to complete
}

Emitting 0
Collector 1 starts collecting
Collector 1: 0
Emitting 1
Collector 1: 1
Collector 2 starts collecting
Collector 1: 2
Collector 2: 2



*/





















