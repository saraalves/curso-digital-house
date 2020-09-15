package aula07.exercicio02

fun main(){
    val jogador1 = JogadorDeFutebol("Marta", 10, 10, 10, 10)
    val jogador2 = JogadorDeFutebol("Cristiane", 100, 100, 14, 159)

    val sessaoDeTreinamento1 = SessaoDeTreinamentos(10)
    val sessaoDeTreinamento2 = SessaoDeTreinamentos(0)

    sessaoDeTreinamento1.treinarA(jogador1)
    sessaoDeTreinamento2.treinarA(jogador2)
}