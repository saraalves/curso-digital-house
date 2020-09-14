package lista_de_exercicios
/*
2) Escrever o código que deve analisar duas cadeias de texto e, caso sejam
diferentes, retornar true, ou, caso sejam iguais, retornar false.
*/
const val DIGITE_TEXTO = "Digite um texto: "

fun main() {
    analiseDeTexto()
}

fun analiseDeTexto(): Boolean{
    println(DIGITE_TEXTO)
    val texto1 = readLine()!!.toString()
    println(DIGITE_TEXTO)
    val texto2 = readLine()!!.toString()

    if (texto1 == texto2) {
        println("São iguais")
        return false
    } else {
        println("Não são iguais")
        return true
    }
}