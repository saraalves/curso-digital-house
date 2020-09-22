package aula10.exercicio01

class Professor(nome: String, registro: String) : Pessoa(nome, registro){
    override val fazerChamada: Boolean
        get() = true

    override val darAulas: Boolean
        get() = true

}