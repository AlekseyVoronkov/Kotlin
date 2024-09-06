fun main() {
    print("Введите колличество чисел в массиве: ")

    val userN = readln().toInt()
    val array = IntArray(userN)

    for (i in 0 until userN) {
        array[i] = (-100..100).random()
    }

    println("Массив: " + array.joinToString(", "))

    // используя for
    for (i in 1 until userN - 1) {
        if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
            println("(for)Элементы массива больше своих соседей: " + array[i].toString())
        }
    }

    //  используя while
    var i = 1
    while (i < array.size -1) {
        if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
            println("(while)Элементы массива больше своих соседей: " + array[i].toString())
        }
        i++
    }

    // используя foreach
    array.forEachIndexed { index, value ->
        if (index > 0 && index < array.size - 1) {
            if (value > array[index - 1] && value > array[index + 1]) {
                println("(foreach)Элементы массива больше своих соседей: $value")
            }
        }
    }
}