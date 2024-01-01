package com.example.myownframework.Kotlin_Android.Differences


/*
<include> :
Inside the layout where you want to add the reusable component, add the <include> tag.
For example, here's a layout that includes the title bar from the preceding

example:

 <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/app_bg"
    android:gravity="center_horizontal">

    <include layout="@layout/titlebar"/>

    <TextView android:layout_width="match_parent"
              android:layout_height="wrap_content"
              android:text="@string/hello"
              android:padding="10dp" />

</LinearLayout>



<Merge> :

The <merge> tag helps eliminate redundant view groups in your view hierarchy when including one layout
within another. One use case of <merge> is when you implement a custom view by extending a ViewGroup.

For example, if your main layout is a vertical LinearLayout in which two consecutive views can be reused
in multiple layouts, then the reusable layout where you place the two views requires its own root view.
However, using another LinearLayout as the root for the reusable layout results in a vertical LinearLayout
inside a vertical LinearLayout. The nested LinearLayout serves no real purpose and slows down your UI
 performance.

Instead, you can extend a LinearLayout to create a custom view and use a layout XML to describe its
child views. The top tag in the XML is <merge>, rather than LinearLayout, as shown in the following

example:


<merge xmlns:android="http://schemas.android.com/apk/res/android">

    <Button
        android:layout_width="fill_parent"
        android:layout_height="wrap_content"
        android:text="@string/add"/>

    <Button
        android:layout_width="fill_parent"
        android:layout_height="wrap_content"
        android:text="@string/delete"/>

</merge>
When you include this layout in another layout—using the <include> tag—the system ignores the <merge>
element and places the two buttons directly in the layout, in place of the <include> tag.

 */