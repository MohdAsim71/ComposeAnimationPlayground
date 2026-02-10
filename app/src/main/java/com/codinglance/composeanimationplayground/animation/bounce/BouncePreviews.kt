package com.codinglance.composeanimationplayground.animation.bounce

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BounceAnimationDemoScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {

        EnterBounceDemo()

        ClickBounceDemo()

        CardBounceDemo()

//        ListBounceDemo(
//            items = listOf("Compose", "Animations", "Bounce", "Scale","Compose", "Animations", "Bounce", "Scale","Compose", "Animations", "Bounce", "Scale","Compose", "Animations", "Bounce", "Scale","Compose", "Animations", "Bounce", "Scale","Compose", "Animations", "Bounce", "Scale")
//        )
    }
}


@Composable
fun EnterBounceDemo() {
    BounceScale(
        trigger = Unit,
        spec = BounceVariants.Soft
    ) {
        Text(
            text = "Welcome 👋",
            fontSize = 28.sp
        )
    }
}


@Composable
fun ClickBounceDemo() {
    var trigger by remember { mutableStateOf(false) }

    BounceScale(
        trigger = trigger,
        spec = BounceVariants.Fast
    ) {
        Button(onClick = { trigger = !trigger }) {
            Text("Tap Me")
        }
    }
}


@Composable
fun CardBounceDemo() {
    BounceScale(
        trigger = Unit,
        spec = BounceVariants.Hard
    ) {
        Card(
            elevation = CardDefaults.cardElevation(8.dp)
        ) {
            Text(
                text = "Animated Card",
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}




