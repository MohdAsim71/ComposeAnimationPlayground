package com.codinglance.composeanimationplayground.listing.flipListAnimation

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer

@Composable
fun FlipItem(
    visible: Boolean,
    content: @Composable () -> Unit
) {
    val rotation by animateFloatAsState(
        if (visible) 0f else 90f,
        label = ""
    )

    Box(
        modifier = Modifier.graphicsLayer {
            rotationY = rotation
            cameraDistance = 12 * density
        }
    ) {
        content()
    }
}