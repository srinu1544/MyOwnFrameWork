package com.example.myownframework.Kotlin_Android.Classes.java;

public class MySingleTon {


    private static MySingleTon single_instance = null;

    public String s;

    private MySingleTon() {
        s = "Hello I am a string part of Singleton class";
    }


    public static synchronized MySingleTon getInstance() {
        if (single_instance == null)
            single_instance = new MySingleTon();
        return single_instance;
    }
}


class SingleEx {
    public static void main(String[] args) {
        System.out.println(MySingleTon.getInstance().s);
    }
}




