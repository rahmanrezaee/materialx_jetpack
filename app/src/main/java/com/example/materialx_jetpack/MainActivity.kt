package com.example.materialx_jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.materialx_jetpack.route.NavScreenGraph
import com.example.materialx_jetpack.screen.homeScreen
import com.example.materialx_jetpack.ui.theme.Materialx_jetpackTheme
@ExperimentalMaterialApi
class MainActivity : ComponentActivity() {


    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            this.window.statusBarColor = ContextCompat.getColor(this,R.color.black)
            Materialx_jetpackTheme(
                darkTheme = true
            ) {

                navController = rememberNavController()
                 NavScreenGraph(navhost = navController)
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
//        homeScreen(rememberNavController())
//    }
//}