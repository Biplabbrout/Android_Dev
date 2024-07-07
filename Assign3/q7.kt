fun filter(inputList: List<Int?>): List<Int> {
    return inputList.filterNotNull()
}

fun main() {
    val listWithNulls = listOf(1, 2, null, 4, null, 6)
    val nonNullList = filter(listWithNulls)
    println(nonNullList) 
}
