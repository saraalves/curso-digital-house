package aula07.exercicio03

class Prova(val dificuldade: Int, val energiaNecessaria: Int) {

    var atleta = Atleta()
    var nivel = atleta.nivel
    var energia = atleta.energia

    init { }

    fun realizarProva(atleta: Atleta): Boolean {

        return if(nivel >= dificuldade && energia > energiaNecessaria){

            energia--
            println("O atleta pode realizar a prova")
            true
        } else{
            println("Infelizmente o atleta não pode realizar a prova")
            false
        }

    }
}