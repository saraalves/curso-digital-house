package aula04_sequencial

fun main() {
//    2. Faça um Programa que pergunte quanto você ganha por hora e o número de horas
//    trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

//    Exemplo:
//    Quanto vale sua hora? 15
//    Quantas horas você trabalhou? 200
//    Você receberá R$ 3000,00


    print("Quanto vale a sua hora: ")
    var valorPorHora = readLine()!!.toDouble()

    print("Quantas horas você trabalhou no mês: ")
    var horasTrabalhadasMes = readLine()!!.toDouble()

    var salarioTotal = valorPorHora * horasTrabalhadasMes

    println("Você receberá R$ $salarioTotal")

}