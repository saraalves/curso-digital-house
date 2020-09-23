package aula12.exercicio01

fun main() {

    val pessoa1 = Pessoa("Julia", Estado("RJ", "Rio de Janeiro"))
    val pessoa2 = Pessoa("Lucas", Estado("BA", "Bahia"))
    val pessoa3 = Pessoa("José", Estado("BA", "Bahia"))
    val pessoa4 = Pessoa("João", Estado("MA", "Maranhão"))
    val pessoa5 = Pessoa("Renato", Estado("MA", "Maranhão"))
    val pessoa6 = Pessoa("Alan", Estado("MG", "Minas Gerais"))
    val pessoa7 = Pessoa("Alana", Estado("MG", "Minas Gerais"))
    val pessoa8 = Pessoa("Jennifer", Estado("MA", "Maranhão"))
    val pessoa9 = Pessoa("Gabriela", Estado("MG", "Minas Gerais"))
    val pessoa10 = Pessoa("Bruna", Estado("MG", "Minas Gerais"))

    val listaDePessoasPorEstado = listOf(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5, pessoa6, pessoa7, pessoa8, pessoa9, pessoa10)

    println(listaDePessoasPorEstado.groupBy { it.estado.sigla })
}