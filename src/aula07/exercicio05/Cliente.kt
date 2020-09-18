package aula07.exercicio05

class Cliente(nome: String) {
    var sobrenome: String = ""
    var contato: String = ""

    constructor(nomeCliente: String, sobrenome: String, contato: String) : this("") {
        this.sobrenome = sobrenome
        this.contato = contato
    }
}