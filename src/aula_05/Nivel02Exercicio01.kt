package aula_05

fun main() {
//    2. Faça um Programa que peça um número inteiro e determine se ele é par ou ímpar.
//    Dica: utilize o operador módulo (resto da divisão).

    print("Digite um numero inteiro: ")
    var numeroInteiro = readLine()!!.toInt()

    if(numeroInteiro % 2 == 0){
        print("É par")
    } else {
        print("É impar")
    }
}