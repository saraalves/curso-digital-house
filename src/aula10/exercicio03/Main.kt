package aula10.exercicio03

fun main(){

    val estoque = Estoque("Estoque", 35, 10)

    estoque.darBaixa(15)

    println(estoque.mostrar())
    println(estoque.precisaRepor())

    estoque.repor(30)

    println(estoque.mostrar())
    println(estoque.precisaRepor())

}