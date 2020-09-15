package aula07.exercicio01


fun main() {

    var cliente1 = Clientes("Franscisca", "Silva")
    var conta1 = Contas(12345, 20.0, cliente1)
    conta1.sacar(400.00)
    conta1.depositar(500.00)

    var cliente2 = Clientes("Joana", "Silveira")
    var conta2 = Contas(54321, 0.0, cliente2)


    conta2.sacar(600.00)
    conta2.depositar(800.00)
}
