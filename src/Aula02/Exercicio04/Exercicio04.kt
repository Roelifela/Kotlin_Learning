package Aula02.Exercicio04



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