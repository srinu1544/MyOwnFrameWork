package com.example.myownframework.Kotlin_Android.Differences

import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flowOf

/*The collect and collectLatest functions in Kotlin are both used to collect values from a Flow.
However, there is a key difference between the two functions.

The collect function will collect all of the values emitted by the Flow, regardless of when they are
emitted. This can be useful if you need to process all of the values in the Flow, even if they
are emitted out of order.

The collectLatest function, on the other hand, will only collect the latest value emitted by the
Flow. This can be useful if you only need to process the most recent value emitted by the Flow.*/

suspend fun main(args: Array<String>) {
    val flow = flowOf(1, 2, 3, 4, 5)

    // Collect all of the values emitted by the Flow
    flow.collect { value ->
        println(value)
    }

    // Only collect the latest value emitted by the Flow
    flow.collectLatest { value ->
        println(value)
    }
}