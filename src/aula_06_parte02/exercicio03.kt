package aula_06_parte02

//3. Faça um programa com uma função chamada somaImposto. A função possui
//dois parâmetros formais: taxaImposto, que é a quantia de imposto sobre vendas
//expressa em porcentagem e custo, que é o custo de um item antes do imposto. A
//função “altera” o valor de custo para incluir o imposto sobre vendas.

fun main() {
    print(somaImposto(2.0, 20.0))

}

fun somaImposto(taxaImposto: Double, custo: Double): Double {

    val custoTotal =  custo * (taxaImposto / 100)

    return custoTotal + custo

}