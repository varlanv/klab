package com.varlanv.klab.glb.kotlin

fun KotlinGltf.copyLocalTransformTo(nodeIndex: Int, destination: FloatArray) {
    require(destination.size >= 16)
    localTransform(nodes[nodeIndex], destination)
}

fun KotlinGltf.copyWorldTransformTo(nodeIndex: Int, destination: FloatArray) {
    require(destination.size >= 16)
    var index = nodeIndex
    localTransform(nodes[index], destination)
    val parent = FloatArray(16)
    while (nodes[index].parent >= 0) {
        index = nodes[index].parent
        localTransform(nodes[index], parent)
        multiplyTransform(parent, destination)
    }
}

fun KotlinGltf.copyWorldTransformTo(nodeIndex: Int, destination: FloatArray, scratch: FloatArray) {
    require(destination.size >= 16 && scratch.size >= 16 && destination !== scratch)
    var index = nodeIndex
    localTransform(nodes[index], destination)
    while (nodes[index].parent >= 0) {
        index = nodes[index].parent
        localTransform(nodes[index], scratch)
        multiplyTransform(scratch, destination)
    }
}

private fun localTransform(node: KNode, out: FloatArray) {
    if (node.hasMatrix) { node.matrix.copyInto(out, 0, 0, 16); return }
    val qx = node.rotation[0]; val qy = node.rotation[1]; val qz = node.rotation[2]; val qw = node.rotation[3]
    val sx = node.scale[0]; val sy = node.scale[1]; val sz = node.scale[2]
    out[0] = (1 - 2 * qy * qy - 2 * qz * qz) * sx
    out[1] = (2 * qx * qy + 2 * qz * qw) * sx
    out[2] = (2 * qx * qz - 2 * qy * qw) * sx
    out[3] = 0f
    out[4] = (2 * qx * qy - 2 * qz * qw) * sy
    out[5] = (1 - 2 * qx * qx - 2 * qz * qz) * sy
    out[6] = (2 * qy * qz + 2 * qx * qw) * sy
    out[7] = 0f
    out[8] = (2 * qx * qz + 2 * qy * qw) * sz
    out[9] = (2 * qy * qz - 2 * qx * qw) * sz
    out[10] = (1 - 2 * qx * qx - 2 * qy * qy) * sz
    out[11] = 0f
    out[12] = node.translation[0]; out[13] = node.translation[1]; out[14] = node.translation[2]; out[15] = 1f
}

private fun multiplyTransform(parent: FloatArray, out: FloatArray) {
    var column = 0
    while (column < 16) {
        val x = out[column]; val y = out[column + 1]; val z = out[column + 2]; val w = out[column + 3]
        out[column] = parent[0] * x + parent[4] * y + parent[8] * z + parent[12] * w
        out[column + 1] = parent[1] * x + parent[5] * y + parent[9] * z + parent[13] * w
        out[column + 2] = parent[2] * x + parent[6] * y + parent[10] * z + parent[14] * w
        out[column + 3] = parent[3] * x + parent[7] * y + parent[11] * z + parent[15] * w
        column += 4
    }
}
