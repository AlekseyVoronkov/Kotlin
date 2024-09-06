fun main() {
    val n = 10
    val numbers = IntArray(n)

    for (i in 0 until n) {
        numbers[i] = (-10..10).random()
        if (numbers[i] == 0) {
            numbers[i] = 1
        }
    }

    println("Массив: ${numbers.joinToString(", ")}")

    val numberArray = NumberArray(numbers)

    println("Удвоенные четные, утроенные нечетные: ${numberArray.doubleEvenTripleOdd().joinToString(", ")}")
    println("Максимальный элемент массива: ${numberArray.maxElement()}")
    println("Минимальный элемент массива: ${numberArray.minElement()}")
    println("Сумма элементов массива: ${numberArray.sum}")

}

class NumberArray(private val array: IntArray) {

    fun doubleEvenTripleOdd(): IntArray {
        return array.map { if (it % 2 == 0) it * 2 else it * 3 }.toIntArray()
    }

    fun maxElement(): Int {
        return array.max()
    }

    fun minElement(): Int {
        return array.min()
    }

    val sum: Int
        get() = array.sum()
}