package com.example.myownframework.Kotlin_Android.Strings.java;


/*

please refer note book for this
--------------------------------
or this video - https://www.youtube.com/watch?v=XWHWuFNoklk&list=PLd3UqWTnYXOlrdBwt2DTnF3u3W-1Kozk0&index=2&ab_channel=DurgaSoftwareSolutions


difference between String  s = "srinivas"   and String s = new String("srinivas")
--------------------------------------------------------------------------------


String  s = "srinivas" :
------------------------

if content available in SCP it will reuse same object , if not available in SCP then only created
new object in string constant pool

This is why string literals are
considered to be more memory-efficient.



String s = new String("durga"):
----------------------------------

in this scenario  one object created in heap area and one object created in SCP area

  Heap :
  -------

  s --> durga

  SCP :
  -----

  Durga


 ->  Implicitly reference maintained by jvm
 ->  it is not elegible for garbage collector
 -> until 1.6 v method area | PermGen (Permanent Generation) is a special heap space separated from the main memory heap.
 -> 1.7 onwards heap area moved



Here's a brief summary:

String s = "srinivas";: Creates a string object in the string pool if it doesn't exist,
or reuses the existing one.

String s = new String("srinivas");: Always creates a new string object on the heap,
even if the same string exists in the string pool.



String s1 = new String("durga");
String s2 = new String("durga")

String s3 = "durga";
String s4 = "durga"


how many total objects are created  heap and SCP?

               heap :               SCP :

1 -- >  s1 --> durga   -------- durga one copy will be maintained for feature purpose
2 -- >  s2 --> durga   --------- not created bec allready present in scp
3 not created in heap  --------- already present in scp so s3 pointing to durga
4 not created in heap  --------- already present in scp so s3 pointing to durga





*/

public class StringObject_StringLitral {

    public static void main(String[] args) {


    }


}
