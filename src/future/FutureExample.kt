package future

import java.util.concurrent.Callable
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.Future

fun main(args: Array<String>) {
    val pool: ExecutorService = Executors.newSingleThreadExecutor()
    val future: Future<*> = pool.submit(Callable {
        Calculator.sum(100, 200, delay = 1000)
    })
    println("계산 시작")
    val futureResult = future.get() // 비동기 작업의 결과를 기다린다.
    println(futureResult)
    val result = Calculator.sum(1, 5)
    println(result)
    println("계산 종료")
}