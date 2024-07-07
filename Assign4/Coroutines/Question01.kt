import kotlinx.coroutines.*

fun main() {
    GlobalScope.launch {
        delay(1000) 
        println("Hello") 
        println("World") 
    }
    Thread.sleep(2000) 
}