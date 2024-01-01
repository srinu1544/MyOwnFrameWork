package com.example.myownframework.Kotlin_Android.safecallOperators

/*

colon (?:)


The Elvis operator will evaluate the left expression and will return
it if it’s not null else will evaluate the right side expression.
Please note that the right side expression will only be called if
the left side expression is null.

Note that, since throw and return are expressions in
Kotlin, they can also be used on the right-hand side
of the Elvis operator. This can be very handy, for
example, for checking function arguments

The Elvis operator is used to return a non-null value or a default value
when the original variable is null. In other words, if left expression is
not null then elvis operator returns it, otherwise it returns the right
expression. The right-hand side expression is evaluated only if the left-hand
side found to be null.
The following expression: */


 var firstName : String? = null
//val name = firstName ?:  throw IllegalArgumentException("name expected")
val name = firstName ?:  "unknown"

fun main(){
    //println(name)
    elevis()
}



/*
val name = if(firstName!= null)
    firstName
else
    "Unknown"*/



fun elevis(){

    var str : String? = "srinivas"

    val result  = str?.length ?: "srinivas"

    println(result)


}



