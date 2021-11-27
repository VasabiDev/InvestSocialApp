package com.hfad.investsocialapp.screen.profile

import android.graphics.drawable.BitmapDrawable
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.res.ResourcesCompat
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import com.hfad.investsocialapp.R

@ExperimentalComposeUiApi
@Composable
// отображение профиля
fun ProfileView(navController: NavController, ProfileViewModelViewModel: ProfileViewModel) {

    Box(
        modifier = Modifier
            .fillMaxSize(), contentAlignment = Alignment.TopStart
    ) {


        ProfileCard()


    }

}
// отрисовка профиля
@Composable
fun ProfileCard() {
    Column(
        modifier = Modifier

            .fillMaxWidth()
            .fillMaxHeight()
            .height(30.dp)
            .background(Color.White),
        verticalArrangement = Arrangement.Top,


        ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)

        ) {
            Column(horizontalAlignment = Alignment.Start)
            {
                Image(
                    painterResource(R.drawable.photo),
                    contentDescription = "profile_photo",
                    modifier = Modifier
                        .padding(8.dp)
                        .width(60.dp)
                        .height(60.dp)
                        .clip(CircleShape)
                )
            }

            Column() {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    text = "Name",
                    fontSize = 30.sp,
                )
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    fontSize = 20.sp,
                    text = "Rating"
                )
                Row(horizontalArrangement = Arrangement.End) {
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "Подписаться")
                    }
                }
            }
        }
        Row(
           modifier = Modifier
               .background(Color.Red)
               .fillMaxWidth()
               .fillMaxHeight()
    ) {

           postStructure()
       }

    }
}

// структура публикации
@Composable
fun postStructure() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)

    ) {
        Column(horizontalAlignment = Alignment.Start)
        {
//            Image(
//                painterResource(R.drawable.photo),
//                contentDescription = "profile_photo",
//                modifier = Modifier
//                    .padding(8.dp)
//                    .width(30.dp)
//                    .height(30.dp)
//                    .clip(CircleShape)
//            )
            Row(
                horizontalArrangement = Arrangement.SpaceAround
            ) {

                Image(
                painterResource(R.drawable.logo),
                contentDescription = "",
                modifier = Modifier
                    .padding(8.dp)
                    .width(400.dp)
                    .height(400.dp)
                    .clip(RectangleShape)
            )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
            ){
Text(text = "dgdfg", style = MaterialTheme.typography.body1)
            }

        }
//        Spacer(modifier = Modifier.padding(40.dp))
//        Column() {
//            Row() {
//                Text(
//                    modifier = Modifier
//
//                        .padding(8.dp),
//                    text = "Name",
//                    fontSize = 20.sp,
//                )
//                Text(
//                    modifier = Modifier
//
//                        .padding(8.dp),
//                    fontSize = 15.sp,
//                    text = "Rating"
//                )
//            }
//
//
//        }
    }
}
// превью для тестирования
@Preview
@Composable
fun showColumnItem() {
    ProfileCard()
}