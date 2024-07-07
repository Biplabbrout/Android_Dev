data class User(val name: String?, val email: String?)

fun printUserDetails(user: User) {
    if (user.name == null || user.email == null) {
        println("Incomplete User")
    } else {
        println("Name: ${user.name}, Email: ${user.email}")
    }
}

fun main() {
    val cUser = User("surya kumar yadav", "surya.12@example.com")
    val inUser = User("surya kumar yadav", null)

    printUserDetails(cUser)
    printUserDetails(inUser) 
}
