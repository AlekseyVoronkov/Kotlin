fun main() {
    concat(arrayOf("why", "you're", "third?."))
}

val concat: (Array<String>) -> Unit = { strings ->
    strings.sortedBy { it.length }.joinToString(" ").let(::println)
}
