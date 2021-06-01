package Aula17.Exercicio02

fun main(){

    var Lista: MutableList<String> = mutableListOf()

    Lista.add(0, "Pato")
    Lista.add(1, "Cachorro")
    Lista.add(2, "Gato")

    try{
        println(Lista[3])
    }catch (e: IndexOutOfBoundsException){
        println(e.message)
    }

}
