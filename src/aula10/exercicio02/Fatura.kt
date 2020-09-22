package aula10.exercicio02

class Fatura {

    val listaItens = ArrayList<Item>()

    fun getTotalFatura(): Double {
        var total = 0.0

        listaItens.forEach{
            total += it.quantidade * it.precoUnitario
        }

        return total
    }
}