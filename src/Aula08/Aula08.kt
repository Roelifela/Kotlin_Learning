package Aula08

fun main(){

    var cliente1 = Cliente("Rodrigo", "Cordeiro", "1000", 1234, 1234)
    var contaCorrente1 = ContaCorrente(cliente1, 1000.00, "1000-01")
    var contaPoupanca1 = ContaPoupanca(cliente1, 100.00, 0.01, "2000-02")

//    contaCorrente1.consultarSaldo()
//    contaCorrente1.depositar(1000.00)
//    contaCorrente1.consultarSaldo()
//    contaCorrente1.sacar(500.00)

    contaPoupanca1.consultarSaldo()
    contaPoupanca1.depositar(900.00)
    contaPoupanca1.consultarSaldo()
    contaPoupanca1.recolherJuros()
    contaPoupanca1.sacar(1010.00)
}