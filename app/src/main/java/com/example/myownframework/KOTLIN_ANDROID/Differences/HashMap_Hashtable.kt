package com.example.myownframework.Kotlin_Android.Differences

/*
HashMap :
---------
-> every method present not synchronized
-> at a time multiple thread allow to operate
-> not thread safe
-> performance is high
-> null k/v allowed


Hashtable :
------------
->  every method present synchronized
-> at a time only one  thread allow to operate
->  thread safe
->  performance is low
->  null k/v not allowed (null pointer exception)

by default hashmap is non synchronized but we can get synchronized version of map
by using Collections.synchronized(m)

HashMap m = new HashMap()
map m1 = Collections.synchronized(m)
*/