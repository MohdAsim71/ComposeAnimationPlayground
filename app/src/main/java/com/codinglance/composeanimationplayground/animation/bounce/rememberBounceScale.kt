package com.codinglance.composeanimationplayground.animation.bounce

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.keyframes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember

@Composable
fun rememberBounceScale(
    trigger: Any,
    spec: BounceScaleSpec = BounceScaleSpec()
): Animatable<Float, *> {

    val scale = remember { Animatable(0f) }

    LaunchedEffect(trigger) {
        scale.snapTo(0f)
        scale.animateTo(
            targetValue = 1f,
            animationSpec = keyframes {
                durationMillis = spec.durationMillis

                spec.overshoot at (spec.durationMillis * 0.16f).toInt() with spec.easing
                spec.undershoot at (spec.durationMillis * 0.33f).toInt()
                spec.rebound at (spec.durationMillis * 0.5f).toInt()
                1f at spec.durationMillis
            }
        )
    }

    return scale
}
