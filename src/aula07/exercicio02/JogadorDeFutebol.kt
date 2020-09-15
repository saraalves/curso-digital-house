package aula07.exercicio02

class JogadorDeFutebol(nome: String) {

    var energia: Int = 0
    var alegria: Int = 0
    var gols: Int = 0
    var experiencia: Int = 0

    init{}

    constructor() : this("") {}

    constructor(nomeJogador: String, experiencia: Int) : this(nomeJogador) {
        this.experiencia = experiencia

    }

    constructor(nomeJogador: String, energia:Int, alegria: Int, gols: Int, experiencia: Int) : this(nomeJogador) {
        this.energia = energia
        this.alegria = alegria
        this.gols = gols
        this.experiencia = experiencia
    }

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
