package com.example.myownframework.Kotlin_Android.LaunchModes

/*


must watch : https://www.youtube.com/watch?v=p2VcRmZLbpA&list=PLfuE3hOAeWhY8fkzCluHakmK9A3bJsGR0&index=2&ab_channel=Codetutor
Launching modes :


Standard
singleTop
singleTask
singleInstance
taskaffinity


Standard: (The default mode.)
------------------------------

This is the default launch mode of activity. If you don’t set any launch mode to your activity,
it will use the standard mode by default. It creates a new instance of activity every time even
if the activity instance is already present.

Suppose we have A, B, C, and D activities and your activity B has standard launch mode.
Now again launching activity B

State of Activity Stack before launch B

A →B→ C→D

State of Activity Stack after launch B
A → B → C→D→ B
We can see that a new instance of B is created again.

SingleTop:
----------

If an instance of activity already exists at the top of the current task, a new instance
will not be created and the Android system will route the intent information through onNewIntent().
If an instance is not present on top of the task then a new instance will be created.

Suppose we have A, B, C, and D activities. A →B →C →D

If we launch C then a new instance of C will be created as it is not on top.
So it will look like A →B →C →D →C

Now suppose we have A →B →C →D →C like this
then we if again launch C activity then in this case new instance will not be created. Instead, we will receive the callback on onNewIntent() method.

SingleTask:
------------

An activity declared with launch mode as singleTask can have only one instance in the system
(singleton). At a time only one instance of activity will exist.

If activity instance is not present then the new instance will be created and if the instance
is already present in the system then the onNewIntent() method will receive the callback.

Suppose we have A, B, C activities(A →B →C ) and we are launching D that has a singleTask launch mode.
In that case, the new instance of D will be created so the current state will look like this.
 (A →B →C →D)

Now let suppose if we launch B that also have has a singleTask launch mode then current state will
look like this.

A → B

Here old instance gets called and intent data route through onNewIntent() callback. Also, notice
that C and D activities get destroyed here.

SingleInstance:
---------------

It is similar to singleTask except that no other activities will be created in the same task.
If another Activity is called from this kind of Activity, a new Task would be automatically
created to place that new Activity.

Case 1:
Suppose you have A, B, and C activities(A →B →C) and your activity D has a singleInstance
launch mode. In this case, if we launch D then D will be launch in the different task.
New task for D will be created.

Task1: A →B →C
Task2 : D (here D will be in the different task)
Now if you continue this and start E and D then Stack will look like
Task1: A →B →C →E

Task2: D

Case 2:
Suppose you have A, B, C activities in one task (A →B →C)and activity D is in another task with launch
mode singleInstance. In this case, if we launch D again then we will receive the callback in the
onNewIntent() method of D activity.

Task1: A →B →C
Task2: D (Here old instance gets called and intent data route through onNewIntent() callback)

singleInstancePerTask :

The activity can only run as the root activity of the task, the first activity that created the
task, and therefore there is only one instance of this activity in a task. However, the activity
can be instantiated multiple times in different tasks
*/