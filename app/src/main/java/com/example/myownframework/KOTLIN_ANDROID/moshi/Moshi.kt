package com.example.myownframework.Kotlin_Android.Moshi

/*


https://github.com/square/moshi

https://www.geeksforgeeks.org/moshi-library-for-android/

Moshi is a JSON library for Kotlin, Java, and Android that makes it easier to parse JSON into
Java and Kotlin classes. It's developed by Square and offers features like type-safe parsing,
 data class support, and flexible JSON customization.

Moshi is built on top of Okio and inherits the principles of Gson, another JSON parser. However, Moshi is faster than Gson and has a smaller footprint. Moshi is also faster than Gson because it uses code generation instead of reflection.
To work with Moshi, you can use the JsonAdapter class and builder pattern. You can also create a variable of type JsonAdapter to convert JSON to an object class and vice versa.
To implement Moshi with Retrofit in Kotlin, you can:
Add dependencies
Add the Moshi Converter Factory to Retrofit
Update your Network Data classes



Moshi is a modern JSON library for Android, Java and Kotlin.
It makes it easy to parse JSON into Java and Kotlin classes:
Note:
The Kotlin examples of this README assume use of either Kotlin code
gen or KotlinJsonAdapterFactory for reflection. Plain Java-based reflection
is unsupported on Kotlin classes

Moshi is a JSON library for Android, Java, and Kotlin. It was developed by Square.
Moshi allows users to:
Parse JSON into Java and Kotlin classes
Serialize and deserialize JSON in an efficient and straightforward manner
Moshi can be considered the successor to GSON.
To use Moshi, you can:
Create a Moshi object
Create an adapter
Get output
Here are the steps to code Moshi in Android Studio:
Create a Moshi object
Moshi moshi = new Moshi.Builder().build();
Create an adapter
Type type = Types.newParameterizedType(List.class, Person.class);
JsonAdapter<List> adapter = moshi.adapter(type);
Get output
List<Person> persons = adapter.fromJson(jsonResponse);*/


/*
java
String json = ...;

Moshi moshi = new Moshi.Builder().build();
JsonAdapter<BlackjackHand> jsonAdapter = moshi.adapter(BlackjackHand.class);

BlackjackHand blackjackHand = jsonAdapter.fromJson(json);
System.out.println(blackjackHand);


Kotlin

val json: String = ...

val moshi: Moshi = Moshi.Builder().build()
val jsonAdapter: JsonAdapter<BlackjackHand> = moshi.adapter<BlackjackHand>()

val blackjackHand = jsonAdapter.fromJson(json)
println(blackjackHand)


And it can just as easily serialize Java or Kotlin objects as JSON:

Java
BlackjackHand blackjackHand = new BlackjackHand(
    new Card('6', SPADES),
    Arrays.asList(new Card('4', CLUBS), new Card('A', HEARTS)));

Moshi moshi = new Moshi.Builder().build();
JsonAdapter<BlackjackHand> jsonAdapter = moshi.adapter(BlackjackHand.class);

String json = jsonAdapter.toJson(blackjackHand);
System.out.println(json);
Kotlin
val blackjackHand = BlackjackHand(
    Card('6', SPADES),
    listOf(Card('4', CLUBS), Card('A', HEARTS))
  )

val moshi: Moshi = Moshi.Builder().build()
val jsonAdapter: JsonAdapter<BlackjackHand> = moshi.adapter<BlackjackHand>()

val json: String = jsonAdapter.toJson(blackjackHand)
println(json)


*/
