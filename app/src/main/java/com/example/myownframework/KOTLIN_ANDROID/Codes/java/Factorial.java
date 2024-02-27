package com.example.myownframework.Kotlin_Android.Codes.java;

public class Factorial {

    // logic F(n) = F(1)*F(2)...F(n-1)*F(n)

    public static void main(String[] args) {
        System.out.println(factorial(7));
    }

    public static long factorial(long n) {
        if (n == 1)
            return 1;
        else
            return (n * factorial(n - 1));
    }
}
