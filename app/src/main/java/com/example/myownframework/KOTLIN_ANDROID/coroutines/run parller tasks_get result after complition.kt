package com.example.myownframework.Kotlin_Android.coroutines

/*In Android, you can use Kotlin coroutines to run parallel tasks using the async function,
 which allows you to perform concurrent operations and then await their results. To know
 when all parallel tasks are completed, you can use awaitAll or other methods to track
 their completion. Here's a step-by-step guide:

Add Coroutines Dependency:
Ensure you have the Kotlin coroutines library added to your project. You can include it in
your app-level build.gradle file:

implementation "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.x.x"
Make sure to replace 1.x.x with the latest version available.

Use the async Function for Parallel Execution:
You can use the async function to execute tasks concurrently. Here's an example of how to do this:

import kotlinx.coroutines.*

suspend fun parallelTasks() {
    val task1 = async { // First parallel task
        // Your task logic here
    }

    val task2 = async { // Second parallel task
        // Your task logic here
    }

    // Await both tasks to complete
    val result1 = task1.await()
    val result2 = task2.await()

    // Now you can work with the results
    // ...

    // Optionally, you can use async {} for more tasks.
}
Wait for All Tasks to Complete:
To wait for all parallel tasks to complete, you can use the awaitAll function. This function
takes multiple Deferred objects and suspends the coroutine until all of them are done.
Here's how you can use it:



suspend fun parallelTasks() {
    val task1 = async { /* Task 1 */ }
    val task2 = async { /* Task 2 */ }
    val task3 = async { /* Task 3 */ }

    // Wait for all tasks to complete
    val results = awaitAll(task1, task2, task3)

    // Now you can work with the results
    // ...
}
Calling the Parallel Task Function:
To actually execute your parallelTasks function, you should call it within a CoroutineScope.
 You can do this in an Android ViewModel, in an Android Activity, or within a CoroutineScope
  that you create explicitly. Ensure that you handle exceptions appropriately.


viewModelScope.launch {
    try {
        parallelTasks()
        // All parallel tasks have completed successfully
    } catch (e: Exception) {
        // Handle exceptions here
    }
}
Now, when you call the parallelTasks function within a coroutine, it will execute the
tasks in parallel, and you can wait for all of them to complete using awaitAll. Once all
tasks are finished, you can work with their results as needed.


Remember to handle exceptions that might occur during the execution of parallel tasks,
as shown in the try-catch block in the example.
*/
