package com.example.materialx_jetpack.component.bottom_navigation


import androidx.compose.animation.AnimatedVisibility
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.materialx_jetpack.screen.bottom_nav.NavBasicScreen
import com.example.materialx_jetpack.ui.theme.Materialx_jetpackTheme

@Composable
fun IconBottomNavigation(items:List<BottomNavItem>, selectedIndex:Int,onItemClick: (index:Int) -> Unit) {

    Card() {
        Row(
            Modifier
                .background(Color.Black)
                .fillMaxWidth()
                .padding( 5.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            items.forEachIndexed { index, bottomNavItem ->

                IconBottomNavItem(
                    Modifier.clickable {
                        onItemClick.invoke(index);
                    }.weight(1f).height(60.dp),
                    title = bottomNavItem.title , icon =bottomNavItem.icon , isSelected =selectedIndex == index  )
            }


        }
    }
}



@Composable
fun IconBottomNavItem(modifier: Modifier, title:String, icon: ImageVector, isSelected:Boolean){

    Column(
        modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        var color = Color.Gray;

        if(isSelected)
            color = Color.White

        Icon(icon, contentDescription = "$title", tint =color )


    }

}


