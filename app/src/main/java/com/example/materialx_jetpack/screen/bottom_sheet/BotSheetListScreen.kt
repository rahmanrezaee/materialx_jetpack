package com.example.materialx_jetpack.screen.bottom_sheet

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Link
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.materialx_jetpack.R
import com.example.materialx_jetpack.ui.theme.Materialx_jetpackTheme
import kotlinx.coroutines.launch

@ExperimentalMaterialApi
@Composable
fun SheetBottomListScreen(navhost: NavHostController) {

    val modalBottomSheetState = rememberModalBottomSheetState(initialValue = ModalBottomSheetValue.Hidden)
    val scope = rememberCoroutineScope()
    ModalBottomSheetLayout(
        sheetContent = {
            val context = LocalContext.current
            Column(

            ) {
                BottomSheetListItem(
                    icon = Icons.Default.Share,
                    title = "Share",
                    onItemClick = { title ->
                        Toast.makeText(
                            context,
                            title,
                            Toast.LENGTH_SHORT
                        ).show()
                    })
                BottomSheetListItem(
                    icon = Icons.Default.Link,
                    title = "Get link",
                    onItemClick = { title ->
                        Toast.makeText(
                            context,
                            title,
                            Toast.LENGTH_SHORT
                        ).show()
                    })
                BottomSheetListItem(
                    icon = Icons.Default.Edit,
                    title = "Edit name",
                    onItemClick = { title ->
                        Toast.makeText(
                            context,
                            title,
                            Toast.LENGTH_SHORT
                        ).show()
                    })
                BottomSheetListItem(
                    icon = Icons.Default.Delete,
                    title = "Delete collection",
                    onItemClick = { title ->
                        Toast.makeText(
                            context,
                            title,
                            Toast.LENGTH_SHORT
                        ).show()
                    })
            }
        },
        sheetState = modalBottomSheetState,
    ) {
        Column(
            Modifier
                .fillMaxSize()
                .background(colorResource(R.color.black)),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = colorResource(id = R.color.purple_500),
                    contentColor = Color.White
                ),
                onClick = {
                    scope.launch {
                        modalBottomSheetState.show()
                    }
                }) {
                Text(text = "Open Modal Bottom Sheet Layout")
            }
        }
    }

}

@Composable
fun BottomSheetListItem(icon: ImageVector, title: String, onItemClick: (String) -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = { onItemClick(title) })
            .height(55.dp)

            .padding(start = 15.dp), verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(icon, contentDescription = "Share", tint = Color.White)
        Spacer(modifier = Modifier.width(20.dp))
        Text(text = title, color = Color.White)
    }
}

@ExperimentalMaterialApi
@Preview(showBackground = true)
@Composable
fun SheetBottomListPreview() {
    Materialx_jetpackTheme(
        darkTheme = true
    ) {
        SheetBottomListScreen(rememberNavController())
    }
}