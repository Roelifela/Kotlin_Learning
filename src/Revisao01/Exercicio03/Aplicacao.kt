package Revisao01.Exercicio03

fun main() {

    var estoque = Estoque("Notebook", 100, 200)

    estoque.mostrar()
    estoque.darBaixa(10)
    estoque.mudarNome("Notebook New")
    estoque.mostrar()
    println(estoque.precisaRepor(estoque))
    estoque.repor(110)


}