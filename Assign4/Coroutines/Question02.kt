import kotlinx.coroutines.*

suspend fun main() {
    coroutineScope {
        launch {
            try {
                delay(1000)
                println("Task completed successfully!")
            } catch (e: Exception) {
                println("Exception occurred: ${e.message}")
            }
        }
    }
}