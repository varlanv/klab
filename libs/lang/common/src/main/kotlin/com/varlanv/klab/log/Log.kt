package com.varlanv.klab.log

class Log(@PublishedApi internal val sink: Sink, val enabled: Boolean) {
    inline fun debug(message: () -> String) {
        if (enabled) {
            sink.write(message())
        }
    }

    companion object {
        val noop: Log = Log(sink = Sink.noop, enabled = false)
    }
}

sealed interface Sink {
    fun write(message: String)

    private data object Stderr : Sink {
        override fun write(message: String) {
            System.err.println(message)
        }
    }

    private data object Noop : Sink {
        override fun write(message: String) {
            // no-op
        }
    }

    companion object {
        val noop: Sink = Noop
        val stderr: Sink = Stderr
    }
}
