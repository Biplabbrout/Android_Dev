fun rList(inputList: List<Int>): List<Int> {
    val rList = mutableListOf<Int>()
    for (i in inputList.size - 1 downTo 0) {
        rList.add(inputList[i])
    }
    return rList
}

fun main() {
    val oList = listOf(1, 2, 3, 4, 5)
    val rList = rList(oList)
    println(rList) 
}
