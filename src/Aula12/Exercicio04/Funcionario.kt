package Aula12.Exercicio04

class Funcionario(var nome: String, var numeroDeRegistro: Int) {

    override fun equals(other: Any?): Boolean {
        var otherFuncionario = other as? Funcionario

        return when (other) {
            is Funcionario -> {
                this.numeroDeRegistro == otherFuncionario?.numeroDeRegistro
            }
            else ->{
                return super.equals(other)
            }
        }

    }
}