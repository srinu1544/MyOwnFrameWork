package com.example.myownframework.Kotlin_Android.Flows

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.buffer
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.launch

/*

please refer :
https://developer.android.com/kotlin/flow
https://www.youtube.com/watch?v=B_3iTVJT8Zs&ab_channel=PhilippLackner

flow :
------

In coroutines, a flow is a type that can emit multiple values sequentially,
as opposed to suspend functions that return only a single value. For example,
you can use a flow to receive live updates from a database.

Flows are built on top of coroutines and can provide multiple values. A flow is
conceptually a stream of data that can be computed asynchronously. The emitted values
must be of the same type. For example, a Flow<Int> is a flow that emits integer values.

A flow is very similar to an Iterator that produces a sequence of values, but it uses
suspend functions to produce and consume values asynchronously. This means, for example,
that the flow can safely make a network request to produce the next value without blocking
the main thread.

There are three entities involved in streams of data:

A producer produces data that is added to the stream. Thanks to coroutines,
flows can also produce data asynchronously.

(Optional) Intermediaries can modify each value emitted into the stream or the stream itself.
A consumer consumes the values from the stream.

In Android, a repository is typically a producer of UI data that has the user interface
(UI) as the consumer that ultimately displays the data. Other times, the UI layer is
a producer of user input events and other layers of the hierarchy consume them. Layers
in between the producer and consumer usually act as intermediaries that modify the
stream of data to adjust it to the requirements of the following layer.


stateFlow :
------------

->use to  keep state

sharedFlow :
------------

-> shared flow is used to send onetime event
-> shared flow is used for send an event like when auth success open a page one time


StateFlow and SharedFlow are Flow APIs that enable flows to optimally emit state updates
and emit
values to multiple consumers.




 */





suspend fun main(args: Array<String>) {
    val flow = flowOf(1, 2, 3, 4, 5)

    // Collect all of the values emitted by the Flow
       flow.collect { value ->
           delay(1000L)
        println(value)
    }


    // Only collect the latest value emitted by the Flow
/*    flow.collectLatest { value ->
        delay(1000L)
        println(value)
    }*/
}