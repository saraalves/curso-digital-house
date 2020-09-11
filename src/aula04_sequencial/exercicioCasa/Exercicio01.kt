package aula04_sequencial.exercicioCasa

//    1. Faça um Programa que peça as 4 notas bimestrais e mostre a média.

//    Digite a nota 1: 10
//    Digite a nota 2: 5
//    Digite a nota 3: 7
//    Digite a nota 4: 8
//    A média é 7,5
//

fun main() {

        print("Digite a nota 1: ")
        var primeiraNota = readLine()!!.toDouble()

        print("Digite a nota 2: ")
        var segundaNota = readLine()!!.toDouble()

        print("Digite a nota 3: ")
        var terceiraNota = readLine()!!.toDouble()

        print("Digite a nota 4: ")
        var quartaNota = readLine()!!.toDouble()

        var totalNotas = primeiraNota + segundaNota + terceiraNota + quartaNota

        var media = totalNotas / 4

        println("A média é: $media")
}

