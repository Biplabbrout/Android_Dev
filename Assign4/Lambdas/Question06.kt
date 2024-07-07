fun main() {
    val factorial: (Int) -> Int = { n ->
        var result = 1
        for (i in 1..n) {
            result *= i
        }
        result
    }
    fun computeFactorial(num: Int): Int {
        return factorial(num)
    }
    val number = 5
    println("Factorial of $number is ${computeFactorial(number)}")
    }