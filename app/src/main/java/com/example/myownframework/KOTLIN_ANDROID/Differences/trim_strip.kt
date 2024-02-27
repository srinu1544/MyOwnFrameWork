package com.example.myownframework.Kotlin_Android.Differences

/*In short : strip() is "Unicode-aware" evolution of trim(). Meaning trim() removes
only characters <= U+0020 (space); strip() removes all Unicode whitespace characters
(but not all control characters, such as \0)*/