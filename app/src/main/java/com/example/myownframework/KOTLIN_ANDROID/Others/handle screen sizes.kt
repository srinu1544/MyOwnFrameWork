package com.example.myownframework.Kotlin_Android.Others

/*
https://stuff.mit.edu/afs/sipb/project/android/docs/training/multiscreen/screensizes.html

Generative AI is experimental. Info quality may vary.
To handle multiple screen sizes in Android, you can use:
wrap_content: and match_parent
RelativeLayout
Size Qualifiers
Smallest-width Qualifier
Layout Aliases
Orientation Qualifiers
Nine-patch Bitmaps

You can use "wrap_content" and "match_parent" for the width and height of some view
components. These parameters adapt to the space available. However, using "wrap_content"
for layouts might make the design poor.

You can also use qualifiers to make your layouts look differently on different screens.
For example, you can define a country code so that the layout looks different for that
specific country.

The minimum size for recent versions of Android is 426x320, except for devices defined as
 watches which must have at least 120dpi and a diagonal size of at least 1.1 inches */