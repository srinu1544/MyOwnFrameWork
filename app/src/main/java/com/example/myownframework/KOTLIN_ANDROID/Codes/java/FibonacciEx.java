package com.example.myownframework.Kotlin_Android.Codes.java;

import java.util.ArrayList;

public class FibonacciEx {

    public static void main(String [] args) {

        //printFibb();
        getFibbWithIndex(9);

    }

    private static void printFibb(){
        int n1 = 0 ; int n2 = 1; int n3 ; int count = 20;
        System.out.println(n1);
        System.out.println(n2);
        for(int i =2 ;i<= count;i++ ){
            n3 = n1+n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }


    private static void getFibbWithIndex(int index) {

        ArrayList<Integer> al = new ArrayList<>();

        int n1 = 0 ; int n2 = 1; int n3 ; int count = 20;
        al.add(n1);
        al.add(n2);
        for(int i =2 ;i<= count;i++ ){
            n3 = n1+n2;
            al.add(n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println(al);
        System.out.println(al.get(index));

    }


}
