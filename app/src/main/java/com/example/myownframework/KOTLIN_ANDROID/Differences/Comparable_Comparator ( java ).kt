package com.example.myownframework.Kotlin_Android.Differences


/*


 Conparable :
---------------
present -  java.lang
interface - java.lang.Comparable
Method     - compareTo()
Parameters  - Object of the same class
Return value - Integer (-1, 0, or 1)
use case     - 	default nature sorting order
implemented classes - All wrapper classes and String classes implement comparable interface.




Comparator :
------------
present -  java.util
interface - java.util.Comparator
Method     - compare(), equals()
Parameters  - Two objects of any type
Return value - Integer (-1, 0, or 1)
use case     - 	customized sorting order
implemented classes - The only implemented class of comparator are collator and RuleBasedCollator.





Comparable and Comparator are both interfaces in Java that are used to sort objects. However, there are some key differences between the two.
Comparable is an interface that is implemented by a class to indicate that its objects can be compared to each other. The compareTo() method is used to compare two objects of the same class. The return value of the compareTo() method is an integer that indicates whether the first object is less than, equal to, or greater than the second object.
Comparator is an interface that is used to compare two objects of any type. The compare() method is used to compare two objects. The return value of the compare() method is an integer that indicates whether the first object is less than, equal to, or greater than the second object.
Here is a table that summarizes the key differences between Comparable and Comparator:





Comparable is typically used when you want to sort a collection of objects in a natural order. For example, you might use Comparable to sort a list of strings in alphabetical order.
Comparator is typically used when you want to sort a collection of objects in a custom order. For example, you might use Comparator to sort a list of students by their GPA.
Here are some examples of how to use Comparable and Comparator




*/