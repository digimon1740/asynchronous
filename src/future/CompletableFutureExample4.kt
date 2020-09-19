package future

import java.util.concurrent.*

fun main(args: Array<String>) {
    val startTime = System.nanoTime()
    println("계산 시작")
    (0 until 5).map {
        CompletableFuture.supplyAsync { // (1)
            println("current-thread-name : ${Thread.currentThread().name}")
            Calculator.sum(100, 200, delay = 2000)
        }
    }.map(CompletableFuture<Int>::join).forEach(::println)
    println("계산 종료")
    val elapsedTime = (System.nanoTime() - startTime) / 1_000_000
    println("수행시간 : $elapsedTime msecs")
}