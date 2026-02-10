package com.codinglance.composeanimationplayground.animation.bounce

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer

@Composable
fun BounceScale(
    trigger: Any,
    modifier: Modifier = Modifier,
    spec: BounceScaleSpec = BounceScaleSpec(),
    content: @Composable () -> Unit
) {
    val scale = rememberBounceScale(trigger, spec)

    Box(
        modifier = modifier.graphicsLayer {
            scaleX = scale.value
            scaleY = scale.value
        }
    ) {
        content()
    }
}
