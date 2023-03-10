package com.example.materialx_jetpack.screen.bottom_nav

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.RecentActors
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.materialx_jetpack.component.bottom_navigation.IconBottomNavigation
import com.example.materialx_jetpack.component.bottom_navigation.BottomNavItem
import com.example.materialx_jetpack.component.bottom_navigation.MainBottomNavigation
import com.example.materialx_jetpack.component.home.ExpandableContainer
import com.example.materialx_jetpack.ui.theme.Black500
import com.example.materialx_jetpack.ui.theme.Materialx_jetpackTheme

@Composable
fun NavMainScreen(navhost: NavHostController) {


    var selectedIndex by remember { mutableStateOf(0) }
    var centeredIndex by remember { mutableStateOf(2) }
    val items = listOf(
        BottomNavItem.Home,
        BottomNavItem.Favorite,
        BottomNavItem.AddPost,
        BottomNavItem.Notification,
        BottomNavItem.Profile,
    )
    Scaffold(
        bottomBar = {
            MainBottomNavigation(items, selectedIndex,centeredIndex) {
                selectedIndex = it;
            }
        }

    ){
        Column {
            Box(
                Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(Black500),

                contentAlignment = Alignment.Center
            ) {
                Text(text = "${items[selectedIndex].title}", style = MaterialTheme.typography.h4)
            }

        }
    }
}
//
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultMainNavPreview() {
//    Materialx_jetpackTheme(
//        darkTheme = true
//    ) {
//        NavMainScreen(rememberNavController())
//    }
//}