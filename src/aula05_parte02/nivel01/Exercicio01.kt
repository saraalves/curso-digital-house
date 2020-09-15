package aula05_parte02.nivel01

fun main() {

    // Faça um programa que leia 5 números e informe o maior número.
    var numeroMaior = Int.MIN_VALUE
    var contador = 1

    do {
        println("Digite um número: ")
        val numeroDigitado = readLine()!!.toInt()

        if (numeroDigitado > numeroMaior) {
            numeroMaior = numeroDigitado
        }
        contador++

    }
    while(contador <= 5)
    print("O número maior é $numeroMaior")
}