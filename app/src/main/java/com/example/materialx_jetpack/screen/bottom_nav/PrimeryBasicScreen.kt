package com.example.materialx_jetpack.screen.bottom_nav

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Shop
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.materialx_jetpack.component.bottom_navigation.PrimaryBottomNavigation
import com.example.materialx_jetpack.component.bottom_navigation.BottomNavItem
import com.example.materialx_jetpack.ui.theme.Black500
import com.example.materialx_jetpack.ui.theme.Materialx_jetpackTheme

@Composable
fun NavPrimeryScreen(navhost: NavHostController) {


    var selectedIndex by remember { mutableStateOf(0) }
    val items = listOf(
        BottomNavItem.Home,
        BottomNavItem.Favorite,
    )
    Scaffold(
        bottomBar = {
            PrimaryBottomNavigation(items, BottomNavItem.AddPost, selectedIndex) {
                selectedIndex = it;
            }
        },
        floatingActionButtonPosition = FabPosition.Center,
        floatingActionButton  = {
          Box(Modifier.offset(0.dp,40.dp)) {
              FloatingActionButton(
                  shape = CircleShape,
                  onClick = {

                  },

                  ) {
                  Icon(imageVector = Icons.Filled.Shop, contentDescription = "Shop")
              }
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
//fun DefaultPrimaryPreview() {
//    Materialx_jetpackTheme(
//        darkTheme = true
//    ) {
//        NavPrimeryScreen(rememberNavController())
//    }
//}