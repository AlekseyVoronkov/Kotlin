fun main() {
    val randomNumber = (0..10).random()
    var isRunning = true
    while(isRunning) {
        println("Угадай число от 0 до 10: ")

        var userNumber = readln().toInt()

        if (userNumber < randomNumber) {
            println("Мало")
        }

        else if (userNumber > randomNumber) {
            println("Много")
        }

        else if (userNumber == randomNumber) {
            println("Угадал!")
            isRunning = false
        }
    }
}