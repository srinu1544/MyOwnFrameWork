package com.example.myownframework.Kotlin_Android.Differences

/*FragmentPagerAdapter:

This adapter is suitable when you have a relatively small number of Fragments that you want to keep in memory.
It retains all Fragments in memory, which can be memory-intensive if you have many Fragments.
Fragments are not destroyed when they are swiped away; instead, they are detached and can be reattached quickly.
Good for situations where you need to switch between fragments quickly with minimal overhead.
Use when you have a limited number of Fragments, such as tabs in a tabbed interface.

FragmentStatePagerAdapter:

This adapter is more memory-efficient when dealing with a large number of Fragments.
It destroys and recreates Fragments as they are swiped away and back into view. This can save memory, especially if you have many Fragments.
Well-suited for scenarios with a large number of Fragments or when the contents of Fragments are dynamic and can change.
Best used when memory optimization is a concern, but there might be a slight performance overhead due to recreating Fragments.
*/