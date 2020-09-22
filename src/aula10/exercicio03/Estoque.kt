package aula10.exercicio03

import java.lang.Exception
import kotlin.math.max

class Estoque(var nome: String, var qtdAtual: Int, var qtdMinima: Int) {

    fun mudarNome(nome: String) {
        this.nome = nome
    }

    fun quantidadeMinima(qtdMinima: Int) {
        this.qtdMinima = qtdMinima
    }

    fun repor(quantidade: Int) {
        this.qtdAtual += quantidade
    }
    fun darBaixa(quantidade: Int) {
        if(qtdAtual - qtdMinima < 0) {
            throw Exception("Quantidade não pode ser negativa")
        }
        this.qtdAtual = quantidade
    }

    fun mostrar(): String = "Nome $nome\n quantidade minima $qtdMinima\n quantidade atual $qtdAtual"

    fun precisaRepor(): Boolean = qtdAtual <= qtdMinima
}





