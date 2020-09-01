package thread

fun main(args: Array<String>) {
    for (i in 0..5) {
        val thread = Thread(PrintRunnable())
        thread.start()
    }
    println("current-thread-name : ${Thread.currentThread().name}")
}