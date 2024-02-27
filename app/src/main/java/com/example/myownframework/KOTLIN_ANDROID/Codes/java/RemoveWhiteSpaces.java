package com.example.myownframework.Kotlin_Android.Codes.java;

/*
The String class contains two methods to remove leading and trailing whitespaces: trim() and strip().
The strip() method was added to the String class in Java 11. The strip() method uses the
Character.isWhitespace() method to check if the character is a whitespace. This method uses
Unicode code points, while the trim() method identifies any character with a codepoint value
less than or equal to U+0020 as a whitespace character.


The strip() method is the recommended way to remove whitespaces because it uses the Unicode standard.
The following example code shows how to use the strip() method to remove whitespaces:*/

public class RemoveWhiteSpaces {

    public static void main(String[] args) {
        RemoveWhiteSpaces removeWhiteSpaces = new RemoveWhiteSpaces();
        System.out.println(removeWhiteSpaces.removeSpace("  abc  def\tr"));

        //strip();
    }

    String removeSpace(String input) {

        StringBuilder output = new StringBuilder();

        char[] charArray = input.toCharArray();

        for (char c : charArray) {
            if (!Character.isWhitespace(c)) {
                output.append(c);
            }
        }
        return output.toString();
    }


   static void strip() {

        String s = "  abc  def\tr";

       // s = s.strip();

        System.out.println(s);
    }
}


