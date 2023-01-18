package com.example.materialx_jetpack.component.bottom_navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.materialx_jetpack.screen.bottom_nav.NavMainScreen
import com.example.materialx_jetpack.ui.theme.Materialx_jetpackTheme

@Composable
fun MainBottomNavigation(items:List<BottomNavItem>, selectedIndex:Int, centeredIndex:Int, onItemClick: (index:Int) -> Unit) {

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

                MainBottomNavItem(
                    Modifier
                        .clickable {
                            onItemClick.invoke(index);
                        }
                        .weight(1f)
                        .height(60.dp),
                    title = bottomNavItem.title , icon =bottomNavItem.icon , isSelected = selectedIndex == index , isCentered = centeredIndex == index )
            }


        }
    }
}



@Composable
fun MainBottomNavItem(modifier: Modifier, title:String, icon: ImageVector, isSelected:Boolean,isCentered:Boolean){

    Column(
        modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        var color = Color.Gray;
        if(isSelected)
            color = Color.White


        if(isCentered)
            Box(
                modifier = Modifier.size(50.dp).clip(CircleShape).background(MaterialTheme.colors.secondary),
                contentAlignment = Alignment.Center
            ){
                Icon(icon, contentDescription = "$title", tint = Color.White )
            }
        else
            Icon(icon, contentDescription = "$title", tint =color )



    }

}



//
//
//@Preview(showBackground = true)
//@Composable
//fun MainNavPreview() {
//    Materialx_jetpackTheme(
//        darkTheme = false
//    ) {
//
//        var selectedIndex by remember { mutableStateOf(0) }
//        var centeredIndex by remember { mutableStateOf(2) }
//        val items = listOf(
//            BottomNavItem.Home,
//            BottomNavItem.Favorite,
//            BottomNavItem.AddPost,
//            BottomNavItem.Notification,
//            BottomNavItem.Profile,
//        )
//
//        MainBottomNavigation(items, selectedIndex,centeredIndex) {
//            selectedIndex = it;
//        }
//    }
//}
//
//
//
