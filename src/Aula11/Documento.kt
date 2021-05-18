package Aula11

class Documento(override var nome: String, override var tipoDocumento: String): Imprimivel {

    override fun imprimir() {
        println("Eu sou um documento Word - Tipo documento: $tipoDocumento - Nome arquivo: $nome")
    }
}