fun accessArrayElement(arr: IntArray, index: Int) {
    try {
        val element = arr[index]
        println("Element at index $index: $element")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Error: Index $index is out of bounds.")
    } finally {
        println("End of array access operation.")
    }
}

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5)
    accessArrayElement(array, 2)
    accessArrayElement(array, 7)  
}