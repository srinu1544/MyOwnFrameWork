package com.example.myownframework.Kotlin_Android.CollectionFrameWork.java.map

/*

-> underlying data structure of map is hashtable
-> insertion order is preserved and based on hashcode of keys
-> duplicate keys are not allowed but values can be duplicated
-> heterogeneous objects are allowed for keys and values.
-> null is allowed for key (only once ) null allowed for values (any num of times)
-> is implements serializable and cloneable IntelliTrace but not random access
-> it is best choice if our frequent operation is search operation.


by default hashmap is non synchronized but we can get synchronized version of map
by using Collections.synchronized(m)

HashMap m = new HashMap()
map m1 = Collections.synchronized(m)


 constructors :
 ---------------

 HashMap m = new HashMap() // creates empty with default capacity 16 and fill ratio 0.75
 HashMap m = new HashMap(int initialcapacity) //
 HashMap m = new HashMap(int initialcapacity, float fillratio ) //
 HashMap m = new HashMap(Map m) // equalent map


 example in java
 ---------------

 public static void main(String args){

 HashMap m = new HashMap();
 m.put("chirangeevi", 700);
 m.put("balaiah", 800);
 m.put("venkatesh", 200);
 m.put("nagarjuna", 500);

 sop(m)

 }

*/


fun main(){

    val hashMap = HashMap<Int,String>()
}