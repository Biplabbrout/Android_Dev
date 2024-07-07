fun fact(n: Int): Int {
    if (n == 0) {
        return 1
    } else {
        return n * fact(n - 1)
    }
}
fun main() {
    println(fact(10)) 
   
}
