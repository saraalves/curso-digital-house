package aula_05

fun main() {

    println("Digite a 1ª nota parcial do aluno:")
    val nota1 = readLine()!!.toDouble()

    println("Digite a 2ª nota parcial do aluno:")
    val nota2 = readLine()!!.toDouble()

    val totalNotas = (nota1+nota2) / 2
    println("A média do aluno é: $totalNotas")

    when {
        totalNotas >= 7 -> {
            println("Aprovado")
        }
        totalNotas < 7 -> {
            println("Reprovado")
        }
        totalNotas == 10.0 -> {
            println("Aprovado com Distinção")
        }
    }
}