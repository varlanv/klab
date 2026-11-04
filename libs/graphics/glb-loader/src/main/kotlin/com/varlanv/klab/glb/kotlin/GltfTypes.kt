package com.varlanv.klab.glb.kotlin

import com.varlanv.klab.collections.*
import com.varlanv.klab.collections.Array

internal const val GLTF_MISSING_INDEX = -1

internal const val GLTF_COMPONENT_BYTE = 5120
internal const val GLTF_COMPONENT_UNSIGNED_BYTE = 5121
internal const val GLTF_COMPONENT_SHORT = 5122
internal const val GLTF_COMPONENT_UNSIGNED_SHORT = 5123
internal const val GLTF_COMPONENT_UNSIGNED_INT = 5125
const val GLTF_COMPONENT_FLOAT = 5126

internal const val GLTF_TYPE_INVALID = 0
internal const val GLTF_TYPE_SCALAR = 1
internal const val GLTF_TYPE_VEC2 = 2
internal const val GLTF_TYPE_VEC3 = 3
internal const val GLTF_TYPE_VEC4 = 4
internal const val GLTF_TYPE_MAT2 = 5
internal const val GLTF_TYPE_MAT3 = 6
internal const val GLTF_TYPE_MAT4 = 7

internal const val VEC2_COMPONENTS = 2
internal const val VEC3_COMPONENTS = 3
internal const val VEC4_COMPONENTS = 4
internal const val MAT2_COMPONENTS = 4
internal const val MAT3_COMPONENTS = 9
internal const val MAT4_COMPONENTS = 16
internal const val MATRIX_COLUMN_ALIGNMENT = 4

internal const val GLTF_PRIMITIVE_POINTS = 0
const val GLTF_PRIMITIVE_TRIANGLES = 4
internal const val GLTF_PRIMITIVE_TRIANGLE_FAN = 6

internal const val GLTF_INTERPOLATION_LINEAR = 0
internal const val GLTF_INTERPOLATION_STEP = 1
internal const val GLTF_INTERPOLATION_CUBIC_SPLINE = 2
internal const val GLTF_PATH_INVALID = 0
internal const val GLTF_PATH_TRANSLATION = 1
internal const val GLTF_PATH_ROTATION = 2
internal const val GLTF_PATH_SCALE = 3
internal const val GLTF_PATH_WEIGHTS = 4

const val ATTRIBUTE_INVALID = 0
const val ATTRIBUTE_POSITION = 1
const val ATTRIBUTE_NORMAL = 2
const val ATTRIBUTE_TANGENT = 3
const val ATTRIBUTE_TEXCOORD = 4
const val ATTRIBUTE_COLOR = 5
const val ATTRIBUTE_JOINTS = 6
const val ATTRIBUTE_WEIGHTS = 7
const val ATTRIBUTE_CUSTOM = 8
const val ALPHA_OPAQUE = 0
const val ALPHA_MASK = 1
const val ALPHA_BLEND = 2

class KExtension(
    val name: String,
    val data: String
)

open class KProperty(
    val name: String?,
    val extras: String?,
    val extensions: Array<KExtension>
)

class KAsset(
    val copyright: String?,
    val generator: String?,
    val version: String?,
    val minVersion: String?,
    extras: String?,
    extensions: Array<KExtension>,
) : KProperty(null, extras, extensions)

class KBuffer(
    name: String?,
    val byteLength: Int,
    val uri: String?,
    extras: String?,
    extensions: Array<KExtension>,
) : KProperty(name, extras, extensions)

class KMeshopt(
    val buffer: Int,
    val offset: Int,
    val byteLength: Int,
    val stride: Int,
    val count: Int,
    val mode: String?,
    val filter: String?,
    val isKhr: Boolean,
)

class KBufferView(
    name: String?,
    val buffer: Int,
    val offset: Int,
    val byteLength: Int,
    val stride: Int,
    val target: Int,
    val meshopt: KMeshopt?,
    extras: String?,
    extensions: Array<KExtension>,
) : KProperty(name, extras, extensions)

class KSparse(
    val count: Int,
    val indicesBufferView: Int,
    val indicesOffset: Int,
    val indicesComponentType: Int,
    val valuesBufferView: Int,
    val valuesOffset: Int,
)

class KAccessor(
    name: String?,
    val componentType: Int,
    val type: Int,
    val offset: Int,
    val count: Int,
    var stride: Int,
    val bufferView: Int,
    val normalized: Boolean,
    val min: Floats,
    val max: Floats,
    val sparse: KSparse?,
    extras: String?,
    extensions: Array<KExtension>,
) : KProperty(name, extras, extensions)

