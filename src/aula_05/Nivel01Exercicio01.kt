package aula_05

fun main() {
//    1. Faça um Programa que verifique se uma letra digitada é "F" ou "M".
//    Conforme aletra escrever: F - Feminino, M - Masculino, Sexo Inválido.

        print("Digite F para feminino e M para masculino")
        var sexo = readLine()!!.toUpperCase()

    when (sexo) {
        "F" -> {
            println("Feminino")
        }
        "M" -> {
            println("Masculino")
        }
        else -> {
            println("Sexo inválido")
        }
    }
}