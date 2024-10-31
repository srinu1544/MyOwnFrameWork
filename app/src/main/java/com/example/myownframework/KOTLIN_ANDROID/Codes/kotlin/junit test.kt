package com.example.myownframework.KOTLIN_ANDROID.Codes.kotlin

import org.junit.Test
import org.testng.Assert.assertEquals

fun main() {
    val result = MySingleTon.multiply(4,5)
    println(result)
}

object MySingleTon {
    fun multiply(a:Int, b : Int) : Int {
        return a*b
    }
}

class MathSingleTonTest {

    @Test
    fun testMultiply(){
        val  a=5
        val b=3
        val expected = 15

        val result = MySingleTon.multiply(a,b)
        assertEquals(expected,result, "multiplication result should be 15")
    }
}