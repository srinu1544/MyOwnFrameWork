package com.example.myownframework.Kotlin_Android.JetpackCompose

/*https://www.composables.com/
https://www.youtube.com/watch?v=6_wK_Ud8--0&ab_channel=PhilippLackner
https://developer.android.com/jetpack/compose/

this is for code example :
https://developer.android.com/codelabs/basic-android-kotlin-compose-first-app?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-2%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-first-app#4

what is jetpack compose :

Jetpack compose is a modern user interface
development toolkit for building android ui.

with the help of jetpack compose,we can make
more declarative ui code with few lines of code.


//Screen height
        val screenHeight = LocalConfiguration.current.screenHeightDp
            Log.i("screenHeight",screenHeight.toString())


box :
-----
-> Box to stack elements
-> box layout similar to the frame layout
-> In Jetpack Compose, a box is a component used to arrange objects in layers.
-> child elements are stacked on top of each other.

Column :
--------
-> arrange elements vertically.

 Row :
 -----
-> arrange items horizontally

modifier:
---------

Modifiers allow you to decorate or augment a composable. Modifiers let you do these sorts of things:

Change the composable's size, layout, behavior, and appearance
Add information, like accessibility labels
Process user input
Add high-level interactions, like making an element clickable, scrollable, draggable, or zoomable
Modifiers are standard Kotlin objects. Create a modifier by calling one of the Modifier class functions:


Composable functions
---------------------
Jetpack Compose is built around composable functions. These functions let you define your
app's UI programmatically by describing how it should look and providing data dependencies,
rather than focusing on the process of the UI's construction (initializing an element,
attaching it to a parent, etc.). To create a composable function, just add the @Composable
annotation to the function name.

To make a function composable, add the @Composable




@Composable
private fun Greeting(name: String) {
    Column(modifier = Modifier.padding(24.dp)) {
        Text(text = "Hello,")
        Text(text = name)
    }
}


remember :
----------

In Jetpack Compose, the remember function is used to keep state across recompositions of
a Composable function. It allows you to keep track of mutable state without having to
manage the state yourself.

The remember function can be used to store both mutable and immutable objects.
It stores objects in the Composition, and forgets the object when the composable
that called remember is removed from the Composition


state :
-------
In Jetpack Compose, a state is a value that can change over time and is related to updating the UI.
Jetpack Compose automatically updates the UI whenever a state value changes. The state can be of any
type, such as a Boolean or a String.

State is represented by a mutableStateOf function. This function takes an initial value and returns a
MutableState object. The object contains the current state of the UI element and can be modified and
passed around.

Some techniques for managing state in Jetpack Compose include:

ViewModel: A lifecycle-aware class that can hold the data for the composable function
State hoisting: Exposing both a stateful and a stateless version of the same composable
Jetpack Compose is a toolkit for building native UI on Android. It combines a reactive
programming model with the Kotlin programming language*/