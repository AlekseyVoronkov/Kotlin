fun main() {
    val string = "abxbbznmfkYyyxX"

    messageParse(string,
        { println("Обнаружен символ x") },
        { println("Обнаружен символ y") },
        { println("Обнаружен символ z") }
    )

}

fun messageParse(message: String, eventX:() -> Unit, eventY:() -> Unit, eventZ:() -> Unit) {
    for (char in message) {
        when (char.lowercaseChar()) {
            'x' -> eventX()
            'y' -> eventY()
            'z' -> eventZ()
        }
    }
}