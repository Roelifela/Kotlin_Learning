package Aula10

class Normal : Ingresso() {

    override var valor: Double = 10.0

    override fun imprimeValor() {
        println("Valor ingresso Normal = $valor")
    }
}