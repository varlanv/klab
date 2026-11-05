@file:Suppress("ArrayInDataClass")

package com.varlanv.klab.gpu.assets

import com.varlanv.klab.collections.Bytes
import com.varlanv.klab.collections.getPackedFloat
import com.varlanv.klab.collections.setPackedFloat

/** Packed vertex and index storage. Read-only after ownership transfers to [PreparedModel]. */
@JvmInline
value class PreparedGeometry(val bytes: Bytes) {
    val byteSize: Int
        get() = bytes.size

    fun positionX(vertex: PreparedVertex): Float = bytes.getPackedFloat(vertex.byteOffset + VERTEX_POSITION_X_OFFSET)

    fun positionY(vertex: PreparedVertex): Float = bytes.getPackedFloat(vertex.byteOffset + VERTEX_POSITION_Y_OFFSET)

    fun positionZ(vertex: PreparedVertex): Float = bytes.getPackedFloat(vertex.byteOffset + VERTEX_POSITION_Z_OFFSET)

    fun normalX(vertex: PreparedVertex): Float = bytes.getPackedFloat(vertex.byteOffset + VERTEX_NORMAL_X_OFFSET)

    fun normalY(vertex: PreparedVertex): Float = bytes.getPackedFloat(vertex.byteOffset + VERTEX_NORMAL_Y_OFFSET)

    fun normalZ(vertex: PreparedVertex): Float = bytes.getPackedFloat(vertex.byteOffset + VERTEX_NORMAL_Z_OFFSET)

    fun u(vertex: PreparedVertex): Float = bytes.getPackedFloat(vertex.byteOffset + VERTEX_UV_U_OFFSET)

    fun v(vertex: PreparedVertex): Float = bytes.getPackedFloat(vertex.byteOffset + VERTEX_UV_V_OFFSET)

    /** Writes during preparation, before geometry ownership transfers to [PreparedModel]. */
    fun setPosition(
        vertex: PreparedVertex,
        x: Float,
        y: Float,
        z: Float,
    ) {
        bytes.setPackedFloat(idx = vertex.byteOffset + VERTEX_POSITION_X_OFFSET, value = x)
        bytes.setPackedFloat(idx = vertex.byteOffset + VERTEX_POSITION_Y_OFFSET, value = y)
        bytes.setPackedFloat(idx = vertex.byteOffset + VERTEX_POSITION_Z_OFFSET, value = z)
    }

    fun setNormal(
        vertex: PreparedVertex,
        x: Float,
        y: Float,
        z: Float,
    ) {
        bytes.setPackedFloat(idx = vertex.byteOffset + VERTEX_NORMAL_X_OFFSET, value = x)
        bytes.setPackedFloat(idx = vertex.byteOffset + VERTEX_NORMAL_Y_OFFSET, value = y)
        bytes.setPackedFloat(idx = vertex.byteOffset + VERTEX_NORMAL_Z_OFFSET, value = z)
    }

    fun setUv(
        vertex: PreparedVertex,
        u: Float,
        v: Float,
    ) {
        bytes.setPackedFloat(idx = vertex.byteOffset + VERTEX_UV_U_OFFSET, value = u)
        bytes.setPackedFloat(idx = vertex.byteOffset + VERTEX_UV_V_OFFSET, value = v)
    }
}
