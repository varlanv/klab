package com.varlanv.klab

import com.varlanv.klab.glb.GltfLoader
import com.varlanv.klab.gpu.assets.Assets
import com.varlanv.klab.log.Log
import com.varlanv.klab.mem.NativeAllocator
import com.varlanv.klab.platform.Platform
import com.varlanv.klab.platform.PlatformImpl
import com.varlanv.klab.renderer.FlyCameraController
import com.varlanv.klab.renderer.FpsOverlay
import com.varlanv.klab.renderer.GpuModel
import com.varlanv.klab.renderer.Renderer

class App private constructor(
    private val std: Std,
    private val platform: Platform,
    private val renderer: Renderer,
    private val fps: FpsOverlay,
    private val duck: GpuModel,
) : AutoCloseable {
    class Init(val mode: RunMode, val log: Log)

    private val camera = FlyCameraController(camera = renderer.camera)
    private var previousFrame = platform.ticksNs()
    private var closed = false

    fun frame(gpa: NativeAllocator): Boolean {
        check(!closed) { "App is closed" }
        if (!platform.pollEvents()) {
            return false
        }
        val frameStart = platform.ticksNs()
        val deltaSeconds = ((frameStart - previousFrame) / 1_000_000_000.0).toFloat()
        previousFrame = frameStart
        fps.update(frameStart)
        for (row in 0 until 20) {
            for (column in 0 until 20) {
                val shade = if ((row + column) % 2 == 0) {
                    0.38f
                } else {
                    0.5f
                }
                renderer.drawPlane(
                    x = column * 2f - 19f,
                    y = -1f,
                    z = row * 2f - 19f,
                    width = 2f,
                    length = 2f,
                    red = shade,
                    green = shade,
                    blue = shade,
                )
            }
        }
        renderer.drawCube(
            x = 0.6f,
            y = 0f,
            z = 0f,
            width = 2f,
            height = 2f,
            length = 2f,
            red = 0.2f,
            green = 0.45f,
            blue = 0.85f,
            fill = true,
        )
        renderer.drawModel(model = duck, x = -2f, y = -1.1f, z = 0f)
        renderer.drawRectangle(
            x = 360f,
            y = 310f,
            width = 160f,
            height = 100f,
            red = 0.9f,
            green = 0.3f,
            blue = 0.2f,
            alpha = 0.8f,
            fill = true,
        )
        platform.input.update(gpa)
        if (platform.mouseCaptured) {
            camera.update(input = platform.input, deltaSeconds = deltaSeconds)
        }
        if (renderer.renderFrame(gpa)) {
            fps.framePresented()
        }
        context(std) {
            platform.waitForNextFrame(frameStart)
        }
        return true
    }

    override fun close() {
        if (closed) {
            return
        }
        closed = true
        try {
            renderer.close()
        } finally {
            context(std) {
                platform.close()
            }
        }
    }

    companion object {
        fun create(gpa: NativeAllocator, init: Init): App {
            val std = Std(init.log)
            context(std) {
                val platform = PlatformImpl.create(
                    gpa = gpa,
                    title = gpa.allocateFrom("klab"),
                )
                var renderer: Renderer? = null
                try {
                    val createdRenderer = Renderer.create(
                        gpa = gpa,
                        device = platform.device,
                        swapchain = platform.swapchain,
                        ttf = platform.ttf,
                    )
                    renderer = createdRenderer
                    val duck = loadDuck(gpa = gpa, assets = platform.assets)
                    val fontData = checkNotNull(
                        App::class.java.getResourceAsStream("/fonts/LiberationMono-Regular.ttf"),
                    ).use { it.readAllBytes() }
                    val font = createdRenderer.openFont(gpa = gpa, data = fontData, pointSize = 20f)
                    val text = createdRenderer.text.createText(font = font, text = "FPS: --")
                    text.setPosition(x = 16f, y = 16f)
                    return App(
                        std = std,
                        platform = platform,
                        renderer = createdRenderer,
                        fps = FpsOverlay(text),
                        duck = duck,
                    )
                } catch (failure: Throwable) {
                    try {
                        renderer?.close()
                    } catch (closeFailure: Throwable) {
                        failure.addSuppressed(closeFailure)
                    } finally {
                        platform.close()
                    }
                    throw failure
                }
            }
        }

        context(std: Std)
        private fun loadDuck(gpa: NativeAllocator, assets: Assets): GpuModel {
            val data = checkNotNull(App::class.java.getResourceAsStream("/assets/models/duck/Duck.glb"))
                .use { it.readAllBytes() }
            return assets.uploadModel(
                gpa = gpa,
                source = GltfLoader().load(data),
            )
        }
    }
}
