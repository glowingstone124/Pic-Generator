class Timer {
    fun measure(block: () -> Unit): Long {
        val startTime = System.currentTimeMillis()
        block()
        val endTime = System.currentTimeMillis()
        return endTime - startTime
    }
}
