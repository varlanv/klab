package com.varlanv.klab

import com.varlanv.klab.log.Log
import com.varlanv.klab.log.Sink

fun main() {
    App.create(
        init = App.Init(
            mode = RunMode.Debug,
            log = Log(
                sink = Sink.stderr,
                enabled = true,
            ),
        )
    ).start()
}
