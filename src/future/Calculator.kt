package future

object Calculator {
    fun sum(a: Int, b: Int, delay: Long = 0): Int {
        Thread.sleep(delay)
        return a + b
    }
}