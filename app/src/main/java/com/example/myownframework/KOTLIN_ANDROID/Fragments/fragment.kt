package com.example.myownframework.Kotlin_Android.Fragments

/*

adding androidx fragment dependency :
--------------------------------------


    val fragment_version = "1.6.2"

    // Java language implementation
    implementation ("androidx.fragment:fragment:$fragment_version")
    // Kotlin
    implementation ("androidx.fragment:fragment-ktx:$fragment_version")
    // Testing Fragments in Isolation
    debugImplementation ("androidx.fragment:fragment-testing:$fragment_version")



In Android app development, a fragment is a modular and reusable component that represents a portion of a user interface or behavior within an activity. Fragments were introduced to allow developers to create more flexible and responsive UIs, especially for larger screens or multi-pane layouts. Fragments have their own lifecycle and can be combined within an activity to create complex and dynamic user interfaces.

Here are some key aspects of fragments and their lifecycle:

Fragment Lifecycle Phases:
Fragments have their own lifecycle phases that are similar to the lifecycle of an activity. The key phases in the fragment's lifecycle are:

onAttach(): Called when the fragment is attached to an activity.
onCreate(): Initializes the fragment.
onCreateView(): Creates the fragment's UI (user interface) by inflating a layout or constructing it programmatically.
onActivityCreated(): Called after the activity's onCreate() method has been called.
onStart(): Called when the fragment becomes visible.
onResume(): Fragment is now actively interacting with the user.
onPause(): Fragment is no longer interacting with the user.
onStop(): Fragment is no longer visible.
onDestroyView(): The fragment's UI is being destroyed.
onDestroy(): Fragment is being destroyed.
onDetach(): Fragment is detached from the activity.


Fragment Transactions:

Fragments are typically added to or removed from an activity through fragment transactions.
Fragment transactions are a way to manage the addition, removal, or replacement of fragments
within an activity. They allow you to dynamically change the fragments displayed in an activity.

Fragment Communication:
Fragments can communicate with each other and with the hosting activity using interfaces, callbacks, or shared view models. This enables flexible and decoupled interactions between different parts of your UI.

Back Stack:
Fragments can be added to a back stack, which allows users to navigate back to previous fragments in a manner similar to the back stack of activities. This can be useful for preserving the navigation history within a single activity.

Fragment Types:
There are different types of fragments, including static fragments (defined in XML layouts) and dynamic
fragments (created programmatically). Dynamic fragments are often used for more flexible and interactive UIs.

Here's a simplified example of fragment lifecycle methods:

public class MyFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        // Called when the fragment is attached to an activity.
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Initialize the fragment.
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the fragment's UI layout here.
        return inflater.inflate(R.layout.fragment_my, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        // Called after the hosting activity's onCreate().
    }

    // Other lifecycle methods: onStart(), onResume(), onPause(), onStop(), onDestroyView(), onDestroy(), onDetach()
}
Understanding the fragment lifecycle is crucial when developing Android applications with complex user interfaces that use fragments to manage different parts of the UI.
Properly managing the fragment lifecycle ensures that your app behaves as expected and is responsive to configuration changes and user interactions.




*/