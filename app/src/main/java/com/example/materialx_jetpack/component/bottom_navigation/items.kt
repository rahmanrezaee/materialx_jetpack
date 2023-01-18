package com.example.materialx_jetpack.component.bottom_navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(var title:String, var icon:ImageVector, var screen_route:String, var badge:String = ""){

    object Home : BottomNavItem("Home", Icons.Default.Home,"home","")
    object Favorite: BottomNavItem("Favorite",Icons.Default.Favorite,"favorite")
    object AddPost: BottomNavItem("Add Post",Icons.Default.Add,"add_post",)
    object Notification: BottomNavItem("Notification",Icons.Default.Notifications,"notification", "88")
    object Profile: BottomNavItem("Profile",Icons.Default.Person,"profile")

}