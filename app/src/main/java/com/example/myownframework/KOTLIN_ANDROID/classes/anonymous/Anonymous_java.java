package com.example.myownframework.Kotlin_Android.classes.anonymous;


interface Alian {

    void think();
}

public class Anonymous_java {

    public static void main(String args[]) {

        Alian alian = new Alian() {
            @Override
            public void think() {
                System.out.println("Alians also think");
            }
        };

        alian.think();
    }
}
