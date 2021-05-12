package Aula08

class ContaPoupanca (cliente: Cliente, var saldoContaPoupanca: Double, var juros: Double, var numContaPoupanca: String): Conta(cliente) {

    override fun depositar(valorDeposito: Double) {
        //super.depositar(valorDeposito)
        saldoContaPoupanca += valorDeposito
        println("Valor do depósito: $valorDeposito. Saldo de $saldoContaPoupanca")
    }

    override fun sacar(valorSaque: Double) {
        //super.sacar(valorSaque)
        if (valorSaque > saldoContaPoupanca){
            println("o valor solicitado $valorSaque é maior que o saldo disponivel $saldoContaPoupanca")
        }else{
            saldoContaPoupanca -= valorSaque
            println("Valor do saque: $valorSaque. Saldo de $saldoContaPoupanca")
        }

    }

    override fun consultarSaldo() {
        //super.consultarSaldo()
        println("Saldo da conta poupança é de $saldoContaPoupanca")
    }

    fun recolherJuros(){

        var montanteJuros: Double = saldoContaPoupanca * (juros)
        saldoContaPoupanca += montanteJuros

        println("Valor dos juros aplicado: $montanteJuros -> Saldo conta poupança: $saldoContaPoupanca")
    }


}