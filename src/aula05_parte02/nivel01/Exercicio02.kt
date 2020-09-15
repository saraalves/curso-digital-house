package aula05_parte02.nivel01

// 2. Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.

fun main() {
    for (numero in 1..50 ) {

        if (numero % 2 != 0) {
            println("Esses são os números ímpares dentro do intervalo: $numero")
        }
    }
}