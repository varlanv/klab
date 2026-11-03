package com.varlanv.klab.renderer

import com.varlanv.klab.Io
import com.varlanv.klab.collections.Bytes
import com.varlanv.klab.sdl3.*
import java.lang.foreign.SegmentAllocator
import kotlin.math.ceil

private const val NANOS_IN_SECOND = 1_000_000_000.0

class Renderer private constructor(
    private val sdl: Sdl3,
    private val device: Sdl3GpuDevice,
    private val window: Sdl3Window,
    private val swapchain: Sdl3GpuSwapchain,
    private val ttf: Sdl3Ttf,
    val text: TextRenderer,
) : AutoCloseable {

    private val fonts = ArrayList<Sdl3Font>()
    private var closed = false
    private var previousRefreshRate = 0.0

    context(gpa: SegmentAllocator)
    fun openFont(data: Bytes, pointSize: Float): Sdl3Font {
        checkOpen()
        val font = ttf.openFont(data = data, pointSize = pointSize)
        fonts.add(font)
        return font
    }

    fun pollEvents(): Boolean {
        checkOpen()
        while (true) {
            when (sdl.pollEvent() ?: return true) {
                Sdl3Event.Quit, Sdl3Event.WindowCloseRequested -> return false
                Sdl3Event.Other -> Unit
            }
        }
    }

    fun ticksNs(): Long {
        checkOpen()
        return sdl.ticksNs()
    }

    context(gpa: SegmentAllocator)
    fun renderFrame(): Boolean {
        checkOpen()
        text.prepare()
        device.acquireCommandBuffer().use { command ->
            text.upload(command)
            val frame = swapchain.acquireFrame(command)
            if (frame != null) {
                frame.beginRenderPass(r = 1f, g = 1f, b = 1f).use { pass ->
                    text.draw(pass)
                }
            }
            command.submit()
            text.commitUploads()
            return frame != null
        }
    }

    context(io: Io)
    fun waitForNextFrame(frameStart: Long) {
        checkOpen()
        val refreshRate = window.currentDisplayRefreshRate().let { if (it > 0.0) it else 60.0 }
        if (refreshRate != previousRefreshRate) {
            io.debug { "Resolved refresh rate - [ $refreshRate ]" }
            previousRefreshRate = refreshRate
        }
        val duration = ceil(NANOS_IN_SECOND / minOf(refreshRate, 120.0)).toLong()
        sdl.delayPrecise(duration - (sdl.ticksNs() - frameStart))
    }

    private fun checkOpen() {
        check(!closed) { "Renderer is closed" }
    }

    override fun close() {
        if (!closed) {
            closed = true
            val resources = ArrayList<AutoCloseable>()
            resources.add(text)
            resources.addAll(fonts.asReversed())
            resources.addAll(listOf(ttf, swapchain, window, device, sdl))
            closeResources(resources)
        }
    }

    companion object {
        context(gpa: SegmentAllocator)
        fun create(title: String): Renderer {
            val sdl = Sdl3.init()
            var device: Sdl3GpuDevice? = null
            var window: Sdl3Window? = null
            var swapchain: Sdl3GpuSwapchain? = null
            var ttf: Sdl3Ttf? = null
            var text: TextRenderer? = null
            try {
                device = sdl.createGpuDevice()
                window = sdl.createWindow(title = title, width = 1280, height = 720)
                swapchain = device.claimWindow(window)
                ttf = Sdl3Ttf.init()
                text = TextRenderer.create(
                    device = device,
                    targetFormat = swapchain.textureFormat,
                    shader = resource("/shaders/shaders-primitive/text.spv"),
                )
                return Renderer(sdl = sdl, device = device, window = window, swapchain = swapchain, ttf = ttf, text = text)
            } catch (failure: Throwable) {
                closeResources(resources = listOfNotNull(text, ttf, swapchain, window, device, sdl), cause = failure)
                throw failure
            }
        }

        private fun resource(path: String): Bytes {
            return checkNotNull(Renderer::class.java.getResourceAsStream(path)) { "Missing renderer resource: $path" }
                .use { it.readAllBytes() }
        }
    }
}

private fun closeResources(resources: List<AutoCloseable>, cause: Throwable? = null) {
    var failure = cause
    for (resource in resources) {
        try {
            resource.close()
        } catch (error: Throwable) {
            if (failure == null) failure = error else failure.addSuppressed(error)
        }
    }
    if (failure != null) throw failure
}
