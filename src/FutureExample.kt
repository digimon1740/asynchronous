import future.Calculator
import java.util.concurrent.Callable
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.Future

fun main(args: Array<String>) {
    val pool: ExecutorService = Executors.newSingleThreadExecutor()
    val future: Future<*> = pool.submit(Callable {
        Calculator.sum(100, 200, delay = 1000)
    })
    val result = Calculator.sum(1, 5, delay = 0)
    println(result)
    val futureResult = future.get()
    println(futureResult)
}