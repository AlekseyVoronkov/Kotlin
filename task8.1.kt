fun main() {
    println("Введите первое число: ")
    val firstUserNumber = readln().toDouble()

    println("Выберите операцию: " +
            "\n1: +" +
            "\n2: -" +
            "\n3: *" +
            "\n4: /")
    val chosenOperation = readln().toInt()

    println("Введите второе число: ")
    val secondUserNumber = readln().toDouble()

    when(chosenOperation) {
        1 -> println("$firstUserNumber + $secondUserNumber = " + (firstUserNumber + secondUserNumber))
        2 -> println("$firstUserNumber - $secondUserNumber = " + (firstUserNumber - secondUserNumber))
        3 -> println("$firstUserNumber * $secondUserNumber = " + (firstUserNumber * secondUserNumber))
        4 -> {
            if (secondUserNumber != 0.0) {
                println("$firstUserNumber * $secondUserNumber = " + (firstUserNumber / secondUserNumber))
            } else {
                println("Я отказываюсь делить на ноль")
            }
        }
        else -> {
            println("Неверный оператор")
        }
    }
}

