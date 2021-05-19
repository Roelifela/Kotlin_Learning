package Aula11

class Contrato(override var nome: String, override var tipoDocumento: String): Imprimivel {

    override fun imprimir() {
        println("“Sou um contrato juridico - Tipo documento: $tipoDocumento - Nome arquivo: $nome")
    }
}