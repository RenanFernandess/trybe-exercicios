//Escreva um programa usando Kotlin que receba o salário de uma pessoa colaboradora,
//calcule e mostre o novo salário, sabendo-se que este sofreu um aumento de 25%

fun main() {
    print("Digite o salario: ")
    val salario: Double = readln().toDouble()

    println("O novo salario é ${calcSalario(salario)}")
}

fun calcSalario(salario: Double): Double = salario + (salario * 0.25)