package Aula04_07.Exercicio05

fun main() {
    val cliente1 = Cliente("José", "Carlos")
    val cliente2 = Cliente("Pedro", "Lopes")
    val c1 = Conta(123, 150.0, cliente1)
    val c2 = Conta(546, 1500.0, cliente2)

    c1.deposito(150.0)
    c1.saque(305.0)

    c2.deposito(200.0)
    c2.saque(10.0)
}