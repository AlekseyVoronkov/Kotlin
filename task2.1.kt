fun main() {
    print("Введите колличество простых чисел: ")
    val n = readln().toInt()
    var count = 0
    var num = 2

    while (count < n) {
        if (isPrime(num)) {
            count++
            println("$count-ое число: $num")
        }
        num++
    }
}

fun isPrime(num: Int): Boolean {
    if (num < 2) return false
    for (i in 2 until num) {
        if (num % i == 0) return false
    }
    return true
}
