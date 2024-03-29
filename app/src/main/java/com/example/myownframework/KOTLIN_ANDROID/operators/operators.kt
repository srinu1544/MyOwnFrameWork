package com.example.myownframework.Kotlin_Android.Operators

/*


please refer : https://kotlinlang.org/docs/keyword-reference.html

Operators and special symbols
Kotlin supports the following operators and special symbols:


Arithmetic: +, -, *, /, % (modulo)
Comparison: <, >, <=, >=
Equality: ==, !=
Logical: && (and), || (or), ! (not)
Bitwise: &, |, ^, <<, >> (use dedicated functions for bitwise operations instead)
Assignment: =, +=, -=, *=, etc. (augmented assignment)
Increment/Decrement: ++, --
Range: .., ..< (inclusive/exclusive)
Elvis operator: ?: (null-coalescing)
Type checking and casting: as, is
Indexing: []
Member access: . (dot operator)

+, -, *, /, % - mathematical operators

* is also used to pass an array to a vararg parameter.

= - is assignment operator.

is used to specify default values for parameters.

+=, -=, *=, /=, %= - augmented assignment operators.

++, -- - increment and decrement operators.

&&, ||, ! - logical 'and', 'or', 'not' operators (for bitwise operations, use the corresponding infix functions instead).

==, != - equality operators (translated to calls of equals() for non-primitive types).

===, !== - referential equality operators.

<, >, <=, >= - comparison operators (translated to calls of compareTo() for non-primitive types).

[, ] - indexed access operator (translated to calls of get and set).

!! asserts that an expression is non-nullable.

?. performs a safe call (calls a method or accesses a property if the receiver is non-nullable).

?: takes the right-hand value if the left-hand value is null (the elvis operator).

:: creates a member reference or a class reference.

.., ..< create ranges.

: separates a name from a type in a declaration.

? marks a type as nullable.

->

separates the parameters and body of a lambda expression.

separates the parameters and return type declaration in a function type.

separates the condition and body of a when expression branch.


@ - introduces an annotation.

introduces or references a loop label.

introduces or references a lambda label.

references a 'this' expression from an outer scope.

references an outer superclass.


; separates multiple statements on the same line.

$ references a variable or expression in a string template.

_

substitutes an unused parameter in a lambda expression.

substitutes an unused parameter in a destructuring declaration.

For operator precedence, see this reference in Kotlin grammar.*/
