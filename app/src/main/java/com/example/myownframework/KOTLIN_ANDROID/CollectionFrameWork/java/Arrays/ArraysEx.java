package com.example.myownframework.Kotlin_Android.CollectionFrameWork.java.Arrays;



/*An array in Java is a data structure that can store a fixed number of values of the same data type.
The length of an array is established when the array is created. After creation, its length is fixed.

limitations of arrays
---------------------

-> fixed in size
-> It holds only homogeneous data type elements

Student[] s = new Strudent[1000]

s[0] = new Student(); // correct
s[1] = new Customer(); // wrong

to overcome this problem

Object[] o = new Object[100]
o[0] = new Student(); // correct
o[1] = new Customer(); // correct

-> it not implemented from Standard data structure so ready made mehods not supported
-> no under lying data structure




//declaring array
int intArray[];
// allocating memory to array
intArray = new int[20];
// combining both statements in oneint[]
intArray = new int[20];



  */

import androidx.annotation.NonNull;

public class ArraysEx {


    public static void main(String[] args) {

        int[] s = new int[2];
        s[0] = 1;

        String[] names = new String[2];
        names[0] = "sai";
        names[1] = "nani";

        //System.out.println(names[0]);
        //System.out.println(names[1]);

        Student[] students = new Student[]{new Student("10 th class",45)};


        Student[] array = new Student[105];

        for (int i = 0; i < 100; i++) {
            Student someObject = new Student("10th class", i);
            // set properties
            array[i] = someObject;
        }
        System.out.println(array[40]);
    }
}

class Student {

    String  classNum;

    int rollNumber;

    Student(String classNum , int rollNumber){
        this.classNum = classNum;
        this.rollNumber = rollNumber;
    }

    @NonNull
    @Override
    public String toString() {
        return classNum + rollNumber;
    }
}
