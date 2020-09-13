package aula_05_parte02.nivel02

//1. Faça um programa que calcule e mostre a média aritmética de N notas

fun main() {

    print("Informe a quantidade de notas: ")

    var notas =  readLine()!!.toInt()
    var contador = 0
    var somaNota = 0.0

    while (notas > 0){
        notas--
        print("Digite a ${++contador}ª nota: ")
        val nota = readLine()!!.toDouble()
        somaNota += nota
    }

    val media = somaNota / contador
    println("A media das notas é $media")
}