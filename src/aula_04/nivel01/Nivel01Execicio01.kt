package aula_04.nivel01

//    1. Faça um Programa que peça um número e então mostre a mensagem:O número informado foi [número]

fun main() {

    println("Informe o número: ")
    var numero = readLine()!!.toInt()
    println("O número informado foi $numero")

}