class KAttribute(
    val name: String,
    val accessor: Int,
    val semantic: Int,
    val set: Int
)

class KDraco(
    val bufferView: Int,
    val attributes: Array<KAttribute>
)

class KMaterialMapping(
    val variant: Int,
    val material: Int,
    val extras: String?
)

class KPrimitive(
    val mode: Int,
    val indices: Int,
    val material: Int,
    val attributes: Array<KAttribute>,
    val targets: Array<Array<KAttribute>>,
    val draco: KDraco?,
    val mappings: Array<KMaterialMapping>,
    extras: String?,
    extensions: Array<KExtension>,
) : KProperty(null, extras, extensions)

class KMesh(
    name: String?,
    val primitives: Array<KPrimitive>,
    val weights: Floats,
    val targetNames: Array<String>,
    extras: String?,
    extensions: Array<KExtension>,
) : KProperty(name, extras, extensions)

class KTextureTransform(
    val offset: Floats,
    val rotation: Float,
    val scale: Floats,
    val texCoord: Int,
)

class KTextureView(
    val texture: Int,
    val texCoord: Int,
    val scale: Float,
    val transform: KTextureTransform?,
)

class KMetallicRoughness(
    val baseColorTexture: KTextureView?,
    val metallicRoughnessTexture: KTextureView?,
    val baseColorFactor: Floats,
    val metallicFactor: Float,
    val roughnessFactor: Float,
)

class KSpecularGlossiness(
    val diffuseTexture: KTextureView?,
    val specularGlossinessTexture: KTextureView?,
    val diffuseFactor: Floats,
    val specularFactor: Floats,
    val glossinessFactor: Float,
)

class KClearcoat(
    val texture: KTextureView?,
    val roughnessTexture: KTextureView?,
    val normalTexture: KTextureView?,
    val factor: Float,
    val roughnessFactor: Float,
)

class KTransmission(
    val texture: KTextureView?,
    val factor: Float
)

class KSpecular(
    val texture: KTextureView?,
    val colorTexture: KTextureView?,
    val factor: Float,
    val colorFactor: Floats
)

class KVolume(
    val thicknessTexture: KTextureView?,
    val thicknessFactor: Float,
    val attenuationColor: Floats,
    val attenuationDistance: Float
)

class KSheen(
    val colorTexture: KTextureView?,
    val colorFactor: Floats,
    val roughnessTexture: KTextureView?,
    val roughnessFactor: Float
)

class KIridescence(
    val factor: Float,
    val texture: KTextureView?,
    val ior: Float,
    val thicknessMin: Float,
    val thicknessMax: Float,
    val thicknessTexture: KTextureView?
)

class KDiffuseTransmission(
    val texture: KTextureView?,
    val factor: Float,
    val colorFactor: Floats,
    val colorTexture: KTextureView?
)

class KAnisotropy(
    val strength: Float,
    val rotation: Float,
    val texture: KTextureView?
)

class KMaterial(
    name: String?,
    val metallicRoughness: KMetallicRoughness?,
    val specularGlossiness: KSpecularGlossiness?,
    val normalTexture: KTextureView?,
    val occlusionTexture: KTextureView?,
    val emissiveTexture: KTextureView?,
    val emissiveFactor: Floats,
    val alphaMode: Int,
    val alphaCutoff: Float,
    val doubleSided: Boolean,
    val unlit: Boolean,
    val clearcoat: KClearcoat?,
    val transmission: KTransmission?,
    val ior: Float?,
    val specular: KSpecular?,
    val volume: KVolume?,
    val sheen: KSheen?,
    val emissiveStrength: Float?,
    val iridescence: KIridescence?,
    val diffuseTransmission: KDiffuseTransmission?,
    val anisotropy: KAnisotropy?,
    val dispersion: Float?,
    extras: String?,
    extensions: Array<KExtension>,
) : KProperty(name, extras, extensions)

class KImage(
    name: String?,
    val uri: String?,
    val bufferView: Int,
    val mimeType: String?,
    extras: String?,
    extensions: Array<KExtension>,
) : KProperty(name, extras, extensions)

class KSampler(
    name: String?,
    val magFilter: Int,
    val minFilter: Int,
    val wrapS: Int,
    val wrapT: Int,
    extras: String?,
    extensions: Array<KExtension>,
) : KProperty(name, extras, extensions)

class KTexture(
    name: String?,
    val image: Int,
    val sampler: Int,
    val basisuImage: Int,
    val webpImage: Int,
    extras: String?,
    extensions: Array<KExtension>,
) : KProperty(name, extras, extensions)

