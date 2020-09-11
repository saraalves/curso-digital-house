package aula_05_parte02.nivel01

fun main() {

    // Faça um programa que leia 5 números e informe o maior número.
    var numeroMaior = Int.MIN_VALUE
    var contador = 1

    do {
        println("Digite um número: ")
        val numero = readLine()!!.toInt()

        if (numero > numeroMaior) {
            numeroMaior = numero
        }
        contador++

    }
    while(contador <= 5)
    print("O número maior é $numeroMaior")


}