package com.example.myownframework.KOTLIN_ANDROID.JetpackCompose

/*
In this example, CompositionLocalProvider is being used to temporarily override the value of
 LocalContentAlpha for the Text composable within the block. Let’s break it down:

Components Involved:

1) CompositionLocalProvider:

CompositionLocalProvider allows you to set a value for a CompositionLocal within the subtree of composables.
In this case, the CompositionLocalProvider is providing a specific value (ContentAlpha.medium)
 for LocalContentAlpha.

2) LocalContentAlpha:

LocalContentAlpha is a predefined CompositionLocal in Jetpack Compose used to determine the alpha
 (opacity) level for content like text or icons.

The alpha controls how transparent or opaque the content appears. For instance,
a value of 1.0f means fully opaque, while lower values make the content more transparent.

3) ContentAlpha.medium:

ContentAlpha is an object that provides predefined alpha levels like high, medium, and disabled:
ContentAlpha.high: Full visibility (fully opaque).
ContentAlpha.medium: Semi-transparent.
ContentAlpha.disabled: Very transparent, used for disabled states.
What Does This Code Do?

CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
    Text(text = "Active Now", style = MaterialTheme.typography.bodyMedium)
*/