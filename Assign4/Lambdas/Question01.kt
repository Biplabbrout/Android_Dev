fun sAge(people: List<Pair<String, Int>>): List<Pair<String, Int>> {
    
    val sPeople = people.toMutableList()
    
    
    for (i in sPeople.indices) {
        for (j in 0 until sPeople.size - i - 1) {
            if (sPeople[j].second > sPeople[j + 1].second) {
            
                val temp = sPeople[j]
                sPeople[j] = sPeople[j + 1]
                sPeople[j + 1] = temp
            }
        }
    }
    
    return sPeople
}

fun main() {
    val people = listOf(
        "virat" to 30,
        "rohit" to 25,
        "jadu" to 35
    )

    val sPeople = sAge(people)
    println(sPeople)
}