package com.example.myownframework.Kotlin_Android.Constructors

/*

please refer : https://www.youtube.com/results?search_query=kotlin+constructors



-> if we not define any constructor default constructor is available
-> cannot write any logic in primary constructor bec we don't have any body
-> if you want to write any logic we can write in the init block
-> init block will called after call the primary constructor
-> we can have multiple init blocks
-> we can have multiple secondary constructors
-> need of secondary constructor is for overload different arguments for diff constructors
-> we can not write val or var in secondary constructor
-> we must call primary constructor from secondary constructor with this keyword

A class in Kotlin has a primary constructor and possibly one or more secondary constructors.
The primary constructor is declared in the class header, and it goes after the class name
 and optional type parameters.



class Person private constructor(firstName: String) { /*...*/ }
If the primary constructor does not have any annotations or visibility modifiers,
the constructor keyword can be omitted:


class Person(firstName: String) { /*...*/ }



In Kotlin, a constructor is a special function that is used to initialize the properties of a class.
It is declared with the same name as the class and has no return type.

There are two types of constructors in Kotlin:

Primary Constructor: The primary constructor is the first constructor that is called when an object is created.
It is declared in the class header and has no parameters.

Secondary Constructor: The secondary constructor is a constructor that is declared after the primary
constructor. It can have parameters and is used to initialize the properties of the class in a more
specific way.

Here is an example of a class with a primary constructor:

class Person(name: String, age: Int) {
    var name: String = name
    var age: Int = age
}

Here is an example of a class with a secondary constructor:

class Person(name: String) {
    var name: String = name
    var age: Int = 0
    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }
}

To create an object of a class, you use the new keyword followed by the name of the class and the
arguments for the constructor.

Here is an example of how to create an object of the Person class:

var person = Person("John Doe", 30)

This will create a new object of the Person class with the name "John Doe" and the age 30.*/


class Box(val length : Int, val width : Int, val bearth : Int) {  // this is primary constructor


    init {
        println("init block called")
        println("init block legth$length width $width bearth $bearth")
    }


    //secondary constructor
    constructor() : this(10,10,10){    // this is secondary constructor
        println("legth$length width $width bearth $bearth")
    }

}

fun main(){
    val box = Box(12,12,13)
}