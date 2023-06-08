package com.example.gamesplaytime.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import androidx.navigation.NavDeepLink
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.example.gamesplaytime.screen.GamesScreen
import com.example.gamesplaytime.screen.ProfileScreen
import com.example.gamesplaytime.screen.SearchScreen
import com.example.gamesplaytime.screen.SettingsScreen
import com.google.accompanist.navigation.material.BottomSheetNavigator

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomNavigation(){
    val navController = rememberNavController()

    val listItems = listOf(
        BottomItem.Games,
        BottomItem.Search,
        BottomItem.Profile,
        BottomItem.Settings
    )

    // NavController is passed via parameter
    val backStackEntry = navController.currentBackStackEntryAsState()

    Scaffold(
        bottomBar = {
            androidx.compose.material3.NavigationBar(
                containerColor = MaterialTheme.colorScheme.primary,
            ) {
                listItems.forEach { item ->
                    val selected = item.route == backStackEntry.value?.destination?.route

                    NavigationBarItem(
                        selected = selected,
                        onClick = { navController.navigate(item.route) },
                        label = {
                            Text(
                                text = item.title,
                                fontWeight = FontWeight.SemiBold,
                            )
                        },
                        icon = {
                            Icon(
                                imageVector = ImageVector.vectorResource(id = item.icon),
                                contentDescription = "${item.title} Icon",
                            )
                        }
                    )
                }
            }
        },
        content = {
            Box(modifier = Modifier.padding(it)) {

                // in content area of Scaffold create NavHost.
                //Deep Links
                //Navigation Compose support implicit deep links that can be defined
                // as Part of the composable() function as sell. add them as list using navDeepLink()

                NavHost(navController = navController, startDestination = "games") {
                    // Create Navigation GamesScreen
                    navigation(startDestination = "GamesScreen", route = "games" ) {
                        composable("GamesScreen") {
                            GamesScreen()
                        }
                    }

                    // Create Navigation SearchScreen
                    navigation(startDestination = "SearchScreen", route = "search" ) {
                        composable("SearchScreen") {
                            SearchScreen()
                        }
                    }

                    // Create Navigation ProfileScreen
                    navigation(startDestination = "ProfileScreen", route = "profile" ) {
                        composable("ProfileScreen") {
                            ProfileScreen()
                        }
                    }

                    //Now Add final Tab Setting Page.
                    navigation(startDestination = "SettingsScreen", route = "settings") {
                        composable("SettingsScreen") {
                            SettingsScreen()
                        }
                    }

                }

            }
        }
    )

}