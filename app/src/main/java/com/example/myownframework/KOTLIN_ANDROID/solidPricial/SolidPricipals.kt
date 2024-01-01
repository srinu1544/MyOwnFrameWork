package com.example.myownframework.Kotlin_Android.solidPricial

/*

https://www.youtube.com/watch?v=t8VTLxMsufU&t=40s&ab_channel=PhilippLackner

SOLID principles are a set of five principles that help make software designs more
understandable and easier to maintain. They are important in Android development as
they ensure that the code is scalable and maintainable in the long run.

Single Responsibility Principle
Open-Closed Principle
Liskov Substitution Principle
Interface Segregation Principle
Dependency Inversion Principle


Single Responsibility Principle :
---------------------------------
The Single Responsibility Principle (SRP) is a computer programming principle that states
that a module should only be responsible to one actor. An actor is a group of one or more
users or stakeholders who require a change in the module.

SRP is a part of the SOLID programming principles, which were put forth by Robert Martin.
The principle states that every module, class, or function should have only one reason to
change. This means that each piece of code should have a clear and specific purpose, and
avoid doing too many things at once.

The purpose of the SOLID principles is to allow developers to write better software. The
software is easier and cheaper to maintain, easier to understand, faster to develop in a
team, and easier to test.


Open-Closed Principle :
-----------------------

The Open-Closed Principle (OCP) is a design principle in object-oriented programming.
It states that software components, such as classes and methods, should be open for
extension but closed for modification. This means that new functionality can be added
 to software without changing the existing code.

For example, a smartphone can have new functionality added to it by buying accessories like a case,
lens, or battery. These functions don't require opening the phone up and changing it.

In software development, the OCP is similar to creating abstract classes or interfaces.
This gives the code intended uses and expectations, but the concrete implementation is
left up to the developer.


The Liskov Substitution Principle (LSP) :
------------------------------------------
It is a fundamental principle in object-oriented programming. It states that
objects of a superclass can be replaced with objects of a subclass without
affecting the program's correctness

In other words, the objects of the subclasses should behave in the same way as the
objects of the superclass.
Here's an example of the Liskov Substitution Principle:
Ducks can fly
Ostrich is a bird, but it can't fly
Ostrich class is a subtype of class Bird, but it shouldn't be able to use the fly method
This means we are breaking the LSP principle

The Liskov Substitution Principle is a semantic relation, not just syntactic. It aims to
ensure the semantic interoperability of types in a hierarchy, especially object types


The Interface Segregation Principle (ISP) :
-------------------------------------------
It is a design principle in object-oriented programming. It states that clients should not
be forced to depend on interfaces they don't use.

The goal of the ISP is to reduce the side effects of using larger interfaces by breaking application
interfaces into smaller ones. The ISP suggests that a software system should be broken down into
smaller, more specific interfaces, rather than one large interface that covers all possible functionality.

Robert C. Martin first defined the ISP while consulting for Xerox to help them build the software
for their new printer systems.

Here are some solutions to ISP violations:
Split large interfaces into smaller ones
Inherit multiple small interfaces if required

Use the adapter design pattern for the third-party large interface so that your code can
work with the adapter

Dependency Inversion Principle :
--------------------------------
Dependency Inversion is the strategy of depending upon interfaces or abstract functions and
classes rather than upon concrete functions and classes. Simply put, when components of our
system have dependencies, we don't want directly inject a component's dependency into another.




*/