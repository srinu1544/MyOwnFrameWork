package com.example.myownframework.KOTLIN_ANDROID.Activity/*Adding fragment to an activity

Fragments are typically added to an activity's layout in two ways:

1)Static Fragment: Declared directly in the activity's XML layout file.

<fragment
    android:id="@+id/exampleFragment"
    android:name="com.example.app.ExampleFragment"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />

 2)Dynamic Fragment: Added programmatically in the activity using FragmentManager and FragmentTransaction.
val fragment = ExampleFragment()
supportFragmentManager.beginTransaction()
    .add(R.id.fragment_container, fragment)
    .commit()

    FragmentManager and FragmentTransaction :
    ------------------------------------------
FragmentManager: Responsible for managing fragment operations such as adding, removing,
 and replacing fragments in an activity.

FragmentTransaction: Used to perform operations on fragments like add(), replace(), remove(), and commit().

*/