package com.varlanv.klab

import com.varlanv.klab.log.Log

fun main() {
    App.create(
        init = App.Init(
            mode = RunMode.Release,
            log = Log.noop,
        )
    ).start()
}
