package Aula04_07.Exercicio01

class Concessionaria{
var listaDeVenda = mutableListOf<Venda>()

fun registrarVenda(venda: Venda) {
    listaDeVenda.add(venda)
}
}