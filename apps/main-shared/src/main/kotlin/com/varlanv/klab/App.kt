package com.varlanv.klab

import com.varlanv.klab.renderer.Renderer
import java.lang.foreign.Arena

class App private constructor() {

    fun start() {
        Arena.ofConfined().use { arena ->
            Renderer.create().start(gpa = arena, title = "klab")
        }
    }

    companion object {
        fun create(): App {
            return App()
        }
    }
}
