package Actividad3

fun verificaCadena(cd: String): Boolean {

    if (cd.isEmpty()) {
        return false
    }

    val primerCr = cd[0]
    if (primerCr != '_' && !primerCr.isLetter()) {
        return false
    }

    for (cr in cd) {
        if (cr != '_' && !cr.isLetterOrDigit()) {
            return false
        }
    }

    return true

}

fun main(args: Array<String>) {
    println(verificaCadena("nombre")) // true
    println(verificaCadena("_nombre")) // true
    println(verificaCadena("_12")) // true
    println(verificaCadena("")) // false
    println(verificaCadena("012")) // false
    println(verificaCadena("no$")) // false
}