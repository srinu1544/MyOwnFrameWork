package com.example.myownframework.Kotlin_Android.Fragments

/*
parse data bw fragments except bundle :

To pass data between two fragments in Android without using a Bundle, you have several options,
depending on your specific requirements and the complexity of your application. Here are a few common
approaches:


ViewModel:
Use a ViewModel to store and share data between fragments. ViewModels are lifecycle-aware
components that can hold data independently of fragments or activities. Here's how you can use them:

a. Create a ViewModel class to hold your data. This class should extend ViewModel from the Android
Architecture Components library.


public class MyViewModel extends ViewModel {
   private MutableLiveData<String> sharedData = new MutableLiveData<>();

   public void setSharedData(String data) {
       sharedData.setValue(data);
   }

   public LiveData<String> getSharedData() {
       return sharedData;
   }
}
b. In each of your fragments, obtain a reference to the same ViewModel.
MyViewModel viewModel = new ViewModelProvider(requireActivity()).get(MyViewModel.class);
c. Set and observe data in your fragments.
In the sending fragment:
viewModel.setSharedData("Data to share");
In the receiving fragment:

viewModel.getSharedData().observe(getViewLifecycleOwner(), new Observer<String>() {
   @Override
   public void onChanged(String data) {
       // Do something with the data
   }
});

EventBus:
EventBus is a third-party library that simplifies communication between components.
It allows you to publish and subscribe to events within your app.
a. Add the EventBus library to your project.

gradle
implementation 'org.greenrobot:eventbus:3.2.0'
b. Define an event class to encapsulate your data.

public class DataEvent {
   private String data;

   public DataEvent(String data) {
       this.data = data;
   }

   public String getData() {
       return data;
   }
}
c. In the sending fragment, post the event.
EventBus.getDefault().post(new DataEvent("Data to share"));
d. In the receiving fragment, subscribe to the event.


@Subscribe(threadMode = ThreadMode.MAIN)
public void onDataEvent(DataEvent event) {
   String data = event.getData();
   // Do something with the data
}
Make sure to register and unregister your fragments as subscribers in their respective onCreate and
onDestroy methods.

LiveData with Shared ViewModel (Kotlin):
In Kotlin, you can use LiveData and a shared ViewModel similar to the first approach but with a more concise syntax. Here's an example:

a. Create a shared ViewModel with LiveData in your activity.
class SharedViewModel : ViewModel() {
   val sharedData = MutableLiveData<String>()
}
b. In your sending fragment, set the data.

val viewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
viewModel.sharedData.value = "Data to share"
c. In your receiving fragment, observe the LiveData.


val viewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
viewModel.sharedData.observe(viewLifecycleOwner) { data ->
   // Do something with the data
}
Choose the method that best fits your application's architecture and requirements. LiveData with
ViewModel is recommended for modern Android app development as it provides a clean and lifecycle-aware way
to share data between components.




*/
