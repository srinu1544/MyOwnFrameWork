package com.example.myownframework.Kotlin_Android.Methods_Functions.kotlin

/*In Android development (as well as in Kotlin in general),
the noinline keyword is used in
conjunction with inline functions
to specify that certain lambda parameters
should not be marked as inline themselves.
When you mark a lambda parameter as noinline,
it means that the lambda cannot
be inlined at the call site where the function is invoked.
This can be useful when you want to ensure
that the lambda retains its reference and doesn't get inlined,
which can affect its behavior
or prevent certain optimizations.

In the performOperation function, the callback parameter
is marked as inline, which means it can
be inlined at the call site, potentially
improving performance. However, the errorCallback
parameter is marked as noinline, which prevents it
from being inlined. This can be useful when
you want to ensure that the lambda retains its
reference, for example, if you want to log an error
message or perform some error handling logic that
should not be optimized away.

noinline is particularly useful in scenarios where
you need to pass lambdas to higher-order functions
that are themselves inline functions but want to retain
control over which lambdas can be inlined and
which cannot. */



inline fun performOperation(callback: () -> Unit, noinline errorCallback: () -> Unit) {
    try {
        // Perform the operation
        callback()
    } catch (e: Exception) {
        // Handle the error
        errorCallback()
    }
}

fun main() {
    performOperation(
        {
            // This lambda can be inlined at the call site
            println("Performing the operation")
        },
        {
            // This lambda is marked as 'noinline' and cannot be inlined
            println("Error occurred while performing the operation")
        }
    )
}






