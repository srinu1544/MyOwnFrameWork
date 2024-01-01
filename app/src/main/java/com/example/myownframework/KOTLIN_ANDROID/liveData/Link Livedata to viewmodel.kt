package com.example.myownframework.Kotlin_Android.LiveData

/*

To link LiveData to a ViewModel in Android, you can follow these steps:

Create a ViewModel: First, create a ViewModel class that will hold your data. You can do
this by extending the ViewModel class.


import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    // Declare LiveData variables here
}
Declare LiveData:
Inside your ViewModel, declare the LiveData variables that you want to
expose to your UI. These LiveData objects will hold your data.


private MutableLiveData<String> dataLiveData = new MutableLiveData<>();

public LiveData<String> getDataLiveData() {
    return dataLiveData;
}

Update LiveData:
Whenever you want to update the data held by the LiveData, you can use the
setValue or postValue methods. Usually, this is done in response to some data changes or
user interactions.


public void updateData(String newData) {
    dataLiveData.setValue(newData);
}

Observe LiveData in the UI:
In your UI components (e.g., Activity or Fragment), you can observe the LiveData to react
to changes and update the UI accordingly. To do this, use the observe method.


public class MyFragment extends Fragment {
    private MyViewModel viewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = ViewModelProviders.of(this).get(MyViewModel.class);
        viewModel.getDataLiveData().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String newData) {
                // Update the UI with the new data
            }
        });
    }
}
Make sure you import the necessary classes, such as ViewModel, MutableLiveData, LiveData,
and ViewModelProviders, in your Java or Kotlin file.

Access ViewModel:
You should use ViewModelProviders.of(this) to get an instance of your ViewModel in the UI
component (Activity or Fragment) and then use the observe method to observe changes in the
LiveData.

By following these steps, you can link LiveData to a ViewModel in your Android app,
ensuring that your UI always displays up-to-date data without leaking resources or
handling lifecycle-related issues manually.

*/
