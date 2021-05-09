package Aula02.Exercicio01
/*
Given 3 numbers
return the bigger one
 */

fun main(){

    println("${retornaMaiorNumero(2000, 1000, 3000)}")

}

fun retornaMaiorNumero(num1: Int, num2: Int, num3: Int): Int {

    var maior: Int = 0

    if (num1 > num2 && num1 > num3){
        maior = num1
    } else if (num2 > num1 && num2 > num3){
        maior = num2
    } else if (num3 > num1 && num3 > num2){
        maior = num3
    }
    return maior
}

