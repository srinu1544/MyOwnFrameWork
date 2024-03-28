package com.example.myownframework.Kotlin_Android.Methods_Functions.kotlin

    /*In Kotlin, the crossinline keyword is used to specify that a
     lambda parameter passed to a higher-order function should not
     allow non-local returns. This keyword is typically used when
     return statement to return control flow to the caller of the
     you want to ensure that the lambda expression cannot use the
     higher-order function */



/*In this example, higherOrderFunction is an inline function that takes
a lambda parameter marked with crossinline. This means that the lambda
passed to higherOrderFunction cannot contain return statements that
would return control flow to the caller of higherOrderFunction.

Here's an example to illustrate how crossinline works : */

inline fun compareInts(a:Int,b:Int, crossinline responce : (String) -> Unit)  {
    println("settings up comparison")

   val task = Runnable {
       if (a > b) {
           responce("a>b")
       } else if (a < b) {
           responce("a<b")
       } else {
           responce("a == b")
       }
   }
    task.run()


}


/*fun main() {

    compareInts(4, 5) { it ->
        println(it)
    }

}*/


inline fun performAsyncOperation(callback: (String) -> Unit) {
    // Simulate an asynchronous operation
    val result = "Async operation result"

    // Execute the callback in the same context
    callback(result)
}

fun main() {
    performAsyncOperation { result ->
        println("Result received: $result")
        // Do some other work here...
    }
}





/*fun main(args: Array<String>) {
    val num = bar()
    println(num)
}*/




/*In the above code, the lambda passed to higherOrderFunction cannot
 use return to return control flow to the main function. If you attempt
 to use return within the lambda, it will result in a compilation error.

The use of crossinline is particularly relevant in scenarios where you're
passing lambdas to functions that perform asynchronous operations or callbacks,
and you want to prevent non-local returns that could lead to unexpected behavior.

Please note that crossinline is not always needed, and its usage should be
considered carefully. It's typically used in specific scenarios where you
want to ensure that control flow remains within the immediate lexical scope
of the lambda and doesn't escape to the outer function.


link : https://www.youtube.com/watch?v=QsOXgTwLqIo&t=67s&ab_channel=KotlinBytes


 */

