package Aula04_07.Exercicio05

class Conta(
    val numeroDaConta: Int,
    var saldo: Double,
    val titular: Cliente
) {

    fun deposito(valor: Double){
        saldo += valor
        println("Depósito de R$ $valor\nNovo saldo: R$ $saldo")
    }

    fun saque(valor:Double){
        if (valor <= saldo) {
            saldo -= valor
            println("Saque de R$ $valor\nNovo saldo: R$$saldo")
        } else {
            println("Saldo insuficiente")
        }
    }
}