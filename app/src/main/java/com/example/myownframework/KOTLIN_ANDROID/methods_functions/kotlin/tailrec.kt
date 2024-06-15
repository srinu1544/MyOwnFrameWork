package com.example.myownframework.Kotlin_Android.Methods_Functions.kotlin

/*In traditional recursion call, we perform our recursive call first, and then we take the
return value of the recursive call and calculate the result. But in tail recursion, we
perform the calculation first, and then we execute the recursive call, passing the results
of the current step to the next recursive call. In the end, both recursion and tail
 recursion gives same output. The must follow rule for the tail recursion is that recursive
 call should be the last call of the method */



fun Fact(num: Int, x:Int):Long{

    return if(num==1)   // terminate condition
        x.toLong()
    else
        Fact(num-1,x*num)   //tail recursion
}
fun main() {
    var n = 1
    var result = Fact(5,n)
    println("Factorial of 5 is: $result")
}