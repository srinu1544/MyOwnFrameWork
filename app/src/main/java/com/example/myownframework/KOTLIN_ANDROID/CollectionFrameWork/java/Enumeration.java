package com.example.myownframework.KOTLIN_ANDROID.CollectionFrameWork.java;


/*1. Enumeration (Interface)
Enumeration is an interface in Java, which was part of the original JDK 1.0.
 It is used to iterate over elements in collections like Vector, Hashtable, and other legacy classes.*/


import java.util.Hashtable;
import java.util.Vector;

public class Enumeration {

    public static void main(String[] args) {
        Hashtable<String,Integer> hashtable = new Hashtable<>();
        hashtable.put("srinivas",1);
        hashtable.put("kumar",2);
        hashtable.put("reddy",3);

        java.util.Enumeration<Integer> enumeration =  hashtable.elements();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }


        // second
        Vector<String> vector = new Vector<>();
        vector.add("srinivas");
        java.util.Enumeration<String> enumeration1 =  vector.elements();
        while(enumeration1.hasMoreElements()){
            System.out.println(enumeration1.nextElement());
        }
    }


}


