package com.example.myownframework.KOTLIN_ANDROID.CollectionFrameWork.kotlin.operations

/*ordering

1) sorted
2) sortedDescending
3) sortedWith
4) sortedBy
5) reversed
6) asReversed
7) shuffel // shaffel in random order



*/

 data class Friends(
    var name : String ,
     var age  :  Int
 )


   fun main() {
       val friends = listOf(
           Friends("srinivas", 32),
           Friends("mahesh" , 33),
           Friends("sai", 24),
           Friends("roja", 25),
           Friends("sai roja", 26),
           Friends("shankar" , 36),
           Friends("nani", 33),
           Friends("babi", 34),
           Friends("sai srinivas", 35)
       )

       friends.sortedBy { it.name }.forEach{ println(it) }
   }


