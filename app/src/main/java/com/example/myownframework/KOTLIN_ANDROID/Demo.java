package com.example.myownframework.Kotlin_Android;

import androidx.compose.animation.core.InfiniteTransition;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Demo {

     public static void main(String[] args) {


          TreeSet<Integer> ints = new TreeSet<Integer>();

          ints.add(1);
          ints.add(1);
          ints.add(1);
          ints.add(2);
          ints.add(4);

          StringBuilder stringBuilder = new StringBuilder();
          for (Integer element : ints) {
               stringBuilder.append(element).append(", ");
          }

          // Remove the trailing comma and space if any elements are present
          if (stringBuilder.length() > 0) {
               stringBuilder.setLength(stringBuilder.length() - 2);
          }

          System.out.println(stringBuilder.toString());

     }


}

