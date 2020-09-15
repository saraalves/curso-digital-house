package aula06.nivel01

//Nível 1
//1. Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.

const val PERGUNTA = "Digite um numero: "
fun main() {
    val numeros = ArrayList<Int>()

    for (numero in 1..5) {
        print(PERGUNTA)

        val numero = readLine()!!.toInt()
        numeros.add(numero)
    }
    println(numeros)
}