package future

import java.util.concurrent.*

fun main(args: Array<String>) {
    val completableFuture = CompletableFuture.supplyAsync { // (1)
        Calculator.sum(100, 200, delay = 2000)
    }

    println("계산 시작")
    val futureResult = completableFuture.get() // (2)
    println(futureResult)

    while (!completableFuture.isDone) { // (3)
        Thread.sleep(500)
        println("계산 결과를 집계 중입니다.")
    }
    println("계산 종료")
}
