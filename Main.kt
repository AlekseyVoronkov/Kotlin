fun main() {
    // 1
    val listOfNumbers = listOf(4, 12, -2, 3, -4, -15, -3)
    val filteredListOfNumbes = listOfNumbers.filter { it < 0 }
    println("Отрицательные числа: $filteredListOfNumbes")

    // 2
    val mutableList = mutableListOf(4, 12, -2, 3, -4, -15, -3)
    mutableList.replaceAll { if (it > 0) -it else it * -1}
    println("Список с заменой знаков: $mutableList")

    // 3
    val squaredNumbers = listOfNumbers.map { it * it }
    println("Список чисел в квадрате: $squaredNumbers")

    // 4
    val coolNumbers = IntRange(1, 7).toList()
    val newWeirdString = coolNumbers.joinToString(prefix = "=", postfix = "=", separator = "+")
    println("Ещё какой-то список: $newWeirdString")

    // 5
    val phoneBook = mapOf("razwod" to "+78005553535", "kredit" to "+829295235", "neZvonyit" to "+666", "Sanya" to "89237068346")
    val countryCode = "+8"
    val filteredNumbers = phoneBook.filterValues { it.startsWith(countryCode) }
    println(filteredNumbers)

    // 6
    print("Введите число от 0 до 100: ")
    val userNumber = readln().toInt()

    val userNumberString = when (userNumber) {
        in 0..19 -> arrayOf("ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать")[userNumber]
        in 20..99 -> {
            val tens = arrayOf("", "", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто")[userNumber / 10]
            val ones = arrayOf("", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять")[userNumber % 10]
            "$tens $ones"
        }
        100 -> "сто"
        else -> "не, в падлу"
    }
    println(userNumberString)

    // 7
    val time = "01:20:12"
    val (hours, minutes, seconds) = time.split(":").map { it.toInt() }
    val secondsPassed = hours * 360 + minutes * 60 + seconds
    println("Прошло $secondsPassed секунд с начала дня")
    }

