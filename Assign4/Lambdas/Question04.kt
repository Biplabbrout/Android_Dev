fun transformStrings(strings: List<String>, transform: (String) -> String): List<String> {
    return strings.map { transform(it) }
}

fun main() {
    val strings = listOf("dhoni", "thala", "noseven")

    val toUpperCase: (String) -> String = { it.toUpperCase() }
    val upperCaseStrings = transformStrings(strings, toUpperCase)
    println(upperCaseStrings) 
    val reversedStrings = transformStrings(strings) { it.reversed() }

    println(reversedStrings) 
}