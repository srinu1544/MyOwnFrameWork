package com.example.practiceapp.Kotlin_Android.AAAA_ALL_Questions




/*

must watch :
------------
https://www.youtube.com/watch?v=4D79It7Jnzg&ab_channel=PhilippLackner
https://developer.android.com/jetpack/compose/touch-input/handling-interactions
https://www.youtube.com/watch?v=_FtKhWvHiTg&ab_channel=PhilippLackner

new things
-----------
-> jetbreans fleet (ide for all launguages support)
-> kotlin kandy     --- for graphs
-> google announced android system service together with AI Gemini
   that system services called AI Core


? - asked in interviews
# - study completed
$ - Details in MyFrameWork project

 */

/*Questions

Kotlin,Java and Android
=======================

Kotlin
=======

about kotlin :
---------------
what is kotlin         - @#
Keyfeatures in kotlin  - @#
Advani gtages of kotlin  - @#

variables :
-----------
variables in kotlin    - @#

data types :
------------
Data types in kotlin   - @#

functions
---------------------------------------
Top - level function    -  @#
member function         -  @#
lambda                  -  @#
higher order function   -  @#
extension function      -  @#
infix function          -  @#
inline function         -  @#
noinline                -  @#
cross inline            -  @#
invoke                  -  @#
operation overload      -  @#
tailrec                 -  @#
recursion               -  @#
single line funtion

classes
-------
anonymous class
abstract
data class
enum
nested
open
sealed

Object :
--------
object


constructiors :
primary
scondary



kotlin null safe call operators : -  @#
---------------------------------
safe call operator(?.)
safe call with let ( let)
elivis operator (?:)
not- null assertion (!!)

scope function in kotlin :     - @#
--------------------------
apply
with
also
run


keywords :

super keyword         - @#
final keyword         - @#
finally block         - @#


init block in kotlin? - @#

Kotlin how to initialize static variables? @#
what is companion object  @#


what is backing property in kotlin  @#
backing field                       @#
how to declare object in kotlin?    @#
destructuring                       @#
what is componentN in data class    @#


keywords
--------
varargs                             @#
invoke                              @#
what is lateinit in kotlin?         @#
what is lazy keyword in kotlin?     @#

operator                            @#
--------
double colon :: in kotlin
three dots ... in kotlin
two dots .. in kotlin




oops
====
what is polymorphisam                               @#
what is encapsulation
what is inheritance
what is abstraction

interface :
-----------
about
sealed interface



Strings
=======
string class, string builder, stringbuffer, String tokenizer                      - @#
difference between String n = "srinu " and string n = new String("srinu") in java - @#




Android components
==================
activity :
                                                     @#
fragment :
and life cycle of fragment? How to maintain back stack in fragments?
what is service:
-----------------

services                                     @#
--------
about
what is service and types of service
What is a JobScheduler
what is foreground service
what is background service
what we use async task
difference bw thread and async task
difference between service and intent service
what is an async task method?
types of services? service life cycle
AIDL


content providers?
------------------
broadcast receivers :
---------------------
and types



intents
--------
what is intent                      @#
what is intent filter               @#
how to pass data bw two intents     @#
how to pass data bw two fragments   @#
what is a Flag task?                @#
Launchmodes?                        @#
what is pending intent in Android?  @#

layouts and XML
----------------
Types of layouts?                            @#
what is constraint layout?                   @#
What is frame layout                         @#
difference between include and merge in XML  @#




Jetpack Components
------------------
Coroutines             @#
MVVM                   @#
dependency injection   @#
view model             @#
livedata               @#
data binding           @#
view binding           @#
RxJava , RxAndroid     @#
navigation (xml)       @#      (code is in own framework project)
navigation (compose)   @#     (code is in own framework project)
what is a Repository?  @#


code
-----
duplicates
array list


architectural pattern
---------------------
MVC,MVP,mvvm

Creational design pattern
-------------------------
Factory pattern,
Abstract Factory pattern,
Singleton pattern,
Builder pattern,
and prototype pattern are examples of creational design patterns.
These are mainly involved with the creation of objects.



Threads
-------
what is thread
what is multi threading
When would you use a Java thread instead of an AsyncTask?
How do we update ui thread from the background thread

coroutines
------------
GlobalScope.launch
delay
Thread.sleep
suspend
runblocking
coroutines - await ,async
how to write parallel tasks


codes have to write
--------------------
print duplicates in a given string
palendrom
fibonacci


Database
---------
CRUD Operations
How to upgrade SQLite database tables
how do get the table details from a query in SQLite?
how to migrate SQLite?
how to upgrade the SQLite database?
difference between hashtable and hashmap?
How do we view the Database?
how to Remove duplicates from an array
CRUD Operations
queries in sqlite
what is primary key
what is foign key


collections
-----------
what is a linked hash map?
What is the difference between ArrayList and the linked list?
what is collection
what is flow type
what is emptyList() method


jetpack compose
==================
Architecture components
-----------------------
view model
live data
data binding
---------------------
paging
lifecycles
Navigation Component
room
work manager
Hilt
CameraX
Security
Fragment
AppCompat

foundation
--------------
App compact
Android KTX
multidex
Test

UI
------------------------
Animation and transition
Auto, Tv, and wear
Emoji
Fragment
layout
palette

Behavior
----------------------
Download manager
media and playback
permissions
Notification
sharing
slices

abrivations
===========
Uniform Resource Identifiers (URIs)
APK - Android Package Kit
(ART) - Android Runtime
(AOT) - Ahead-Of-Time
(AOSP) - android open source project
ASAP: As soon as possible
ALAP: As late as possible
ATAP: As timely as possible
LOL: Laugh out loud
YOLO: You only live once
WIP: Work in progress
FOMO: Fear of missing out
PIN: Personal Identification Number

Test Driven Development (TDD)
An agile methodology where tests are written before code is developed.

Acceptance Test-Driven Development (ATDD)



useful links  or websites
------------
jetpack compose. --- https://www.youtube.com/watch?v=8OdId23cmCU

websites :
---------

Regexioi.com --- test and save regulat expression
mockaroo.com  --- create take data this can be very helpful for testing or display ristance data
dev.to
explainshell.com --- unix command
Draw.io          ---- draw software architecture diagrams





differences
-----------
difference bw == operator and equals method - @#F
difference bw data binding and view binding - @#
difference bw final finally and finalize    - @#
mutable vs immutable?                       - @#
flavors and builds                          - @#
diff bw fragmentPageAdapter and FragmentStatePageAdapter - @#
difference between apk and .aab                         -  @#
difference between push notifications and notification. - @#
What's the difference between commit() and apply() -      #$
What is the difference between the socket and restful API? @#
difference between MVP, MVC, and MVVM?                    -@#
difference between the compiled SDK version and the target SDK version? - @#
The main differences between registering a BroadcastReceiver in the Manifest and registering it programmatically?
difference between AppCompatActivity and AppActivity?      - @#
differences bw arrays and mutable and immutable          -   @#
difference bw room and sqlite? which is faster?  -        - @#
serialazation and deserialisation                           @#
difference between .dex and JVM                             @#
difference between UI and the main thread                  -@#
What are Threads and Handlers?                             -@#
diff bw handlers and looper                                -@#
difference bw throw and throws                             -@#
difference between Mavin and Gradle?                       -@#
drfference between view and viewGroup                      -@#
difference bw finally and final - @#
synchronization vs asynchronization @#
What difference between Val and var? @#
difference between interface and abstract class?
difference between singleton class and class?
sealed class, sealed interface
diff overloading overriding
diff bw R8 and proguard                                    -@#?
diff bw const vs val
diff bw activity and fragment                               ?
diff bw  app gradel and project gradel       @#?






others
=======

How do we get data from another application :
Ans : use of shared prer

how to call const object in koltin form java - @#

what is user  permissions                       @#


What is  Multidex?                              @#
ANS : 64 k method

What is ANR? How can the ANR be prevented?      @#
Ans : application  not responce

Looper
ans : Looper is a class which is used to execute the Messages(Runnables) in a queue.

Handler
ans : A Handler in Kotlin is a class that allows you to schedule and execute tasks on the UI thread

HandlerThread :
 A thread handler is a class that uses three main components to handle these actions


What is ADB? - any ADB commands - @#

What is DVM in Android?
what is ART in android?
Internal process of Build apk
What are the design patterns? like singleton   -- https://www.softwaretestinghelp.com/design-patterns-in-java/
how to create a horizontal recycler view in Android?
What is the image loader in Android?
what are the third-party libraries used?
What's soap in Android?
what is Gson?
what is JSON?
what are the access modifier in korlin?
What is the view and life cycle?
what is the current version using android studio?
Ans : Android Studio Flamingo | 2022.2.1 Patch 2
how to handle screen rotation?
What is ANR? How do you handle ANR?
what is a memory leak? how to avoid memory leak in Android?
what are build variants?                                      -@#
what are flavours in Android?
Looper, Handler, message queue, and HandlerThread?
What is the difference between HTML5 & HTML?
what is ThreadPoolExecuter?
media player? different types?
espresso?
Mockito?
what is finally Block?
what is the try-catch and throws clause?
what is the covariant return type?
how do I upload an image to the network?
What are the annotations present in core Java?
what is the sha1 key? how to create it in Android Studio?
what is time complexability?
what is Moshi?
Features of android 12 and 13
how to handle multiple screen sizes
what are the background limitations
what is geofence
what is geocoder
How to get users walking, and running events?
Java Garbage Collections and Memory Management.
ADB and ADB Commands
GIT Commands
How to build an App Without Android Studio.
How do you communicate between two applications?
How do we pass the video data from one application to another?
How do we Use Authentication?
How do we Inspect Network Calls?
What is WebView and how do we control WebView in different android versions?
How do we check the crashes?
Why two gradles in android project
how to upload profile pic without third party library?
what is iot
what is mqtt
what is singleton class
explain mvvm with login screen
Doze mode ?
Bluetooth
conflict changes like orientation in Android
when, with
trailing lambda in kotlin -
context in composible function -
what is deep linking -
what is androidx -
what is ktx -
what is just and promt in kotlin -
solid principals -
state in jetpack compose  -
what is composable function ?
dispatches in  coroutines -
with out higher order function can we use lambda expression -
what is interpolation string -
duplicate string -
what is manifest file -
DVM
JVM
android architecture
shared sheet
destructure
write a code single ton class with thread safe ?
what is "is" keyword ?
what is "as" keyword ?
how to send push notification from firebase
how to send push notification from firebase for particular user.


how to check types of elements in kotlin ?
ans : var myVariable: Any = 10

if (myVariable is Int) {
  println("myVariable is an Int")
} else {
  println("myVariable is not an Int")
}

what is verify method ?
ans : can be used to verify if a method on a mock object has been called (mockito).

what is notify method
The notify() method in Android is used to display a notification.
When a notification is issued, it appears as an icon in the notification area.
To see the details of the notification, the user opens the notification drawer

combine a string?
ans :  Using the + operator:
       append() function
       "$name $age"
       joinToString()



what happen if duplicate keys in hashMap ? --  imp
ans : A Java HashMap cannot have duplicate keys. If a key already exists in the HashMap, the old
value associated with that key is replaced with the new value, override with new value.

what is interceptor and they types?

how to handle configurations changes ? imp
ans : private val viewModel by viewModels<ContactsViewModel>()

where we use higher order function ?



versatile in room database ?

payment gateways ?


notifications ?

push notifications?

what is clean Architecture ?

can we implement click event in viewModel class ?

how to assign data to live data ?

mutablelivedata vs livedata ?

what is flatmap in kotlin ?
---------------------------
FlatMap is used to combine all the items of lists into one list

val numbers = listOf(listOf(1, 2), listOf(3, 4), listOf(5))
val flattenedNumbers = numbers.flatMap { it }
println(flattenedNumbers) // [1, 2, 3, 4, 5]

what is map in kotlin ?

why two gradle files in android ?

unsplash apis -

network inspector ?

what is hiltviewmodel?

firebase dynamic links

ordered broadcast receiver?










flow
stateflow
sharedFlow
livedata





*/