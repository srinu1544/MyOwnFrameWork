package com.example.myownframework.Kotlin_Android.safecallOperators

/*Another way of using a nullable property is safe call operator ?.

This calls the method if the property is not null or returns null if that
 property is null without throwing an NPE (null pointer exception).

Null Comparisons are simple but number of nested if-else expression could
be burdensome. So, Kotlin has a Safe call operator, ?. that reduces this
complexity and execute an action only when the specific reference holds
a non-null value.. It allows us to combine a null-check and a method call
in a single expression.*/

fun main(){
    var name : String? = "srinivas"
    println(name?.length)
    name = null
    println(name?.length)
}