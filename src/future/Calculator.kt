package future

object Calculator {
    fun sum(a: Int, b: Int, delay: Long): Int {
        Thread.sleep(delay)
        return a + b
    }
}