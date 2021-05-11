package Aula08

open class Conta(
    var numeroDaConta: Int,
    var saldo: Double,
    var titular: Cliente)
 {

    open fun deposito(valor: Double){

        saldo += valor
        println("Depósito de R$ $valor\nNovo saldo: R$ $saldo")
    }

    open fun saque(valor:Double){
        if (valor <= saldo) {
            saldo -= valor
            println("Saque de R$ $valor\nNovo saldo: R$$saldo")
        } else {
            println("Saldo insuficiente")
        }
    }

    fun consutarSaldo(conta: Conta){
        println("Seu saldo é $saldo")
    }
}