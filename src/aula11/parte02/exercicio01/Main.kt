package aula11.parte02.exercicio01

import java.lang.Exception

fun main(){
    val listString = arrayListOf<String>()
    listString.add("Gato, Cachorro, Gato")

//    println(listString.get(3))
    try{
        println(listString.get(3))
    } catch (ex: IndexOutOfBoundsException){
        println(ex.message)
    }
}