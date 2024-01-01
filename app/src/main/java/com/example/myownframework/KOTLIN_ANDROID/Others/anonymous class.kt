package com.example.myownframework.Kotlin_Android.Others

/*In Java, an anonymous class is a nested class that doesn't have a name.
It's also known as an anonymous inner class.

Android developers often use anonymous inner classes to define specialized listeners.
These listeners register callbacks for specific behavior when an event occurs.
For example, to listen for clicks on a View control, the developer must call the
setOnClickListener() method.

Anonymous classes are useful when:
Creating an instance with specific "extras", without having to actually subclass a class
Making your code more concise
Declaring and instantiating a class at the same time
Using a local class only once

The syntax for an anonymous class is:
  // defining anonymous class

class outerClass {
  object1 = new Type(parameterList) {
    // body of the anonymous class
  };
}

You can declare and instantiate anonymous classes in a single expression at the
point of use. You can either extend an existing class or implement an interface*/