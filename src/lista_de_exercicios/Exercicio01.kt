package lista_de_exercicios

/*
1) Escrever o código que deve analisar três números inteiros e retornar o maior
deles.

*/

const val INFORME_NUMERO = "Informe o numero: "

fun main() {

    retornaMaiorNumero()
}

fun retornaMaiorNumero(): Int {

    var numeroMaior = Int.MIN_VALUE
    var contador = 1

    do {
        print(INFORME_NUMERO)
        val resposta = readLine()!!.toInt()

        if (resposta > numeroMaior) {
            numeroMaior = resposta
        }
        contador++
    } while (contador <= 3)


    println("o número maior é $numeroMaior")
    return numeroMaior
}