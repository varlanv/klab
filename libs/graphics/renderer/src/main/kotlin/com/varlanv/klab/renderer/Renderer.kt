package com.varlanv.klab.renderer

import com.varlanv.klab.Io
import com.varlanv.klab.collections.Bytes
import com.varlanv.klab.sdl3.*
import java.lang.foreign.SegmentAllocator
import kotlin.math.ceil

private const val NANOS_IN_SECOND = 1_000_000_000.0
private const val POINT_SIZE = 20f

class Renderer private constructor() {

    context(gpa: SegmentAllocator, io: Io)
    fun start(title: String) {
        Sdl3.init(gpa).use { sdl ->
            sdl.createGpuDevice().use { device ->
                sdl.createWindow(title, 1280, 720).use { window ->
                    device.claimWindow(window).use { swapchain ->
                        Sdl3Ttf.init().use { ttf ->
                            ttf.openFont(
                                gpa = gpa,
                                data = resource("/fonts/LiberationMono-Regular.ttf"),
                                pointSize = POINT_SIZE,
                            ).use { font ->
                                swapchain.createTextEngine(resource("/shaders/shaders-primitive/text.spv"))
                                    .use { engine ->
                                        engine.createText(font = font, text = "FPS: --").use { fpsText ->
                                            fpsText.setPosition(x = 16f, y = 16f)
                                            renderLoop(
                                                sdl = sdl,
                                                window = window,
                                                swapchain = swapchain,
                                                fpsText = fpsText
                                            )
                                        }
                                    }
                            }
                        }
                    }
                }
            }
        }
    }

    context(gpa: SegmentAllocator, io: Io)
    private fun renderLoop(sdl: Sdl3, window: Sdl3Window, swapchain: Sdl3GpuSwapchain, fpsText: Sdl3GpuText) {
        val refreshRate = window.currentDisplayRefreshRate().let {
            if (it > 0.0) it else 60.0
        }
        io.debug { "Resolved refresh rate - [ $refreshRate ]" }
        val renderPass = RenderPass(fpsText = fpsText, swapchain = swapchain)
        while (true) {
            renderPass.frameStart = sdl.ticksNs()
            assert(renderPass.frameStart > 0)
            while (true) {
                when (sdl.pollEvent() ?: break) {
                    Sdl3Event.Quit, Sdl3Event.WindowCloseRequested -> return
                    Sdl3Event.Other -> Unit
                }
            }
            renderPass.drawFps()
            val frameRate = minOf(refreshRate, 120.0)
            val frameDuration = ceil(NANOS_IN_SECOND / frameRate).toLong()
            sdl.delayPrecise(frameDuration - (sdl.ticksNs() - renderPass.frameStart))
        }
    }


    private fun resource(path: String): Bytes {
        return checkNotNull(Renderer::class.java.getResourceAsStream(path)) { "Missing renderer resource: $path" }
            .use { it.readAllBytes() }
    }

    companion object {
        fun create(): Renderer = Renderer()
    }
}
