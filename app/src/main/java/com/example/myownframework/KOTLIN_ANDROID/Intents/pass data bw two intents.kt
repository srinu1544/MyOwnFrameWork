package com.example.myownframework.Kotlin_Android.Intents

/*To pass data between intents in Android, you can use the putExtra() method:
Create a new Intent object in the source activity
Use the putExtra() method to save data in the Intent object
Use a key-value pair in the putExtra() method
Call the startActivity() method in the source activity
Call the getIntent() method in the target activity
Here's an example of passing data between intents:
Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
intent.putExtra("Variable name", "Value you want to pass");
startActivity(intent);
You can also use putExtras() to store data as a Bundle data object


To pass a Parcelable class through an Intent in Kotlin, you can use the putExtra() method.
The syntax is:

intent.putExtra("key", parcelableObject)

val intent = Intent(this, SecondActivity::class.java)
val myParcelable = MyParcelable()
intent.putExtra("my_parcelable", myParcelable)
startActivity(intent)


val myParcelable = intent.getParcelableExtra<MyParcelable>("my_parcelable")


*/