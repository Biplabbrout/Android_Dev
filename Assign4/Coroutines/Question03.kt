import kotlinx.coroutines.*

suspend fun longRunningTask(): String {
    delay(2000) 
    return "Task completed successfully!"
}

fun main() = runBlocking {
    try {
        withTimeout(1000) {
            val result = longRunningTask()
            println(result)
        }
    } catch (e: TimeoutCancellationException) {
        println("Task timed out after 2 seconds.")
    }
}