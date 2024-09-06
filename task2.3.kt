fun main() {
    print("Введите колличество чисел в массиве: ")

    val userN = readln().toInt()
    val array = IntArray(userN)

    for (i in 0 until userN) {
        array[i] = (-10..10).random()
        if (array[i] == 0) {
            array[i] = 1
        }
    }

    println("Массив: " + array.joinToString(", "))

    // for
    val resultOfForLoop = arrayOperationsForLoop(array)
    println("Product: ${resultOfForLoop.first}, Min: ${resultOfForLoop.second}, Max: ${resultOfForLoop.third}")

    // while
    val resultOfWhileLoop = arrayOperationsWhileLoop(array)
    println("Product: ${resultOfWhileLoop.first}, Min: ${resultOfWhileLoop.second}, Max: ${resultOfWhileLoop.third}")

    // reduce and min max
    val resultOfReduce = arrayOperationsReduce(array)
    println("Product: ${resultOfReduce.first}, Min: ${resultOfReduce.second}, Max: ${resultOfReduce.third}")

    // forEach
    val resultOfForEach = arrayOperationsForEach(array)
    println("Product: ${resultOfForEach.first}, Min: ${resultOfForEach.second}, Max: ${resultOfForEach.third}")
}

fun arrayOperationsForLoop(array: IntArray): Triple<Int, Int, Int> {
    var product = 1
    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE

    for (element in array) {
        product *= element
        if (element < min) min = element
        if (element > max) max = element
    }

    return Triple(product, min, max)
}

fun arrayOperationsWhileLoop(array: IntArray): Triple<Int, Int, Int> {
    var product = 1
    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE
    var index = 0

    while (index < array.size) {
        product *= array[index]
        if (array[index] < min) min = array[index]
        if (array[index] > max) max = array[index]
        index++
    }

    return Triple(product, min, max)
}

fun arrayOperationsReduce(array: IntArray): Triple<Int, Int, Int> {
    val product = array.reduce { acc, element -> acc * element }
    val min = array.minOrNull() ?: Int.MAX_VALUE
    val max = array.maxOrNull() ?: Int.MIN_VALUE

    return Triple(product, min, max)
}

fun arrayOperationsForEach(array: IntArray): Triple<Int, Int, Int> {
    var product = 1
    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE

    array.forEach { element ->
        product *= element
        if (element < min) min = element
        if (element > max) max = element
    }

    return Triple(product, min, max)
}
