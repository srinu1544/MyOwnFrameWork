package com.example.myownframework.Kotlin_Android.SafecallOperators

/*
double exclamation mark (!!)

The not null assertion (!!) operator converts any value to a
non-null type and throws an exception if the value is null.
If anyone want NullPointerException then he can ask explicitly
 using this operator.*/


        fun main(args: Array<String>) {
        var str : String?  = "GeeksforGeeks"
        println(str!!.length)
        str = null
     //   str!!.length

        var b = ""

        val l = b!!.length
    }
