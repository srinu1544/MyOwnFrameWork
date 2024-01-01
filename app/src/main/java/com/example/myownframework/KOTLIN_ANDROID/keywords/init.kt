package com.example.myownframework.Kotlin_Android.keywords


/*


init keyword is used in Kotlin to initialize properties of a class.
It is similar to the constructor keyword in Java, but it is more flexible.
The init keyword can be used to initialize properties before or after the constructor is called.
Here is an example of how to use the init keyword in Kotlin: */

class Personn {
    var name: String
    var age: Int

    init {
        name = "John Doe"
        age = 30
    }

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
}

/*In this example, the init keyword is used to initialize the name and age properties before the constructor
is called. The constructor is then used to initialize the name and age properties again. This is perfectly
valid, and it is often used to initialize properties that are not known at compile time.
The init keyword can also be used to initialize properties that are dependent on other properties.
For example, the following code initializes the fullName property after the name and lastName properties
have been initialized:*/


class Person {

    var firstName : String = ""
    var lastName: String = ""
    var fullName: String  = ""

    init {
        fullName = "$firstName$lastName"
        println("init called")
    }

    constructor(firstName: String, lastName: String) {
        this.firstName = firstName
        this.lastName = lastName
        println("constructor called")
    }
}

fun main(){
    val person = Person("sai","srinivas")
}

/*The init keyword is a powerful tool that can be used to initialize properties in Kotlin.
It is more flexible than the constructor keyword, and it can be used to initialize properties
 that are not known at compile time or that are dependent on other properties.*/



