package com.example.myownframework.Kotlin_Android.Classes;

/*
A data class in Kotlin is a special kind of class that is used to store data. It is a concise way to
define a class that has properties and some basic operations on those properties. Data classes are immutable,
which means that their properties cannot be changed once they are created. This makes them ideal for storing
data that needs to be kept consistent.

Here is an example of a data class in Kotlin:
data class User(val name: String, val age: Int)

This class has two properties, name and age. The name property is a string, and the age property is an integer.
The data keyword tells the compiler that this is a data class. This allows the compiler to generate some
useful functions for the class, such as equals(), hashCode(), and toString().

Here is an example of how to use the User data class:
val user1 = User("Alice", 25)

val user2 = User("Bob", 30)

println(user1.name) // prints "Alice"
println(user1.age) // prints 25
println(user1 == user2) // prints false



val user3 = user1.copy() // creates a copy of user1

println(user3.name) // prints "Alice"

println(user3.age) // prints 25



println(user1 == user3) // prints true
Use code with caution.
Learn more
As you can see, the User data class is a concise and efficient way to store data.
It provides some useful functions that make it easy to work with the data.


Here are some of the advantages of using data classes in Kotlin:
Automatic equals(), hashCode(), and toString() methods:

Data classes automatically generate equals(), hashCode(), and toString() methods based on the
properties declared in the primary constructor. This eliminates the need to write these methods
manually, which can save time and reduce the risk of errors.


ComponentN() functions:
-----------------------
Data classes automatically generate componentN() functions, which allow you to access the
properties of a data class object in a destructuring declaration. This can make code more
concise and readable.

Copy() function:
----------------
Data classes automatically generate a copy() function, which allows you to create a copy of
a data class object with modified properties. This can be useful for implementing immutable
data structures or for making deep copies of objects.

Data classes are Kotlin-specific:
---------------------------------
Kotlin data classes are a specific feature of the Kotlin language. This means that they are
not available in other programming languages, which can make your code more Kotlin-idiomatic.

Safer for multithreading:
------------------------
Data classes are immutable by default, which means that their properties cannot be changed
once they are initialized. This makes them safer to use in multithreaded applications,
where it is important to avoid race conditions.

Performance benefits:
---------------------
Data classes can have some performance benefits over regular classes.
For example, the JVM can optimize the way that data classes are stored and accessed in memory.
Overall, data classes are a powerful feature of Kotlin that can make your code more concise,
readable, and maintainable.

Data class internally contains the following functions:

equals(): Boolean
hashCode(): Int
toString(): String
component() functions corresponding to the properties
copy()



*/


data class Person(val name : String , val age : Int)


fun main(){


}