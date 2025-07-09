package com.example.launchix.NavegationBar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

sealed class AppNavigationBarItems (val route: String, val label: String, val icon: ImageVector) {
    object Home: AppNavigationBarItems("home", "Home", Icons.Filled.Home)
    object Pages: AppNavigationBarItems("pages", "Pages", Icons.Filled.Face)

}