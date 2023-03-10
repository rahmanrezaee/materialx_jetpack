package com.example.materialx_jetpack.screen

import android.content.res.Configuration
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.materialx_jetpack.component.home.drawerComponents
import com.example.materialx_jetpack.component.home.homeItemComponents
import com.example.materialx_jetpack.component.home.homeTopbarComponent
import kotlinx.coroutines.launch

@Composable
fun homeScreen(navhost: NavHostController)  {
    var scaffoldState: ScaffoldState =
        rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
    val scope = rememberCoroutineScope()

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            homeTopbarComponent {
                scope.launch {
                    if (scaffoldState.drawerState.isOpen) scaffoldState.drawerState.close()
                    else scaffoldState.drawerState.open()
                }

            }
        },
        drawerContent = { Row() {
            drawerComponents()
        }  },
        drawerShape = MyShape(),

        content = { homeItemComponents(navhost =  navhost) }
    )


}




class MyShape : Shape {
    var leftSpaceWidth: Float? = null
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        leftSpaceWidth = size.width * 1 / 3
        return Outline.Rectangle(Rect(left = 0f, top = 0f, right = size.width * 2 / 3, bottom = size.height))
    }
}

