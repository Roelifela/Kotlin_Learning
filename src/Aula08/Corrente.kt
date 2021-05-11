package Aula08

class Corrente (cliente: Cliente, saldo: Double, numeroDaConta: Int): Conta(numeroDaConta, saldo, cliente){

    fun depositarCheque(valor: Double){
        this.saldo += valor
        //saldo += valor
    }

}