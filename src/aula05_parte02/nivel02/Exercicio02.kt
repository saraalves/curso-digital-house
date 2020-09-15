package aula05_parte02.nivel02

//2. Faça um programa que calcule o valor total investido por um colecionador em sua
//coleção de CDs e o valor médio gasto em cada um deles. O usuário deverá informar
//a quantidade de CDs e o valor para em cada um.

fun main() {

    print("Informe a quantidade de CDs: ")

    var quantidadeCds = readLine()!!.toInt()
    var contador = 0
    var valorTotal = 0.0

    while(quantidadeCds > 0) {
        quantidadeCds--
        print("Informe o valor do ${++contador}º CD: ")
        val valorCd = readLine()!!.toDouble()
        valorTotal += valorCd
    }

    val media = valorTotal / contador
    println("O valor total investido em CDs é de $valorTotal")
    println("A media de gastos em cada CD é de $media")
}