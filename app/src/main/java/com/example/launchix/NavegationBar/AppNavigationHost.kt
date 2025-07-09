package com.example.launchix.NavegationBar

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.launchix.Screen.Home2
import com.example.launchix.Screen.Page1

@Composable
fun AppNavigationHost(navController: NavHostController, modifier: Modifier) {
    NavHost(
        navController = navController,
        startDestination = AppNavigationBarItems.Home.route
    ) { }
}

fun NavGraphBuilder.homeGraph(navController: NavController, modifier: Modifier){
    navigation(
        startDestination = "home1", route = AppNavigationBarItems.Home.route){
        composable("home2"){
            Home2(modifier)
        }
    }

}


fun NavGraphBuilder.pageGraph(navController: NavController, modifier: Modifier){
    navigation(
        startDestination = "page1", route = AppNavigationBarItems.Pages.route){
        composable("page1"){
                Page1(modifier)
        }
    }

}