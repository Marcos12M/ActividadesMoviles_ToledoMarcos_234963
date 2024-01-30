package Actividad4_1

    fun List<Int>.sum(): Int {
        var result = 0
        for (i in this) {
            result += i
        }
        return result
    }

    fun main(args: Array<String>) {
        val myList = listOf(1, 2, 3)
        val sumResult = myList.sum()
        println(sumResult) // 6
    }