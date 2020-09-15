package aula07.exercicio01

class Contas(val numeroDaConta: Int, var saldo: Double, val titular: Clientes) {

    fun depositar(quantiaEmDinheiro: Double) {

        saldo += quantiaEmDinheiro
        println("Depósito realizado com sucesso o valor do depósito foi de $saldo")
    }

    fun sacar(quantiaEmDinheiro: Double) {

        if(quantiaEmDinheiro > saldo){
            println("Saldo insuficiente")
        } else {
            saldo -= quantiaEmDinheiro
            println("Saque realizado com sucesso a quantia sacada foi de $saldo")
        }
    }
}

