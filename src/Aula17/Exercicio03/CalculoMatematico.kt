package Aula17.Exercicio03

class CalculoMatematico() {

    fun Divisao(dividendo: Int, divisor: Int) {
        try {
            return println("${dividendo / divisor}")
        } catch (e: ArithmeticException) {
            return println(0)
        }
    }

}