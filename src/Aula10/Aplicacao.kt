package Aula10

import java.util.Scanner

fun main() {

    //PONTOS A MELHORAR
    //COMO TRATAR O ERRO SE
    //O USUÁRIO NÃO DIGITAR NUMERO?
    //COMO FAZER UM TRY-CATCH OU VALIDAR?

    println("DIGITE 1 PARA INGRESSO NORMAL")
    println("DIGITE 2 PARA INGRESSO VIP")

    val input = Scanner(System.`in`)

    val ticketOption = input.nextInt()

    if (ticketOption == 1) {
        val ingressoNormal = Normal()
        ingressoNormal.imprimeValor()
    } else if (ticketOption == 2) {
        println("DIGITE 1 PARA CAMARPOTE SUPERIOR")
        println("DIGITE 2 PARA CAMAROTE INFERIOR")
        val vipOption = input.nextInt()
        if (vipOption == 1) {
            val ingressoCamaroteSuperior = CamaroteSuperior("Superior - 20B")
            ingressoCamaroteSuperior.imprimeValor()
        } else {
            val ingressoCamaroteInferior = CamaroteInferior("Inferior - 10A")
            ingressoCamaroteInferior.imprimeValor()
        }
    }else{
        println("OPÇÃO INVALIDA - ")
        main()
    }
}