package com.example.myownframework.Kotlin_Android.layouts

/*
Android provides several types of layouts that you can use to organize and arrange UI components (views)
within your app's user interface. Each layout type has its own purpose and behavior. Here are some of
the most commonly used Android layout types:

LinearLayout:

This layout arranges child views either horizontally or vertically in a single line. You can specify
the orientation using the android:orientation attribute. It's simple and efficient for creating simple
linear arrangements.

**RelativeLayout:**
Allows you to position child views relative to each other or relative to the parent layout.
You can specify rules like aligning to the top, bottom, left, or right of other views. It's flexible for
creating complex UIs.

Relative Layout is a view group in Android that arranges views relative to each other.
It allows you to position views in relation to sibling elements or the parent RelativeLayout area.
For example, you can position a view to the left of, below, or above another view.
You can also align a view to the bottom, left, or center of the parent RelativeLayout area.
Relative Layout is considered a flexible layout because it allows you to position components anywhere you want.
You can use it for custom layout designing.



**FrameLayout:**
This layout is designed to hold a single child view, positioned at the top-left corner. It's often
used for fragments and overlays.

**GridLayout:**
Arranges child views in a grid of rows and columns. You can specify the number of rows and columns
and assign views to specific grid cells.

** TableLayout: **
Organizes child views in rows and columns, similar to an HTML table. It's less flexible than
GridLayout but can be useful for certain types of UIs.

**ScrollView:**
Allows you to create scrollable layouts when the content overflows the screen. You can place
a single child within a ScrollView to make it scrollable.

**ListView**
(deprecated) and RecyclerView: These layouts are used for displaying lists of data. RecyclerView
is the modern replacement for ListView and offers better performance and flexibility.

CardView:
While not a layout in the traditional sense, CardView is often used as a container for grouping
views together, providing a card-like appearance with rounded corners and elevation.

ConstraintSet:
This is not a layout type on its own but is often used in conjunction with ConstraintLayout
to define constraints programmatically in your code.

ConstraintLayout :

ConstraintLayout defines a layout by assigning constraints to each child view or widget.
A constraint represents a connection or alignment to another view, the parent layout,
or an invisible guideline.

ConstraintLayout improves UI performance over other layouts.
It also makes it easier for developers to build complex UI designs

Introduced in recent versions of Android, this layout allows you to create complex layouts
with a flat view hierarchy. You can set constraints between views, making it easy to create
responsive and
flexible designs.

Custom Layouts:
You can create custom layouts by extending existing layouts or implementing your own layout
logic by extending the ViewGroup class.

Choosing the right layout type depends on your app's specific design requirements. You may also use a
combination of these layouts within your app's hierarchy to achieve the desired UI structure. Additionally,
Android's layout system is continually evolving, so be sure to check the latest documentation and best practices for the most up-to-date information.


coordinate layout :
-------------------

CoordinatorLayout is a super-powered FrameLayout.

CoordinatorLayout is a general-purpose container that allows for coordinating interactive behaviorsbetween its children.CoordinatorLayout manages interactions between its children, and as such needs to contain all the Views that interact with each other. The two general cases supported by CoordinatorLayout are:

As a top-level content layout (meaning CoordinatorLayout is at the root of all views within an activity or fragment).
As a container for a specific interaction with one or more child views.
By specifying Behaviors for child views of a CoordinatorLayout you can provide many different interactions within a single parent and those views can also interact with one another.

https://medium.com/android-news/coordinatorlayout-basic-8040c74cf426#:~:text=CoordinatorLayout%20is%20a%20general%2Dpurpose,that%20interact%20with%20each%20other.

*/


