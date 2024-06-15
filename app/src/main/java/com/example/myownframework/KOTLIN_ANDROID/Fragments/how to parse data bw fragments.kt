package com.example.myownframework.Kotlin_Android.Fragments

/*
how to parse data between two fragments :
with the use of fragments we can parse the data between two fragments
Parsing data between two fragments in an Android application typically involves passing data from one
fragment to another. Here are the steps to achieve this:

Create Your Fragments:
Ensure you have two fragments that need to communicate with each other. Let's call them FragmentA and
 FragmentB.

Define a Listener Interface (Optional):
You can create an interface in FragmentA to define the method that FragmentB will implement to receive
the data. This step is optional but can be useful for decoupling the fragments.


public interface DataListener {
    void onDataReceived(String data);
}
Implement the Interface (Optional):
In FragmentB, implement the interface you created in FragmentA.


public class FragmentB extends Fragment implements FragmentA.DataListener {


    @Override
    public void onDataReceived(String data) {
        // Handle the received data here
    }
}
Pass Data from FragmentA to FragmentB:
To pass data from FragmentA to FragmentB, you can use a Bundle. Here's how you can do it:

In FragmentA:

// Create a Bundle to hold the data
Bundle bundle = new Bundle();
bundle.putString("key", "your_data_here");

// Attach the Bundle to FragmentB
FragmentB fragmentB = new FragmentB();
fragmentB.setArguments(bundle);

// Replace or add FragmentB to the FragmentManager
FragmentTransaction transaction = getFragmentManager().beginTransaction();
transaction.replace(R.id.fragment_container, fragmentB);
transaction.addToBackStack(null);
transaction.commit();
Retrieve Data in FragmentB:
In FragmentB, retrieve the data from the Bundle.

@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_b_layout, container, false);

    Bundle bundle = getArguments();
    if (bundle != null) {
        String data = bundle.getString("key");
        // Now you can use the 'data' variable in FragmentB
    }

    return view;
}
Handle Data in FragmentB:
You can now use the received data in FragmentB as needed.

By following these steps, you can pass data between two fragments in your Android application.
Keep in mind that there are other methods for communication between fragments, such as using ViewModel
or EventBus, depending on the complexity and requirements of your application.
*/