package com.example.materialx_jetpack.component.home

import androidx.compose.foundation.layout.Row
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.materialx_jetpack.ui.theme.Materialx_jetpackTheme
import kotlinx.coroutines.Job

@Composable

fun homeTopbarComponent(toggleDrawerCallBack: () -> Unit) {
    TopAppBar(

        actions = {
            IconButton(
                onClick = { }) {
                Icon(
                    Icons.Default.Search,
                    contentDescription = "search",
                )
            }
        },
        title = {
            Text(text = "MaterialX")
        },
        contentColor = Color.White,
        navigationIcon = {
            IconButton(onClick = { toggleDrawerCallBack.invoke() }) {
                Icon(
                    Icons.Default.Menu,
                    contentDescription = "Menu",
                )
            }
        },

        backgroundColor = MaterialTheme.colors.primaryVariant,
    )
}
//
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    Materialx_jetpackTheme(
//        darkTheme = true
//    ) {
//        homeTopbarComponent {
//
//
//        }
//    }
//}