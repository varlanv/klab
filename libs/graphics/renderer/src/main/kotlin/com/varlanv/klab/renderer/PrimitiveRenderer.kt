package com.varlanv.klab.renderer

import com.varlanv.klab.collections.*
import com.varlanv.klab.sdl3.*
import java.lang.foreign.MemorySegment
import java.lang.foreign.SegmentAllocator

private const val WORLD_FILL = 0
private const val WORLD_WIRE = 1
private const val RECTANGLE_FILL = 2
private const val RECTANGLE_WIRE = 3
private const val VERTEX_FLOATS = 7
private const val VERTEX_BYTES = VERTEX_FLOATS * 4

private val cubeFaces: Ints = intArrayOf(
    0, 4, 6, 2, 1, 3, 7, 5,
    0, 1, 5, 4, 2, 6, 7, 3,
    0, 2, 3, 1, 4, 5, 7, 6,
)
private val cubeEdges: Ints = intArrayOf(
    0, 1, 2, 3, 4, 5, 6, 7,
    0, 2, 1, 3, 4, 6, 5, 7,
    0, 4, 1, 5, 2, 6, 3, 7,
)
private val primitiveAttributes = listOf(
    Sdl3GpuVertexAttribute(location = 0, offset = 0, format = Sdl3GpuVertexFormat.Float3),
    Sdl3GpuVertexAttribute(location = 1, offset = 12, format = Sdl3GpuVertexFormat.Float4),
)

