package com.varlanv.klab.gpu.assets

/** Byte offset of a packed position/normal/UV vertex in model geometry. */
@JvmInline
value class PreparedVertex(val byteOffset: Int) {
    companion object {
        fun byteSize(vertexCount: Int): Int = Math.multiplyExact(vertexCount, VERTEX_STRIDE)
    }
}
