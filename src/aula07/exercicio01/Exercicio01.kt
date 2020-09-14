package aula07.exercicio01

fun main() {

    var cliente1 = Clientes("Franscisca")
    cliente1.sobrenome = "Silva"
    var conta1 = Contas(12345, cliente1)
    conta1.saldo
    conta1.saque(400.00)
    conta1.deposito(500.00)




    var cliente2 = Clientes("Joana")
    cliente2.sobrenome = "Silveira"
    var conta2 = Contas(54321, cliente2)

    conta2.saldo
    conta2.saque(600.00)
    conta2.deposito(800.00)

}