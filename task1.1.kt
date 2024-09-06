fun main() {
    println("Введите целое положительное число: ")

    val userNumber = readln()
    val result = userNumber.first().digitToInt() + userNumber.last().digitToInt()

    println("Ваше число: $result")
}