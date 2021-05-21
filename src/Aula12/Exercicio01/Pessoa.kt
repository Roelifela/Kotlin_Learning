package Aula12.Exercicio01

class Pessoa(var nome: String, var rg: Int) {

    override fun equals(other: Any?): Boolean {
        val outraPessoa = other as? Pessoa

        return when (other) {
            is Pessoa -> {
                /*
                Testando comparando nome
                this.nome == outraPessoa?.nome
                */
                this.rg == outraPessoa?.rg
            }
            else -> {
                return super.equals(other)
            }
        }

    }

}