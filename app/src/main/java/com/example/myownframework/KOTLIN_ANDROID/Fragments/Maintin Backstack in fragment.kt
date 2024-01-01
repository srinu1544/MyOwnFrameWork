package com.example.myownframework.Kotlin_Android.Fragments

/*managing navigation and providing a smooth user experience. The back stack allows users to navigate
between different fragments and return to the previous ones by pressing the back button. To maintain the
back stack in fragments, you can follow these steps:

Use FragmentManager:
You should use the FragmentManager to manage your fragments and transactions. The FragmentManager
is responsible for adding, replacing, and removing fragments from the UI.

Transactions:
To navigate between fragments and maintain the back stack, you should use fragment transactions.
Transactions represent a set of operations that can be applied atomically to your fragment stack.
Here's how you can create and commit a transaction:


FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
transaction.replace(R.id.fragment_container, new MyFragment());
transaction.addToBackStack(null); // Add to back stack
transaction.commit();

In the code above, we create a new transaction, replace the current fragment with a new one,
and add it to the back stack using addToBackStack(null).

Handling Back Press:
To handle the back button press and navigate through the back stack, you should override the onBackPressed method in your activity. This method should pop fragments from the back stack when the back button is pressed:

@Override
public void onBackPressed() {
    if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
        getSupportFragmentManager().popBackStack();
    } else {
        super.onBackPressed();
    }
}
This code checks if there are fragments in the back stack. If so, it pops the top fragment from the
back stack. Otherwise, it calls the default behavior to exit the activity.

Custom Back Actions:
You can also customize the back button behavior within your fragments. For example, you might want to
perform some action before popping the fragment from the back stack:


@Override
public void onBackPressed() {
    // Perform some custom action here
    super.onBackPressed(); // Pop the fragment from the back stack
}
This allows you to add custom logic before navigating back.

By following these steps, you can maintain the back stack in fragments, enabling smooth navigation
 between fragments and a consistent user experience.





*/