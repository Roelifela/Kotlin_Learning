package Revisao02

class Banco(var listaContas: MutableList<ContaBancaria>) : Imprimivel {

    fun inserir(contaBancaria: ContaBancaria) {

        listaContas.add(contaBancaria)
        println("Conta Bancária adicionada com sucesso!!!")

    }

    fun remover(contaBancaria: ContaBancaria) {

        listaContas.remove(contaBancaria)
        println("Conta Bancária removida com sucesso!!!")

    }

    fun procurar(contaBancaria: ContaBancaria) {

        if (listaContas.contains(contaBancaria)) {
            println("Conta encontrada!!!")
            contaBancaria.mostrarDados()


            TODO("COMO MOSTRAR OS DADOS DO OBJETO?")

        } else {
            println("Conta inexistente!!!")
        }
    }

    override fun mostrarDados() {
        listaContas.forEach(){
            it.mostrarDados()        }
    }

}