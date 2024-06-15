package com.example.myownframework.Kotlin_Android.Methods_Functions.kotlin



/* In Kotlin, a higher-order function is a function that can accept other functions
 as parameters and/or return a function as its result. This concept is closely related
 to functional programming and is a powerful feature that allows you to write more modular
 and expressive code. Higher-order functions are used extensively when working with collections,
 asynchronous programming, and other functional programming patterns. Here are some examples
 of higher-order functions in Kotlin */



/*
  Uses
 -------
Higher-order functions in Kotlin have a wide range of uses that can make your code more concise,
modular, and expressive. Here are some common uses of higher-order functions in Kotlin:

Functional Transformations:

map: Use map to transform each element in a collection and create a new collection with the
transformed values.
filter: Use filter to create a new collection by selecting elements from an existing collection
that satisfy a given predicate.
flatMap: Use flatMap to transform elements and flatten nested collections into a single collection.
Aggregations:

reduce: Use reduce to combine elements of a collection into a single value by applying a binary operation.
fold: Similar to reduce, but with an initial accumulator value.
Iteration:

forEach: Iterate over the elements of a collection and perform an action for each element.
forEachIndexed: Iterate over the elements of a collection with access to the index of each element.
Sorting and Ordering:

sortedBy: Sort a collection based on a key selector function.
groupBy: Group elements of a collection by a key extracted using a function.
Asynchronous Programming:

Use higher-order functions like runBlocking, async, and await from Kotlin's coroutines library to work
with asynchronous code in a structured and readable way.
Custom Control Flow:

Define custom control flow structures using higher-order functions. For example, you can create a retry
function that retries an operation based on a condition.
Dependency Injection:

Use higher-order functions to inject dependencies into functions or classes. This is commonly seen in
frameworks like Koin and Dagger for dependency injection.
Validation:

Create reusable validation rules using higher-order functions to check if an input meets specific
criteria.
Logging:

Create custom logging functions that log messages with additional metadata or formatting based on the
logging level.
Event Handling:

Define event handlers that respond to different events or actions in your application. For example,
handling button clicks in a user interface.
Configurable Behavior:

Allow users of your library or framework to customize behavior by passing functions as parameters.
This is common in DSL (Domain-Specific Language) creation.
Testing:

In unit testing, you can use higher-order functions to inject mock dependencies or define test cases
as functions.
Functional Composition:

Compose multiple functions together using higher-order functions like compose or andThen to create
complex operations from simpler ones.
Higher-order functions are a fundamental feature of Kotlin that promote functional programming
principles and enable you to write clean, reusable, and expressive code. They are particularly
powerful when combined with lambda expressions and can make your code more modular and adaptable to
changing requirements.


real examples of higherorder function

fold() - in collection

*/


// higher order function example 1
fun higherOrder(x:Int, operation : (Int) -> Int) : Int {
    return operation(x)
}


fun add(a:Double,b:Double) : Double {
    return a*b
}

fun higherOrder2(a:Double,b:Double, fn: (Double,Double) -> Double) : Any  {
    return fn(a,b)
}

//higher order example 3

fun rollDice(range : IntRange, time : Int, callback : (result:Int) -> Unit) {

    for (i in 0 until time) {
        val result = range.random()
        callback(result)
    }

}


fun higherOrder4(range : IntRange, time : Int , callback : (result:Int) -> Unit ){

      for (i in 0 until time){
          val result  = range.random()
          callback(result)
      }

  }



fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}





fun generateMultiplier(factor: Int) : (Int) -> Int {
    return { x -> x * factor }
}


 fun operations(x:Int,y:Int, op : (Int,Int) -> Int) : Int {
     return op(x,y)
 }


fun singeleOperations(x:Int,op : (Int) -> Int) : Int {
    return op(x)
}

fun main(){

    //calling example 1
    // val add5 =  higherOrder(4) {value -> value  * value}
    // println(add5)

    //calling functio 2
    // val result = higherOrder2(2.0,3.0, ::add)
    // println(result)

    // we can pass the lambda in peranthasis and out side the pernthasis
    // when you pass the lambda in out side the peranthasis called treiling
    // lambda. like below

    //rollDice(1..8,4,{it-> println(it)})  // this is trailing lambda
    // rollDice(1..8,4,{ println(it)})


    //higherOrder4(1..16,10,{it-> println(it)})

    // val sum = operateOnNumbers(5, 3) { x, y -> x + y }
    // val product = operateOnNumbers(5, 3) { x, y -> x * y }


    // val double = generateMultiplier(2)
    // val triple = generateMultiplier(3)

    // val result1 = double(5) // Result: 10
    // val result2 = triple(5) // Result: 15

    val add =  operations(3,5,{x,y -> x+y})
    val mul =   operations(3,5,{x,y -> x*y})

    //println(add)
    //println(mul)

    val plusLuck = singeleOperations(4,{ x-> x+4})
    println(plusLuck)




}






















