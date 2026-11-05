package com.varlanv.klab.platform

import com.varlanv.klab.Std
import com.varlanv.klab.TracedCloseable
import com.varlanv.klab.sdl3.Sdl3GpuDevice
import com.varlanv.klab.sdl3.Sdl3GpuSwapchain
import com.varlanv.klab.sdl3.Sdl3Input
import com.varlanv.klab.sdl3.Sdl3Ttf

/** Owns platform resources. Close renderers before closing the platform. */
interface Platform : TracedCloseable {
    val device: Sdl3GpuDevice
    val swapchain: Sdl3GpuSwapchain
    val ttf: Sdl3Ttf
    val input: Sdl3Input
    val assets: Assets
    var mouseCaptured: Boolean

    fun pollEvents(): Boolean

    fun ticksNs(): Long

    context(std: Std)
    fun waitForNextFrame(frameStart: Long)
}
