package Aula12.Exercicio03

fun main(){

    var aluno1 = Aluno("Rodrigo", 123)
    var aluno2 = Aluno("Rodrigo", 321)
    var aluno3 = Aluno("Felipe", 123)
    var aluno4 = Aluno("Larissa", 456)

    var listaAluno = listOf<Aluno>(aluno1, aluno2, aluno3, aluno4)


    if (aluno1 == aluno3){
        println("Alunos com mesmo numero")
    }else{
        println("Alunos com numero diferentes")
    }

    println("${aluno1.numeroDeAluno}")
    println("${aluno3.numeroDeAluno}")


}