package com.varlanv.klab

import com.varlanv.klab.log.Log

class Io(log: Log) {

    val logEnabled = log.enabled
    val logSink = log.sink

    inline fun debug(message: () -> String) {
        if (logEnabled) {
            logSink.write(message())
        }
    }
}
