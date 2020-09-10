package aula_04

fun main () {

//    2. Faça um Programa que pergunte quanto você ganha por hora e o número dehoras trabalhadas no mês.
//    Calcule e mostre o total do seu salário no referido mês,sabendo-se que são descontados 11% para o Imposto de Renda,
//    8% para o INSS e5% para o sindicato, faça um programa que nos dê:salário bruto.quanto pagou ao INSS.
//    quanto pagou ao sindicato.o salário líquido. calcule os descontos e o salário líquido,
//    conforme a tabela abaixo:

//    + Salário Bruto : R$
//    - IR (11%) : R$
//    - INSS (8%) : R$
//    - Sindicato ( 5%) : R$
//    = Salário Líquido : R$

    print("Informe o valor do seu salário por hora: ")
    var salarioPorHora = readLine()!!.toDouble();

    print("Informe quantas horas você trabalha por mês: ")
    var horasTrabalhadasNoMes = readLine()!!.toInt()

    var salarioBruto = salarioPorHora * horasTrabalhadasNoMes;

    var descontoIr = salarioBruto * 0.11;

    var descontoInss = salarioBruto * 0.08;

    var descontoSindicato = salarioBruto * 0.05;

    var descontosTotais = descontoIr + descontoInss + descontoSindicato;

    println("+ Salário Bruto : R$ $salarioBruto")
    println("- IR (11%) : R$ $descontoIr")
    println("- INSS (8%) : R$ $descontoInss")
    println("- Sindicato ( 5%) : R$ $descontoSindicato")
    println(" = Salário Líquido : R$ ${salarioBruto - descontosTotais}")

}