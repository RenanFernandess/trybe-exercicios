import kotlin.math.ceil

//Cada degrau de uma escada tem X de altura.
//Escreva um programa usando Kotlin que receba essa altura e a
//altura que umapessoa deseja alcançar usando a escada,
//calcule e mostro quantos degraus ela deverá subir para atingir seu
//objetivo, sem se preocupar com a altura da pessoa.
//Todas as medidas fornecidas devem estar em metros.


fun main() {
    print("Digite a altura do degral: ")
    val alturaDegral: Double = readln().toDouble()

    print("Digite a altura que deseja alcançar: ")
    val alturaASubir:Double = readln().toDouble()

    println("A escada necessaria para subir $alturaASubir metros de altura, precisa ter pelomenos ${calcDegraus(alturaDegral, alturaASubir)} degraus.")
}

fun calcDegraus (altDegral: Double, altSubir:Double): Int {
    val numDegraus: Double = altSubir / altDegral
    return ceil(numDegraus).toInt()
}