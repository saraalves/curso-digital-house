package aula11.exercicio04

fun main() {
    val funcionario1 = Funcionario("Adriana", 123456)
    val funcionario2 = Funcionario("Leandro", 234567)
    val funcionario3 = Funcionario("Sandra", 345678)
    val funcionario4 = Funcionario("Alana", 456789)

    val funcionarioNovo = Funcionario("Julio", 456789)

    val listaFuncionario = arrayListOf<Funcionario>(funcionario1, funcionario2, funcionario3, funcionario4)

    println(listaFuncionario.contains(funcionarioNovo))
}