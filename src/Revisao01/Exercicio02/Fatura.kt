package Revisao01.Exercicio02

class Fatura(var lista: List<Item>) {

    fun getTotalFatura() {

        var precoTotal: Double = 0.0

        lista.forEach(){
            println("Item num.: ${it.numItem} - Desc.Item.: ${it.desItem} - Qtde.: ${it.qtdComprada}" +
                    " - Preço Unit.: ${it.precoUnitItem} - Preço Total: ${it.precoUnitItem * it.qtdComprada}")
            precoTotal += (it.precoUnitItem * it.qtdComprada)
        }

        println("Valor total da compra: $precoTotal")

    }

}