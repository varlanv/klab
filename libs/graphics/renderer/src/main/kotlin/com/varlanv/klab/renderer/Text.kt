package com.varlanv.klab.renderer

import com.varlanv.klab.collections.MutBytes
import com.varlanv.klab.collections.MutInts
import com.varlanv.klab.sdl3.Sdl3GpuText
import com.varlanv.klab.sdl3.Sdl3GpuTexture
import java.lang.foreign.MemorySegment
import java.lang.foreign.SegmentAllocator

class Text internal constructor(
    private val owner: TextRenderer,
    private val native: Sdl3GpuText,
    private var content: String,
) : AutoCloseable {

    private var closed = false
    internal var dirty = true
        private set
    internal var vertices = MutBytes(0)
        private set
    internal var indices = MutBytes(0)
        private set
    internal var vertexCount = 0
        private set
    internal var indexCount = 0
        private set
    internal val textures = ArrayList<Sdl3GpuTexture>()
    internal var batchFirstIndices = MutInts(0)
        private set
    internal var batchIndexCounts = MutInts(0)
        private set
    internal var batchVertexOffsets = MutInts(0)
        private set
    internal var firstVertex = 0
    internal var firstIndex = 0
    internal var x = 0f
        private set
    internal var y = 0f
        private set
    internal var red = 0f
        private set
    internal var green = 0f
        private set
    internal var blue = 0f
        private set
    internal var alpha = 1f
        private set

    fun setText(text: String) {
        checkOpen()
        if (content != text) {
            content = text
            dirty = true
        }
    }

    fun setPosition(x: Float, y: Float) {
        checkOpen()
        require(x.isFinite() && y.isFinite())
        this.x = x
        this.y = y
    }

    fun setColor(red: Float, green: Float, blue: Float, alpha: Float = 1f) {
        checkOpen()
        require(red.isFinite() && green.isFinite() && blue.isFinite() && alpha.isFinite())
        this.red = red
        this.green = green
        this.blue = blue
        this.alpha = alpha
    }

    context(gpa: SegmentAllocator)
    internal fun prepare() {
        checkOpen()
        if (!dirty) return
        native.setText(content)
        val first = native.drawData()
        var sequence = first
        var verticesNeeded = 0
        var indicesNeeded = 0
        var batchesNeeded = 0
        while (sequence != null) {
            assert(sequence.vertexCount >= 0 && sequence.indexCount >= 0)
            verticesNeeded = Math.addExact(verticesNeeded, sequence.vertexCount)
            indicesNeeded = Math.addExact(indicesNeeded, sequence.indexCount)
            batchesNeeded++
            sequence = sequence.next
        }
        val vertexBytes = Math.multiplyExact(verticesNeeded, 16)
        val indexBytes = Math.multiplyExact(indicesNeeded, 4)
        if (vertices.size < vertexBytes) vertices = MutBytes(growCapacity(vertices.size, vertexBytes))
        if (indices.size < indexBytes) indices = MutBytes(growCapacity(indices.size, indexBytes))
        if (batchFirstIndices.size < batchesNeeded) {
            val capacity = growCapacity(batchFirstIndices.size, batchesNeeded)
            batchFirstIndices = MutInts(capacity)
            batchIndexCounts = MutInts(capacity)
            batchVertexOffsets = MutInts(capacity)
        }
        textures.clear()
        val vertexData = MemorySegment.ofArray(vertices)
        val indexData = MemorySegment.ofArray(indices)
        sequence = first
        var vertexOffset = 0
        var indexOffset = 0
        var batch = 0
        while (sequence != null) {
            sequence.copyVertices(destination = vertexData, offset = vertexOffset * 16L)
            sequence.copyIndices(destination = indexData, offset = indexOffset * 4L)
            textures.add(sequence.texture)
            batchFirstIndices[batch] = indexOffset
            batchIndexCounts[batch] = sequence.indexCount
            batchVertexOffsets[batch] = vertexOffset
            vertexOffset += sequence.vertexCount
            indexOffset += sequence.indexCount
            batch++
            sequence = sequence.next
        }
        assert(vertexOffset == verticesNeeded && indexOffset == indicesNeeded)
        vertexCount = verticesNeeded
        indexCount = indicesNeeded
        dirty = false
    }

    private fun checkOpen() {
        check(!closed) { "Text is closed" }
        owner.checkOpen()
    }

    override fun close() {
        if (!closed) {
            native.close()
            owner.remove(this)
            closed = true
        }
    }
}

internal fun growCapacity(current: Int, required: Int): Int {
    assert(current >= 0 && required >= 0)
    return maxOf(required.toLong(), maxOf(16L, current.toLong() * 2L)).coerceAtMost(Int.MAX_VALUE.toLong()).toInt()
}
