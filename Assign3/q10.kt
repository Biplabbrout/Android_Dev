fun filterStrings(inputList: List<Any>): List<String> {
    val sList = mutableListOf<String>()
    for (element in inputList) {
        if (element is String) {
            sList.add(element)
        }
    }
    return sList
}

fun main() {
    val mList: List<Any> = listOf("kuldeep", 1, "dube", 2, "jadu")
    val sList = filterStrings(mList)
    println(sList)
}
