package com.varlanv.klab.glb

import com.varlanv.klab.glb.ffi.*
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.lang.ref.Cleaner
import java.lang.ref.Reference
import java.util.concurrent.locks.ReentrantReadWriteLock

class GlbModel internal constructor(
    internal val handle: MemorySegment,
    private val source: MemorySegment,
) : AutoCloseable {

    @Volatile
    private var closed = false
    private val lifecycle = ReentrantReadWriteLock()
    private val cleanable = cleaner.register(this, Allocation(handle))

    val meshCount: Int get() = read { Math.toIntExact(cgltf_data.meshes_count(handle)) }
    val nodeCount: Int get() = read { Math.toIntExact(cgltf_data.nodes_count(handle)) }
    val sceneCount: Int get() = read { Math.toIntExact(cgltf_data.scenes_count(handle)) }
    val accessorCount: Int get() = read { Math.toIntExact(cgltf_data.accessors_count(handle)) }
    val bufferViewCount: Int get() = read { Math.toIntExact(cgltf_data.buffer_views_count(handle)) }
    val materialCount: Int get() = read { Math.toIntExact(cgltf_data.materials_count(handle)) }
    val textureCount: Int get() = read { Math.toIntExact(cgltf_data.textures_count(handle)) }
    val imageCount: Int get() = read { Math.toIntExact(cgltf_data.images_count(handle)) }
    val animationCount: Int get() = read { Math.toIntExact(cgltf_data.animations_count(handle)) }
    val skinCount: Int get() = read { Math.toIntExact(cgltf_data.skins_count(handle)) }
    val requiredExtensionCount: Int get() = read { Math.toIntExact(cgltf_data.extensions_required_count(handle)) }
    val usedExtensionCount: Int get() = read { Math.toIntExact(cgltf_data.extensions_used_count(handle)) }
    val defaultSceneIndex: Int?
        get() = read {
            indexOf(
                pointer = cgltf_data.scene(handle),
                base = cgltf_data.scenes(handle),
                count = cgltf_data.scenes_count(handle),
                size = cgltf_scene.sizeof()
            )
        }
    val generator: String? get() = read { nativeString(cgltf_asset.generator(cgltf_data.asset(handle))) }

    fun mesh(index: Int): GlbMesh = read {
        GlbMesh(
            this,
            element(
                pointer = cgltf_data.meshes(handle),
                count = cgltf_data.meshes_count(handle),
                size = cgltf_mesh.sizeof(),
                index = index
            )
        )
    }

    fun node(index: Int): GlbNode = read {
        GlbNode(
            this,
            element(
                pointer = cgltf_data.nodes(handle),
                count = cgltf_data.nodes_count(handle),
                size = cgltf_node.sizeof(),
                index = index
            )
        )
    }

    fun scene(index: Int): GlbScene = read {
        GlbScene(
            this,
            element(
                pointer = cgltf_data.scenes(handle),
                count = cgltf_data.scenes_count(handle),
                size = cgltf_scene.sizeof(),
                index = index
            )
        )
    }

    fun accessor(index: Int): GlbAccessor = read {
        GlbAccessor(
            this,
            element(
                pointer = cgltf_data.accessors(handle),
                count = cgltf_data.accessors_count(handle),
                size = cgltf_accessor.sizeof(),
                index = index
            )
        )
    }

    fun bufferView(index: Int): GlbBufferView = read {
        GlbBufferView(
            this,
            element(
                pointer = cgltf_data.buffer_views(handle),
                count = cgltf_data.buffer_views_count(handle),
                size = cgltf_buffer_view.sizeof(),
                index = index
            )
        )
    }

    fun material(index: Int): GlbMaterial = read {
        GlbMaterial(
            this,
            element(
                pointer = cgltf_data.materials(handle),
                count = cgltf_data.materials_count(handle),
                size = cgltf_material.sizeof(),
                index = index
            )
        )
    }

    fun texture(index: Int): GlbTexture = read {
        GlbTexture(
            this,
            element(
                pointer = cgltf_data.textures(handle),
                count = cgltf_data.textures_count(handle),
                size = cgltf_texture.sizeof(),
                index = index
            )
        )
    }

    fun image(index: Int): GlbImage = read {
        GlbImage(
            this,
            element(
                pointer = cgltf_data.images(handle),
                count = cgltf_data.images_count(handle),
                size = cgltf_image.sizeof(),
                index = index
            )
        )
    }

    fun requiredExtension(index: Int): String = read {
        extension(
            pointer = cgltf_data.extensions_required(handle),
            count = cgltf_data.extensions_required_count(handle),
            index = index
        )
    }

    fun usedExtension(index: Int): String = read {
        extension(
            pointer = cgltf_data.extensions_used(handle),
            count = cgltf_data.extensions_used_count(handle),
            index = index
        )
    }

    private fun extension(pointer: MemorySegment, count: Long, index: Int): String {
        require(index >= 0 && index.toLong() < count)
        return pointer.getAtIndex(ValueLayout.ADDRESS, index.toLong()).reinterpret(Long.MAX_VALUE).getString(0L)
    }

    internal fun nodeIndex(pointer: MemorySegment): Int? = read {
        indexOf(
            pointer = pointer,
            base = cgltf_data.nodes(handle),
            count = cgltf_data.nodes_count(handle),
            size = cgltf_node.sizeof()
        )
    }

    internal fun meshIndex(pointer: MemorySegment): Int? = read {
        indexOf(
            pointer = pointer,
            base = cgltf_data.meshes(handle),
            count = cgltf_data.meshes_count(handle),
            size = cgltf_mesh.sizeof()
        )
    }

    internal fun materialIndex(pointer: MemorySegment): Int? = read {
        indexOf(
            pointer = pointer,
            base = cgltf_data.materials(handle),
            count = cgltf_data.materials_count(handle),
            size = cgltf_material.sizeof()
        )
    }

    internal fun textureIndex(pointer: MemorySegment): Int? = read {
        indexOf(
            pointer = pointer,
            base = cgltf_data.textures(handle),
            count = cgltf_data.textures_count(handle),
            size = cgltf_texture.sizeof()
        )
    }

    internal fun imageIndex(pointer: MemorySegment): Int? = read {
        indexOf(
            pointer = pointer,
            base = cgltf_data.images(handle),
            count = cgltf_data.images_count(handle),
            size = cgltf_image.sizeof()
        )
    }

    internal fun bufferBytes(view: MemorySegment): MemorySegment = read {
        val buffer = cgltf_buffer_view.buffer(view).reinterpret(cgltf_buffer.sizeof())
        val pointer = cgltf_buffer.data(buffer)
        check(pointer.address() != 0L) { "Buffer data is not loaded" }
        val offset = Math.addExact(pointer.address() - source.address(), cgltf_buffer_view.offset(view))
        val length = cgltf_buffer_view.size(view)
        check(offset >= 0L && length >= 0L && offset <= source.byteSize() - length) {
            "Buffer view is outside the GLB payload"
        }
        source.asSlice(offset, length).asReadOnly()
    }

    internal fun checkOpen() {
        check(!closed) { "GLB model is closed" }
        check(source.scope().isAlive) { "GLB input memory has been released" }
        check(source.isAccessibleBy(Thread.currentThread())) { "GLB input is not accessible on this thread" }
    }

    internal inline fun <T> read(block: () -> T): T {
        val guard = lifecycle.readLock()
        guard.lock()
        try {
            checkOpen()
            return block()
        } finally {
            guard.unlock()
            Reference.reachabilityFence(this)
        }
    }

    override fun close() {
        val guard = lifecycle.writeLock()
        guard.lock()
        try {
            if (!closed) {
                closed = true
                cleanable.clean()
            }
        } finally {
            guard.unlock()
        }
    }

    private class Allocation(private val handle: MemorySegment) : Runnable {
        override fun run() {
            Cgltf.cgltf_free(handle)
        }
    }

    companion object {
        private val cleaner = Cleaner.create()
    }
}

internal fun element(pointer: MemorySegment, count: Long, size: Long, index: Int): MemorySegment {
    require(index >= 0 && index.toLong() < count) { "GLB index $index is outside element count $count" }
    return pointer.asSlice(Math.multiplyExact(index.toLong(), size), size)
}

internal fun indexOf(pointer: MemorySegment, base: MemorySegment, count: Long, size: Long): Int? {
    if (pointer.address() == 0L) return null
    val offset = pointer.address() - base.address()
    check(offset >= 0L && offset % size == 0L && offset / size < count) { "Invalid GLB reference" }
    return Math.toIntExact(offset / size)
}

internal fun nativeString(pointer: MemorySegment): String? =
    if (pointer.address() == 0L) null else pointer.getString(0L)
