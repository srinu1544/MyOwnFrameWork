package com.example.myownframework.Kotlin_Android.JetpackCompose.Animations

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.keyframes
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AnimationTween() {

    var sizeState by remember {
        mutableStateOf(200.dp)
    }
    val size by animateDpAsState(
        targetValue = sizeState,
        tween(durationMillis = 3000,
            delayMillis = 300,
            easing = LinearOutSlowInEasing)
    )

    Box(modifier = Modifier
        .size(size)
        .background(Color.Red),
        contentAlignment = Alignment.Center) {

        Button(onClick = { sizeState += 50.dp }) {

            Text(text = "Increase Size")

        }
    }


}


@Composable
fun AnimationInfinateTransation() { // infinateTransation

    var sizeState by remember {
        mutableStateOf(200.dp)
    }
    val size by animateDpAsState(
        targetValue = sizeState,
        tween(durationMillis = 1000)
    )

    val infiniteTransation = rememberInfiniteTransition()
    val color by infiniteTransation.animateColor(
        initialValue = Color.Red,
        targetValue = Color.Green,
        animationSpec = infiniteRepeatable(
            tween(durationMillis = 2000),
            repeatMode = RepeatMode.Reverse

        )
    )

    Box(modifier = Modifier
        .size(size)
        .background(color),
        contentAlignment = Alignment.Center) {

        Button(onClick = { sizeState += 50.dp }) {

            Text(text = "Increase Size")

        }
    }


}


@Composable
fun AnimationSpring() { // bouncy

    var sizeState by remember {
        mutableStateOf(200.dp)
    }
    val size by animateDpAsState(
        targetValue = sizeState,
        spring(Spring.DampingRatioHighBouncy)
    )


    Box(modifier = Modifier
        .size(size)
        .background(Color.Red),
        contentAlignment = Alignment.Center) {

        Button(onClick = { sizeState += 50.dp }) {

            Text(text = "Increase Size")

        }
    }


}


@Composable
fun AnimationKeyFrames() { // bouncy

    var sizeState by remember {
        mutableStateOf(200.dp)
    }
    val size by animateDpAsState(
        targetValue = sizeState,
       keyframes {
           durationMillis =5000
           sizeState at 0 with LinearEasing
           sizeState * 1.5f at 1000 with FastOutLinearInEasing
           sizeState * 2f at 5000
       }
    )


    Box(modifier = Modifier
        .size(size)
        .background(Color.Red),
        contentAlignment = Alignment.Center) {

        Button(onClick = { sizeState += 50.dp }) {

            Text(text = "Increase Size")

        }
    }


}

@Composable
fun AnimationSmooth() {

    var sizeState by remember {
        mutableStateOf(200.dp)
    }

    val size by animateDpAsState(
        targetValue = sizeState)


    Box(modifier = Modifier
        .size(size)
        .background(Color.Red),
        contentAlignment = Alignment.Center) {

        Button(onClick = { sizeState += 50.dp }) {

            Text(text = "Increase Size")

        }
    }


}