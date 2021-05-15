package Aula10

class CamaroteSuperior(var localizacao: String) : VIP() {

    override var valor: Double = 20.00

    override fun imprimeValor() {
        println("Valor ingresso VIP = $valor - Localização: $localizacao")
    }
}