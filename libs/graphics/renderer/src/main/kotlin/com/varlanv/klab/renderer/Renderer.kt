package com.varlanv.klab.renderer

import com.varlanv.klab.Io
import com.varlanv.klab.collections.Bytes
import com.varlanv.klab.glb.GlbModel
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
    private val primitives: PrimitiveRenderer,
    private val models: ModelRenderer,
    val camera: Camera3D,
    val input: Sdl3Input,
) : AutoCloseable {

    private val fonts = ArrayList<Sdl3Font>()
    private var closed = false
    private var previousRefreshRate = 0.0
    private var depth: Sdl3GpuDepthTexture? = null

    var mouseCaptured: Boolean
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

    fun drawRectangle(
        x: Float,
        y: Float,
        width: Float,
        height: Float,
        red: Float,
        green: Float,
        blue: Float,
        alpha: Float = 1f,
        fill: Boolean = true,
    ) {
        checkOpen()
        primitives.drawRectangle(
            x = x, y = y, width = width, height = height,
            red = red, green = green, blue = blue, alpha = alpha, fill = fill,
        )
    }

    fun drawCube(
        x: Float,
        y: Float,
        z: Float,
        width: Float,
        height: Float,
        length: Float,
        red: Float,
        green: Float,
        blue: Float,
        alpha: Float = 1f,
        fill: Boolean = true,
    ) {
        checkOpen()
        primitives.drawCube(
            x = x, y = y, z = z, width = width, height = height, length = length,
            red = red, green = green, blue = blue, alpha = alpha, fill = fill,
        )
    }

    fun drawPlane(
        x: Float,
        y: Float,
        z: Float,
        width: Float,
        length: Float,
        red: Float,
        green: Float,
        blue: Float,
        alpha: Float = 1f,
    ) {
        checkOpen()
        primitives.drawPlane(
            x = x, y = y, z = z, width = width, length = length,
            red = red, green = green, blue = blue, alpha = alpha,
        )
    }

    context(gpa: SegmentAllocator)
    fun uploadModel(source: GlbModel): GpuModel {
        checkOpen()
        return models.upload(source)
    }

    fun drawModel(model: GpuModel, x: Float, y: Float, z: Float, scale: Float = 1f) {
        checkOpen()
        models.draw(model = model, x = x, y = y, z = z, scale = scale)
    }

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
                Sdl3Event.EscapePressed, Sdl3Event.WindowFocusLost -> mouseCaptured = false
                Sdl3Event.LeftMousePressed -> if (window.hasInputFocus) mouseCaptured = true
                Sdl3Event.WindowFocusGained, Sdl3Event.Other -> Unit
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
        try {
            text.prepare()
            device.acquireCommandBuffer().use { command ->
                text.upload(command)
                primitives.upload(command)
                val frame = swapchain.acquireFrame(command)
                if (frame != null) {
                    val world = primitives.hasWorldGeometry || models.hasGeometry
                    if (world) {
                        val target = depth
                        if (target == null || target.width != frame.width || target.height != frame.height) {
                            val replacement = device.createDepthTexture(width = frame.width, height = frame.height)
                            target?.close()
                            depth = replacement
                        }
                        frame.beginRenderPass(r = 1f, g = 1f, b = 1f, depth = checkNotNull(depth)).use { pass ->
                            primitives.drawWorld(pass)
                            models.render(pass)
                        }
                    }
                    frame.beginRenderPass(r = 1f, g = 1f, b = 1f, clear = !world).use { pass ->
                        primitives.drawRectangles(pass)
                        text.draw(pass)
                    }
                }
                command.submit()
                text.commitUploads()
                return frame != null
            }
        } finally {
            primitives.clear()
            models.clear()
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
            resources.add(models)
            resources.add(primitives)
            depth?.let { resources.add(it) }
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
            var primitives: PrimitiveRenderer? = null
            var models: ModelRenderer? = null
            try {
                device = sdl.createGpuDevice()
                val input = sdl.createInput()
                val camera = Camera3D()
                window = sdl.createWindow(title = title, width = 1280, height = 720)
                swapchain = device.claimWindow(window)
                ttf = Sdl3Ttf.init()
                text = TextRenderer.create(
                    device = device,
                    targetFormat = swapchain.textureFormat,
                    shader = resource("/shaders/shaders-primitive/text.spv"),
                )
                primitives = PrimitiveRenderer.create(
                    device = device,
                    targetFormat = swapchain.textureFormat,
                    depthFormat = device.depthTextureFormat,
                    shader = resource("/shaders/shaders-primitive/primitive.spv"),
                    camera = camera,
                )
                models = ModelRenderer.create(
                    device = device,
                    targetFormat = swapchain.textureFormat,
                    depthFormat = device.depthTextureFormat,
                    shader = resource("/shaders/shaders-primitive/model.spv"),
                    camera = camera,
                )
                window.setRelativeMouseMode(true)
                input.discardMouseMotion()
                return Renderer(
                    sdl = sdl, device = device, window = window, swapchain = swapchain,
                    ttf = ttf, text = text, primitives = primitives, models = models, camera = camera, input = input,
                )
            } catch (failure: Throwable) {
                closeResources(
                    resources = listOfNotNull(models, primitives, text, ttf, swapchain, window, device, sdl),
                    cause = failure,
                )
                throw failure
            }
        }

        private fun resource(path: String): Bytes {
            return checkNotNull(Renderer::class.java.getResourceAsStream(path)) { "Missing renderer resource: $path" }
                .use { it.readAllBytes() }
        }
    }
}

internal fun closeResources(resources: List<AutoCloseable>, cause: Throwable? = null) {
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
