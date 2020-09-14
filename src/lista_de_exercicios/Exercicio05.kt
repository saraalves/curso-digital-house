package lista_de_exercicios

/*
5) Escrever um código que deve analisar quatro números inteiros e, caso numA
seja maior que numC e numD ou caso numB seja maior que numC e numD,
retornar true, caso contrário, retornar false.
*/

fun main() {

    numeroMaior()
}

fun numeroMaior(): Boolean{

    var numA = 10
    var numB = 8
    var numC = 9
    var numD = 5

    return if(numA > numC && numA > numD || numB > numC && numB > numD) {
        println("Numero A e numero B são maiores")
        true
    } else {
        println("Não são maiores")
        false
    }
}