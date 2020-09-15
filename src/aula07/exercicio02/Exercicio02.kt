package aula07.exercicio02

fun main(){
    val jogador1 = JogadorDeFutebol("Marta", 110, 100, 100, 200)
    val jogador2 = JogadorDeFutebol("Cristiane", 14, 100, 100, 159)

    val sessaoDeTreinamento1 = SessaoDeTreinamentos(10)
    val sessaoDeTreinamento2 = SessaoDeTreinamentos(0)

    sessaoDeTreinamento1.treinarA(jogador1)
    sessaoDeTreinamento2.treinarA(jogador2)
}