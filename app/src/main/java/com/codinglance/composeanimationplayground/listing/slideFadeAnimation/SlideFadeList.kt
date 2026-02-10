package com.codinglance.composeanimationplayground.listing.slideFadeAnimation

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
import com.codinglance.composeanimationplayground.listing.AnimatedListItem
import com.codinglance.composeanimationplayground.listing.rememberAnimatedItemState

@Composable
fun SlideFadeList(items: List<String>) {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 40.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        itemsIndexed(
            items,
            key = { _, item -> item }
        ) { _, item ->

            val visible = rememberAnimatedItemState(item)

            SlideFadeItem(visible = visible) {
                AnimatedListItem(
                    title = item,
                    subtitle = "Slide + Fade Animation",
                    icon = Icons.Default.Star
                )
            }
        }
    }
}