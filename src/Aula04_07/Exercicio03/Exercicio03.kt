package Aula04_07.Exercicio03

fun main() {
    val atleta1 = Atleta("Eduardo", 5, 100)
    val atleta2 = Atleta("Bruno", 2, 100)

    val prova1 = Prova(3, 20)
    val prova2 = Prova(1, 10)
    val prova3 = Prova(6, 10)
    val prova4 = Prova(3, 50)
    val prova5 = Prova(2, 80)
    val prova6 = Prova(6, 110)

    println( prova1.podeRealizar(atleta1))
    println( prova2.podeRealizar(atleta1))
    println( prova3.podeRealizar(atleta1))

    println( prova4.podeRealizar(atleta2))
    println( prova5.podeRealizar(atleta2))
    println( prova6.podeRealizar(atleta2))
}