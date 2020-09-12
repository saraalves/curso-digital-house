package aula_05_parte02.nivel01

//4. Faça um programa que leia e valide as seguintes informações:

////Nome: maior que 3 caracteres;
////Idade: entre 0 e 150;
////Salário: maior que zero;
////Sexo: 'f' ou 'm';
////Estado Civil: 's', 'c', 'v', 'd';

fun main() {

    do {
        print("Informe seu nome: ")
        val nome = readLine()!!.length

        if (nome > 3) {
            println("Válido")
            break
        } else {
            println("Digite um nome válido")
            continue
        }
    } while (true)

    do {
        print("Informe sua idade: ")
        var idade = readLine()!!.toInt()

        if (idade in 1 until 50) {
            println("Válido")
            break
        } else {
            println("Digite uma idade válida")
            continue
        }

    } while (true)

    do {
        print("Informe seu salário: ")
        var salario = readLine()!!.toDouble()

        if (salario > 0) {
            println("Válido")
            break
        } else {
            println("Digite um salário válido")
            continue
        }

    } while (true)

    do {
        print("Informe seu gênero: ")
        var genero = readLine()!!.toLowerCase()

        if (genero == "f" || genero == "m") {
            println("Válido")
            break
        } else {
            println("Digite um gênero válido")
            continue
        }

    } while (true)

    do {

        print("Informe seu estado civil: ")
        var estadoCivil = readLine()!!.toLowerCase()

        if (estadoCivil == "s" || estadoCivil == "c" || estadoCivil == "v" || estadoCivil == "d") {
            println("Válido")
            break
        } else {
            println("Digite um gênero válido")
            continue
        }

    } while (true)

}