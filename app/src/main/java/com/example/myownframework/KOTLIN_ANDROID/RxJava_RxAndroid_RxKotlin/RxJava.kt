package com.example.myownframework.Kotlin_Android.RxJava_RxAndroid_RxKotlin

import android.annotation.SuppressLint
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers


/*RxJava is a popular open-source library for reactive programming in Java. It allows you to work with
asynchronous data streams and provides a way to compose and manipulate these streams in a functional
and declarative manner. RxJava is part of the larger Rx (Reactive Extensions) family of libraries,
which originated in the Microsoft .NET framework and has since been implemented in various programming
languages.

Here are some key concepts and features of RxJava:

Observable:
An Observable is a source of data that emits a sequence of items over time. These items can be of
any type, such as integers, strings, or custom objects. Observables are used to represent asynchronous data
streams.

Observer:
An Observer subscribes to an Observable to receive and react to the items emitted by the Observable.
Observers define how to handle these items when they are emitted, as well as how to handle errors and
completion events.

Operators:
RxJava provides a wide range of operators that allow you to transform, filter, combine, and manipulate data
streams. These operators make it easy to perform operations like mapping, filtering, merging, and more on
Observables.

Schedulers:
RxJava allows you to specify the thread or thread pool on which certain Observable operations and their
emissions should occur. This is helpful for managing concurrency and controlling which threads handle
different parts of your reactive code.

Backpressure:
RxJava provides mechanisms for dealing with backpressure, which occurs when an Observable emits data faster
than an Observer can consume it. Backpressure strategies help you handle and control this situation.

Error Handling:
RxJava has built-in error-handling mechanisms, making it easy to handle exceptions and errors that may occur
during the processing of Observables.

RxJava is commonly used in Android app development for managing asynchronous operations, handling UI updates,
and working with data streams like user input, network requests, and more. It simplifies the complexity of
managing asynchronous code and helps create more responsive and maintainable applications.


RxJava Operators in RxAndroid
RxAndroid provides a powerful toolkit for reactive programming on the Android platform.
Operators are the building blocks of RxJava, allowing you to manipulate data streams
and achieve various effects. Here's a comprehensive overview of essential RxJava operators in RxAndroid:

1. Creating Observables:

just: Emits a single item and then completes.
from: Creates an Observable from a collection or an Iterable.
range: Creates an Observable that emits a sequence of numbers.
timer: Emits a single item after a specified delay.
interval: Emits an item repeatedly at specified intervals.


2. Transforming Observables:

map: Applies a function to each item emitted by the source Observable.
filter: Filters out items that don't meet a specified condition.
take: Takes a specified number of items from the source Observable.
skip: Skips a specified number of items from the source Observable.
distinct: Emits only distinct items from the source Observable.
buffer: Creates an Observable that emits batches of items from the source Observable.


3. Combining Observables:

merge: Merges emissions from multiple Observables into a single Observable.
concat: Concatenates emissions from multiple Observables in sequence.
zip: Combines emissions from multiple Observables into a single Observable that emits tuples of items.


4. Error Handling:

onErrorResumeNext: Allows you to specify an alternative Observable to resume from in case of an error.
retry: Retries an Observable a specified number of times in case of an error.
catchError: Allows you to specify an error handler for an Observable.


5. Schedulers:

subscribeOn: Specifies the Scheduler on which the Observable is subscribed.
observeOn: Specifies the Scheduler on which the Observer receives items.


6. Utility Operators:

debounce: Delays the emission of items by a specified time.
throttleFirst: Emits only the first item emitted by the source Observable within a specified time window.
sample: Emits only the latest item emitted by the source Observable within a specified time window.
7. Android-specific Operators:

bindToLifecycle: Binds an Observable to the lifecycle of an Android component.
subscribeOnMainThread: Subscribes to an Observable on the main thread.
observeOnMainThread: Observes an Observable on the main thread.


 operator
 --------
 fromIterable
 filter

 subscribeOn(Schedulers.io())   // the task run on the io thread
 observeOn(AndroidSchedulers.mainThread()) // give me data on main thread

 compositeDisposables
 compositeObservables                      ----*/


/*fun main() {
        .filter { item -> item == "Red" }
        .subscribe{ onNext -> println("name $onNext")}

}*/




/*
**** FLowable
-----------
In RxJava, a Flowable is a type that’s designed to handle cases where the data emission rate might be higher
 than the rate at which it can be consumed. It’s particularly useful for handling backpressure,
 which occurs when an observable is emitting items faster than the observer can consume them.

When to Use Flowable
Flowable is recommended for situations where you’re dealing with a large number of events
 (like processing a large dataset or streaming a high volume of data), and there is a possibility
 that data could overwhelm the consumer. It’s useful in scenarios where resource constraints
 (like CPU or memory) could affect the stability of the stream processing.

Basic Concepts of Flowable
Backpressure: If the Flowable emits data faster than it can be processed, it allows the consumer to "push back," instructing the Flowable to slow down or drop items.
Backpressure Strategy: RxJava provides several backpressure strategies, which let you control what happens when there is more data than the consumer can handle. Common strategies include:
BUFFER: Collects all items, buffering them until the consumer can process them.
DROP: Drops items that can’t be processed in time.
LATEST: Keeps only the most recent item, dropping older ones.
MISSING: Passes responsibility to the downstream consumer for handling backpressure.
Creating a Flowable
You can create a Flowable using several different methods in RxJava, such as create, just, fromIterable, and more. Here are a few examples:

Example 1: Creating a Flowable with create
Here’s how to create a Flowable using Flowable.create, which emits numbers from 1 to 100 with a BUFFER strategy:

kotlin
Copy code
import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.schedulers.Schedulers

val flowable = Flowable.create<Int>({ emitter ->
    for (i in 1..100) {
        if (!emitter.isCancelled) {
            emitter.onNext(i) // Emit each item
        }
    }
    emitter.onComplete() // Complete the emission
}, BackpressureStrategy.BUFFER) // Define the backpressure strategy

flowable
    .observeOn(Schedulers.io()) // Specify the thread for observing
    .subscribe(
        { item -> println("Received: $item") },
        { error -> println("Error: ${error.message}") },
        { println("Complete") }
    )
Example 2: Flowable with Backpressure Strategy
You can also use a Flowable to handle cases with a limited resource like a network or disk. Here’s an example using the DROP strategy to drop items that can’t be processed in time:

kotlin
Copy code
val flowable = Flowable.range(1, 1000)
    .onBackpressureDrop() // Drop items if they can't be processed

flowable
    .observeOn(Schedulers.io())
    .subscribe(
        { item -> println("Received: $item") },
        { error -> println("Error: ${error.message}") },
        { println("Complete") }
    )
In this example, if items are being emitted too quickly for the subscriber to process, they’ll be dropped instead of buffered.

Key Takeaways
Use Flowable when you have potentially large data streams and need to control backpressure.
Select a Backpressure Strategy that fits your use case (e.g., BUFFER, DROP, LATEST).
Remember to specify threading when using Flowable since it typically handles asynchronous data streams.
Flowable is a powerful tool in RxJava for dealing with potentially overwhelming data streams, giving you flexibility and control over how emissions are managed.*/

@SuppressLint("CheckResult", "SuspiciousIndentation")
fun main() {

    Observable.fromArray("Red", "Blue", "green")
    val obsrvable =  Observable.just("Red", "Blue", "green")
    val range =  Observable.range(1,15)


    range.subscribeOn(Schedulers.io())
    range.observeOn(Schedulers.io())
    range.subscribe{onNext -> println(onNext)}

    obsrvable.subscribe{it -> println(it)}





}