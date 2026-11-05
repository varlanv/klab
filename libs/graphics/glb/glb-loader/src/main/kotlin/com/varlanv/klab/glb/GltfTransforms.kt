package com.varlanv.klab.glb

import com.varlanv.klab.collections.Floats
import com.varlanv.klab.collections.MutFloats

private const val VECTOR_X = 0
private const val VECTOR_Y = 1
private const val VECTOR_Z = 2
private const val VECTOR_W = 3
private const val MATRIX_ROWS = 4

private const val M00 = 0
private const val M10 = 1
private const val M20 = 2
private const val M30 = 3
private const val M01 = 4
private const val M11 = 5
private const val M21 = 6
private const val M31 = 7
private const val M02 = 8
private const val M12 = 9
private const val M22 = 10
private const val M32 = 11
private const val M03 = 12
private const val M13 = 13
private const val M23 = 14
private const val M33 = 15

fun KGltf.copyLocalTransformTo(nodeIndex: Int, destination: MutFloats) {
    require(destination.size >= MAT4_COMPONENTS)
    localTransform(node = nodes[nodeIndex], out = destination)
}

fun KGltf.copyWorldTransformTo(nodeIndex: Int, destination: MutFloats) {
    require(destination.size >= MAT4_COMPONENTS)
    var index = nodeIndex
    localTransform(node = nodes[index], out = destination)
    val parent = MutFloats(MAT4_COMPONENTS)
    while (nodes[index].parent >= 0) {
        index = nodes[index].parent
        localTransform(node = nodes[index], out = parent)
        multiplyTransform(parent = parent, out = destination)
    }
}

fun KGltf.copyWorldTransformTo(
    nodeIndex: Int,
    destination: MutFloats,
    scratch: MutFloats,
) {
    require(destination.size >= MAT4_COMPONENTS && scratch.size >= MAT4_COMPONENTS && destination !== scratch)
    var index = nodeIndex
    localTransform(node = nodes[index], out = destination)
    while (nodes[index].parent >= 0) {
        index = nodes[index].parent
        localTransform(node = nodes[index], out = scratch)
        multiplyTransform(parent = scratch, out = destination)
    }
}

private fun localTransform(node: KNode, out: MutFloats) {
    if (node.hasMatrix) {
        (node.matrixValues ?: defaultMatrix).copyInto(out, 0, 0, MAT4_COMPONENTS)
        return
    }
    val qx = (node.rotationValues ?: defaultRotation)[VECTOR_X]
    val qy = (node.rotationValues ?: defaultRotation)[VECTOR_Y]
    val qz = (node.rotationValues ?: defaultRotation)[VECTOR_Z]
    val qw = (node.rotationValues ?: defaultRotation)[VECTOR_W]
    val sx = (node.scaleValues ?: defaultScale)[VECTOR_X]
    val sy = (node.scaleValues ?: defaultScale)[VECTOR_Y]
    val sz = (node.scaleValues ?: defaultScale)[VECTOR_Z]
    out[M00] = (1 - 2 * qy * qy - 2 * qz * qz) * sx
    out[M10] = (2 * qx * qy + 2 * qz * qw) * sx
    out[M20] = (2 * qx * qz - 2 * qy * qw) * sx
    out[M30] = 0f
    out[M01] = (2 * qx * qy - 2 * qz * qw) * sy
    out[M11] = (1 - 2 * qx * qx - 2 * qz * qz) * sy
    out[M21] = (2 * qy * qz + 2 * qx * qw) * sy
    out[M31] = 0f
    out[M02] = (2 * qx * qz + 2 * qy * qw) * sz
    out[M12] = (2 * qy * qz - 2 * qx * qw) * sz
    out[M22] = (1 - 2 * qx * qx - 2 * qy * qy) * sz
    out[M32] = 0f
    out[M03] = (node.translationValues ?: defaultTranslation)[VECTOR_X]
    out[M13] = (node.translationValues ?: defaultTranslation)[VECTOR_Y]
    out[M23] = (node.translationValues ?: defaultTranslation)[VECTOR_Z]
    out[M33] = 1f
}

internal fun multiplyTransform(parent: Floats, out: MutFloats) {
    var column = 0
    while (column < MAT4_COMPONENTS) {
        val x = out[column]
        val y = out[column + VECTOR_Y]
        val z = out[column + VECTOR_Z]
        val w = out[column + VECTOR_W]
        out[column] = parent[M00] * x + parent[M01] * y + parent[M02] * z + parent[M03] * w
        out[column + VECTOR_Y] = parent[M10] * x + parent[M11] * y + parent[M12] * z + parent[M13] * w
        out[column + VECTOR_Z] = parent[M20] * x + parent[M21] * y + parent[M22] * z + parent[M23] * w
        out[column + VECTOR_W] = parent[M30] * x + parent[M31] * y + parent[M32] * z + parent[M33] * w
        column += MATRIX_ROWS
    }
}
