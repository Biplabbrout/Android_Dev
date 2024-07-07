fun main() {
    var num= 3450
    var number = num.toString()
    if (number[0] == '0') {
        println("$number is not a Duck number.")
    } else {
        for (i in 1 until number.length) {
            if (number[i] == '0') {
                 println("$number is a Duck number.")
            }
        }
    }
}
