package com.codinglance.composeanimationplayground.animation.bounce

import androidx.compose.animation.core.Easing
import androidx.compose.animation.core.FastOutSlowInEasing

data class BounceScaleSpec(
    val durationMillis: Int = 800,
    val overshoot: Float = 1.2f,
    val undershoot: Float = 0.9f,
    val rebound: Float = 1.05f,
    val easing: Easing = FastOutSlowInEasing
)
