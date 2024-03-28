package com.example.myownframework.Kotlin_Android.Coroutines


import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


/*


please refer : https://kotlinlang.org/api/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/-coroutine-scope/
what is coroutine:
------------------

-> coroutines are light weight thread

-> Coroutines are available for Kotlin. They execute long-running tasks without blocking
the main thread or freezing the UI.

-> In kotlin coroutines are a feature that allows you to write asynchronous , non-blocking code
in a more sequential and structured manner.

-> They are the part of kotlin library and provide a way to perform concurrent operations with
out dealing with the complexities of traditional call b ack or thread - based approaches.




suspend function :
------------------
-> start, resume and pause coroutine execute coroutine
-> you cannot call suspend function either coroutine or another suspend function
-> it does not block the main thread
-> suspend means function can suspend and start it is same as writing callbacks but in simple
and cleaner way
-> In this function network request will be called asynchronously in the io thread and get the
result and process in the main thread

from 2.6 retroft supports coroutines

scopes :
---------

Coroutine scope
Global Scope
LifeCycle Scope
ViewModel Scope


coroutine scope :
-----------------

-> we can create an individual coroutine scope this is a scope we really control and where we can say
is scope.cancel to cancel all coroutines in that scope that's very helpful if you create a custom component
that has a lifecycle where we need coroutine in it so unless you really know what you're doing prefer
coroutine in scope and cancel the scope as soon as you don't need the coroutine anymore

Defines a scope for new coroutines. Every coroutine builder (like launch, async, etc.)
is an extension on CoroutineScope and inherits its coroutineContext to automatically propagate
all its elements and cancellation.


The best ways to obtain a standalone instance of the scope are CoroutineScope() and MainScope()
factory functions, taking care to cancel these coroutine scopes when they are no longer needed
(see section on custom usage below for explanation and example).


Additional context elements can be appended to the scope using the plus operator.

Convention for structured concurrency
Manual implementation of this interface is not recommended, implementation by delegation
should be preferred instead. By convention, the context of a scope should contain an instance
 of a job to enforce the discipline of structured concurrency with propagation of cancellation.

Every coroutine builder (like launch, async, and others) and every scoping function
(like coroutineScope and withContext) provides its own scope with its own Job instance
into the inner block of code it runs. By convention, they all wait for all the coroutines
inside their block to complete before completing themselves, thus enforcing the structured
concurrency. See Job documentation for more details.

every coroutine need to run inside some scope we can not run coroutine with out a coroutine scope
it way to keep to track of all coroutines that runs inside it so coroutine scope takes coroutine context
as a parameter and coroutine context is a set of various elements in and the main elements of coroutine
context are the job of the coroutine its a dispatcher and coroutine name

coroutine scope and coroutine context are closely related and you can say that the coroutine scope context
is inherit so for example when a coroutine is launched inside the certain scope of another coroutine it
inherits its context and the job of the new coroutine becomes a child job of the parent coroutine so when
the parent coroutine is canceled all its children are canceled as well and the parent coroutine always waits
for competition of all its children by default

job + dispatcher + coroutineName


CoroutineScope(Dispatcher.Main).launch {
println("hello")
}


Global scope :
-------------
The life cycle of global scope is life cycle of whole application that is why we never use
this Global scope because it may cause memory leaks.

this scope is used in only quick debuging things

GlobalScope.launch(Dispatchers.Main){
}


life cycle scope :
------------------
This scope is automatically canceled when your activity or fragment destroyed so we dont need
worry about memory leaks

viewmodel scope :
-----------------
A ViewModel Scope is defined for each ViewModel in your app. Any coroutine launched in this scope
is automatically canceled if the ViewModel is cleared. Coroutines are useful here for when you
have work that needs to be done only if the ViewModel is active. For example, if you are computing
some data for a layout, you should scope the work to the ViewModel so that if the ViewModel is
cleared, the work is canceled automatically to avoid consuming resources.

You can access the CoroutineScope of a ViewModel through the viewModelScope property of the
ViewModel, as shown in the following example:


class MyViewModel: ViewModel() {
    init {
        viewModelScope.launch {
            // Coroutine that will be canceled when the ViewModel is cleared.
        }
    }
}

launch :
--------
-> where launch is used for where you don't want to get result back (updating of data extra)
-> launch the coroutine and forget
-> launch calls sequentially


withContext :
------------
-> this is a suspending function call only in coroutine
-> switch the context
-> It is mainly used for shift execution of block into a different thread if new dispatcher is
 specified.
withContext is nothing but another way of writing the async where one does not have to
write await(). When withContext, is used, it runs the tasks in series instead of parallel.
So one should remember that when we have a single task in the background and want to get
back the result of that task, we should use withContext

await :
------
-> blocking the main thread
->  await retrieves the result.
-> Await can be used on the main thread




async :
-------
-> parallel execution
-> it calls the function concurrent manner
-> start the coroutine and get result back
-> it returns a  deferred value
-> with the use of await it get the actual value otherwise it gets deferred value.
-> async can be on the background thread.

runBlocking :
----------
-> it blocks our thread
-> it blocks the current thread
-> it is also block onDraw function for updating ui and it will lead to unresponsive application.
->  it is used for testing and debuging purpose

delay :
-------
simply delay the execution with the given milliseconds

yield :
-------


//Dispachers

https://www.youtube.com/watch?v=3q5dvywJMfo&ab_channel=Smartherd

    Dispatchers.Io -> network request or desk read and write
    Dispatchers.Main -> main safety
    Dispatcher.Default -> cpu intensive tasks
    Dispatchers.Unconfined



Dispatchers.Io :
================

It is used when we want to block threads with I/O (input-output) operations, such as when
we want to read/write files.

We should use Dispatchers.IO to perform disk or network I/O-related tasks. In a nutshell,
 anything related to file systems or networking should be done using Dispatchers.IO as
 those tasks are IO-related tasks.

We can think of Dispatchers.IO as a Schedulers.io() of RxJava.

Example use cases:
-----------------

Any network operations like making a network call.
Downloading a file from the server.
Moving a file from one location to another on disk.
Reading from a file.
Writing to a file.
Making a database query.
Loading the Shared Preferences.

Syntax
------
launch(Dispatchers.IO)



Dispatchers.Main:
=================

It is not used very often. It’s only used in Android applications when we want to interact
with the UI. It is restricted to the main thread as it is only used when we want to run our
coroutine on the main thread. If we’re going to use this, we first need to set a dispatcher
using Dispatchers.setMain(dispatcher).

Example use cases:
-------------------

Performing UI-related tasks.

Any small tasks like any operations on a smaller list present in the memory like sorting,
filtering, searching, etc.

Syntax
-------
launch(Dispatchers.Main)

Dispatcher.Default
===================

We use the default dispatcher when we want to run CPU-intensive functions. If we forget
to choose our dispatcher, this dispatcher will be selected by default.

We should use Dispatchers.Default to perform CPU-intensive tasks.

Example use cases:
------------------

Doing heavy calculations like Matrix multiplications.

Doing any operations on a bigger list present in the memory like sorting, filtering, searching, etc.
Applying the filter on the Bitmap present in the memory, NOT by reading the image file present on
the disk.

Parsing the JSON available in the memory, NOT by reading the JSON file present on the disk.
Scaling the bitmap already present in the memory, NOT by reading the image file present on the disk.
Any operations on the bitmap that are already present in the memory, NOT by reading the image file
present on the disk.

    -> CPU intensive task
    -> this is similar to GlobalScope.launch{}
    -> It will execute on separate background thread
    -> after delay function also it will might be change thread

Syntax
------
launch(Dispatchers.Default)


 Dispatchers.Unconfined :
 ========================

An unconfined dispatcher isn’t restricted to a particular thread. This dispatcher contrasts with
those mentioned earlier as it changes no threads. At the point when it is begun, it runs on the
thread on which it was begun.

   -> it is execute on parent
    -> it inherits coroutine context from parent coroutine
    -> after delay function also it will run on the other thread

Syntax
------
launch(Dispatchers.Unconfined)



    with out any dispatcher (parameter) CONFINED  DISPATCHER  :
    -----------------------------------------------------------

     -> only launch means it runs on main thread
     -> it inherits coroutine context from parent coroutine
     -> after delay function also it will run on the same thread

     launch{ // it runs on parent thread
     }

     like :

     runBlock {
      launch{ // it runs on parent thread
       }
     }




    Job :
    -----
   -> coroutines life cycle
   -> cancellation
   -> parent-child-relation


   State	                   isActive	 isCompleted  isCancelled
New (optional initial state)	false	  false	          false
Active (default initial state)	true	  false	          false
Completing (transient state)	true	  false	          false
Cancelling (transient state)	false	  false	           true
Cancelled (final state)	false	true	  true             true
Completed (final state)	false	true	  false            false

   join :
   -----

   cancelAndJoin :
   --------------

   ensureActive :
   ---------------

   coroutinescope :
   --------------
   -> this scope is unique for each coroutine

   coroutinecontext :
   ------------------
   -> coroutinecontext is inherited from parent to child



 */
fun main() = GlobalScope.launch(Dispatchers.IO) {

}




