package com.example.materialx_jetpack.component.home

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.materialIcon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.materialx_jetpack.route.Screen

@Composable
fun homeItemComponents(navhost: NavHostController) {

    LazyColumn(Modifier.fillMaxSize()) {

        item {

            ExpandableContainer(title = "bottom Navigation", icon = Icons.Filled.ViewArray) {
                Column() {
                    subTileItems(title = "Basic") {
                        navhost.navigate(Screen.NavBasic.route)
                    }
                    subTileItems(title = "Icon") {
                        navhost.navigate(Screen.NavIcon.route)
                    }
                    subTileItems(title = "Shifting") {
                        navhost.navigate(Screen.NavShifting.route)
                    }
                    subTileItems(title = "Primary") {
                        navhost.navigate(Screen.NavPrimary.route)
                    }
                    subTileItems(title = "Main") {
                        navhost.navigate(Screen.NavMain.route)
                    }
                    subTileItems(title = "Badge") {
                        navhost.navigate(Screen.NavBadge.route)
                    }
                }
            }

            ExpandableContainer(title = "bottom Sheet", icon = Icons.Filled.Window) {
                Column() {


                    subTileItems(title = "Basic") {

                    }
                    subTileItems(title = "List") {

                    }
                    subTileItems(title = "Full") {

                    }
                    subTileItems(title = "Filter") {

                    }
                    subTileItems(title = "Menu") {

                    }


                }
            }
            ExpandableContainer(title = "Button", icon = Icons.Filled.SmartButton) {
                Column() {


                    subTileItems(title = "Basic") {
                        navhost.navigate(Screen.ButBasic.route)
                    }
                    subTileItems(title = "Fab More") {

                    }
                    subTileItems(title = "Material") {

                    }
                    subTileItems(title = "Toggle Basic") {

                    }
                    subTileItems(title = "Outline") {

                    }
                    subTileItems(title = "With Icon") {

                    }


                }
            }
            ExpandableContainer(title = "Cards", icon = Icons.Filled.CardTravel) {
                Column() {


                    subTileItems(title = "Basic") {

                    }
                    subTileItems(title = "TimeLine") {

                    }
                    subTileItems(title = "OverLap") {

                    }
                    subTileItems(title = "Wizard") {

                    }
                    subTileItems(title = "Outline") {

                    }


                }
            }


        }
    }
}



