package Aula08

class Poupanca(cliente: Cliente, saldo: Double, numeroDaConta: Int): Conta(numeroDaConta, saldo, cliente) {

    var juros: Double = 0.1

    fun recolherJuros(conta: Conta){

        saldo *= juros
        println("O montante dos juros é de $saldo")

    }

}