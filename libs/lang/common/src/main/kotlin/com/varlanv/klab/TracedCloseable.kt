package com.varlanv.klab

/**
 * Same as [AutoCloseable], but logs errors to provided logger and guarantees that close will not fail with exception.
 */
interface TracedCloseable {
    context(std: Std)
    fun close()
}

context(std: Std)
inline fun <T : TracedCloseable?> T.use(block: (T) -> Unit) {
    try {
        return block(this)
    } catch (t: Throwable) {
        std.debug { "Failed to close resource with error [ ${t.message} ] - ${t.stackTraceToString()}" }
    }
}
