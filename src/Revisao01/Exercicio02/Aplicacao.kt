package Revisao01.Exercicio02

fun main() {

    val item1 = Item(1, "Arroz", 2, 10.00)
    val item2 = Item(2, "Milho", 3, 5.00)
    val item3 = Item(3, "Sal", 1, 20.00)
    val item4 = Item(4, "Carne", 5, 15.00)
    val item5 = Item(5, "Leite", 4, 10.00)

    val fatura = Fatura(listOf(item1, item2, item3, item5))

    fatura.getTotalFatura()

}