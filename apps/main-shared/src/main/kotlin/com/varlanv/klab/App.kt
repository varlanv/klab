package com.varlanv.klab

import com.varlanv.klab.log.Log
import com.varlanv.klab.renderer.Renderer
import java.lang.foreign.Arena

class App private constructor(private val init: Init) {

    class Init(
        val mode: RunMode,
        val log: Log,
    )

    fun start() {
        context(Io(log = init.log)) {
            Arena.ofConfined().use { arena ->
                context(arena) {
                    Renderer.create().start(title = "klab")
                }
            }
        }
    }

    companion object {
        fun create(init: Init): App {
            return App(init)
        }
    }
}
