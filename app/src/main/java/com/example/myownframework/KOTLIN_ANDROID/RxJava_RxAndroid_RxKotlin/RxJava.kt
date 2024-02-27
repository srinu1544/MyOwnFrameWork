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