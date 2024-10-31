package com.example.myownframework.KOTLIN_ANDROID.generics.kotlin

/*Generics  in kotlin

-> generics provides Type safety
-> generics avoid Type casting problems
-> Reusability
-> flexibility

Generics in Kotlin, like in Java, provide a way to write classes,
interfaces, and functions that work with any data type while maintaining type safety.
Generics make code more flexible and reusable by allowing type parameters instead of
hardcoding specific types.


concepts have to learn
-------------------------
-> variance (out and in),
-> type projections,
-> bounded types,
-> and star projections

1) Generic Classes:
-------------------
A generic class can operate on objects of various types while providing compile-time type safety
*/

// Example :
class Box<T>(var item: T) {
    fun get() : T = item
    fun set(value: T) {
        item = value
    }
}
/*

2) Generic functions :
----------------------
A generic function can be defined with a type parameter that is independent of any generic type
parameters of the class it is defined in.

//Example
*/
fun <T> print(value : T) {
    println(value)
}

/*
3) Bounded Type Parameters:
Bounded type parameters restrict the types that can be used as arguments for a generic type.
*/

fun <T : Number> sum(a: T, b: T) : Double {
    return a.toDouble() + b.toDouble()
}

/*
4) Variance:  (covariance (in) and contravariance (out))
 Covariance (out):
Allows a generic type to be a subtype of another generic type. This is used when
you want to allow a type parameter to be more specific.

class Producer<out T>(private val item: T) {
    fun produce(): T = item
}

val producer: Producer<Any> = Producer("Hello")  // Valid because String is a subtype of Any

countervariance (in):
Allows a generic type to be a supertype of another generic type. This is used when you want to allow
a type parameter to be more general.

class Consumer<in T> {
    fun consume(item: T) {
        println(item)
    }
}

val consumer: Consumer<String> = Consumer<Any>()  // Valid because Any is a supertype of String

Invariance:
By default, Kotlin generics are invariant, meaning that List<String> is not a
subtype of List<Any> even though String is a subtype of Any.

5) Type Projections:
Type projections allow for more flexible use of generics by specifying how a generic
type can be used within a method.

 */

fun copy(from: Array<out Any>, to: Array<Any?>) {
    for (i in from.indices) {
        to[i] = from[i]
    }
}












fun main() {

    // this is for first example
    //val integerBox = Box(123)
    //val stringBox = Box("Hello")

    //println(integerBox.get())
    // println(stringBox.get())

    // this is for second example
    //print(100)
    //print("srinivas")

    // this is for third example
   // println(sum(10,20))
   //  println(sum(10.5,20.5))

    // this is for fourth example
   // val src: Array<Int> = arrayOf(1, 2, 3)
    //val dest: Array<Any?> = arrayOfNulls(3)
    //copy(src, dest)

    val list = listOf(1,2,3,4,5)
    println(list.getSecondIndex())

}


/*Interview Questions on Generics in Kotlin

Q ) What are Generics in Kotlin?
Answer:
-> Generics in Kotlin allow you to define classes, functions, and interfaces
-> that can operate on any type of object,
->  providing type safety and code reusability.
-> avoid Type casting problems

Q) What is variance in Kotlin Generics, and how does it differ from Java?
Answer :
-> variance in kotlin determines how generic types related to each other with respect to their subtypes
kotlin has explicit variance annotation
-> "out" allows a generic type to be a subtype of another generic type.
-> "in" allows a generic type to be a supertype of another generic type
-> Invariant :  kotlin generic types are invariant by default , meaning List<String> is not a subtype
 of list of List<Any> unlike java kotlin variance is defined at the type level making the code more explicit and safe

 Q ) explain bounded type parameter in kotlin with example
 Answer : bounde type parameter restrict the types that can be used as a argument for a generic type this is
 done using ":" symbol


  fun <T : Number>  square(value : T) : Double {
        return value.toDouble() * value.toDouble()
  }

  // Usage
val result = square(5)  // T is inferred as Int
val result2 = square(5.5)  // T is inferred as Double

Q ) what is projection in kotlin and when would be use it ?
Answer  :
-> type projection is used to control how generics are used in  a function or class.
-> it allows you to specify whether a generic type can be read from or written to within a method.
this is useful when you want to ensure type safety while still allowing some level of flexibility.

fun copy(from: Array<out Any>, to: Array<Any>) {
    for (i in from.indices) {
        to[i] = from[i]  // Safe to read from 'from' and write to 'to'
    }
}

fun main() {
    val ints: Array<Int> = arrayOf(1, 2, 3)
    val anys: Array<Any> = arrayOfNulls(3)

    copy(ints, anys)

    for (item in anys) {
        println(item)  // Outputs: 1, 2, 3
    }
}

Q ) difference bw in and out  in generics
out (Covariant):
Used when you want to produce (return) items of a type.
This ensures that a type parameter can be safely used as a return type but not as a parameter.

class Producer<out T>(private val item: T) {
    fun produce(): T = item
}

in (Contravariant):
Used when you want to consume (accept) items of a type.
This ensures that a type parameter can be safely used as a parameter type but not as a return type.

class Consumer<in T> {
    fun consume(item: T) {
        println(item)
    }
}


Q ) Can you create a generic extension function in Kotlin? Provide an example.
Ans  : yes you can create


*/

fun <T> List<T>.getSecondIndex() :  T? {
    return  if (this.size > 2) this[2] else null

}

/*
Q ) what are star projections in kotlin
Ans : in kotlin star projections are used to denote an unknown type with certain constraint in generics . it can be used
when you dont care about the exact type but still want to work with generic type

fun printList(list: List<*>) {
    for (item in list) {
        println(item)
    }
}
Here, List<*> allows you to pass a list of any type to the function.

Q ) Explain the difference between List<out T> and List<in T> in Kotlin.

List<out T>:
This means that the list is covariant and can be used in a context where a list of any subtype
 of T is expected. You can read from this list but cannot add elements to it.

List<in T>:
This means that the list is contravariant and can be used in a context where a
list of any supertype of T is expected. You can add elements to this list, but reading from it will
give you the most general type.


Summary
Generics in Kotlin allow you to write flexible, type-safe, and reusable code.
Understanding the concepts of variance (out and in), type projections,
bounded types, and star projections is crucial for mastering Kotlin generics
and will often be a topic in technical interviews.

*/


