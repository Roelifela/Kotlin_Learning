package Aula11

class Contrato(override var nome: String, override var tipoDocumento: String): Imprimivel {

    override fun imprimir() {
        println("“Sou um contrato muito legal - Tipo documento: $tipoDocumento - Nome arquivo: $nome")
    }
}