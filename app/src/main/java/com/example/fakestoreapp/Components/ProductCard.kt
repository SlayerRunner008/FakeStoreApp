package com.example.fakestoreapp.Components
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.fakestoreapp.Models.Product
import androidx.compose.ui.graphics.Color
import coil3.compose.AsyncImage


@Composable
fun ProductCard(product: Product, onClick : () -> Unit){
    Row (
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .height(100.dp)
            .clip(CircleShape)
            .background(Color.White)
            .padding(10.dp)
            .clickable{
                onClick()
                      }
        ,
        verticalAlignment = Alignment.CenterVertically

    ){
        AsyncImage(
            model = product.image,
            contentDescription = product.title,
            modifier = Modifier
                .size(80.dp)
                .clip(CircleShape)
                .background(Color.White)
        )

        Column (
            modifier = Modifier
                .padding(start = 10.dp)
                .weight(1f),
        ) {
            Text(product.title)
            Text(product.category)
        }
        Text(text = "$ ${product.price}")



    }

}


