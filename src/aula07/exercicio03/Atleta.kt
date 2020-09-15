package aula07.exercicio03

class Atleta(nome: String) {

    var nivel: Int = 0
    var energia: Int = 0

    init{}

    constructor() : this("") {}

    constructor(nomeAtleta: String, nivel: Int, energia: Int): this(nomeAtleta) {
        this.nivel = nivel
        this.energia = energia
    }
}