package com.example.myownframework.Kotlin_Android.Differences

/*Dagger 1:
The graph is composed via reflection by ObjectGraph.
It is by square




Dagger 2: The graph is built by a user-defined type that is annotated with @Component.

The implementation of this type is generated at compile time


Both Dagger 1 and Dagger 2 are dependency injection frameworks for Android, but they differ significantly in their approach and features:

Key Differences:

Graph composition:

Dagger 1: Relies on reflection at runtime to construct the dependency graph, which can be slow and less traceable.
Dagger 2: Utilizes annotations and generates code at compile time, resulting in faster performance and a more readable and maintainable graph.
Configuration:

Dagger 1: Requires more configuration for modules, including setting the scope for each dependency.
Dagger 2: Requires less configuration, relying on annotations to define dependencies and scopes.
Features:

Dagger 2: Offers additional features like:
Method injection, alongside field and constructor injection available in both versions.
Support for custom scope annotations, whereas Dagger 1 only supports the @Singleton scope.
Compatibility with code obfuscation tools like ProGuard.
Overall, Dagger 2 is considered the superior option due to its:

Improved performance: Compile-time generation eliminates the runtime overhead of reflection.
Enhanced readability and maintainability: Generated code and less configuration make the dependency graph easier to understand.
Greater flexibility: Supports various features not available in Dagger 1.
Additionally:

Dagger 1 is deprecated, and migrating to Dagger 2 is recommended for new projects.
Resources are available to assist with migrating from Dagger 1 to Dagger 2.




*/