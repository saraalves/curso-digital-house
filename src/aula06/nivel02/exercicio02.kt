package aula06.nivel02

//2. Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao
//usuário a valor do saque e depois informar quantas notas de cada valor serão
//fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor
//mínimo é de 10 reais e o máximo de 600 reais. O programa não deve se preocupar
//com a quantidade de notas existentes na máquina.

const val PERGUNTA_QUANTO_SACAR = "Informe o valor que deseja sacar: "
fun main() {

    var notas = arrayOf(100, 50, 10, 5, 1)
    var quantidadeNotas = arrayOf(0, 0, 0, 0, 0)

    print(PERGUNTA_QUANTO_SACAR)
    var valorSaque = readLine()!!.toInt()

    if (valorSaque in 10..600) {
        for (count in 0..4) {
            if (valorSaque != 0) {
                quantidadeNotas[count] = valorSaque / notas[count]
                valorSaque %= notas[count]

                println("Notas de ${notas[count]}: ${quantidadeNotas[count]}")
            } else break
        }

    } else {
        println("Informe um valor entre R$10 a R$600")
    }
}