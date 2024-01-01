package com.example.myownframework.Kotlin_Android.ViewBinding

/*

View binding is a feature in Android that makes it easier to write code that interacts with views.
It generates a binding class for each XML layout file in a module.

View binding replaces the findViewById() method, which reduces boilerplate code.
It also generates instances of the views of the current layout.

View binding has several advantages, including:
Null safety: You don't need to do a null check on a view while performing actions on it.
Type safety: One of the most significant advantages of view binding.
Ease of use: View binding's sole purpose is to replace the use of findviewbyId.
You can enable view binding in a module. Once you've enabled and recompiled your project,
the binding classes should be available to you.
You can use view binding in: Activity onCreate, Fragment, RecyclerView Adapter, ViewHolder.






 process of view binding

    add this in build.gradel
    buildFeatures {
        viewBinding = true
    }


*/