package com.example.myownframework.Kotlin_Android.Codes.java;

import java.util.List;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println(""+isPalindrome("madam"));
        System.out.println(""+isPalindrome("nani"));

    }

    static boolean isPalindrome(String name) {

        char[] nameChar = name.toCharArray();
        String reverse = "";
        for (int i = nameChar.length-1 ; i>=0 ; i--){
            reverse += nameChar[i];
        }

        System.out.println(reverse);

        if (name.equals(reverse)){
            return true;
        }else {
            return false;
        }

    }
}
