package com.example.myownframework.Kotlin_Android.Others

/*
https://developer.android.com/topic/performance/memory-overview#:~:text=Any%20time%20a%20generation%20starts,objects%20are%20in%20each%20generation.
* https://www.geeksforgeeks.org/how-garbage-collector-works-in-android/
https://developer.android.com/topic/performance/memory-overview


A managed memory environment, like the ART or Dalvik virtual machine, keeps track of each
memory allocation. Once it determines that a piece of memory is no longer being used
by the program, it frees it back to the heap, without any intervention from the
programmer. The mechanism for reclaiming unused memory within a managed memory
environment is known as garbage collection. Garbage collection has two goals: find
data objects in a program that cannot be accessed in the future; and reclaim the
resources used by those objects.

Android’s memory heap is a generational one, meaning that there are different buckets
of allocations that it tracks, based on the expected life and size of an object being
allocated. For example, recently allocated objects belong in the Young generation. When
an object stays active long enough, it can be promoted to an older generation, followed
by a permanent generation.

Each heap generation has its own dedicated upper limit on the amount of memory that
objects there can occupy. Any time a generation starts to fill up, the system executes
a garbage collection event in an attempt to free up memory. The duration of the garbage
collection depends on which generation of objects it's collecting and how many active
objects are in each generation.

Even though garbage collection can be quite fast, it can still affect your app's
performance. You don’t generally control when a garbage collection event occurs
from within your code. The system has a running set of criteria for determining
when to perform garbage collection. When the criteria are satisfied, the system
stops executing the process and begins garbage collection. If garbage collection
occurs in the middle of an intensive processing loop like an animation or during
music playback, it can increase processing time. This increase can potentially push
code execution in your app past the recommended 16ms threshold for efficient and smooth
frame rendering.

Additionally, your code flow may perform kinds of work that force garbage collection
events to occur more often or make them last longer-than-normal. For example, if
you allocate multiple objects in the innermost part of a for-loop during each frame
of an alpha blending animation, you might pollute your memory heap with a lot of
objects. In that circumstance, the garbage collector executes multiple garbage collection
events and can degrade the performance of your app.

For more general information about garbage collection, see Garbage
collection.



*/
