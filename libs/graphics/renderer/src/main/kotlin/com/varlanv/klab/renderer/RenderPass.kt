package com.varlanv.klab.renderer

import com.varlanv.klab.sdl3.Sdl3GpuSwapchain
import com.varlanv.klab.sdl3.Sdl3GpuText
import java.lang.foreign.SegmentAllocator
import kotlin.math.roundToInt
import kotlin.time.Duration.Companion.milliseconds

private const val NANOS_IN_SECOND = 1_000_000_000.0
private val FPS_UPDATE_INTERVAL = 500.milliseconds

class RenderPass(private val fpsText: Sdl3GpuText, private val swapchain: Sdl3GpuSwapchain) {

    private var sampleStart: Long = 0
    private var frameCount: Int = 0
    internal var frameStart: Long = 0

    context(gpa: SegmentAllocator)
    fun drawFps() {
        val elapsed = frameStart - sampleStart
        if (elapsed >= FPS_UPDATE_INTERVAL.inWholeNanoseconds) {
            val fps = (frameCount * NANOS_IN_SECOND / elapsed).roundToInt()
            fpsText.setText(fps.toString())
            sampleStart = frameStart
            frameCount = 0
        }
        if (swapchain.render(r = 1f, g = 1f, b = 1f, text = fpsText)) {
            frameCount++
        }
    }
}
