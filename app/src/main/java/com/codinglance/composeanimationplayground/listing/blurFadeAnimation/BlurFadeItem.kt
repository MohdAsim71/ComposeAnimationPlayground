package com.codinglance.composeanimationplayground.listing.blurFadeAnimation

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp

@Composable
fun BlurFadeItem(
    visible: Boolean,
    content: @Composable () -> Unit
) {
    val alpha by animateFloatAsState(
        if (visible) 1f else 0f,
        label = ""
    )
    val blur by animateDpAsState(
        if (visible) 0.dp else 12.dp,
        label = ""
    )

    Box(
        modifier = Modifier
            .graphicsLayer { this.alpha = alpha }
            .blur(blur)
    ) {
        content()
    }
}