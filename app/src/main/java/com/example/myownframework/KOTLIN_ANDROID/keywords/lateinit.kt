package com.example.myownframework.Kotlin_Android.keywords

/*

lateinit :
----------

The lateinit keyword in Kotlin is used to declare a variable that will be initialized
later in the program. This can be useful in cases where you need to use a variable before
it has been initialized, but you are sure that it will be initialized before it is used.


The lateinit keyword in Kotlin is used to declare a non-nullable property that
can be initialized later. This can be useful in situations where you need to use
a property before it has been initialized, such as when you are using a dependency
injection framework

Here are some of the benefits of using lateinit var:
----------------------------------------------------

It allows you to avoid nullable types and provides a guarantee that the property will not be
null when accessed.

It is useful in situations where you need to use a property before it has been initialized
,such as when you are using a dependency injection framework.

It can make your code more concise and readable.

Here are some of the things to keep in mind when using lateinit var:
------------------------------------------------------------------
Make sure to initialize the property before you use it.
lateinit var can't have custom getter or setter whereas lazy has custom getter.

A lateinit property can't have a custom getter whereas a lazy property has a block that gets
executed whenever the first time that property is called.

lateinit var is a powerful tool, but it should be used with caution. If you are not careful,
you can easily end up with code that is difficult to read and maintain




*/


lateinit var myVariable: String

fun myFunction() {
    myVariable = "Hello, world!"
    println(myVariable)
}


fun main() {
    myFunction()
}

