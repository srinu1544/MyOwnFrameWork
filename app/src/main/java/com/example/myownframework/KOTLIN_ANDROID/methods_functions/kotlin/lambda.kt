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

/*fun main() {


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

        println(square(3))




}*/

fun main(){
        //println(add(5,5))
        //println(addPlus1("5"))
        println(agediscription(23))
}


val square : (number : Int) -> String = { number ->

        val result = number*number
        "$number * $number = $result"

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

fun callLambdaWithLabel(lambda: () -> Int): Int {
        return lambda() ?: return@callLambdaWithLabel 20
}

// ignore parameter
val add : (Int,Int,Int) -> Int = { first, _, third ->

        val  result = first+third
        result


}

// extension funtion using lambda
val addPlus1 : String.()  ->  String = {
        val result = this.toInt()+1
        "$result" // this is the return

}

// lambda with multiple returns this is called named lambda return
val agediscription : (Int) -> String = ageDiscription@ { age ->

        if (age in 1..18){
                return@ageDiscription "child"
        }else if (age in 18..40){
                return@ageDiscription "teenage"
        }else{
             return@ageDiscription "senior citizen"
        }
}






@Preview
@Composable
fun ImageExample() {

        Image(painter = painterResource(id = R.drawable.custom_lambda),
                contentDescription = null,
                modifier = Modifier.background(Color.Black)
        )

}
