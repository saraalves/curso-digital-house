package aula07.exercicio02

class SessaoDeTreinamentos(var experiencia: Int) {

    val jogadorDeFutebol = JogadorDeFutebol()
//    experiência (ganha quando um treinamento é realizado)

    fun treinarA(jogadorDeFutebol: JogadorDeFutebol){

        var experienciaJogador = jogadorDeFutebol.experiencia
        experiencia = 0
        println("A experiência inicial é de: $experiencia")
        while(experienciaJogador > experiencia ){

            jogadorDeFutebol.correr()
            jogadorDeFutebol.fazerGol()
            jogadorDeFutebol.correr()

            experiencia++
        }
        println("A exeperiência final é de: $experiencia")
    }
}