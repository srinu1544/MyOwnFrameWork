package com.example.myownframework.Kotlin_Android.print

/*

https://developer.android.com/training/printing/custom-docs#kotlin

For some applications, such as drawing apps, page layout apps and other apps that focus
 on graphic output, creating beautiful printed pages is a key feature. In this case, it is not
 enough to print an image or an HTML document. The print output for these types of applications
 requires precise control of everything that goes into a page, including fonts, text flow, page
 breaks, headers, footers, and graphic elements.


Creating print output that is completely customized for your application requires more programming
investment than the previously discussed approaches. You must build components that communicate
with the print framework, adjust to printer settings, draw page elements and manage printing on
multiple pages.

This lesson shows you how you connect with the print manager, create a print adapter and build content for printing.

Connect to the print manager
When your application manages the printing process directly, the first step after receiving a print request
from your user is to connect to the Android print framework and obtain an instance of the PrintManager class.
This class allows you to initialize a print job and begin the printing lifecycle. The following code example
shows how to get the print manager and start the printing process.

private fun doPrint() {
    activity?.also { context ->
        // Get a PrintManager instance
        val printManager = context.getSystemService(Context.PRINT_SERVICE) as PrintManager
        // Set job name, which will be displayed in the print queue
        val jobName = "${context.getString(R.string.app_name)} Document"
        // Start a print job, passing in a PrintDocumentAdapter implementation
        // to handle the generation of a print document
        printManager.print(jobName, MyPrintDocumentAdapter(context), null)
    }
}


The example code above demonstrates how to name a print job and set an instance of the PrintDocumentAdapter
 class which handles the steps of the printing lifecycle. The implementation of the print adapter class
 is discussed in the next section.


Note: The last parameter in the print() method takes a PrintAttributes object. You can use this parameter
to provide hints to the printing framework and pre-set options based on the previous printing cycle,
thereby improving the user experience. You may also use this parameter to set options that are more
appropriate to the content being printed, such as setting the orientation to landscape when printing
a photo that is in that orientation.



Create a print adapter
----------------------
A print adapter interacts with the Android print framework and handles the steps of the printing process.
This process requires users to select printers and print options before creating a document for printing.
These selections can influence the final output as the user chooses printers with different output
capabilities, different page sizes, or different page orientations. As these selections are made,
the print framework asks your adapter to lay out and generate a print document, in preparation for
 final output. Once a user taps the print button, the framework takes the final print document
 and passes it to a print provider for output. During the printing process, users can choose to
 cancel the print action, so your print adapter must also listen for and react to a cancellation requests.

The PrintDocumentAdapter abstract class is designed to handle the printing lifecycle, which has four main
callback methods. You must implement these methods in your print adapter in order to interact properly
with the print framework:


onStart() - Called once at the beginning of the print process. If your application has any one-time preparation tasks to perform, such as getting a snapshot of the data to be printed, execute them here. Implementing this method in your adapter is not required.
onLayout() - Called each time a user changes a print setting which impacts the output, such as a different page size, or page orientation, giving your application an opportunity to compute the layout of the pages to be printed. At the minimum, this method must return how many pages are expected in the printed document.
onWrite() - Called to render printed pages into a file to be printed. This method may be called one or more times after each onLayout() call.
onFinish() - Called once at the end of the print process. If your application has any one-time tear-down tasks to perform, execute them here. Implementing this method in your adapter is not required.
The following sections describe how to implement the layout and write methods, which are critical to the functioning of a print adapter.






*/