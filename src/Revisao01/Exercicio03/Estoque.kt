package Revisao01.Exercicio03

class Estoque(var nome: String, var qtdAtual: Int, var qtdMinima: Int) {

    fun mudarNome(nome: String) {
        this.nome = nome
    }

    fun mudarQtdMinima(qtdMinima: Int) {
        this.qtdMinima = qtdMinima
    }

    fun repor(qtd: Int) {
        this.qtdAtual += qtd
        println("Estoque Reposto!!")
        println("nome: $nome - Qtde Minima: $qtdMinima - Qtde Atual: $qtdAtual")
    }

    fun darBaixa(qtd: Int) {
        if (this.qtdAtual <= qtd) {
            println("Estoque não pode ficar negativo!!!")
        } else {
            this.qtdAtual -= qtd
            println("Estoque alterado!!")
            println("nome: $nome - Qtde Minima: $qtdMinima - Qtde Atual: $qtdAtual")
        }
    }

    fun mostrar() {
        println("nome: $nome - Qtde Minima: $qtdMinima - Qtde Atual: $qtdAtual")
    }

    fun precisaRepor(estoque: Estoque): Boolean {
        return (qtdAtual <= qtdMinima)
    }

}