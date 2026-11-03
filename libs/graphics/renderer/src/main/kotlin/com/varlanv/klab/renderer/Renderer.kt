package com.varlanv.klab.renderer

import com.varlanv.klab.Io
import com.varlanv.klab.sdl3.Sdl3
import com.varlanv.klab.sdl3.Sdl3Event
import com.varlanv.klab.sdl3.Sdl3GpuSwapchain
import com.varlanv.klab.sdl3.Sdl3Window
import java.lang.foreign.SegmentAllocator
import kotlin.math.ceil

private const val NANOS_IN_SECOND = 1_000_000_000.0

class Renderer private constructor() {

    context(io: Io)
    fun start(
        gpa: SegmentAllocator,
        title: String
    ) {
        Sdl3.init(gpa).use { sdl ->
            sdl.createGpuDevice().use { device ->
                sdl.createWindow(title, 1280, 720).use { window ->
                    device.claimWindow(window).use { swapchain ->
                        renderLoop(sdl, window, swapchain)
                    }
                }
            }
        }
    }

    context(io: Io)
    private fun renderLoop(sdl: Sdl3, window: Sdl3Window, swapchain: Sdl3GpuSwapchain) {
        val refreshRate = window.currentDisplayRefreshRate().let {
            if (it > 0.0) it else 60.0
        }
        io.debug { "Resolved refresh rate - [ $refreshRate ]" }
        while (true) {
            val frameStart = sdl.ticksNs()
            assert(frameStart > 0)
            while (true) {
                when (sdl.pollEvent() ?: break) {
                    Sdl3Event.Quit, Sdl3Event.WindowCloseRequested -> return
                    Sdl3Event.Other -> Unit
                }
            }

            val frameRate = minOf(refreshRate, 120.0)
            val frameDuration = ceil(NANOS_IN_SECOND / frameRate).toLong()

            swapchain.clear(red = 1f, green = 1f, blue = 1f)
            sdl.delayPrecise(frameDuration - (sdl.ticksNs() - frameStart))
        }
    }

    companion object {
        fun create(): Renderer = Renderer()
    }
}
