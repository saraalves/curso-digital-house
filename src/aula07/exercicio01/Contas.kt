package aula07.exercicio01

class Contas(numeroDaConta: Int, titular: Clientes) {

    var saldo: Double = 0.0

    fun deposito(quantiaEmDinheiro: Double) {

        val totalDeposito = quantiaEmDinheiro + saldo
        println("Depósito realizado com sucesso o valor do depósito foi de $totalDeposito")
    }

    fun saque(quantiaEmDinheiro: Double) {

        if(quantiaEmDinheiro > saldo){
            println("Saldo insuficiente")
        } else {
            val totalSaque = quantiaEmDinheiro - saldo
            println("Saque realizado com sucesso a quantia sacada foi de $totalSaque")
        }
    }
}

