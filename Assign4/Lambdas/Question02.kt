fun main() {
    val n = listOf(9,7,5,4,6)
    val squarn = n.map { it * it }
    val oddSquaredn = squarn.filter { it % 2 != 0 }
    val sumOfOddSquaredn = oddSquaredn.reduce { acc, num -> acc + num }

    println("Original numbers: $n")
    println("Squared numbers: $squarn")
    println("Odd squared numbers: $oddSquaredn")
    println("Sum of odd squared numbers: $sumOfOddSquaredn")
}