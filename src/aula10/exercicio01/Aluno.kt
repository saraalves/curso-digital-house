package aula10.exercicio01

class Aluno(registro: String, nome: String, sobrenome: String) : Pessoa(nome, registro) {

    override val podeAssitirAula: Boolean
        get() = true

    override val podeFazerLicao: Boolean
        get() = true

}