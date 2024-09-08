fun main() {
    val celsius = 11
    val farenheit = convertTofarenheit(celsius)
    println(farenheit)
}

val convertTofarenheit = { celsius: Int -> celsius * 9 / 5 + 32}