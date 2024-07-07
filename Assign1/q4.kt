fun main() {
    var str = "MrinalKumarJena"
    val str1 = str.lowercase()
    var count: Int
    for (i in 0 until str1.length) {
        count = 0
            for (j in i until str1.length) {
                if (str1[i] == str1[j]) {
                    count++
                }
            }
            println("${str1[i]}: $count")
    }
}
