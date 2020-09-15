package aula07.exercicio03

fun main() {
    val atleta1 = Atleta("João", 8, 10)
    val atleta2 = Atleta("Maria", 9, 10)

    val prova1 = Prova(10, 9)
    val prova2 = Prova(9, 8)
    val prova3 = Prova(7, 7)

    prova1.realizarProva(atleta1)
    prova2.realizarProva(atleta1)
    prova3.realizarProva(atleta1)

    prova1.realizarProva(atleta2)
    prova2.realizarProva(atleta2)
    prova3.realizarProva(atleta2)

}