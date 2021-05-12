package Aula08

class ContaCorrente(cliente: Cliente, var saldoContaCorrente: Double, var numContaCorrente: String): Conta(cliente) {

    override fun depositar(valorDeposito: Double) {
        //super.depositar(valorDeposito)
        saldoContaCorrente += valorDeposito
        println("Valor do depósito: $valorDeposito. Saldo de $saldoContaCorrente")
    }

    override fun sacar(valorSaque: Double) {
        //super.sacar(valorSaque)
        if (valorSaque > saldoContaCorrente){
            println("o valor solicitado $valorSaque é maior que o saldo disponivel $saldoContaCorrente")

        }else{
            saldoContaCorrente -= valorSaque
            println("Valor do saque: $valorSaque. Saldo de $saldoContaCorrente")
        }

    }

    override fun consultarSaldo() {
        //super.consultarSaldo()
        println("Saldo da conta corrente é de $saldoContaCorrente")
    }

    fun depositarCheque(valorCheque: Double, bancoEmissor: String, dataPagto: String){
        saldoContaCorrente += valorCheque
        println("Valor do cheque depositado: $valorCheque. Saldo de $saldoContaCorrente")
    }

}