package com.example.materialx_jetpack.component.home

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.core.content.res.ResourcesCompat
import com.example.materialx_jetpack.R

@Composable
fun drawerComponents() {

    Column  {
        Row(
            Modifier.padding(vertical = 30.dp).fillMaxWidth(0.6f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
           Box(
               modifier = Modifier .height(80.dp)
                   .width(80.dp).clip(RoundedCornerShape(40.dp))

           ) {

               Image(painter = painterResource(id = R.drawable.logo_round), contentDescription = "logo",)

           }
        }
//        (modifier = Modifier.padding(horizontal =  10.dp)) {
        Row(
            Modifier
                .padding(horizontal = 10.dp, vertical = 10.dp)
                .fillMaxWidth()
                .clickable {

                    Log.i("TAG", "homeItemComponents: Clicked")
                },
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
             Text(text = "MaterialX", style =  MaterialTheme.typography.h4)
        }
        Divider()
        Column() {
            drawerItems(title = "Favorites") {}

            drawerItems(title = "Other Apps") {}
            drawerItems(title = "Rate this App") {}
            drawerItems(title = "About") {}
        }

    }

}


@Composable
fun drawerItems(
    title: String,
    clicked: () -> Unit,
) {

    Column(modifier = Modifier.padding(horizontal =  10.dp)) {
        Box(modifier = Modifier.height(10.dp))
        Row(
            Modifier
                .height(40.dp)
                .fillMaxWidth()
                .clickable {
                    clicked.invoke()
                    Log.i("TAG", "homeItemComponents: Clicked")
                },
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "$title",
                style = MaterialTheme.typography.subtitle2,
                color = MaterialTheme.colors.primary
            )
        }
    }



}