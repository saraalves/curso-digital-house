package aula04_sequencial

fun main() {
//    3. Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que
//    calcule seu peso ideal, utilizando as seguintes fórmulas:

//    Para homens: (72.7 * h) - 58
//    Para mulheres: (62.1 * h) - 44.7
//
//    Exemplo:
//    Digite a altura: 1.73
//    Para homens: 67,77
//    Para mulheres: 62,73

    print("Digite sua altura: ")
    var h = readLine()!!.toDouble()

    println("Para homens: ${(72.7 * h) - 58}")
    println("Para mulheres: ${(62.1 * h) - 44.7}")
}