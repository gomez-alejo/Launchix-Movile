package com.example.launchix.Screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.OnPlacedModifier
import androidx.compose.ui.unit.dp

@Composable

fun Home1(modifier: Modifier, onNavigateToHome2: () -> Unit){
    Box(Modifier.padding(15.dp)){
        Column (modifier = modifier){
            Text(text = "Home1")
            Button(onClick = onNavigateToHome2){ }
            Text(text = " Go Home2")
        }
    }
}
