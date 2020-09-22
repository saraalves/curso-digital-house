package aula10.exercicio02

fun main() {
    //preço negativo
    //quantidade negativa

    val fatura = Fatura()

    var item1 = Item(5, "maça", 10, -2.50)
    var item2 = Item(6, "banana", -10, 2.50)

    fatura.listaItens.add(item1)
    fatura.listaItens.add(item2)

    println(fatura.getTotalFatura())

    //preço positivo
    //quantidade positva

    item1 = Item(5, "maça", 10, 2.50)
    item2 = Item(6, "banana", 20, 3.50)

    fatura.listaItens.add(item1)
    fatura.listaItens.add(item2)

    println(fatura.getTotalFatura())

}
