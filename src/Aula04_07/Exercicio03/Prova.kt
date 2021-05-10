package Aula04_07.Exercicio03

class Prova(
    val dificuldade: Int,
    val energiaNecessaria: Int
) {

    fun podeRealizar(atleta: Atleta): Boolean{
        return (atleta.nivel >= this.dificuldade) && (atleta.energia >= energiaNecessaria)
    }
}