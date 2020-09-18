package aula07.exercicio05

fun main() {
    val carro1 = Veiculo("Ford", "Gol", 2018, "Preto", 35_000 )
    val cliente1 = Cliente("Renato", "Gusmao", "11 9 5555 6666")

    val concessionaria = Concessionaria()

    concessionaria.registrarVenda(carro1, cliente1, 35_000.00)
}