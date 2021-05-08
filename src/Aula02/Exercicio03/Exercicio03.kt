package Aula02.Exercicio03

/*
Check a given number and
return true if number is even
return false if it´s odd
 */

fun main(){

    println("${checaNumero(11)}")
}

fun checaNumero(num1: Int): Boolean{

    return (num1 % 2 == 0)

}