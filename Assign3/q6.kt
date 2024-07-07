fun StringLength(input: String?): Int {
    return input?.length ?: -1
}


fun main() {
    val nonNullString = "Hello, World!"
    val nullString: String? = null
    
    println(StringLength(nonNullString)) 
    println(StringLength(nullString))
}
