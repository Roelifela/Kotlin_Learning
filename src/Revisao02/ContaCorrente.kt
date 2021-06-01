package Revisao02

class ContaCorrente(override var numeroConta: Int, override var saldo: Double, var taxa: Double) :
    ContaBancaria(), Imprimivel {

    override fun depositar(valorDeposito: Double) {
        saldo += valorDeposito - taxa
        println("Depósito efetuado com sucesso!!!")
    }

    override fun sacar(valorSaque: Double) {

        if (valorSaque > (saldo + taxa)) {
            println("Saldo insuficiente")
        } else {
            saldo -= valorSaque + taxa
            println("Saque efetuado com sucesso!!!")
        }

    }

    override fun mostrarDados() {
        println("CONTA CORRENTE --> Numero conta: $numeroConta - Saldo conta: $saldo - Taxa: $taxa")
    }

    override fun equals(other: Any?): Boolean {
        var outraContaBancaria = other as? ContaBancaria

        return when (other) {
            is ContaBancaria -> {
                this.numeroConta == outraContaBancaria?.numeroConta
            }
            else -> {
                return super.equals(other)
            }
        }

    }
}