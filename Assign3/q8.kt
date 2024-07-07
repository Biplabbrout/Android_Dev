fun printUppercase(input: String?) {
    input?.let {
        println(it.toUpperCase())
    } ?: run {
        println("String is null")
    }
}


fun main() {
    val nonNullString = "hello"
    val nullString: String? = null
    
    printUppercase(nonNullString) 
    printUppercase(nullString)  
}
