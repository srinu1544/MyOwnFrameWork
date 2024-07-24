package com.example.myownframework.Kotlin_Android.Intents

/* it controls launch modes of an activity

FLAG_ACTIVITY_NEW_TASK:
-------------------------
Starts the activity in a new task.
Works similarly to the singleTask launch mode.

FLAG_ACTIVITY_SINGLE_TOP:
-------------------------
Attempts to bring an existing instance of the activity to the foreground,
delivering the intent through onNewIntent(). If no instance exists, a new
one is created. Similar to the singleTop launch mode.

FLAG_ACTIVITY_CLEAR_TOP:
------------------------
If the activity already exists in the current task, all activities above it in
the back stack are destroyed, and the existing instance receives the intent
through onNewIntent(). Otherwise, a new instance is created at the top of the task.
Similar to the clearTop launch mode.


Intent intent = new Intent(this, MyActivity.class);
intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
startActivity(intent);

*/