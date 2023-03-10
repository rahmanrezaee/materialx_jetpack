package com.example.materialx_jetpack.component.bottom_navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun PrimaryBottomNavigation(items:List<BottomNavItem>, centerItem:BottomNavItem, selectedIndex:Int, onItemClick: (index:Int) -> Unit) {

    Card() {

        Row(
            Modifier
                .background(Color.Black)
                .fillMaxWidth()
                .padding(5.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            items.forEachIndexed { index, bottomNavItem ->

                PrimeryBottomNavItem(
                    Modifier
                        .clickable {
                            onItemClick.invoke(index);
                        }
                        .weight(1f)
                        .height(45.dp),
                    title = bottomNavItem.title , Primery =bottomNavItem.icon , isSelected =selectedIndex == index  )
            }


        }
//        PrimeryBottomNavItemCenterButton(
//            Modifier
//                .height(60.dp)
//                .fillMaxWidth()
//                .background(Color.Transparent),
//            title = centerItem.title , Primery =centerItem.icon )
    }
}



@Composable
fun PrimeryBottomNavItem(modifier: Modifier, title:String, Primery: ImageVector, isSelected:Boolean){

    Column(
        modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        var color = Color.Gray;

        if(isSelected)
            color = Color.White


            Icon(Primery, contentDescription = "$title", tint =color )



    }

}




