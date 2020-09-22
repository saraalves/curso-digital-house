package aula10.exercicio01

class Curso(nome: String, val professor: Professor) {

    val listaAula get() = ArrayList<Aula>()

    val listaAlunos get() = ArrayList<Aluno>()

}