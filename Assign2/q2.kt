fun sumOfList(numbers: List<Int>): Int {
    var sum = 0
    for (number in numbers) {
        sum = sum+number
    }
    return sum
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    println("The sum of the list is ${sumOfList(numbers)}")
}
