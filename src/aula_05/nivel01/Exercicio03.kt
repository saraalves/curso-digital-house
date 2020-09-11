package aula_05.nivel01

//3. Faça um programa para a leitura de duas notas parciais de um aluno. Oprograma deve calcular a média alcançada por aluno e apresentar:

// A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
// A mensagem "Reprovado", se a média for menor do que sete;
// A mensagem "Aprovado com Distinção", se a média for igual a dez.

fun main() {

    print("Digite a 1ª nota parcial do aluno: ")
    val nota1 = readLine()!!.toDouble()

    print("Digite a 2ª nota parcial do aluno: ")
    val nota2 = readLine()!!.toDouble()

    val totalNotas = (nota1+nota2) / 2
    println("A média do aluno é: $totalNotas")

    when {
        totalNotas == 10.00 -> {
            println("Aprovado com Distinção")
        }
        totalNotas >= 7 -> {
            println("Aprovado")
        }
        totalNotas < 7 -> {
            println("Reprovado")
        }
    }
}