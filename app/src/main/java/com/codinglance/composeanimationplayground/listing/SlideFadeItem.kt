package com.codinglance.composeanimationplayground.listing

import android.R.attr.translationY
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp


@Composable
fun StaggeredSlideItem(
    index: Int,
    content: @Composable () -> Unit
) {
    val offset by animateDpAsState(
        targetValue = 0.dp,
        animationSpec = tween(
            durationMillis = 500,
            delayMillis = index * 80
        ),
        label = ""
    )

    Box(
        modifier = Modifier.graphicsLayer {
            translationY = offset.toPx()
        }
    ) {
        content()
    }
}









