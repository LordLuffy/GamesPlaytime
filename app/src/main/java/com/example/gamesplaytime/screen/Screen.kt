package com.example.gamesplaytime.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.style.TextAlign

@Composable
fun GamesScreen() {
    Column {
        Text(
            text = "Games Screen",
            textAlign = TextAlign.Center
        )

    }
    ListScreen()
}



@Composable
fun ListScreen() {
    val itemList = listOf("Item 1", "Item 2", "Item 3", "Item 4", "Item 5")

    LazyColumn {
        items(itemList) { item ->
            Text(text = item)
        }
    }
}

@Composable
fun SearchScreen() {
    Column {
        Text(
            text = "Search Screen",
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun ProfileScreen() {
    Column {
        Text(
            text = "Profile Screen",
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun SettingsScreen() {
    Column {
        Text(
            text = "Settings Screen",
            textAlign = TextAlign.Center
        )
    }
}