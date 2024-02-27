package com.example.myownframework.Kotlin_Android.Methods_Functions.kotlin

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.myownframework.R


/*In Kotlin, a lambda function is an anonymous function that can be
used as an argument to higher-order functions, or it can be stored
in a variable and called later. Lambda functions are a concise way
to define small, inline functions without explicitly declaring a
separate function

lambda function example :
-------------------------
list.filter

*/

fun main() {


        // lambda example
        val greet = {println("hello")}
        greet()


        // ex single perameter
        val square = {x:Int -> x*x}
        println("square root of 3 is ${square(3)}")


        // with multiple perameters
        val add = {x:Int,y:Int -> x+y}
        val addNum = add(4,5)
        println(addNum)


        //print lucky number by given name and number
        val luckyNum = {name:String,num:Int -> "hi $name your lucky number is $num"}
        println(luckyNum("srinivas",4))


        val listStrings = listOf<String>("nani","srinivas","Roja","siri","sreeleela","sweety")
        val newList  = listStrings.customFilter { it.length > 4 }
        println(newList)


}


fun List<String>.customFilter(filterfunction:(String) -> (Boolean)) : List<String> {

        val result = mutableListOf<String>()
        for (string in this){
                if(filterfunction(string)) {
                        result.add(string)
                }
        }
        return result
}


@Preview
@Composable
fun ImageExample() {

        Image(painter = painterResource(id = R.drawable.custom_lambda),
                contentDescription = null,
                modifier = Modifier.background(Color.Black)
        )

}
