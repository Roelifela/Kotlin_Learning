package Revisao01.Exercicio01


fun main() {

    val materia1 = Materia("Logica de Programação")
    val materia2 = Materia("Kotlin")
    val materia3 = Materia("Projeto integrador")

    val aula1 = Aula(materia1, "07:30", "08:00")
    val aula2 = Aula(materia2, "08:10", "09:00")
    val aula3 = Aula(materia3, "09:10", "10:00")

    val aluno1 = Aluno("100-0", "Rodrigo", "Cordeiro")
    val aluno2 = Aluno("200-0", "Felipe", "Cordeiro")
    val aluno3 = Aluno("300-0", "Larissa", "Cordeiro")
    val aluno4 = Aluno("400-0", "Eliza", "Cordeiro")
    val aluno5 = Aluno("500-0", "Luby", "Cordeiro")

    val curso1 = Curso("Android", listOf(aula1, aula2, aula3), listOf(aluno1, aluno2, aluno3),
        "Cesar")

    val turma1 = Turma("Abril-2021", curso1)

    turma1.curso.alunoCurso.forEach {
        println("Nome do Aluno: ${it.nome} - ${it.sobreNome} - ${it.regAcademico}")
    }
//
//    turma1.curso.aulaCurso.forEach {
//        println("Materia: ${it.materia} - Inicio: ${it.horaInicial} Fim: ${it.horaFinal}")
//    }

    /*
    Duvida: Como adicionar na impressão o Curso / Materia / Aluno / Professor...?
     */
    curso1.aulaCurso.forEach() {
        println("Aula: ${it.materia.nome}")
    }
}