package aula11.exercicio03

fun main(){

    val aluno1 = Aluno("João", 12345)
    val aluno2 = Aluno("Julia", 23456)
    val aluno3 = Aluno("Roberto", 34567)
    val aluno4 = Aluno("Douglas", 45678)

    val alunoNovo = Aluno("José", 45678)

    val aluno = arrayListOf<Aluno>(aluno1, aluno2, aluno3, aluno4)

    println(aluno.contains(alunoNovo))
}