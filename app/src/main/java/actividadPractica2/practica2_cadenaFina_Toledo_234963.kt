package actividadPractica2

fun String.esFina(): Boolean {
    val condicionesCumplidas = listOf(
        !contains("bu") && !contains("ba") && !contains("be"),
        count { it.toLowerCase() in "aeiou" } >= 3,
        windowed(2).any { it[0] == it[1] }
    )

    return condicionesCumplidas.count { it } >= 2
}

fun main(args: Array<String>) {
    println("bac".esFina()) //Resultado Esperado: False
    println("aza".esFina()) //Resultado Esperado: False
    println("abaca".esFina()) //Resultado Esperado: False
    println("baaa".esFina()) //Resultado Esperado: True
    println("aaab".esFina()) //Resultado Esperado: True
}