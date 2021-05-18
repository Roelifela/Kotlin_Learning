package Aula11

class Foto(override var nome: String, override var tipoDocumento: String): Imprimivel {

    override fun imprimir() {
        println("Eu sou uma Selfie - Tipo documento: $tipoDocumento - Nome arquivo: $nome")
    }
}