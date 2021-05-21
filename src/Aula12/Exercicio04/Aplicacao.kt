package Aula12.Exercicio04


fun main(){

    val funcionario1 = Funcionario("Rodrigo", 123)
    val funcionario2 = Funcionario("Felipe", 456)
    val funcionario3 = Funcionario("Larissa", 789)
    val funcionario4= Funcionario("Eliza", 321)
    val funcionario5= Funcionario("Eliza", 320)

    val listaFuncionario = listOf(funcionario1, funcionario2, funcionario3, funcionario4)

//    if (listaFuncionario.contains(Funcionario("Rodrigo", 123))){
//        println("Sim, contém!!!")
//    }else{
//        println("Não, não contém!!!")
//    }

    if (listaFuncionario.contains(funcionario5)){
        println("Sim, contém!!!")
    }else{
        println("Não, não contém!!!")
    }

}