class KNode(
    name: String?,
    var parent: Int,
    val children: Ints,
    val mesh: Int,
    val skin: Int,
    val camera: Int,
    val light: Int,
    val weights: Floats,
    translation: Floats?,
    rotation: Floats?,
    scale: Floats?,
    matrix: Floats?,
    val hasMatrix: Boolean,
    val hasTranslation: Boolean,
    val hasRotation: Boolean,
    val hasScale: Boolean,
    val instancing: Array<KAttribute>,
    extras: String?,
    extensions: Array<KExtension>,
) : KProperty(name, extras, extensions) {
    internal var translationValues: Floats? = translation
        private set
    internal var rotationValues: Floats? = rotation
        private set
    internal var scaleValues: Floats? = scale
        private set
    internal var matrixValues: Floats? = matrix
        private set

    val translation: Floats get() = translationValues ?: defaultTranslation.copyOf().also { translationValues = it }
    val rotation: Floats get() = rotationValues ?: defaultRotation.copyOf().also { rotationValues = it }
    val scale: Floats get() = scaleValues ?: defaultScale.copyOf().also { scaleValues = it }
    val matrix: Floats get() = matrixValues ?: defaultMatrix.copyOf().also { matrixValues = it }
}

class KScene(
    name: String?,
    val nodes: Ints,
    extras: String?,
    extensions: Array<KExtension>
) :
    KProperty(name, extras, extensions)

class KSkin(
    name: String?,
    val joints: Ints,
    val skeleton: Int,
    val inverseBindMatrices: Int,
    extras: String?,
    extensions: Array<KExtension>,
) : KProperty(name, extras, extensions)

class KAnimationSampler(
    val input: Int,
    val output: Int,
    val interpolation: Int,
    extras: String?,
    extensions: Array<KExtension>,
) : KProperty(null, extras, extensions)

class KAnimationChannel(
    val sampler: Int,
    val targetNode: Int,
    val targetPath: Int,
    extras: String?,
    extensions: Array<KExtension>,
) : KProperty(null, extras, extensions)

class KAnimation(
    name: String?,
    val samplers: Array<KAnimationSampler>,
    val channels: Array<KAnimationChannel>,
    extras: String?,
    extensions: Array<KExtension>,
) : KProperty(name, extras, extensions)

class KPerspective(
    val aspectRatio: Float?,
    val yfov: Float,
    val zfar: Float?,
    val znear: Float,
    val extras: String?
)

class KOrthographic(
    val xmag: Float,
    val ymag: Float,
    val zfar: Float,
    val znear: Float,
    val extras: String?
)

class KCamera(
    name: String?,
    val type: Int,
    val perspective: KPerspective?,
    val orthographic: KOrthographic?,
    extras: String?,
    extensions: Array<KExtension>,
) : KProperty(name, extras, extensions)

class KLight(
    name: String?,
    val color: Floats,
    val intensity: Float,
    val type: Int,
    val range: Float,
    val innerConeAngle: Float,
    val outerConeAngle: Float,
    extras: String?,
) : KProperty(name, extras, emptyArray())

class KVariant(
    name: String?,
    extras: String?
) : KProperty(name, extras, emptyArray())

class KotlinGltf(
    val asset: KAsset,
    val buffers: Array<KBuffer>,
    val bufferViews: Array<KBufferView>,
    val accessors: Array<KAccessor>,
    val meshes: Array<KMesh>,
    val materials: Array<KMaterial>,
    val images: Array<KImage>,
    val textures: Array<KTexture>,
    val samplers: Array<KSampler>,
    val nodes: Array<KNode>,
    val scenes: Array<KScene>,
    val scene: Int,
    val skins: Array<KSkin>,
    val animations: Array<KAnimation>,
    val cameras: Array<KCamera>,
    val lights: Array<KLight>,
    val variants: Array<KVariant>,
    val extensionsUsed: Array<String>,
    val extensionsRequired: Array<String>,
    extras: String?,
    extensions: Array<KExtension>,
) : KProperty(null, extras, extensions) {
    internal var bufferSources: Array<Bytes> = emptyArray()
    internal var bufferOffsets: Ints = stableEmptyInts
    lateinit var source: Bytes
        internal set
    var binOffset: Int = 0
        internal set
    var binSize: Int = 0
        internal set
}

internal val defaultTranslation: Floats = floatArrayOf(0f, 0f, 0f)
internal val defaultRotation: Floats = floatArrayOf(0f, 0f, 0f, 1f)
internal val defaultScale: Floats = floatArrayOf(1f, 1f, 1f)
internal val defaultMatrix: Floats = floatArrayOf(
    1f, 0f, 0f, 0f,
    0f, 1f, 0f, 0f,
    0f, 0f, 1f, 0f,
    0f, 0f, 0f, 1f
)
