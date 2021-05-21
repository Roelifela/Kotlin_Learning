package Aula12.Exercicio03

class Aluno(var nome: String, var numeroDeAluno: Int) {

    override fun equals(other: Any?): Boolean {
        val outroAluno = other as? Aluno

        return when (other) {
            is Aluno -> {
                this.numeroDeAluno == outroAluno?.numeroDeAluno
            }
            else -> {
                return super.equals(other)
            }
        }

    }
}