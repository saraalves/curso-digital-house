package aula_06_parte02

import kotlin.random.Random

//
//4. Jogo de Craps. Faça um programa de implemente um jogo de Craps. O jogador
//lança um par de dados, obtendo um valor entre 2 e 12. Se, na primeira jogada, você
//tirar 7 ou 11, você um "natural" e ganhou. Se você tirar 2, 3 ou 12 na primeira
//jogada, isto é chamado de "craps" e você perdeu. Se, na primeira jogada, você fez
//um 4, 5, 6, 8, 9 ou 10,este é seu "Ponto". Seu objetivo agora é continuar jogando os
//dados até tirar este número novamente. Você perde, no entanto, se tirar um 7 antes
//de tirar este Ponto novamente. Exemplo:

//a.
//Rolar dados? (s ou n)
//Você tirou 7! Parabéns você ganhou!
//b.
//Rolar dados? (s ou n)
//Você tirou 8! Aperte enter para tentar novamente

//Você tirou 7! Você perdeu =(
//Dica: Para obter valores aleatórios use
//Random.nextInt(DE, ATE)

fun main() {

}

fun primeiraJogada(resposta: String) {

    println("Rolar os dados: ")
    val numero = Random.nextInt(1, 6)

}

fun segundaJogada() {

}