internal class PrimitiveRenderer private constructor(
    device: Sdl3GpuDevice,
    private val worldFill: Sdl3GpuGraphicsPipeline,
    private val worldWire: Sdl3GpuGraphicsPipeline,
    private val rectangleFill: Sdl3GpuGraphicsPipeline,
    private val rectangleWire: Sdl3GpuGraphicsPipeline,
    private val camera: Camera3D,
) : AutoCloseable {

    private val mesh = MeshBuffers(device)
    private var vertices: MutFloats = stableEmptyMutFloats
    private var indices: MutInts = stableEmptyMutInts
    private var kinds: MutInts = stableEmptyMutInts
    private var firstIndices: MutInts = stableEmptyMutInts
    private var indexCounts: MutInts = stableEmptyMutInts
    private var vertexCount = 0
    private var indexCount = 0
    private var commandCount = 0
    private var uploaded = false
    private var closed = false

    var hasWorldGeometry = false
        private set
    var hasRectangles = false
        private set

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
        checkCanEnqueue()
        require(x.isFinite() && y.isFinite())
        require(width.isFinite() && height.isFinite() && width > 0f && height > 0f)
        require(red >= 0f && red <= 1f && green >= 0f && green <= 1f)
        require(blue >= 0f && blue <= 1f && alpha >= 0f && alpha <= 1f)
        val right = x + width
        val bottom = y + height
        require(right.isFinite() && bottom.isFinite())
        if (alpha == 0f) return
        reserve(addVertices = 4, addIndices = if (fill) 6 else 8)
        val base = vertexCount
        val firstIndex = indexCount
        vertex(x = x, y = y, z = 0f, red = red, green = green, blue = blue, alpha = alpha)
        vertex(x = right, y = y, z = 0f, red = red, green = green, blue = blue, alpha = alpha)
        vertex(x = right, y = bottom, z = 0f, red = red, green = green, blue = blue, alpha = alpha)
        vertex(x = x, y = bottom, z = 0f, red = red, green = green, blue = blue, alpha = alpha)
        if (fill) {
            quad(base)
        } else {
            for (corner in 0..3) {
                indices[indexCount++] = base + corner
                indices[indexCount++] = base + (corner + 1) % 4
            }
        }
        record(kind = if (fill) RECTANGLE_FILL else RECTANGLE_WIRE, firstIndex = firstIndex)
        hasRectangles = true
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
        checkCanEnqueue()
        require(x.isFinite() && y.isFinite() && z.isFinite())
        require(width.isFinite() && height.isFinite() && length.isFinite())
        require(width > 0f && height > 0f && length > 0f)
        require(red >= 0f && red <= 1f && green >= 0f && green <= 1f)
        require(blue >= 0f && blue <= 1f && alpha >= 0f && alpha <= 1f)
        val minX = x - width * 0.5f
        val maxX = x + width * 0.5f
        val minY = y - height * 0.5f
        val maxY = y + height * 0.5f
        val minZ = z - length * 0.5f
        val maxZ = z + length * 0.5f
        require(minX.isFinite() && maxX.isFinite() && minY.isFinite() && maxY.isFinite())
        require(minZ.isFinite() && maxZ.isFinite())
        if (alpha == 0f) return
        reserve(addVertices = if (fill) 24 else 8, addIndices = if (fill) 36 else 24)
        val firstIndex = indexCount
        if (fill) {
            for (face in 0..5) {
                val base = vertexCount
                val brightness = when (face / 2) {
                    0 -> 0.8f
                    1 -> 1f
                    else -> 0.6f
                }
                for (index in 0..3) {
                    val corner = cubeFaces[face * 4 + index]
                    vertex(
                        x = if (corner and 1 == 0) minX else maxX,
                        y = if (corner and 2 == 0) minY else maxY,
                        z = if (corner and 4 == 0) minZ else maxZ,
                        red = red * brightness,
                        green = green * brightness,
                        blue = blue * brightness,
                        alpha = alpha,
                    )
                }
                quad(base)
            }
        } else {
            val base = vertexCount
            for (corner in 0..7) {
                vertex(
                    x = if (corner and 1 == 0) minX else maxX,
                    y = if (corner and 2 == 0) minY else maxY,
                    z = if (corner and 4 == 0) minZ else maxZ,
                    red = red, green = green, blue = blue, alpha = alpha,
                )
            }
            for (index in cubeEdges.indices) indices[indexCount++] = base + cubeEdges[index]
        }
        record(kind = if (fill) WORLD_FILL else WORLD_WIRE, firstIndex = firstIndex)
        hasWorldGeometry = true
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
        checkCanEnqueue()
        require(x.isFinite() && y.isFinite() && z.isFinite())
        require(width.isFinite() && length.isFinite() && width > 0f && length > 0f)
        require(red >= 0f && red <= 1f && green >= 0f && green <= 1f)
        require(blue >= 0f && blue <= 1f && alpha >= 0f && alpha <= 1f)
        val minX = x - width * 0.5f
        val maxX = x + width * 0.5f
        val minZ = z - length * 0.5f
        val maxZ = z + length * 0.5f
        require(minX.isFinite() && maxX.isFinite() && minZ.isFinite() && maxZ.isFinite())
        if (alpha == 0f) return
        reserve(addVertices = 4, addIndices = 6)
        val base = vertexCount
        val firstIndex = indexCount
        vertex(x = minX, y = y, z = minZ, red = red, green = green, blue = blue, alpha = alpha)
        vertex(x = minX, y = y, z = maxZ, red = red, green = green, blue = blue, alpha = alpha)
        vertex(x = maxX, y = y, z = maxZ, red = red, green = green, blue = blue, alpha = alpha)
        vertex(x = maxX, y = y, z = minZ, red = red, green = green, blue = blue, alpha = alpha)
        quad(base)
        record(kind = WORLD_FILL, firstIndex = firstIndex)
        hasWorldGeometry = true
    }

    private fun reserve(addVertices: Int, addIndices: Int) {
        val requiredVertices = Math.addExact(vertexCount, addVertices)
        Math.multiplyExact(requiredVertices, VERTEX_BYTES)
        val requiredFloats = Math.multiplyExact(requiredVertices, VERTEX_FLOATS)
        val requiredIndices = Math.addExact(indexCount, addIndices)
        Math.multiplyExact(requiredIndices, 4)
        if (vertices.size < requiredFloats) {
            vertices = vertices.copyOf(growCapacity(current = vertices.size, required = requiredFloats))
        }
        if (indices.size < requiredIndices) {
            indices = indices.copyOf(growCapacity(current = indices.size, required = requiredIndices))
        }
        if (kinds.size <= commandCount) {
            val capacity = growCapacity(current = kinds.size, required = Math.addExact(commandCount, 1))
            kinds = kinds.copyOf(capacity)
            firstIndices = firstIndices.copyOf(capacity)
            indexCounts = indexCounts.copyOf(capacity)
        }
    }

    private fun vertex(x: Float, y: Float, z: Float, red: Float, green: Float, blue: Float, alpha: Float) {
        val offset = vertexCount * VERTEX_FLOATS
        vertices[offset] = x
        vertices[offset + 1] = y
        vertices[offset + 2] = z
        vertices[offset + 3] = red
        vertices[offset + 4] = green
        vertices[offset + 5] = blue
        vertices[offset + 6] = alpha
        vertexCount++
    }

    private fun quad(base: Int) {
        indices[indexCount++] = base
        indices[indexCount++] = base + 1
        indices[indexCount++] = base + 2
        indices[indexCount++] = base + 2
        indices[indexCount++] = base + 3
        indices[indexCount++] = base
    }

    private fun record(kind: Int, firstIndex: Int) {
        if (commandCount > 0 && kinds[commandCount - 1] == kind) {
            indexCounts[commandCount - 1] += indexCount - firstIndex
        } else {
            kinds[commandCount] = kind
            firstIndices[commandCount] = firstIndex
            indexCounts[commandCount] = indexCount - firstIndex
            commandCount++
        }
    }

    fun upload(gpa: SegmentAllocator, command: Sdl3GpuCommandBuffer) {
        checkOpen()
        check(!uploaded) { "Primitive geometry has already been uploaded" }
        if (indexCount == 0) return
        val vertexBytes = Math.multiplyExact(vertexCount, VERTEX_BYTES)
        val indexBytes = Math.multiplyExact(indexCount, 4)
        val data = mesh.map(gpa = gpa, vertexBytes = vertexBytes, indexBytes = indexBytes)
        try {
            MemorySegment.copy(MemorySegment.ofArray(vertices), 0L, data, 0L, vertexBytes.toLong())
            MemorySegment.copy(MemorySegment.ofArray(indices), 0L, data, mesh.indexOffset.toLong(), indexBytes.toLong())
        } finally {
            mesh.unmap()
        }
        mesh.upload(gpa = gpa, command = command, vertexBytes = vertexBytes, indexBytes = indexBytes)
        uploaded = true
    }

    fun drawWorld(gpa: SegmentAllocator, pass: Sdl3GpuRenderPass) {
        checkOpen()
        if (hasWorldGeometry) drawLayer(gpa = gpa, pass = pass, world = true)
    }

    fun drawRectangles(gpa: SegmentAllocator,pass: Sdl3GpuRenderPass) {
        checkOpen()
        if (hasRectangles) drawLayer(gpa = gpa, pass = pass, world = false)
    }

    private fun drawLayer(gpa: SegmentAllocator, pass: Sdl3GpuRenderPass, world: Boolean) {
        check(uploaded) { "Upload primitive geometry before drawing" }
        val uniforms = gpa.allocate(80, 16).fill(0)
        camera.writeUniforms(destination = uniforms, width = pass.width, height = pass.height)
        pass.pushVertexUniform(slot = 0, data = uniforms)
        mesh.bind(gpa, pass)
        var previousKind = -1
        for (index in 0 until commandCount) {
            val kind = kinds[index]
            if ((kind <= WORLD_WIRE) != world) continue
            if (kind != previousKind) {
                pass.bindPipeline(
                    when (kind) {
                        WORLD_FILL -> worldFill
                        WORLD_WIRE -> worldWire
                        RECTANGLE_FILL -> rectangleFill
                        RECTANGLE_WIRE -> rectangleWire
                        else -> error("Unknown primitive kind: $kind")
                    },
                )
                previousKind = kind
            }
            pass.drawIndexed(indexCount = indexCounts[index], firstIndex = firstIndices[index])
        }
    }

    fun clear() {
        checkOpen()
        vertexCount = 0
        indexCount = 0
        commandCount = 0
        hasWorldGeometry = false
        hasRectangles = false
        uploaded = false
    }

    private fun checkCanEnqueue() {
        checkOpen()
        check(!uploaded) { "Clear the primitive queue before adding geometry after upload" }
    }

    private fun checkOpen() {
        check(!closed) { "Primitive renderer is closed" }
    }

    override fun close() {
        if (!closed) {
            closed = true
            mesh.close()
            rectangleWire.close()
            rectangleFill.close()
            worldWire.close()
            worldFill.close()
        }
    }

    companion object {
        context(gpa: SegmentAllocator)
        fun create(
            device: Sdl3GpuDevice,
            targetFormat: Sdl3GpuTextureFormat,
            depthFormat: Sdl3GpuTextureFormat,
            shader: Bytes,
            camera: Camera3D,
        ): PrimitiveRenderer {
            var worldFill: Sdl3GpuGraphicsPipeline? = null
            var worldWire: Sdl3GpuGraphicsPipeline? = null
            var rectangleFill: Sdl3GpuGraphicsPipeline? = null
            var rectangleWire: Sdl3GpuGraphicsPipeline? = null
            try {
                device.createShader(
                    gpa = gpa,
                    code = shader, entrypoint = "fragmentMain", stage = Sdl3GpuShaderStage.Fragment,
                ).use { fragment ->
                    device.createShader(
                        gpa = gpa,
                        code = shader, entrypoint = "vertex3D", stage = Sdl3GpuShaderStage.Vertex,
                        uniformBufferCount = 1,
                    ).use { vertex ->
                        worldFill = createPipeline(
                            device = device, vertex = vertex, fragment = fragment, targetFormat = targetFormat,
                            depthFormat = depthFormat, primitiveType = Sdl3GpuPrimitiveType.Triangles,
                        )
                        worldWire = createPipeline(
                            device = device, vertex = vertex, fragment = fragment, targetFormat = targetFormat,
                            depthFormat = depthFormat, primitiveType = Sdl3GpuPrimitiveType.Lines,
                        )
                    }
                    device.createShader(
                        gpa = gpa,
                        code = shader, entrypoint = "vertex2D", stage = Sdl3GpuShaderStage.Vertex,
                        uniformBufferCount = 1,
                    ).use { vertex ->
                        rectangleFill = createPipeline(
                            device = device, vertex = vertex, fragment = fragment, targetFormat = targetFormat,
                            depthFormat = null, primitiveType = Sdl3GpuPrimitiveType.Triangles,
                        )
                        rectangleWire = createPipeline(
                            device = device, vertex = vertex, fragment = fragment, targetFormat = targetFormat,
                            depthFormat = null, primitiveType = Sdl3GpuPrimitiveType.Lines,
                        )
                    }
                }
                return PrimitiveRenderer(
                    device = device,
                    worldFill = checkNotNull(worldFill),
                    worldWire = checkNotNull(worldWire),
                    rectangleFill = checkNotNull(rectangleFill),
                    rectangleWire = checkNotNull(rectangleWire),
                    camera = camera,
                )
            } catch (failure: Throwable) {
                rectangleWire?.close()
                rectangleFill?.close()
                worldWire?.close()
                worldFill?.close()
                throw failure
            }
        }

        context(gpa: SegmentAllocator)
        private fun createPipeline(
            device: Sdl3GpuDevice,
            vertex: Sdl3GpuShader,
            fragment: Sdl3GpuShader,
            targetFormat: Sdl3GpuTextureFormat,
            depthFormat: Sdl3GpuTextureFormat?,
            primitiveType: Sdl3GpuPrimitiveType,
        ): Sdl3GpuGraphicsPipeline {
            return device.createGraphicsPipeline(
                gpa = gpa,
                vertexShader = vertex,
                fragmentShader = fragment,
                targetFormat = targetFormat,
                vertexPitch = VERTEX_BYTES,
                attributes = primitiveAttributes,
                alphaBlend = true,
                primitiveType = primitiveType,
                depthFormat = depthFormat,
                depthTest = depthFormat != null,
                depthWrite = depthFormat != null,
            )
        }
    }
}
