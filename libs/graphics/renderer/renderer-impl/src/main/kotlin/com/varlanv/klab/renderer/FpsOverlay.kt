package com.varlanv.klab.renderer

import kotlin.math.roundToInt

private const val NANOS_IN_SECOND = 1_000_000_000.0
private const val FPS_UPDATE_INTERVAL = 500_000_000L

class FpsOverlay(private val text: Text) {
    private var sampleStart = 0L
    private var started = false
    private var frameCount = 0

    fun update(now: Long) {
        if (!started) {
            sampleStart = now
            started = true
            return
        }
        val elapsed = now - sampleStart
        check(elapsed >= 0L)
        if (elapsed >= FPS_UPDATE_INTERVAL) {
            val fps = (frameCount * NANOS_IN_SECOND / elapsed).roundToInt()
            text.setText("FPS: $fps")
            sampleStart = now
            frameCount = 0
        }
    }

    fun framePresented() {
        frameCount++
    }
}
