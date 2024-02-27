package com.example.myownframework.Kotlin_Android.Codes.java;

import android.security.keystore.UserNotAuthenticatedException;

import androidx.camera.core.processing.SurfaceProcessorNode;

public class FindSecondHighest {

    public static void main(String[] args) {

        int [] input = {1, 2, 3, 4, 5, 6, 7};
        findSecondHighest(input);

    }

    private static int findSecondHighest(int[] array) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i : array) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest) {
                secondHighest = i;
            }

        }
        return secondHighest;
    }

}



