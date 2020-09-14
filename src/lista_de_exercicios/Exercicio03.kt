package lista_de_exercicios

/*
3) Escrever o código que deve analisar um número inteiro e, caso ele seja par,
retornar true, caso contrário, retorna false.
*/

const val DIGITE_INTEIRO = "Digite um numero inteiro: "
 fun main() {
    parOuImpar()
}

fun parOuImpar(): Boolean {
    println(DIGITE_INTEIRO)
    val numeroInteiro = readLine()!!.toInt()

    if (numeroInteiro % 2 == 0) {
        println("É par")
        return true
    } else{
        println("É ímpar")
        return false
    }
}




//print("Digite um numero inteiro: ")
//var numeroInteiro = readLine()!!.toInt()
//
//if(numeroInteiro % 2 == 0){
//    print("É par")
//} else {
//    print("É impar")
//}





