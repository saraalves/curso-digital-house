package aula_06_parte02

//Nível 1
//1. Faça um programa, com uma função que necessite de três argumentos, e que
//forneça a soma desses três argumentos.

fun main() {
    print(soma(3, 5, 8))
}


fun soma(n1: Int, n2: Int, n3: Int): Int {

    return n1 + n2 + n3
}