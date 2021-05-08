package Aula02.Exercicio05

/*
Given 4 numbers
return true if
numA > numC and numD OR
numB > numC and numD
if not then return false
 */

fun main(){

    println("${checkNumbers(1, 20,30, 4)}")
}

fun checkNumbers(numA: Int, numB: Int,numC: Int,numD: Int): Boolean{

    return ((numA > numC) && (numA > numD)) || ((numB > numC) && (numB > numD))

}

