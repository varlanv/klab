package com.varlanv.klab.gpu.assets

import com.varlanv.klab.collections.Array
import com.varlanv.klab.collections.Bytes
import com.varlanv.klab.collections.Floats

/**
 * Owns all supplied arrays without copying. Callers transfer ownership and must not mutate or reuse them.
 * Contains fully prepared CPU data; uploading must not retain references to its storage.
 */
class PreparedModel(
    val geometry: PreparedGeometry,
    val pixels: Bytes,
    val meshes: Array<PreparedMesh>,
    val primitives: Array<PreparedPrimitive>,
    val images: Array<PreparedImage>,
    val samplers: Array<PreparedSampler>,
    val materials: Array<PreparedMaterial>,
    val nodes: Array<PreparedNode>,
)

/** Contiguous range in [PreparedModel.primitives]. */
class PreparedMesh(
    val firstPrimitive: Int,
    val primitiveCount: Int,
)

/**
 * Indexed triangle list. Offsets are bytes into [PreparedModel.geometry], aligned to four bytes.
 * Vertices contain little-endian float32 position (3), normal (3), and UV (2).
 * Indices are little-endian and relative to this primitive's vertices.
 */
class PreparedPrimitive(
    val vertexOffset: Int,
    val vertexCount: Int,
    val indexOffset: Int,
    val indexCount: Int,
    val indexFormat: PreparedIndexFormat,
    val materialIndex: Int,
) {
    val vertexByteSize: Int
        get() = PreparedVertex.byteSize(vertexCount)

    fun vertex(index: Int): PreparedVertex {
        assert(index in 0..<vertexCount)
        return PreparedVertex(vertexOffset + PreparedVertex.byteSize(index))
    }
}

enum class PreparedIndexFormat(val byteSize: Int) {
    Uint16(Short.SIZE_BYTES),
    Uint32(Int.SIZE_BYTES),
}

/** Mips are ordered from level zero; each dimension halves per level, with a minimum of one. */
class PreparedImage(
    val width: Int,
    val height: Int,
    val format: PreparedImageFormat,
    val mips: Array<PreparedMip>,
)

/** Tightly packed rows in [PreparedModel.pixels], with no row padding. */
class PreparedMip(
    val offset: Int,
    val byteSize: Int,
)

enum class PreparedImageFormat {
    Rgba8Unorm,
    Rgba8Srgb,
}

class PreparedSampler(
    val minFilter: PreparedFilter,
    val magFilter: PreparedFilter,
    val mipmapMode: PreparedMipmapMode,
    val addressModeU: PreparedAddressMode,
    val addressModeV: PreparedAddressMode,
)

enum class PreparedFilter {
    Nearest,
    Linear,
}

enum class PreparedMipmapMode {
    None,
    Nearest,
    Linear,
}

enum class PreparedAddressMode {
    Repeat,
    MirroredRepeat,
    ClampToEdge,
}

/** Image and sampler indices are both -1 for an untextured material. Base color is linear RGBA. */
class PreparedMaterial(
    val imageIndex: Int,
    val samplerIndex: Int,
    val baseColor: Floats,
    /** Negative for opaque materials; otherwise the alpha-test threshold. */
    val alphaCutoff: Float,
    val unlit: Boolean,
)

/** Mesh instance with a column-major 4x4 transform relative to the model root. */
class PreparedNode(
    val meshIndex: Int,
    val transform: Floats,
)
