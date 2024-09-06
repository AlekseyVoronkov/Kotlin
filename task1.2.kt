fun main() {
    var isRunning = true
    var amountOfNumbers = 0
    var sumOfNumbers = 0

    while (isRunning) {
        println("Введите число: ")
        val userNumber = readln()

        if (userNumber != "0") {
            amountOfNumbers += 1
            sumOfNumbers += userNumber.toInt()
        } else {
            amountOfNumbers += 1
            sumOfNumbers += userNumber.toInt()
            val arithmeticMean = sumOfNumbers / amountOfNumbers

            println("Колличество введенных чисел: $amountOfNumbers")
            println("Сумма чисел: $sumOfNumbers")
            println("Среднее арифметическое: $arithmeticMean")
            isRunning = false
        }
    }
}