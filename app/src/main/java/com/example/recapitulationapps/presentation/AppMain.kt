package com.example.recapitulationapps.presentation

import LoginScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.recapitulationapps.presentation.home.HomeScreen

@Composable
fun AppMain(
    modifier: Modifier,
    navController: NavHostController = rememberNavController()
) {
    NavHost(navController = navController, startDestination = Route.LoginScreen) {
        composable<Route.LoginScreen> {
            LoginScreen(modifier = modifier) {
                navController.navigate(Route.HomeScreen)
            }
        }
        composable<Route.HomeScreen> {
            HomeScreen()
        }
    }

}