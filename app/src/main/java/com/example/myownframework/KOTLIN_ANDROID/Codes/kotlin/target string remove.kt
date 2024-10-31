package com.example.myownframework.KOTLIN_ANDROID.Codes.kotlin


fun main(){
    val arr = arrayOf("bat","rat","cat","mat")
    val result = removeTargetString(arr,"cat")
    println(result.joinToString())
}

fun removeTargetString(array : Array<String> , target : String) : Array<Any> {
    val filterdString = array.filter{it != target}
    val firstChars    = filterdString.map{it.first()}.joinToString()
    return (filterdString+firstChars).toTypedArray()
}


