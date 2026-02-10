package com.codinglance.composeanimationplayground.listing.bounceScaleListAnimation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.codinglance.composeanimationplayground.animation.bounce.BounceScale
import com.codinglance.composeanimationplayground.animation.bounce.BounceVariants
import com.codinglance.composeanimationplayground.listing.AnimatedListItem

@Composable
fun BounceScaleList(items: List<String>) {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 40.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        itemsIndexed(items) { index, item ->

            BounceScale(
                trigger = index,
                spec = BounceVariants.Micro
            ) {
                AnimatedListItem(
                    title = item,
                    subtitle = "Bounce Scale Animation",
                    icon = Icons.Default.Star
                )
            }
        }
    }
}
