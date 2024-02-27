package com.example.myownframework.Kotlin_Android.Codes.java;

import java.util.Arrays;

public class SortArray {


 /*The Arrays utility class has many overloaded sort() methods to sort primitive and to object arrays.
  If you are sorting a primitive array in the natural order, then you can use the Arrays.sort() method,
  as shown in the following example:

However, if you want to sort an array of objects, then the object must implement the Comparable interface.
If you want to specify the sorting criteria, then you can pass the Comparator for the sorting logic.
Learn more about Comparable and Comparator in Java.


 */

    public static void main(String[] args) {
        arraySort();
    }


    static void arraySort() {

        int[] array = {1, 2, 3, -1, -2, 4};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}



