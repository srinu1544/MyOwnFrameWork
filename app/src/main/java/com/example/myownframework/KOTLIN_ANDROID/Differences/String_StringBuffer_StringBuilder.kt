package com.example.myownframework.Kotlin_Android.Differences

/*
Parameter	            String	      StringBuffer	                                        StringBuilder
Storage	              String Pool	      Heap	                                                 Heap
Mutability             Immutable	    Mutable	                                                Mutable
Thread Safe	Not used in a threaded environment	Used in a multi-threaded environment	Used in a single-threaded environment
Performance	Slow	Slower than StringBuilder but faster than String	Faster than StringBuffer


StringBuffer var = new StringBuffer("Edureka");	StringBuilder var = new StringBuilder("Edureka");


String :
Strored in String Pool
Immutable
Thread Safe
Not used in a threaded environment
Slow
Syntax	String var =“Edureka”;
String var=new String(“Edureka”);


StringBuffer :
Strored in Heap
 Mutable
 no thread safe
 Used in a multi-threaded environment
 synchronized
 Slower than StringBuilder but faster than String
 StringBuffer var = new StringBuffer("Edureka");


 StringBuffer :
Strored in Heap
Mutable
thread safe
Used in a single-threaded environment
synchronized
Faster than StringBuffer
StringBuilder var = new StringBuilder("Edureka");




*/