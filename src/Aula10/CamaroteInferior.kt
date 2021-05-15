package Aula10

class CamaroteInferior(var localizacao: String) : VIP() {

    override var valor: Double = 15.0

    override fun imprimeValor() {
        println("Valor ingresso VIP = $valor - Localicação: $localizacao")
    }

}