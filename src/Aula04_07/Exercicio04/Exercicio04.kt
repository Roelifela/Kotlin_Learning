package Aula04_07.Exercicio04

fun main() {
    val tripe = Tripe(false, 0, 10, 5)

    println(tripe.prontoParaGuardar())
    println(tripe.prontoParaUsar())
    tripe.desdobrar()
    tripe.dobrar()
    tripe.usar()
    tripe.guardar()
    tripe.definirAltura(6)

    println(tripe.alturaAtual)
}