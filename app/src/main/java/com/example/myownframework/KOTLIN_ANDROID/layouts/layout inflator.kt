package com.example.myownframework.Kotlin_Android.layouts

/*In Android, the LayoutInflater class creates View objects from the contents of layout XML files.
 The inflate method does this. The OS then uses these view objects to draw the screen


 You can use a layout inflater if you have a complex layout that you want to add programmatically.
 You could do it all in code, but it is much easier to define it in xml first and then just inflate it.
 The most common time most people use it is in a RecyclerView.

Here are some tips for using LayoutInflater:
Pass in a parent to the root ViewGroup parameter.
Avoid passing in null for the root ViewGroup.

Pass in false for the attachToRoot parameter if you're not attaching the layout file's View to
its root ViewGroup.
Don't pass in true for a View that's already been attached to a ViewGroup



 */