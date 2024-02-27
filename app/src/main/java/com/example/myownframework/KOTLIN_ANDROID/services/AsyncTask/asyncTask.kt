package com.example.myownframework.Kotlin_Android.Services.AsyncTask

/*what is async task?

AsyncTask is an Android class that allows you to perform operations in a background thread and publish
the result on the main thread. AsyncTask is an abstract class that makes it easier to perform heavy
tasks in the background and keep the UI thread light. This makes the application more responsive.

AsyncTask is designed to be used for short operations (a few seconds at the most). You might want to
use a Service and/or Executor for very long running tasks.

In Android development, you can use asynchronous programming to perform time-consuming tasks in the
background without blocking the main UI thread. To work with asynchronous tasks, you can use the async
and await keywords along with the Task class. Here are some common methods and patterns used in asynchronous tasks in Android:

AsyncTask (Deprecated):
AsyncTask was a popular way to perform background tasks in Android prior to Android API level 30.
It provides methods like doInBackground(), onPostExecute(), and onProgressUpdate() for handling
background operations, updating the UI thread, and publishing progress updates. However, AsyncTask
is now deprecated, and other options are recommended for newer Android versions.

onPreExecute - This method is run on the UI before the task starts and is responsible for any setup that needs to be done.
doInBackground - This is the code for the actual task you want done off the main thread. It will be run on a background thread and not disrupt the UI.
onProgressUpdate - This is a method that is run on the UI thread and is meant for showing the progress of a task, such as animating a loading bar.
onPostExecute - This is a method that is run on the UI after the task is finished.


Coroutines:
Kotlin Coroutines are a more modern and preferred way to perform asynchronous operations
in Android. They allow you to write asynchronous code in a more sequential and readable manner.
You can use the async and await keywords to perform background tasks and then return the results
to the UI thread seamlessly. Here's an example:


import kotlinx.coroutines.*

// Inside an Android ViewModel or a suspend function
fun performBackgroundTask() {
    viewModelScope.launch {
        val result = async(Dispatchers.IO) {
            // Perform a background task here
            // Return the result
        }

        // Update the UI with the result
        val data = result.await()
        // Update UI with 'data'
    }
}

RxJava:
RxJava is a reactive programming library that can be used to work with asynchronous operations in
Android. It allows you to compose and manipulate asynchronous data streams. You can use methods
like subscribeOn() and observeOn() to control the threading and perform background tasks. Here's
an example:

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

// Inside an Android Activity or Fragment
public void performBackgroundTask() {
    Observable.fromCallable(() -> {
        // Perform a background task here
        // Return the result
    })
    .subscribeOn(Schedulers.io())
    .observeOn(AndroidSchedulers.mainThread())
    .subscribe(result -> {
        // Update the UI with the result
    });
}


LiveData and ViewModel:
LiveData and ViewModel are Android Architecture Components that help manage the UI-related data and
lifecycle. You can use them to perform background tasks and observe the results in the UI. LiveData
can automatically update the UI when the data changes.

These are some of the methods you can use to work with asynchronous tasks in Android. The choice of
which method to use depends on your project's requirements and the version of Android you are
targeting. For newer projects and Android versions, Kotlin Coroutines and LiveData are often
recommended due to their simplicity and integration with the Android framework.









*/