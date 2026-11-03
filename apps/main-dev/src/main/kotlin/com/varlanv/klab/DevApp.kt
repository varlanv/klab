package com.varlanv.klab

import com.varlanv.klab.log.Log
import com.varlanv.klab.log.Sink

fun main() {
    App.create(
        init = App.Init(
            mode = RunMode.Dev,
            log = Log(
                sink = Sink.stderr,
                enabled = true,
            ),
        )
    ).start()
}
