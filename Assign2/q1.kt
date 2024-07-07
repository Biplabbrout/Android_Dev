fun larger(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun main() {
    val n1 = 5
    val n2 = 10

    println("The larger of $n1 and $n2 is ${larger(n1, n2)}")
}
