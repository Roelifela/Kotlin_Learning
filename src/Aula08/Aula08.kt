package Aula08

fun main() {

    val cliente1 = Cliente("Rodrigo", "Cordeiro", 123456, 654321)
    val cliente2 = Cliente("Eliza", "Tajiri", 7890, 9870)

    val conta1 = Corrente(cliente1, 1000.00, 1111)
    var conta2 = Corrente(cliente2, 100.00, 2222)

    val poupanca1 = Poupanca(cliente1, 1000.00, 1000)
    var poupanca2 = Poupanca(cliente2, 100.00, 2000)

//    poupanca1.consutarSaldo(conta1)
//    poupanca1.recolherJuros(conta1)
//    poupanca1.deposito(1000.00)
//    poupanca1.consutarSaldo(conta1)

    poupanca2.consutarSaldo(conta2)
    poupanca2.deposito(100.00)
    poupanca2.recolherJuros(conta2)
    poupanca2.consutarSaldo(conta2)

}