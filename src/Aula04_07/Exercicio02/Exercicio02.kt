package Aula04_07.Exercicio02

fun main() {
    val jogador1 = JogadorDeFutebol("Alberto", 100, 100, 0, 0)
    val jogador2 = JogadorDeFutebol("Norberto", 100, 100, 0, 0)

    val sessaoDeTreinamento = SessaoDeTreinamento(20)
    sessaoDeTreinamento.treinar(jogador1)
    sessaoDeTreinamento.treinar(jogador2)
}
