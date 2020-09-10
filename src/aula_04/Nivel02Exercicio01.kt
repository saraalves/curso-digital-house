package aula_04

fun main() {
//    Nível 2 (Meta 2 exercícios)1. Faça um Programa que peça a temperatura em graus Fahrenheit,
//    transforme emostre a temperatura em graus Celsius.C = 5 * ((F-32) / 9)

    print("Informe a temperatura em graus Fahrenheit: ")
//    C = 5 * ((F-32) / 9)
    var temperatura = readLine()!!.toDouble()
    var valorTotal = 5 * ((temperatura - 32) / 9)

    println("O valor da temperatura em Cº: $valorTotal")
}