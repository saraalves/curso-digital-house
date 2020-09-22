package aula10.exercicio01

abstract class Pessoa(val nome: String, val registro: String) {

    open val podeAssitirAula: Boolean get() = false

   open val podeFazerLicao: Boolean get() = false

    open val darAulas: Boolean get() = false

    open val fazerChamada: Boolean get() = false
}