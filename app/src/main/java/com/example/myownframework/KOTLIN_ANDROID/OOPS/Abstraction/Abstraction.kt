package com.example.myownframework.Kotlin_Android.OOPS.Abstraction

/*Abstraction is a way of hiding the implementation details and showing only the necessary details.
It is a process of hiding the internal working and showing only necessary details.

In Kotlin, an abstract class is declared using the abstract keyword in front of the class. An abstract
class cannot be instantiated means we can not create object for the abstract class.

Here are some of the points to remember about abstract classes in Kotlin:

We can't create an object for abstract class.

Abstract classes can have both regular and abstract methods or properties.

Abstract classes are always open.

If a class is declared abstract, it cannot be instantiated. To use an abstract class, you have to inherit
it from another class, provide implementations to the abstract methods in it.*/


abstract class Person(age: Int, ssn: Int) {
    var age: Int = 40
    fun displaySSN(ssn: Int) {
        println("My SSN is $ssn.")
    }
    abstract fun displayJob(description: String)
}


/*In this example, the Person class is an abstract class. It has two members: a property called
age and a function called displaySSN(). The displayJob() function is an abstract function, which
means that it does not have a body.

To use the Person class, we need to inherit it from another class and provide implementations to
the abstract methods. For example:*/

class Employee(age: Int, ssn: Int, val jobTitle: String) : Person(age, ssn) {
    override fun displayJob(description: String) {
        println("I am a $jobTitle.")
    }
}


/*
In this example, the Employee class inherits from the Person class. It provides an implementation
for the displayJob() function.

Abstraction is a powerful tool that can help us to write more modular and reusable code.*/
