package com.codinglance.composeanimationplayground.listing.slideFadeAnimation

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp

@Composable
fun SlideFadeItem(
    visible: Boolean,
    content: @Composable () -> Unit
) {
    val offsetY by animateDpAsState(
        targetValue = if (visible) 0.dp else 16.dp,
        label = ""
    )
    val alpha by animateFloatAsState(
        targetValue = if (visible) 1f else 0f,
        label = ""
    )

    Box(
        modifier = Modifier.graphicsLayer {
            translationY = offsetY.toPx()
            this.alpha = alpha
        }
    ) {
        content()
    }
}