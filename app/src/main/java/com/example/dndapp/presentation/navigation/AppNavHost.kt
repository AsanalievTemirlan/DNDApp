package com.example.dndapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.dndapp.presentation.navigation.Routes.MAIN
import com.example.dndapp.presentation.navigation.Routes.SPLASH
import com.example.dndapp.presentation.screens.MainScreen
import com.example.dndapp.presentation.screens.SplashScreen

@Composable
fun AppNavHost() {

    val navController = rememberNavController()
    val startDestination = SPLASH

    NavHost(navController, startDestination){
        composable(SPLASH) { SplashScreen(navController) }
        composable(MAIN) { MainScreen(navController) }
    }

}

object Routes{
    const val MAIN = "main"
    const val SPLASH = "splash"
}