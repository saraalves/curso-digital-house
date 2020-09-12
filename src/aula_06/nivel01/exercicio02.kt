package aula_06.nivel01

//2. Faça um Programa que leia um vetor de 10 números e mostre-os na ordem inversa.

const val PERGUNTA02 = "Digite um numero: "

fun main() {

    val numeros = ArrayList<Int>()

    for(numero in 1..10) {
        print(PERGUNTA02)

        val numero = readLine()!!.toInt()
        numeros.add(numero)
    }
    numeros.reverse()
    println(numeros)


}