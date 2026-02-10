package com.codinglance.composeanimationplayground.animation.bounce

object BounceVariants {

    val Fast = BounceScaleSpec(
        durationMillis = 300,
        overshoot = 1.15f,
        undershoot = 0.95f,
        rebound = 1.03f
    )

    val Soft = BounceScaleSpec(
        overshoot = 1.1f,
        undershoot = 0.97f,
        rebound = 1.02f
    )

    val Hard = BounceScaleSpec(
        overshoot = 1.3f,
        undershoot = 0.85f,
        rebound = 1.1f
    )

    val Micro = BounceScaleSpec(
        overshoot = 1.05f,
        undershoot = 0.98f,
        rebound = 1.01f
    )

    val OverTheTop = BounceScaleSpec(
        overshoot = 1.5f,
        undershoot = 0.8f,
        rebound = 1.2f,
        durationMillis = 800
    )
}
