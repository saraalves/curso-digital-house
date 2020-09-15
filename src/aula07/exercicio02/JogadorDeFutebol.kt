package aula07.exercicio02

class JogadorDeFutebol(nome: String, gols: Int, energia: Int, alegria: Int, exeperiencia: Int) {

    var energia: Int = 0
    var alegria: Int = 0
    var gols: Int = 0
    val experiencia: Int = 0

    fun fazerGol() {

        for(count in 1..10){
            gols++

            energia -= 5

            alegria += 10

            println("GOOOOL!")
        }
    }

    fun correr() {
        energia -= 10
        println("Cansei")
    }
}
