import kotlin.math.sqrt

fun main() {
    val a = 3.0
    val b = -9.0
    val c = 6.0

    println(quadraticRoot(a, b, c))
}

fun sqr(n: Double): Double {
    return n * n
}

fun discriminant(a: Double, b: Double, c: Double) : Double {
    return sqr(b) - (4 * a * c)
}

fun rootsNumber(a: Double, b: Double, c: Double) : Int {
    val number = discriminant(a, b, c)

    val answer: Int = when {
        (number > 0.0) -> 2
        (number == 0.0) -> 1
        else -> 0
    }

    return answer
}

fun quadraticRoot(a: Double, b: Double, c: Double) {
    when (rootsNumber(a, b, c)) {
        2 -> {
            val root1 = (-b + sqrt(discriminant(a, b, c))) / (2 * a)
            val root2 = (-b - sqrt(discriminant(a, b, c))) / (2 * a)
            println("Корни: x1 = $root1, x2 = $root2")
        }
        1 -> {
            val root1 = -b / (2 * a)
            println("Корень: x = $root1")
        }
        else -> {
            println("Корней нет :(")
        }
    }
}