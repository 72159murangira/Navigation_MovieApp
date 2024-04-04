package com.stu72159.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.FirstMovie.route,
    ) {
        composable(route = Routes.FirstMovie.route)
        {
            Home(navController = navController)
        }
        composable(route = Routes.SecondMovie.route)
        {
            Movie2(navController = navController)
        }
        composable(route = Routes.ThirdMovie.route)
        {
            Movie3(navController = navController)
        }

        composable(route = Routes.FourthMovie.route)
        {
            Movie4(navController = navController)
        }
    }
}