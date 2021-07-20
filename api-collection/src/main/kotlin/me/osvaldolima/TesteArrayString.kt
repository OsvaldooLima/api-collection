package me.osvaldolima

fun main () {
    val nomes = Array<String>(3) {""}

    nomes[0] = "Maria"
    nomes[1] = "Zebedeu"
    nomes[2] = "José"

    for (nomes in nomes) {
        println(nomes)
    }

    println(",,,,,,,,,,,")
    nomes.sort()
    nomes.forEach { println(it) }

    println(",,,,,,,,,,,")
    val nomes2 = arrayOf("Maria","Zebedeu", "José")
    nomes2.sort()
    nomes2.forEach { println(it) }
}