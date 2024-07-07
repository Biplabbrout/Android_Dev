class BankAccount(val accountNumber: String, var balance: Double) {

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposited $$amount. New balance is $$balance.")
        } else {
            println("Deposit amount must be positive.")
        }
    }

    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            println("Withdrew $$amount. New balance is $$balance.")
        } else {
            println("Withdrawal amount must be positive and less than or equal to the balance.")
        }
    }

    fun getBal(): Double {
        return balance
    }
}

fun main() {
    val myAccount = BankAccount("123456789", 1000.0)

    println("Initial balance: $${myAccount.getBal()}")

    myAccount.deposit(500.0)
    myAccount.withdraw(200.0)
    myAccount.withdraw(1500.0)

    println("Final balance: $${myAccount.getBal()}")
}
