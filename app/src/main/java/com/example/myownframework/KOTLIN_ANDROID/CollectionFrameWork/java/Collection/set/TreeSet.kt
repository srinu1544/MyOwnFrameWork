package com.example.myownframework.Kotlin_Android.CollectionFrameWork.java.Collection.set

import java.util.TreeSet

/**/


fun main(){

  sortingWithLength()

}


class MyComparator : Comparator<Int> {
    override fun compare(I1: Int?, I2: Int?): Int {
        var i : Int = 0
        if (I1!! < I2!!) {
            i = +1
        } else if (I1!! > I2!!){
            i = -1
        }else  {
            i = 0
        }
       return i

       //  various possible implementations of compare method
      //  return I1!!.compareTo(I2!!)   // accending order
      //   return I2!!.compareTo(I1!!)  // decending order
      //  return - I1!!.compareTo(I2!!)   // decending order
      //  return +1   // insertion order
      //  return -1    // reverse insertion order
      //  return 0    // only one element will be inserted
    }

}


fun defaultSortingOrder(){

    // this is comparable tree set
    // if we not passed any argument to constructior it acts as a default natural sorting order
    val treeSet = TreeSet<String>()

    treeSet.add("a")
    treeSet.add("A")
    treeSet.add("C")
    treeSet.add("B")
    treeSet.add(" ")
    println(treeSet)
}

fun sortingWithLength(){


    val lengthComparator = LengthComparator()
    val treeSet = TreeSet<String>(lengthComparator)
    treeSet.add("Abcd")
    treeSet.add("AA")
    treeSet.add("AAA")
    treeSet.add("A")
    treeSet.add("XX")
    treeSet.add("ABC")

    println(treeSet)

}

fun customizedSortingOrder(){

    // this is comparator tree set
    // this is customized sorting order
    val myComparator = MyComparator()
    val tree = TreeSet<Int>(myComparator)
    tree.add(1)
    tree.add(2)
    tree.add(3)
    tree.add(4)
    tree.add(5)
    tree.add(6)

    println(tree) //  [6, 5, 4, 3, 2, 1]
}


class LengthComparator : Comparator<String> {
    override fun compare(I1: String?, I2: String?): Int {

        var i = 0;
        var l1 = I1?.length
        var l2 = I2?.length
        if (l1!! < l2!!) {
            i = -1
        } else if (l1!! > l2!!){
            i = +1
        }else {
            i = I1!!.compareTo(I2!!)
        }
        return  i


    }

}








