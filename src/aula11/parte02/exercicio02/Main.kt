package aula11.parte02.exercicio02

fun main() {

    val calculoMatematico = CalculoMatematico()



    try {
        calculoMatematico.dividir(4, 0)
    } catch (ex: ArithmeticException) {
        println(ex.message)

    }


}