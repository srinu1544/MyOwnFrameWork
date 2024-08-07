package com.example.myownframework.Kotlin_Android.AboutAndroid

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.myownframework.Kotlin_Android.Utils.Utils
import com.example.myownframework.R

/*JVM is the virtual machine that runs java code on different platforms.
It acts as an abstract layer between the program and the platform on which the java code is running.
The portability of Java code is possible only because of the JVM. The javac compiler converts the
source code file(.java file) into an intermediate java bytecode format which is machine/platform independent.
This intermediate file is then provided to the target machine/platform where it gets translated into
machine code. JVM supports multiple host architecture and it is the reason why Java applications
are called WORA(Write Once Run Anywhere). */

@Preview
@Composable
fun Image(){
    Utils.AndroidArch(R.drawable.jvm)
}

