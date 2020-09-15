package aula05_parte02.nivel02

//3. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer
//número inteiro entre 1 a 10. O usuário deve informar de qual número ele deseja ver
//a tabuada. A saída deve ser conforme o exemplo abaixo:

//Tabuada de 5:
//5 X 1 = 5
//5 X 2 = 10
//...
//5 X 10 = 50

fun main() {

    print("Informe qual número deseja ver a tabuada: ")

    var numeroTabuada = readLine()!!.toInt()
    println("Tabuada de ${numeroTabuada}: ")

    if(numeroTabuada in 1..10) {
        for(count in 1..10){
            var resultado = numeroTabuada * count
            println("$numeroTabuada x $count = $resultado")
        }
    } else {
        println("Informe um numero de 1 a 10")
    }

}

