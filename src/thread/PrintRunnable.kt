package thread

class PrintRunnable : Runnable {
    override fun run() {
        println("current-thread-name : ${Thread.currentThread().name}")
    }
}