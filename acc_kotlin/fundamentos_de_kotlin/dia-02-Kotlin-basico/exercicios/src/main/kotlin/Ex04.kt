
//Escrevas um programa em Kotlin que receba três notas de uma pessoa estudante e
// mostre a média aritmética e a mensagem de acordo com as regras a seguir:

fun main() {
    println("Digite a seguir a sequencia de notas do aluno:")

    print("Nota 1: ")
    val nota1:Double = readln().toDouble()

    print("Nota 2: ")
    val nota2:Double = readln().toDouble()

    print("Nota 3: ")
    val nota3:Double = readln().toDouble()

    println("Status do aluno: ${checaStatus(nota1, nota2, nota3)}")
}

fun checaStatus(a:Double, b:Double, c:Double): String {
    val media:Double = (a + b + c) / 3

    return if (media < 3) "REPROVADO"
    else if (media >= 3 && media < 7) "EXAME"
    else "APROVADO"
}