fun processStrings(strings: List<String>, startLetter: Char): List<String> {
    return strings
        .filter { it.startsWith(startLetter, ignoreCase = true) }
        .map { it.toUpperCase() }
        .sorted()
}

fun main() {
    val strings = listOf("asia","android")

    val processedStrings = processStrings(strings, 'a')

    println(processedStrings)
}