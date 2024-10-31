package com.example.myownframework.Kotlin_Android.Classes;

/*

In Kotlin, a nested class is a class that is defined inside another class.
By default, a nested class does not have access to the instance of the outer class.
This makes it a static-like class in Java. To access members of the outer class,
you would need to use an inner class instead.

Explanation:
Nested Class: The Nested class is defined inside the Outer class. It behaves independently
and does not have access to outerProperty or any other members of the Outer class unless
they are static (companion objects).

Instance Creation:
You create an instance of the nested class using the syntax Outer.Nested() because it doesn't need
an instance of Outer to be instantiated.

Practical Use Case
Nested classes are typically used when a class is closely related to its containing class,
but you don't need it to access the containing class's members. For example, if you want
to group together some helper classes or constants.

Summary:
Nested Class:
Defined within another class but does not have access to the outer class's
instance or members unless explicitly passed.

Usage:
Used when you want to logically group classes together that are related but do not
require access to the outer class's members.

Nested classes in Kotlin provide a way to create self-contained classes that belong to a larger entity but
are otherwise independent. This can be useful for organizational and structural purposes in your code.


*/



class Outer {
    private val outerProperty = "Outer Property"

    // Nested class
    class Nested {
        fun greet() = "Hello from the Nested class"
    }

    // Another nested class
    class Helper {
        fun help() = "Helping from the Helper class"
    }
}

fun main() {
    val nested = Outer.Nested()
    println(nested.greet()) // Output: Hello from the Nested class

    val helper = Outer.Helper()
    println(helper.help()) // Output: Helping from the Helper class
}


