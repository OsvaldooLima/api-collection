package me.osvaldolima

fun main() {
    val Salarios = DoubleArray(3)
    Salarios[0] = 1000.0
    Salarios[1] = 3000.0
    Salarios[2] = 500.0

    Salarios.forEach { println(it) }

    println(",,,,,,,,,,,,,,,,,")
    Salarios.forEachIndexed { index, Salario ->
        Salarios[index] = Salario * 1.1
    }
    Salarios.forEach { println(it) }

    println(",,,,,,,,,,,,,")
    val Salarios2 = doubleArrayOf(1500.0, 1200.0, 5000.0)
    Salarios2.sort()
    Salarios2.forEach { println(it) }
}
