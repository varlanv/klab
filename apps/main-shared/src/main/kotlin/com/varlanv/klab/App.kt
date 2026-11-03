package com.varlanv.klab

import com.varlanv.klab.log.Log
import com.varlanv.klab.renderer.FpsOverlay
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
        while (renderer.pollEvents()) {
            val frameStart = renderer.ticksNs()
            fps.update(frameStart)
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
