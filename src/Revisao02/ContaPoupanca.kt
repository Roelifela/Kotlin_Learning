package Revisao02

class ContaPoupanca(override var numeroConta: Int, override var saldo: Double, var limite: Double) :
    ContaBancaria(), Imprimivel {

    override fun depositar(valorDeposito: Double) {
        saldo += valorDeposito
        println("Depósito efetuado com sucesso!!!")
    }

    override fun sacar(valorSaque: Double) {
        if (valorSaque <= saldo + limite) {
            saldo -= valorSaque
            println("Saque efetuado com sucesso!!!")

        } else {
            println("Saldo insuficiente para saldo!!!")

        }
    }

    override fun mostrarDados() {
        println("POUPANCA --> Numero conta: $numeroConta - Saldo conta: $saldo - Limite: $limite")
    }
}