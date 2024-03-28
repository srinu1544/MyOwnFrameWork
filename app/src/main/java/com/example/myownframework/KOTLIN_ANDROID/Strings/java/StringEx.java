package com.example.myownframework.Kotlin_Android.Strings.java;








public class StringEx {

    public static void main(String[] args) {

        // example 1

        String s = new String("durga");
        s.concat("software");
        s = s.concat("solutions");

        System.out.println(s);



        /*
        heap area
       -----------

       s --> durga

       durgasoftware (elegible fo gc)

       durgasoftware (this pointing to above s)


      SCP
      ---

      durga

      software

      solutions

      String is immutable we can't change the contant if you trying to perform change compulsory
      new object will be created bec of rutime operation if an object required to create that
      object always created in heap area

      note :
      -> SCP ment for string constant and string literals
      -> not for runtime creation objects  */

        // example 2

        String s1 = new String("spring");
        s1.concat("Fall");
        String s2 = s1.concat("Winter");
        s2.concat("Summer");

        System.out.println(s1); // spring
        System.out.println(s2); // springwinter


        /* Heap :
        ----------

        s1 --> spring

        springFall - ele for gc

        s2 --> SpringWinter

        SpringWinterSummer -- ele for gc

        SCP :
        ------

        spring

        Fall

        Winter

        summer

        these all are not eligible for gc */

        // example 3

        String s3 = new String("you can not change me");
        String s4 = new String("you can not change me");
        System.out.println(s3 == s4);


        String s5 = "you can not change me";
        System.out.println(s3 == s5);

        String s6 = "you can not change me";
        System.out.println(s5 == s6);


        String s7 = "you can not" + "change me";
        System.out.println(s6 == s7);


        String s8 = "you cannot";
        String  s9 = s8+"change me";
        System.out.println(s6==s9);


        final String s10 = "you cannot ";
        String  s11 = s10 + "change me";
        System.out.println(s6==s11);


    }




}
