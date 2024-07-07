fun Subset(list1: List<Int>, list2: List<Int>): Boolean {
    val set2 = list2.toSet()  
    for (element in list1) {
        if (element !in set2) {
            return false
        }
    }
    return true
}


fun main() {
    val l1 = listOf(1, 2, 3)
    val l2 = listOf(1, 2, 3, 4, 5)
    println(Subset(l1, l2)) 

    val l3 = listOf(1, 6, 3)
    println(Subset(l3, l2)) 
}
