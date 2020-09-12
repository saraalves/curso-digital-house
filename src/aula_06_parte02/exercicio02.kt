package aula_06_parte02

//2. Faça um programa, com uma função que necessite de um argumento. A função
//retorna o valor de caractere ‘P’, se seu argumento for positivo, e ‘N’, se seu
//argumento for zero ou negativo.

fun main() {
    print(positivoNegativo(8))
}

fun positivoNegativo(numero: Int) = if(numero > 0) "P" else "N"

