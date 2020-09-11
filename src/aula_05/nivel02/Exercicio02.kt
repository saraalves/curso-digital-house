package aula_05.nivel02

//    Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário o valor do saque e depois informar
//    quantas notas de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valormínimo é
//    de 10 reais e o máximo de 600 reais. O programa não deve se preocupar com a quantidade de notas existentes na máquina

//    Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50, uma nota de 5 e uma nota
//    de 1;
//    Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de100, uma nota de 50, quatro notas de 10,
//    uma nota de 5 e quatro notas de 1.

//    Quanto você quer sacar? 425
//    4 notas de 100
//    2 notas de 10
//    1 notas de 5

fun main() {

    print("Informe o valor que deseja sacar: ")
    var valorSaque = readLine()!!.toInt()

    var notasDeCadaValor = 0

    val VALOR_MINIMO = 10

    val VALOR_MAXIMO = 600

    if (valorSaque < VALOR_MINIMO) {
        println("Não foi possível realizar esse saque, o valor minimo para saque é acima de R$ 10,00")
    } else if (valorSaque > VALOR_MAXIMO){
        println("Valor de saque excedido, o valor maximo para saque é até R$ 600,00")
    } else {
        notasDeCadaValor = valorSaque / 100
        if(notasDeCadaValor > 0 ) {
            println("$notasDeCadaValor notas de 100")
        }

        valorSaque -= (100 * notasDeCadaValor)
        notasDeCadaValor = valorSaque / 50
        if(notasDeCadaValor > 0) {
            println("$notasDeCadaValor notas de 50")
        }

        valorSaque -= (50 * notasDeCadaValor)
        notasDeCadaValor = valorSaque / 10
        if(notasDeCadaValor > 0) {
            println("$notasDeCadaValor notas de 10")
        }

        valorSaque -= (10 * notasDeCadaValor)
        notasDeCadaValor = valorSaque / 5
        if(notasDeCadaValor > 0) {
            println("$notasDeCadaValor notas de 5")
        }
        valorSaque -= (5 * notasDeCadaValor)
        if (valorSaque > 0) {
            println("$valorSaque notas de R$1")
        }
    }

}