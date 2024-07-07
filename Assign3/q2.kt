fun rThanN(inputList: List<Int>, n: Int): List<Int> {
    val fList = mutableListOf<Int>()
    for (element in inputList) {
        if (element >= n) {
            fList.add(element)
        }
    }
    return fList
}

fun main() {
    val oList = listOf(1, 2, 3, 4, 5)
    val n = 3
    val fList = rThanN(oList, n)
    println(fList) 
}
