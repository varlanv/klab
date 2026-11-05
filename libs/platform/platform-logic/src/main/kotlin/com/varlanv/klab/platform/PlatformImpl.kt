package com.varlanv.klab.platform

import com.varlanv.klab.Std
import com.varlanv.klab.mem.NativeAllocator
import com.varlanv.klab.sdl3.*
import java.lang.foreign.MemorySegment
import kotlin.math.ceil

private const val NANOS_IN_SECOND = 1_000_000_000.0

class PlatformImpl private constructor(
    private val sdl: Sdl3,
    private val window: Sdl3Window,
    override val device: Sdl3GpuDevice,
    override val swapchain: Sdl3GpuSwapchain,
    override val ttf: Sdl3Ttf,
    override val input: Sdl3Input,
    override val assets: Assets,
    private val resources: List<AutoCloseable>,
) : Platform {

    private var closed = false
    private var previousRefreshRate = 0.0

    override var mouseCaptured: Boolean
        get() {
            checkOpen()
            return window.relativeMouseMode && window.hasInputFocus
        }
        set(value) {
            checkOpen()
            if (window.relativeMouseMode != value) {
                window.setRelativeMouseMode(value)
                input.discardMouseMotion()
            }
        }

    override fun pollEvents(): Boolean {
        checkOpen()
        while (true) {
            when (sdl.pollEvent() ?: return true) {
                Sdl3Event.Quit, Sdl3Event.WindowCloseRequested -> return false
                Sdl3Event.EscapePressed, Sdl3Event.WindowFocusLost -> mouseCaptured = false
                Sdl3Event.LeftMousePressed -> if (window.hasInputFocus) mouseCaptured = true
                Sdl3Event.WindowFocusGained, Sdl3Event.Other -> Unit
            }
        }
    }

    override fun ticksNs(): Long {
        checkOpen()
        return sdl.ticksNs()
    }

    context(std: Std)
    override fun waitForNextFrame(frameStart: Long) {
        checkOpen()
        val refreshRate = window.currentDisplayRefreshRate().let { if (it > 0.0) it else 60.0 }
        if (refreshRate != previousRefreshRate) {
            std.debug { "Resolved refresh rate - [ $refreshRate ]" }
            previousRefreshRate = refreshRate
        }
        val duration = ceil(NANOS_IN_SECOND / minOf(refreshRate, 120.0)).toLong()
        sdl.delayPrecise(duration - (sdl.ticksNs() - frameStart))
    }

    context(std: Std)
    override fun close() {
        if (closed) return
        closed = true
        try {
            assets.close()
        } finally {
            for (index in resources.indices.reversed()) {
                try {
                    resources[index].close()
                } catch (failure: Throwable) {
                    std.debug { "Failed to close platform resource: ${failure.stackTraceToString()}" }
                }
            }
        }
    }

    private fun checkOpen() {
        assert(!closed) { "Platform is closed" }
    }

    companion object {
        fun create(gpa: NativeAllocator, title: MemorySegment): PlatformImpl {
            val resources = ArrayList<AutoCloseable>()
            try {
                val sdl = Sdl3.init(gpa).also { resources.add(it) }
                val device = sdl.createGpuDevice().also { resources.add(it) }
                val window = sdl.createWindow(title, width = 1280, height = 720).also { resources.add(it) }
                val swapchain = device.claimWindow(window).also { resources.add(it) }
                val ttf = Sdl3Ttf.init().also { resources.add(it) }
                val input = sdl.createInput(gpa)
                window.setRelativeMouseMode(true)
                input.discardMouseMotion()
                return PlatformImpl(
                    sdl = sdl, window = window, device = device, swapchain = swapchain,
                    ttf = ttf, input = input, assets = AssetsImpl(device), resources = resources,
                )
            } catch (failure: Throwable) {
                for (index in resources.indices.reversed()) {
                    try {
                        resources[index].close()
                    } catch (closeFailure: Throwable) {
                        failure.addSuppressed(closeFailure)
                    }
                }
                throw failure
            }
        }
    }
}
