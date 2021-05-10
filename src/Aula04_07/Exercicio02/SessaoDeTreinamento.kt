package Aula04_07.Exercicio02

class SessaoDeTreinamento(
    var experiencia: Int
) {
    fun treinar(jogador: JogadorDeFutebol) {
        println("Experiência Inicial: ${jogador.experiencia}")
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        jogador.experiencia += experiencia
        println("Experiência Final: ${jogador.experiencia}")
    }
}