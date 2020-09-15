package future

import java.util.concurrent.*

fun main(args: Array<String>) {
    val completableFuture = CompletableFuture.supplyAsync {
        Calculator.sum(100, 200, delay = 2000)
    }

    println("계산 시작")
    completableFuture.thenApply(::println) // 논블로킹으로 동작

    while (!completableFuture.isDone) {
        Thread.sleep(500)
        println("계산 결과를 집계 중입니다.")
    }
    println("계산 종료")
}