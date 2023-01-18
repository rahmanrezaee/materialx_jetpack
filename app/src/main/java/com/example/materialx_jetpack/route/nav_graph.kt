package com.example.materialx_jetpack.route

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.materialx_jetpack.screen.bottom_nav.*
import com.example.materialx_jetpack.screen.bottom_sheet.SheetBottomBasicScreen
import com.example.materialx_jetpack.screen.button.ButBasicScreen
import com.example.materialx_jetpack.screen.homeScreen

@ExperimentalMaterialApi
@Composable
fun NavScreenGraph(navhost: NavHostController) {

    NavHost(navController = navhost, startDestination = Screen.BotSheetBasic.route) {

        composable(
            Screen.Home.route
        ) {
            homeScreen(navhost = navhost)
        }
        composable(
            Screen.NavBasic.route
        ) {
            NavBasicScreen(navhost = navhost)
        }  
      composable(
            Screen.NavMain.route
        ) {
            NavMainScreen(navhost = navhost)
        }
      composable(
            Screen.NavBadge.route
        ) {
            NavBadgeScreen(navhost = navhost)
        }
        composable(
            Screen.NavIcon.route
        ) {
            NavIconScreen(navhost = navhost)
        }

        composable(
            Screen.NavPrimary.route
        ) {
            NavPrimeryScreen(navhost = navhost)
        }

        composable(
            Screen.NavShifting.route
        ) {
            NavShiftingScreen(navhost = navhost)
        }

        composable(
            Screen.ButBasic.route
        ){
            ButBasicScreen(navhost = navhost)
        }

        composable(
            Screen.BotSheetBasic.route
        ){
            SheetBottomBasicScreen(navhost = navhost)
        }
    }

}