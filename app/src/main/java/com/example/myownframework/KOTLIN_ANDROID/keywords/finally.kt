package com.example.myownframework.Kotlin_Android.Keywords

/*

finally is a block it is execute irrespective of exception or error occur or not finally block will
Definitely execute

for example  if you are working with database connection
*/


fun main() {

    try{
        // con.open
        //some logic
        // error occur
        // con.close
    }catch (e :Exception){
        // error handle
    }finally {
        //con.close
    }
}