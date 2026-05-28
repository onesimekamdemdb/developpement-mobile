package com.example.myapplication.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.MenuBook
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MenuBook
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BottomNaviationBar(){
    NavigationBar{        NavigationBarItem(
        selected = true,
        onClick = { },
        icon = { Icon(Icons.Default.Home, null) },
        label = { Text("Accueil") }
    )

        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = { Icon(Icons.AutoMirrored.Filled.MenuBook, null) },
            label = { Text("Cours")}
        )

        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = { Icon(Icons.Default.FavoriteBorder, null) },
            label = { Text("Favoris")}
        )

        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = { Icon(Icons.Default.FavoriteBorder, null) },
            label = { Text("Profile")}
        )
    }
}

@Preview(showBackground = true)
@Composable
fun NavigationBarPreview(){
    BottomNaviationBar()
}