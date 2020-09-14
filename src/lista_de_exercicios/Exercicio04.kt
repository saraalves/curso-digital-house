package lista_de_exercicios

/*
4) Escrever um programa que imprima na tela os primeiros 100 números
inteiros positivos ímpares.
*/

fun main() {

    numerosPositivosImpares()
}


fun numerosPositivosImpares() {

    for(numero in 1..100) {
        if(numero % 2 != 0) println("Os primeiros 100 numeros positivos impares são $numero")
    }

}