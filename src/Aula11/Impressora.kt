package Aula11

class Impressora() {

    var listaImprimivel = mutableListOf<Imprimivel>()

    fun adicionarLista(imprimivel: Imprimivel){
        listaImprimivel.add(imprimivel)
    }

    fun imprimeTudo(){
        for (i in listaImprimivel){
            println(i.imprimir())
        }
    }
}