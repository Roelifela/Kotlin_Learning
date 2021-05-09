package Aula02.Exercicio04
/*
Print first 100 odd numbers
 */

fun main(){

    first100Odd()

}

fun first100Odd() {

    var number: Int = 1
    var count: Int = 0

    while (count < 5) {
        if (number % 2 != 0) {
            println("$number")
            count++
        }
        number++
    }

}