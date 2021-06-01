package Revisao02

abstract class ContaBancaria: Imprimivel {

    abstract var numeroConta: Int
    abstract var saldo: Double

    abstract fun sacar(valorSaque: Double)

    abstract fun depositar(valorDeposito: Double)

    fun transferir(contaBancaria: ContaBancaria, valor: Double) {
        sacar(valor)
        contaBancaria.depositar(valor)
    }

}