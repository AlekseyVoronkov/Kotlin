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

    val arrayOfNumbers = ArrayOfNumbers(numbers)

    println("Сумма положительных элементов: ${arrayOfNumbers.sumOfPositiveElements()}")
    println("Произведение элементов: ${arrayOfNumbers.productOfElements()}")
    println("Среднее арифметическое: ${arrayOfNumbers.averageOfElements()}")
}

class ArrayOfNumbers(private val array: IntArray) {

    fun sumOfPositiveElements() : Int {
        var sum = 0
        array.forEach { if (it > 0) sum += it }
        return sum
    }

    fun productOfElements() : Long {
        var product: Long = 1
        array.forEach { product *= it.toLong() }
        return product
    }

    fun averageOfElements(): Double {
        var sum = 0
        array.forEach { sum += it }
        return sum.toDouble() / array.size
    }
}