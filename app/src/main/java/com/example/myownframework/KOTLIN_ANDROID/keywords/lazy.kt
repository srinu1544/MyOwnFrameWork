package com.example.myownframework.Kotlin_Android.keywords

/*
lazy :
------

by using lazy it creates object when it is coming to used state

In Kotlin, you can use the lazy delegate to create a property that is initialized lazily,
meaning it will only be computed the first time it is accessed. This can be useful for
expensive or time-consuming operations that you only want to perform when the value is
actually needed. Here's an example:



Lazy initialization is a feature in Kotlin that allows you to delay the initialization of
a property until it's first accessed. This can be useful for improving performance,
as it avoids initializing properties that are never used.

To use lazy initialization, you use the lazy() function. The lazy() function takes a
lambda expression as its argument, and returns a Lazy<T>. The Lazy<T> object can be
used as a delegate for a property. When the property is first accessed, the lazy()
function will execute the lambda expression and store the result. Subsequent accesses
 to the property will simply return the stored result.

Here is an example of how to use lazy initialization:
class MyClass {
    val myProperty: String by lazy {
        // This lambda expression will be executed the first time
        // myProperty is accessed.
        "Hello, world!"
    }
}

In this example, the myProperty property will not be initialized until it is first
accessed. When it is first accessed, the lazy() function will execute the lambda
expression and store the result. Subsequent accesses to the myProperty property
will simply return the stored result.

Lazy initialization can be a useful tool for improving performance, as it avoids
initializing properties that are never used. It can also be useful for simplifying
code, as it can eliminate the need to initialize properties that are only used in a
few places.


 */


class MyClass {
    val myLazyProperty: String by lazy {
        // This block of code will only be executed the first time myLazyProperty is accessed
        println("Computing the value")
        "Lazy Property Value"
    }
}

fun main() {
    val myObject = MyClass()

    // The following line will trigger the initialization of myLazyProperty
    println(myObject.myLazyProperty)

    // Since the property is now initialized, accessing it again won't recompute the value
    println(myObject.myLazyProperty)
}