fun main() {

//    println("Informe o número")
//    var numero = readLine()!!.toInt()
//    println("O número informado foi $numero")


//    var numero1 = 90
//    var numero2 = 490
//    println("A soma dos números é " + (numero1 + numero2))


//    var metros = 5.0
//    var conversorCentimetro = metros * 100
//    println("O resultado total é ${conversorCentimetro}cm")

//    print("Informe a temperatura em graus Fahrenheit: ")
//    C = 5 * ((F-32) / 9)
//    var temperatura = readLine()!!.toDouble()
//    var valorTotal = 5 * ((temperatura - 32) / 9)
//    println("O valor da temperatura em Cº: $valorTotal")

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

