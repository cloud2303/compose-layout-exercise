package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class Card : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CardInfo()
                }
            }
        }
    }
}

@Composable
fun CardAbstract(name: String = "FUll Name", title: String = "title") {
    val image = painterResource(id = R.drawable.android_logo)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = image, contentDescription = name, modifier = Modifier
                .width(50.dp)
                .height(50.dp)
        )
        Text(text = name, fontSize = 36.sp, fontWeight = FontWeight.Bold)
        Text(text = title, fontWeight = FontWeight.Bold)
    }
}

@Composable
fun CardDetail() {
    Column() {
        CardListItem(info = "+000000000000")
        CardListItem(info = "+000000000000")
        CardListItem(info = "+000000000000")
        CardListItem(info = "+000000000000")
    }
}

@Composable
fun CardListItem(info: String) {
    Row(

    ) {
        Icon(Icons.Rounded.Menu, contentDescription = "Menu")
        Text(text = info)
    }
}

@Composable
fun CardInfo() {
    Column(   modifier=Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        CardAbstract()
        Spacer(modifier = Modifier.height(40.dp))
        CardDetail()
    }

}

@Preview(showBackground = true)
@Composable
fun CardInfoPreview() {
    ComposeArticleTheme {
        CardInfo()
    }
}