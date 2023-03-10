package com.example.materialx_jetpack.screen.bottom_nav

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.materialx_jetpack.component.bottom_navigation.BadgeBottomNavigation
import com.example.materialx_jetpack.component.bottom_navigation.BottomNavItem
import com.example.materialx_jetpack.ui.theme.Black500

@Composable
fun NavBadgeScreen(navhost: NavHostController) {


    var selectedIndex by remember { mutableStateOf(0) }
    val items = listOf(
        BottomNavItem.Home,
        BottomNavItem.Favorite,
        BottomNavItem.Notification,
        BottomNavItem.Profile,
    )
    Scaffold(
        bottomBar = {
            BadgeBottomNavigation(items, selectedIndex) {
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
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    Materialx_jetpackTheme(
//        darkTheme = true
//    ) {
//        NavBadgeScreen(rememberNavController())
//    }
//}