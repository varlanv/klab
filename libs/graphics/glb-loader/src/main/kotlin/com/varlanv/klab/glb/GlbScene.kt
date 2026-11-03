package com.varlanv.klab.glb

import com.varlanv.klab.glb.ffi.*
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout

class GlbScene internal constructor(private val model: GlbModel, private val data: MemorySegment) {
    val name: String? get() = model.read { nativeString(cgltf_scene.name(data)) }
    val nodeCount: Int get() = model.read { Math.toIntExact(cgltf_scene.nodes_count(data)) }

    fun nodeIndex(index: Int): Int = model.read {
        require(index >= 0 && index.toLong() < cgltf_scene.nodes_count(data))
        checkNotNull(model.nodeIndex(cgltf_scene.nodes(data).getAtIndex(ValueLayout.ADDRESS, index.toLong())))
    }
}

class GlbNode internal constructor(private val model: GlbModel, private val data: MemorySegment) {
    val name: String? get() = model.read { nativeString(cgltf_node.name(data)) }
    val parentIndex: Int? get() = model.read { model.nodeIndex(cgltf_node.parent(data)) }
    val meshIndex: Int? get() = model.read { model.meshIndex(cgltf_node.mesh(data)) }
    val childCount: Int get() = model.read { Math.toIntExact(cgltf_node.children_count(data)) }

    fun childIndex(index: Int): Int = model.read {
        require(index >= 0 && index.toLong() < cgltf_node.children_count(data))
        checkNotNull(model.nodeIndex(cgltf_node.children(data).getAtIndex(ValueLayout.ADDRESS, index.toLong())))
    }

    fun copyLocalTransformTo(destination: MemorySegment) = model.read {
        requireOutput(destination = destination, bytes = 64L, alignment = 4)
        Cgltf.cgltf_node_transform_local(data, destination)
    }

    fun copyWorldTransformTo(destination: MemorySegment) = model.read {
        requireOutput(destination = destination, bytes = 64L, alignment = 4)
        Cgltf.cgltf_node_transform_world(data, destination)
    }
}
