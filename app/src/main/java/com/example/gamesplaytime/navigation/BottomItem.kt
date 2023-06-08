package com.example.gamesplaytime.navigation

import androidx.annotation.DrawableRes
import com.example.gamesplaytime.R

sealed class BottomItem(val route: String, val title: String, @DrawableRes val icon: Int) {
    object Games : BottomItem("games", "Games", R.drawable.ic_games)
    object Search : BottomItem("search", "Search", R.drawable.ic_search)
    object Profile : BottomItem("profile", "Profile", R.drawable.ic_profile)
    object Settings : BottomItem("settings", "Settings", icon = R.drawable.ic_settings)
}
