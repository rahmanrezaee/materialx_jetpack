package com.example.materialx_jetpack.component.home

import android.util.Log
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

enum class ExpandableState { VISIBLE, HIDDEN }

@Composable
fun ExpandableContainer(
    title: String,
    icon: ImageVector,
    defaultState: ExpandableState = ExpandableState.HIDDEN,
    content: @Composable() (ColumnScope.() -> Unit),

) {

    //State
    var isContentVisible by remember { mutableStateOf(defaultState) }

    Column(
        modifier = Modifier
            .fillMaxWidth().padding(10.dp)
            .clickable {
                isContentVisible =
                    if (isContentVisible == ExpandableState.VISIBLE) ExpandableState.HIDDEN else ExpandableState.VISIBLE
            },
        verticalArrangement = Arrangement.Center
    ) {

        Row(
            horizontalArrangement = Arrangement.Center

        ) {
            Icon(icon, contentDescription = "$title", tint = MaterialTheme.colors.secondaryVariant , modifier = Modifier.size(25.dp) )
            Box(modifier = Modifier.width(10.dp))
            Text(text = title, style = MaterialTheme.typography.subtitle1, color = MaterialTheme.colors.primary)

            Box(modifier = Modifier.weight(1f))

            var icon =  if (isContentVisible == ExpandableState.VISIBLE) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown

            Icon( icon, contentDescription = "$title")
        }
        AnimatedVisibility(visible = isContentVisible == ExpandableState.VISIBLE) {
            Column (  modifier = Modifier.padding(horizontal = 40.dp)) {
                Box(modifier = Modifier.height(5.dp))
                content()
            }
        }
    }

}


@Composable
fun subTileItems(

    title: String,
    clicked: () -> Unit,

){

    Row(
        Modifier
            .height(40.dp).fillMaxWidth()
            .clickable {
                clicked.invoke()
                Log.i("TAG", "homeItemComponents: Clicked")
            },
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "$title",
            style = MaterialTheme.typography.subtitle1,
            color = MaterialTheme.colors.primary
        )
    }


}