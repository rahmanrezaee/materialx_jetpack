package com.example.materialx_jetpack.component.bottom_navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.RecentActors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun BasicBottomNavigation(items:List<BottomNavItem>, selectedIndex:Int,onItemClick: (index:Int) -> Unit) {

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

                BasicBottomNavItem(

                    title = bottomNavItem.title , icon =bottomNavItem.icon , isSelected =selectedIndex == index  ) {

                    onItemClick.invoke(index);
                }

            }


        }
    }
}



@Composable
fun BasicBottomNavItem(title:String, icon: ImageVector, isSelected:Boolean, onClick:()->Unit){

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

        Icon(icon, contentDescription = "$title", tint =color )
        Text(text = title, color = color)
    }

}
