package com.example.gamesplaytime.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.gamesplaytime.screen.GamesScreen
import com.example.gamesplaytime.screen.ProfileScreen
import com.example.gamesplaytime.screen.SearchScreen
import com.example.gamesplaytime.screen.SettingsScreen

@Composable
fun NavGraph(
    navHostController: NavHostController
) {
    NavHost(navController = navHostController, startDestination = "screen_1"){
        composable("screen_games"){
            GamesScreen()
        }
        composable("screen_search"){
            SearchScreen()
        }
        composable("screen_profile"){
            ProfileScreen()
        }
        composable("screen_settings"){
            SettingsScreen()
        }
    }
}