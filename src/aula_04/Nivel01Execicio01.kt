package aula_04

fun main() {
    //    1. Faça um Programa que peça um número e então mostre a mensagem:O número informado foi [número]

    println("Informe o número: ")
    var numero = readLine()!!.toInt()
    println("O número informado foi $numero")

}