package com.example.materialx_jetpack.screen.bottom_sheet

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.materialx_jetpack.R
import com.example.materialx_jetpack.ui.theme.Materialx_jetpackTheme
import kotlinx.coroutines.launch

@ExperimentalMaterialApi
@Composable
fun SheetBottomBasicScreen(navhost: NavHostController) {

    var primeryColor = Color(0xffff0100);

    val modalBottomSheetState =
        rememberModalBottomSheetState(initialValue = ModalBottomSheetValue.Hidden)
    val scope = rememberCoroutineScope()
    ModalBottomSheetLayout(
        sheetBackgroundColor = Color.Transparent,
        sheetElevation = 5.dp,
        sheetContent = {
            val context = LocalContext.current
            Column(

                Modifier
                    .clip(RoundedCornerShape(topStartPercent =  5  , topEndPercent = 5))
                    .fillMaxWidth()
                    .background(Color.White)
                    .padding(20.dp)



            ) {

                Text(
                    text = "Payout", style = TextStyle(
                        fontSize = 28.sp,
                    )
                )
                Text(
                    text = "Pay out your balance new", style = TextStyle(
                        fontSize = 18.sp,
                    ), color = Color.Gray
                )

                Box(modifier = Modifier.height(30.dp))
                Row(

                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,

                ) {

                    Row(

                        verticalAlignment = Alignment.CenterVertically,


                    ) {
                        Box(
                            modifier = Modifier
                                .clip(CircleShape)
                                .background(primeryColor).padding(10.dp),
                        ) {
                            Icon(Icons.Default.Money, contentDescription = "money",
                                Modifier.height(30.dp).width(30.dp), tint = Color.White)
                        }

                        Box(modifier = Modifier.width(5.dp))
                        Column() {
                            Text("Sparkasse", style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.SemiBold
                            ))
                            Text("Credit", style = TextStyle(
                                fontSize = 18.sp,
                            ), color = Color.Gray)
                        }
                    }
                    Box(
                        contentAlignment = Alignment.Center

                    ) {

                        Divider(
                            modifier = Modifier
                                .height(80.dp)
                                .width(1.dp)
                                .background(Color.Gray)
                        )

                        OutlinedButton(onClick = { /*TODO*/ },
                            modifier= Modifier.size(40.dp).background(color= Color.White),  //avoid the oval shape
                            shape = CircleShape,

                            contentPadding = PaddingValues(0.dp),  //avoid the little icon
                            colors = ButtonDefaults.outlinedButtonColors(contentColor =  Color.White)
                        ) {
                            Icon(Icons.Default.ArrowForward, contentDescription = "content description")
                        }



                    }

                    Row(

                        verticalAlignment = Alignment.CenterVertically,


                        ) {
                        Box(
                            modifier = Modifier
                                .clip(CircleShape)
                                .background(Color.Black).padding(10.dp),
                        ) {
                            Text("S-L", color=Color.White,style = TextStyle(
                                fontSize = 19.sp
                            ))
                        }
                        Box(modifier = Modifier.width(5.dp))
                        Column() {
                            Text("Your", style = TextStyle(
                                fontSize = 19.sp,
                                fontWeight = FontWeight.SemiBold
                            ))
                            Text("Account", style = TextStyle(
                                fontSize = 18.sp,
                            ), color = Color.Gray)
                        }
                    }


                }


                Box(modifier = Modifier.height(10.dp))


                Text(
                    text = "12.50 \$", style = TextStyle(
                        fontSize = 28.sp,
                    )
                )
                Text(
                    text = "Will be paid to your account 0000032423", style = TextStyle(
                        fontSize = 18.sp,
                    ), color = Color.Gray
                )

                Box(modifier = Modifier.height(10.dp))



                ExtendedFloatingActionButton(
                    contentColor = Color.White,
                    backgroundColor = primeryColor,
                   modifier =  Modifier.fillMaxWidth(),
                    text = { Text("WithDraw to Back Account") },
                    onClick = { /*TODO*/ })
                Box(modifier = Modifier.height(10.dp))
                ExtendedFloatingActionButton(
                    contentColor = Color.Black,
                    backgroundColor = Color.White,
                    modifier =   Modifier.fillMaxWidth(),
                    text = { Text("Never Mind") }, onClick = { /*TODO*/ })

            }
        },
        sheetState = modalBottomSheetState,
    ) {
        Column(
            Modifier
                .fillMaxSize()
                .background(Color.White),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = primeryColor,
                    contentColor = Color.White
                ),
                onClick = {
                    scope.launch {
                        modalBottomSheetState.show()
                    }
                }) {
                Text(text = "Do Payment")
            }
        }
    }

}

@ExperimentalMaterialApi
@Preview(showBackground = true)
@Composable
fun SheetBottomBasicPreview() {
    Materialx_jetpackTheme(
        darkTheme = true
    ) {
        SheetBottomBasicScreen(rememberNavController())
    }
}