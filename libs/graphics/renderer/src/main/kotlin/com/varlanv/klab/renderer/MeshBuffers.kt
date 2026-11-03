package com.varlanv.klab.renderer

import com.varlanv.klab.sdl3.*
import java.lang.foreign.MemorySegment
import java.lang.foreign.SegmentAllocator

internal class MeshBuffers(private val device: Sdl3GpuDevice) : AutoCloseable {

    private var vertices: Sdl3GpuBuffer? = null
    private var indices: Sdl3GpuBuffer? = null
    private var transfer: Sdl3GpuTransferBuffer? = null

    val indexOffset: Int
        get() = checkNotNull(vertices).size

    context(gpa: SegmentAllocator)
    fun map(vertexBytes: Int, indexBytes: Int): MemorySegment {
        require(vertexBytes > 0 && indexBytes > 0)
        ensureCapacity(vertexBytes = vertexBytes, indexBytes = indexBytes)
        return checkNotNull(transfer).map()
    }

    fun unmap() {
        checkNotNull(transfer).unmap()
    }

    context(gpa: SegmentAllocator)
    fun upload(command: Sdl3GpuCommandBuffer, vertexBytes: Int, indexBytes: Int) {
        command.beginCopyPass().use { copy ->
            copy.upload(source = checkNotNull(transfer), destination = checkNotNull(vertices), size = vertexBytes)
            copy.upload(
                source = checkNotNull(transfer), destination = checkNotNull(indices),
                size = indexBytes, sourceOffset = indexOffset,
            )
        }
    }

    context(gpa: SegmentAllocator)
    fun bind(pass: Sdl3GpuRenderPass) {
        pass.bindVertexBuffer(checkNotNull(vertices))
        pass.bindIndexBuffer(checkNotNull(indices))
    }

    context(gpa: SegmentAllocator)
    private fun ensureCapacity(vertexBytes: Int, indexBytes: Int) {
        val oldVertexSize = vertices?.size ?: 0
        val oldIndexSize = indices?.size ?: 0
        if (vertexBytes <= oldVertexSize && indexBytes <= oldIndexSize) return
        val vertexSize = if (vertexBytes > oldVertexSize) growCapacity(oldVertexSize, vertexBytes) else oldVertexSize
        val indexSize = if (indexBytes > oldIndexSize) growCapacity(oldIndexSize, indexBytes) else oldIndexSize
        val newVertices = device.createBuffer(usage = Sdl3GpuBufferUsage.Vertex, size = vertexSize)
        var newIndices: Sdl3GpuBuffer? = null
        var newTransfer: Sdl3GpuTransferBuffer? = null
        try {
            newIndices = device.createBuffer(usage = Sdl3GpuBufferUsage.Index, size = indexSize)
            newTransfer = device.createTransferBuffer(Math.addExact(vertexSize, indexSize))
        } catch (failure: Throwable) {
            newTransfer?.close()
            newIndices?.close()
            newVertices.close()
            throw failure
        }
        close()
        vertices = newVertices
        indices = newIndices
        transfer = newTransfer
    }

    override fun close() {
        transfer?.close()
        indices?.close()
        vertices?.close()
        transfer = null
        indices = null
        vertices = null
    }
}
