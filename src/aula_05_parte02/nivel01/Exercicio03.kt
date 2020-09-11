package aula_05_parte02.nivel01

fun main() {
        print("Digite o 1º número inteiro:")
        val numero1 = readLine()!!.toInt()

        print("Digite o 2º número inteiro:")
        val numero2 = readLine()!!.toInt()

        when {
            numero1 > numero2 -> {
                for (numInteiro in numero1 downTo numero2)
                    println("Os números inteiros dentro desse intervalo são: $numInteiro")
            }
            numero1 < numero2 -> {
                for (numInteiro in numero1 until numero2)
                    println("Os números inteiros dentro desse intervalo são: $numInteiro")
            }
            else -> {
                println("Não há intervalo entre os números")
            }
        }
}