package com.example.myownframework.Kotlin_Android.Codes.kotlin

fun main() {

  //  isPalindromeUsingFor()
  //  isPalindromeUsingWhile()
  //  isPalindromeUsingReversedMethod()

    palemdrom()

}

fun isPalindromeUsingFor() {

    // using for loop

    val name = "madam"

    val arr = name.toCharArray()

    var reverse = ""

    for (i in arr.size-1 downTo 0){

        reverse+=arr[i]
    }

    if (name == reverse){
        println("given string is palindrome")
    }else {
        println("given string is not palindrome")
    }


}


   fun isPalindromeUsingWhile() {

       val string = "srinivas"
        var reversedString  = ""


          var i = string.length -1
          while(i >= 0){
              reversedString += string[i]
              i -= 1
          }

       if (string == reversedString) {
           println("given string is palindrome")
       } else {
           println("given string is not palindrome")
       }

   }

fun isPalindromeUsingReversedMethod()  {

    val name = "madam"

    val reverse = name.reversed()

    if (name == reverse) {
        println("given string is palindrome")
    } else {
        println("given string is not palindrome")
    }

}


fun palemdrom(){

    val name = "srinivas"
    val arr = name.toCharArray()
    var reverse : String = ""
    for (i in arr.size-1 downTo 0){
        reverse += arr[i]
    }

    println(reverse)
}



