package com.example.myownframework.Kotlin_Android.javajava.collectionframework.map

/*
 -> it is not child interface of collection
   -> if we want represent  group of objects as a key/value pairs then should go for map
   -> where key/value are only objects
   -> duplicate keys are not allowed and duplicate values are allowed
   -> each key/value pair is called Entry
   -> map is considered as entry objects
   -> if we add duplicate key in the map old value replaced with new value and return old value object
   -> if we replacement not their it returns null (Example below)




 implementation class of map

                                     map
                                      |
                                      |
               ------------------------------------------------------------------------

                                                                            Dictonary(Abstract class)
               |              |               |                |                       |
               |              |               |                |                       |
           HashMap        WeakHashMap    IdentityHashMap      SortedMap              Hashtable
               |                                                |                        |
          LinkedHashMap                                     NavigableMap              Properties
                                                                 |                  (legacy classes)
                                                              TreeMap



      101 - Durga
      102 - Roja


      methods :
      ---------

     (here obj is old value )
     1. Object  =  put(Object key , Object value)

    obj =  m.put(101,"durga");   //  here obj is null
    obj =  m.put(102,"shiva");  //here obj is null
    obj =  m.put(101,"Ravi"); // here duplicate key is giving // here obj is durga

    void    m.putAll(map m) //
    Object  m.get(key) // get corresponding value with key // if key not their it returns null
    Object  m.remove(key) // remove total entry
    boolean m.containsKey(key) // get particular key available or not
    boolean m.containsValue(value) // get particular value available or not
    boolean isEmpty() // map is empty
    int     m.size() // get size of map
    void     clear() // clear all map

    collection views of map
    -----------------------
    set      keySet() // get all keys
    Collection values() // get all values
    set entrySet()      //



    Entry (I) :
    -------
    ->  map is group of key/pair each k/v pair is an entry hence map is consired as
        a collectio of entry objects
    -> with out map object their no chance of exisiting entry object
    -> entry interface define inside map interface
    -> it is the part of map interface
    -> it is inner interface of map


    interface Map {

      interface Entry {

          Object getKey()
          Object getValue()
          Object setValue(Object name)

      }

   }


 */






fun main(){

  val map = mapOf<Int,String>(101 to "Roja", 102 to "nani");
  println(map.keys)
}