package Aula11

fun main() {

    var documento = Documento("blueprint", "DOC")
    var contrato = Contrato("juridico", "CON")
    var foto = Foto("selfie", "JPG")
    var impressora = Impressora()

    impressora.adicionarLista(documento)
    impressora.adicionarLista(contrato)
    impressora.adicionarLista(foto)

    impressora.imprimeTudo()

}