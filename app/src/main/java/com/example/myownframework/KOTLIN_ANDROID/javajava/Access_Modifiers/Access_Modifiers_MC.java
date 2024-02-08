package com.example.myownframework.Kotlin_Android.javajava.Access_Modifiers;




/* Access modifiers :
---------------------

access modifiers are behavior of class method or variable

There are four access modifiers in Java:

Public:
-------
-> from anywhere
The public modifier is the most permissive.
A member that is declared public is accessible from anywhere.

Private:
---------
-> within the class

The private modifier is the most restrictive. A member that is declared private is only accessible
from within the class in which it is declared.

Protected:
----------
->  within the class and any subclasses of that class

The protected modifier is in between public and private. A member that is declared protected
is accessible from within the class in which it is declared, as well as from any subclasses of that class.

Default:
--------
--> any other classes in the same package

The default modifier is the least restrictive.
A member that is declared with the default modifier is accessible from
within the class in which it is declared, as well as from any other classes in the same package.


*/

public class Access_Modifiers_MC {

    private int myPrivateVariable;
    protected int myProtectedVariable;
    public int myPublicVariable;

     int  defaultVariable;

    public Access_Modifiers_MC() {
        myPrivateVariable = 1;
        myProtectedVariable = 2;
        myPublicVariable = 3;

    }

    public void setMyPrivateVariable(int value) {
        myPrivateVariable = value;
    }

    public int getMyPrivateVariable() {
        return myPrivateVariable;
    }

    public void setMyProtectedVariable(int value) {
        myProtectedVariable = value;
    }

    public int getMyProtectedVariable() {
        return myProtectedVariable;
    }

    public void setMyPublicVariable(int value) {
        myPublicVariable = value;
    }

    public int getMyPublicVariable() {
        return myPublicVariable;
    }

}
