package com.varlanv.klab.renderer

import com.varlanv.klab.sdl3.Sdl3
import com.varlanv.klab.sdl3.Sdl3Event
import java.lang.foreign.SegmentAllocator

class Renderer private constructor() {

    fun start(
        gpa: SegmentAllocator,
        title: String
    ) {
        Sdl3.init(gpa).use { sdl ->
            sdl.createWindow(title, 1280, 720).use {
                while (true) {
                    when (sdl.waitEvent()) {
                        Sdl3Event.Quit, Sdl3Event.WindowCloseRequested -> break
                        Sdl3Event.Other -> Unit
                    }
                }
            }
        }
    }

    companion object {
        fun create(): Renderer = Renderer()
    }
}
