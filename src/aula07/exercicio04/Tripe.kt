package aula07.exercicio04

class Tripe(dobrado: Boolean) {

    var alturaMinima: Double = Double.MIN_VALUE
    var alturaMaxima: Double = Double.MAX_VALUE
    var alturaAtual: Double = 0.0
    var dobrado: Boolean = true

    init { }

    constructor(dobrado: Boolean, alturaMinima: Double, alturaMaxima: Double, alturaAtual: Double) : this(true){
        this.alturaMinima = alturaMinima
        this.alturaMaxima = alturaMaxima
        this.alturaAtual = alturaAtual
    }

    fun definirAltura(novaAltura: Int) {

        alturaAtual = novaAltura.toDouble()
        println("Altura atual é de: $alturaAtual")
    }

    fun dobrar(){
        dobrado
        println("Dobrad0")
    }

    fun desdobrar(){
        !dobrado
        println("Desdobrado")
    }

    fun guardar(): Boolean{

        if(this.dobrado && this.alturaMinima == alturaAtual){
            println("Pronto para guardar")
            return true
        }
        return false
    }

    fun prontoParaGuardar() {
        guardar()
    }

    fun usar() {

        if (!dobrado && alturaAtual == (alturaMaxima / 2) + 5 ) {
            println("Pronto para usar")
        }
    }

    fun prontoParaUsar() {
        usar()
    }
}