package com.example.fakestoreapp.ui.theme

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

//Callback

fun main(){
    val a=1
    val b=2


    operacionDeNumeros(a,b, operacion = {a,b -> sum(a,b)})

}

//se le debe pasar una funcion que recibe 2 numeros y regresa 2 tambien
fun operacionDeNumeros(a:Int,b:Int, operacion:(Int,Int) -> Int ) {
    println("el numero a vale $a")
    println("el numero b vale $b")
    val result = operacion(a,b)
    println(result)
}

fun sum(a:Int,b:Int):Int {
    return a+b
}

fun resta(a:Int,b:Int):Int{
    return a-b
}

@Composable
fun BookCard(onClick : () -> Unit ){
    Column(
        modifier = Modifier
            .clickable{
                onClick()
            }
    ) {

    }

}

@Composable
fun HomeScreen(){
    Column {
        BookCard {

        }
    }
}
