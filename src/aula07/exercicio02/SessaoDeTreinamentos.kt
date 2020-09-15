package aula07.exercicio02

class SessaoDeTreinamentos(var experiencia: Int) {

//    experiência (ganha quando um treinamento é realizado)

    fun treinarA(jogadorDeFutebol: JogadorDeFutebol){

        experiencia = 0
        println("A experiência inicial é de: $experiencia")
        while(experiencia < 10 ){
            jogadorDeFutebol.correr()
            jogadorDeFutebol.fazerGol()
            jogadorDeFutebol.correr()

            experiencia++
        }
        println("A exeperincia final é de: $experiencia")
    }
}