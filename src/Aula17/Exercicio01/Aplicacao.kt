package Aula17.Exercicio01

fun main() {

    var Lista: MutableList<String> = mutableListOf()
    var Lista1: List<String> = listOf("a", "b", "c")

    Lista.add("pato")
    Lista.add("cachorro")
    Lista.add("gato")

    try {
        println(Lista[3])
    } catch (e: IndexOutOfBoundsException) {
        println("Indice fora do range do array - Erro do tipo: ${e.localizedMessage}")
    }


}
