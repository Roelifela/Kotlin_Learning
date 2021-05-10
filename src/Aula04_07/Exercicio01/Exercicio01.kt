package Aula04_07.Exercicio01

fun main() {
    val carro = Carro("Fiat", "Uno",2016, "Preto", 25265)
    val cliente = Cliente("Joselaine", "Aparecida", 99999)
    val concessionaria = Concessionaria()
    val venda1 = Venda(23500.0, carro, cliente)

    concessionaria.registrarVenda(venda1)

    concessionaria.listaDeVenda.forEach { println(it) }
}