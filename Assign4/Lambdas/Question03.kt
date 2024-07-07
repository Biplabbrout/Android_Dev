fun makeAdder(x: Int): (Int) -> Int {
    return { y: Int -> x + y }
}

fun main() {
    val add10 = makeAdder(10)
    val add20 = makeAdder(20)

    println(add10(3))  
    println(add10(7))  
    println(add20(3))   
    println(add20(7))   
}