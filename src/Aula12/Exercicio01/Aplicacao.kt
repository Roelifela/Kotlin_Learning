package Aula12.Exercicio01

fun main() {

    var pessoa1 = Pessoa("Rodrigo", 12344567)
    var pessoa2 = Pessoa("Rodrigo", 12344560)

    if (pessoa1 == pessoa2) {
        println("São iguais")
    } else {
        println("São diferentes")
    }

    println("$pessoa1")
    println("$pessoa2")

}