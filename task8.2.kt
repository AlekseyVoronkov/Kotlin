fun main() {
    val words: List<String?> = listOf("shmongus", null, "bingus", "e4e5Ke2Ke7", null)

    // if
    for (word in words) {
        if (word != null) {
            println("(if) " + word.uppercase())
        }
    }

    // ?
    words.forEach { println("(?) " + it?.uppercase()) }

    // let
    words.forEach { it?.let { word -> println("(let) " + word.uppercase()) } }

    // ? + let
    words.forEach { it?.let { word -> println(word.uppercase()) } ?: println("null") }
}