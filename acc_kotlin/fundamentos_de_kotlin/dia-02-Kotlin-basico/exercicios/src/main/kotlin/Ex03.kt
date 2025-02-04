//Escrevas um programa em Kotlin que receba dois números e mostre o maior.

fun main() {
    print("Digite o primeiro valor: ")
    val valor1:Int = readln().toInt()

    print("Digite o segundo valor: ")
    val valor2:Int = readln().toInt()

    println("O valor maior é ${retornaMaior(valor1, valor2)}")
}

fun retornaMaior(a:Int, b:Int): Int {
    return if (a > b) a else b
}