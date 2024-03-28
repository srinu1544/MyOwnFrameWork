package com.example.myownframework.Kotlin_Android.Strings.java;

public class String_StringBuffer {


    public static void main(String[] args) {

        String s = new String("durga");
        s.concat("software"); // here not assign any referance variable so it allowed for
        System.out.println(s);   //  garbage collector

        // out put durga



        StringBuffer sb = new StringBuffer("durga");
        sb.append("softwate");
        System.out.println(sb);

        // output durgasoftware

        // -------------------------------------------------------


        String s1 = new String("srinivas");
        String s2 = new String("srinivas");

        System.out.println(s1==s2); // false
        System.out.println(s1.equals(s2)); // true , here equals() method overrides form object class
                                           // for content comparison



        StringBuffer sb1 = new StringBuffer("srinivas");
        StringBuffer sb2 = new StringBuffer("srinivas");

        System.out.println(sb1==sb2); // false
        System.out.println(sb1.equals(sb2)); // false , here equals() method not overrides form object class



    }
}
