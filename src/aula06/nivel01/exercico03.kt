package aula06.nivel01

//3. Faça um Programa que peça a altura de 5 pessoas, armazene cada informação num array.
// Imprima a altura na ordem inversa a ordem lida.


const val PERGUNTA03 = "Informe a sua altura: "

fun main() {
    val alturaPessoa = ArrayList<Double>()

    for(pessoa in 1..5) {
        print(PERGUNTA03)

        val pessoa = readLine()!!.toDouble()
        alturaPessoa.add(pessoa)
    }
    alturaPessoa.reverse()
    println(alturaPessoa)

}
