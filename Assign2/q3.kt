fun isPalindrome(input: String): Boolean {
    val Input = input.replace("".toRegex(), "").toLowerCase()
    val length = Input.length
    var l = 0
    var r = length - 1

    while (l < r) {
        if (Input[l] != Input[r]) {
            return false
        }
        l++
        r--
    }
    return true
}

fun main() {
    val String = "madam"
    println("Is '$String' a palindrome? ${isPalindrome(String)}")
    
}
