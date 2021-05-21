package Aula12.Exercicio02

class Coca(var tamanho: Int, var preco: Double) {

    override fun equals(other: Any?): Boolean {
        val outraCoca = other as? Coca

        return when (other) {
            is Coca -> {
                this.tamanho == outraCoca?.tamanho

            }
            else -> {
                return super.equals(other)
            }
        }

    }

}
