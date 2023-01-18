package com.example.materialx_jetpack.component.bottom_navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.RecentActors
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.materialx_jetpack.ui.theme.Materialx_jetpackTheme

@Composable
fun BadgeBottomNavigation(items:List<BottomNavItem>, selectedIndex:Int,onItemClick: (index:Int) -> Unit) {

    Card() {
        Row(
            Modifier
                .background(Color.Black)
                .fillMaxWidth()
                .padding(vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            items.forEachIndexed { index, bottomNavItem ->

                BadgeBottomNavItem(

                    title = bottomNavItem.title , badge= bottomNavItem.badge,  icon =bottomNavItem.icon , isSelected =selectedIndex == index  ) {

                    onItemClick.invoke(index);
                }

            }


        }
    }
}



@Composable
fun BadgeBottomNavItem(title:String,badge:String, icon: ImageVector, isSelected:Boolean, onClick:()->Unit){
    Column(
        Modifier.clickable {
            onClick.invoke();
        },
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var color = Color.Gray;
        if(isSelected)
            color = Color.White

        BadgedBox(badge = { if(badge != "") Badge {       Text("$badge") } }) {
            Icon(icon, contentDescription = "$title", tint =color )
        }

        Text(text = title, color = color)
    }
}
//
//@Preview(showBackground = true)
//@Composable
//fun BadgeNavPreview() {
//    Materialx_jetpackTheme(
//        darkTheme = false
//    ) {
//        var selectedIndex by remember { mutableStateOf(0) }
//        val items = listOf(
//            BottomNavItem.Home,
//            BottomNavItem.AddPost,
//            BottomNavItem.Notification,
//            BottomNavItem.Profile,
//        )
//
//        BadgeBottomNavigation(items, selectedIndex) {
//            selectedIndex = it;
//        }
//    }
//}


