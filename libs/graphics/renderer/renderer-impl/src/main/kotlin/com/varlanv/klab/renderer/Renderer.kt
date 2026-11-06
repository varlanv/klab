@file:Suppress("NOTHING_TO_INLINE")

package com.varlanv.klab.renderer

import com.varlanv.klab.collections.Bytes
import com.varlanv.klab.mem.NativeAllocator
import com.varlanv.klab.sdl3.*

/** Borrows the device, swapchain, and TTF runtime; owns its drawing resources and fonts. */
class Renderer private constructor(
    private val device: Sdl3GpuDevice,
    private val swapchain: Sdl3GpuSwapchain,
    private val ttf: Sdl3Ttf,
    val text: TextRenderer,
    private val primitives: PrimitiveRenderer,
    private val models: ModelRenderer,
    val camera: Camera3D,
) : AutoCloseable {
    private val fonts = ArrayList<Sdl3Font>()
    private var closed = false
    private var depth: Sdl3GpuDepthTexture? = null

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
            x = x,
            y = y,
            width = width,
            height = height,
            red = red,
            green = green,
            blue = blue,
            alpha = alpha,
            fill = fill,
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
            x = x,
            y = y,
            z = z,
            width = width,
            height = height,
            length = length,
            red = red,
            green = green,
            blue = blue,
            alpha = alpha,
            fill = fill,
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
            x = x,
            y = y,
            z = z,
            width = width,
            length = length,
            red = red,
            green = green,
            blue = blue,
            alpha = alpha,
        )
    }

    fun drawModel(
        model: GpuModel,
        x: Float,
        y: Float,
        z: Float,
        scale: Float = 1f,
    ) {
        checkOpen()
        models.draw(model = model, x = x, y = y, z = z, scale = scale)
    }

    fun openFont(
        gpa: NativeAllocator,
        data: Bytes,
        pointSize: Float,
    ): Sdl3Font {
        checkOpen()
        val font = ttf.openFont(gpa = gpa, data = data, pointSize = pointSize)
        fonts.add(font)
        return font
    }

    fun renderFrame(gpa: NativeAllocator): Boolean {
        checkOpen()
        try {
            text.prepare(gpa)
            device.acquireCommandBuffer().use { command ->
                text.upload(gpa = gpa, command = command)
                primitives.upload(gpa = gpa, command = command)
                val frame = swapchain.acquireFrame(gpa = gpa, command = command)
                if (frame != null) {
                    val world = primitives.hasWorldGeometry || models.hasGeometry
                    if (world) {
                        val target = depth
                        if (target == null || target.width != frame.width || target.height != frame.height) {
                            val replacement = device.createDepthTexture(
                                gpa = gpa,
                                width = frame.width,
                                height = frame.height,
                            )
                            target?.close()
                            depth = replacement
                        }
                        frame
                            .beginRenderPass(
                                gpa = gpa,
                                r = 1f,
                                g = 1f,
                                b = 1f,
                                depth = checkNotNull(depth),
                            )
                            .use { pass ->
                                primitives.drawWorld(gpa = gpa, pass = pass)
                                models.render(gpa = gpa, pass = pass)
                            }
                    }
                    frame.beginRenderPass(gpa = gpa, r = 1f, g = 1f, b = 1f, clear = !world).use { pass ->
                        primitives.drawRectangles(gpa = gpa, pass = pass)
                        text.draw(gpa = gpa, pass = pass)
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

    override fun close() {
        if (!closed) {
            closed = true
            val resources = ArrayList<AutoCloseable>()
            resources.add(models)
            resources.add(primitives)
            depth?.let { resources.add(it) }
            resources.add(text)
            resources.addAll(fonts.asReversed())
            closeResources(resources = resources)
        }
    }

    private inline fun checkOpen() {
        assert(!closed) { "Renderer is closed" }
    }

    companion object {
        fun create(
            gpa: NativeAllocator,
            device: Sdl3GpuDevice,
            swapchain: Sdl3GpuSwapchain,
            ttf: Sdl3Ttf,
        ): Renderer {
            var text: TextRenderer? = null
            var primitives: PrimitiveRenderer? = null
            var models: ModelRenderer? = null
            try {
                val camera = Camera3D()
                text = TextRenderer.create(
                    gpa = gpa,
                    device = device,
                    targetFormat = swapchain.textureFormat,
                    shader = resource("/shaders/shaders-primitive/text.spv"),
                )
                primitives = PrimitiveRenderer.create(
                    gpa = gpa,
                    device = device,
                    targetFormat = swapchain.textureFormat,
                    depthFormat = device.depthTextureFormat,
                    shader = resource("/shaders/shaders-primitive/primitive.spv"),
                    camera = camera,
                )
                models = ModelRenderer.create(
                    gpa = gpa,
                    device = device,
                    targetFormat = swapchain.textureFormat,
                    depthFormat = device.depthTextureFormat,
                    shader = resource("/shaders/shaders-primitive/model.spv"),
                    camera = camera,
                )
                return Renderer(
                    device = device,
                    swapchain = swapchain,
                    ttf = ttf,
                    text = text,
                    primitives = primitives,
                    models = models,
                    camera = camera,
                )
            } catch (failure: Throwable) {
                closeResources(
                    resources = listOfNotNull(
                        models,
                        primitives,
                        text,
                    ),
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

internal fun closeResources(
    resources: List<AutoCloseable>,
    cause: Throwable? = null,
) {
    var failure = cause
    for (resource in resources) {
        try {
            resource.close()
        } catch (error: Throwable) {
            if (failure == null) {
                failure = error
            } else {
                failure.addSuppressed(error)
            }
        }
    }
    if (failure != null) {
        throw failure
    }
}
