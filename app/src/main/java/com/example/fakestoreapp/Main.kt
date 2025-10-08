package com.example.fakestoreapp

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main(){
    cAsync()
}


fun myGlobal(){
    GlobalScope.launch {
        SaludoAsincrono()
    }
}
suspend fun SaludoAsincrono(){
    println("holanda")
    delay(2000)
    println("chavales")
}

//Dispatchers
//Edificio 1 : UI
//Edificio 2: Código async
 fun cAsync(){
    runBlocking {
        val result = async(Dispatchers.Main) {
            println("consultando datos de una API")
            delay(5000)
            println ("Resultados traidos")
            "Datos"
        }
        println("el resultado es ${result.await()}")
    }
}

fun cWithContext(){
    runBlocking {
        val result = withContext(Dispatchers.IO){
            println("Consultando info de API")
            delay(2000)
            println("datos obtenidos")
            "{age:17}"
        }
        println("el resultado es ${result}")

    }
}