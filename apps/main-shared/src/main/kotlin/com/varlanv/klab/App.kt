package com.varlanv.klab

import com.varlanv.klab.log.Log
import com.varlanv.klab.renderer.FpsOverlay
import com.varlanv.klab.renderer.FlyCameraController
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
                    Renderer.create(title = "klab").use { renderer ->
                        val fontData = checkNotNull(App::class.java.getResourceAsStream("/fonts/LiberationMono-Regular.ttf"))
                            .use { it.readAllBytes() }
                        renderer.openFont(data = fontData, pointSize = 20f).use { font ->
                            renderer.text.createText(font = font, text = "FPS: --").use { text ->
                                text.setPosition(x = 16f, y = 16f)
                                runLoop(renderer = renderer, fps = FpsOverlay(text))
                            }
                        }
                    }
                }
            }
        }
    }

    context(io: Io)
    private fun runLoop(renderer: Renderer, fps: FpsOverlay) {
        val camera = FlyCameraController(renderer.camera)
        var previousFrame = renderer.ticksNs()
        while (renderer.pollEvents()) {
            val frameStart = renderer.ticksNs()
            val deltaSeconds = ((frameStart - previousFrame) / 1_000_000_000.0).toFloat()
            previousFrame = frameStart
            fps.update(frameStart)
            for (row in 0 until 20) {
                for (column in 0 until 20) {
                    val shade = if ((row + column) % 2 == 0) 0.38f else 0.5f
                    renderer.drawPlane(
                        x = column * 2f - 19f, y = -1f, z = row * 2f - 19f,
                        width = 2f, length = 2f,
                        red = shade, green = shade, blue = shade,
                    )
                }
            }
            renderer.drawCube(
                x = 0.6f, y = 0f, z = 0f,
                width = 2f, height = 2f, length = 2f,
                red = 0.2f, green = 0.45f, blue = 0.85f,
                fill = true,
            )
            renderer.drawRectangle(
                x = 360f, y = 310f, width = 160f, height = 100f,
                red = 0.9f, green = 0.3f, blue = 0.2f, alpha = 0.8f,
                fill = true,
            )
            val presented = Arena.ofConfined().use { scratch ->
                context(scratch) {
                    renderer.input.update()
                    if (renderer.mouseCaptured) {
                        camera.update(input = renderer.input, deltaSeconds = deltaSeconds)
                    }
                    renderer.renderFrame()
                }
            }
            if (presented) fps.framePresented()
            renderer.waitForNextFrame(frameStart)
        }
    }

    companion object {
        fun create(init: Init): App {
            return App(init)
        }
    }
}
