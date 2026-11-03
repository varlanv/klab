package com.varlanv.klab

import com.varlanv.klab.log.Log
import kotlin.time.Duration.Companion.nanoseconds

class Io(log: Log) {

    @PublishedApi
    internal val logEnabled = log.enabled

    @PublishedApi
    internal val logSink = log.sink

    inline fun debug(message: () -> String) {
        if (logEnabled) {
            logSink.write(message())
        }
    }

    inline fun <R> measure(block: () -> R, operation: String = ""): R {
        check(operation == "" || operation.isNotBlank()) { "`operation` param should be empty or non-blank string" }
        if (logEnabled) {
            val before = System.nanoTime()
            return try {
                block()
            } finally {
                val timeTaken = System.nanoTime() - before
                val msg =
                    if (operation == "") "Measured [ ${timeTaken.nanoseconds} ]" else "[ $operation ] measured [ ${timeTaken.nanoseconds} ] "
                logSink.write(msg)
            }
        }
        return block()
    }
}
