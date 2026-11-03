package com.varlanv.klab.glb.kotlin

internal val emptyInts = IntArray(0)
internal val emptyFloats = FloatArray(0)

class KExtension(val name: String, val data: String)

open class KProperty(val name: String?, val extras: String?, val extensions: Array<KExtension>)

class KAsset(
    val copyright: String?, val generator: String?, val version: String?, val minVersion: String?,
    extras: String?, extensions: Array<KExtension>,
) : KProperty(null, extras, extensions)

class KBuffer(
    name: String?, val byteLength: Int, val uri: String?, extras: String?, extensions: Array<KExtension>,
) : KProperty(name, extras, extensions)

class KMeshopt(
    val buffer: Int, val offset: Int, val byteLength: Int, val stride: Int, val count: Int,
    val mode: String?, val filter: String?, val isKhr: Boolean,
)

class KBufferView(
    name: String?, val buffer: Int, val offset: Int, val byteLength: Int, val stride: Int, val target: Int,
    val meshopt: KMeshopt?, extras: String?, extensions: Array<KExtension>,
) : KProperty(name, extras, extensions)

class KSparse(
    val count: Int, val indicesBufferView: Int, val indicesOffset: Int, val indicesComponentType: Int,
    val valuesBufferView: Int, val valuesOffset: Int,
)

class KAccessor(
    name: String?, val componentType: Int, val type: Int, val offset: Int, val count: Int,
    var stride: Int, val bufferView: Int, val normalized: Boolean, val min: FloatArray, val max: FloatArray,
    val sparse: KSparse?, extras: String?, extensions: Array<KExtension>,
) : KProperty(name, extras, extensions)

class KAttribute(val name: String, val accessor: Int, val semantic: Int, val set: Int)

class KDraco(val bufferView: Int, val attributes: Array<KAttribute>)

class KMaterialMapping(val variant: Int, val material: Int, val extras: String?)

class KPrimitive(
    val mode: Int, val indices: Int, val material: Int, val attributes: Array<KAttribute>,
    val targets: Array<Array<KAttribute>>, val draco: KDraco?, val mappings: Array<KMaterialMapping>,
    extras: String?, extensions: Array<KExtension>,
) : KProperty(null, extras, extensions)

class KMesh(
    name: String?, val primitives: Array<KPrimitive>, val weights: FloatArray, val targetNames: Array<String>,
    extras: String?, extensions: Array<KExtension>,
) : KProperty(name, extras, extensions)

class KTextureTransform(
    val offset: FloatArray, val rotation: Float, val scale: FloatArray, val texCoord: Int,
)

class KTextureView(
    val texture: Int, val texCoord: Int, val scale: Float, val transform: KTextureTransform?,
)

class KMetallicRoughness(
    val baseColorTexture: KTextureView?, val metallicRoughnessTexture: KTextureView?,
    val baseColorFactor: FloatArray, val metallicFactor: Float, val roughnessFactor: Float,
)

class KSpecularGlossiness(
    val diffuseTexture: KTextureView?, val specularGlossinessTexture: KTextureView?,
    val diffuseFactor: FloatArray, val specularFactor: FloatArray, val glossinessFactor: Float,
)

class KClearcoat(
    val texture: KTextureView?, val roughnessTexture: KTextureView?, val normalTexture: KTextureView?,
    val factor: Float, val roughnessFactor: Float,
)

class KTransmission(val texture: KTextureView?, val factor: Float)
class KSpecular(val texture: KTextureView?, val colorTexture: KTextureView?, val factor: Float, val colorFactor: FloatArray)
class KVolume(val thicknessTexture: KTextureView?, val thicknessFactor: Float, val attenuationColor: FloatArray, val attenuationDistance: Float)
class KSheen(val colorTexture: KTextureView?, val colorFactor: FloatArray, val roughnessTexture: KTextureView?, val roughnessFactor: Float)
class KIridescence(val factor: Float, val texture: KTextureView?, val ior: Float, val thicknessMin: Float, val thicknessMax: Float, val thicknessTexture: KTextureView?)
class KDiffuseTransmission(val texture: KTextureView?, val factor: Float, val colorFactor: FloatArray, val colorTexture: KTextureView?)
class KAnisotropy(val strength: Float, val rotation: Float, val texture: KTextureView?)

class KMaterial(
    name: String?, val metallicRoughness: KMetallicRoughness?, val specularGlossiness: KSpecularGlossiness?,
    val normalTexture: KTextureView?, val occlusionTexture: KTextureView?, val emissiveTexture: KTextureView?,
    val emissiveFactor: FloatArray, val alphaMode: Int, val alphaCutoff: Float, val doubleSided: Boolean,
    val unlit: Boolean, val clearcoat: KClearcoat?, val transmission: KTransmission?, val ior: Float?,
    val specular: KSpecular?, val volume: KVolume?, val sheen: KSheen?, val emissiveStrength: Float?,
    val iridescence: KIridescence?, val diffuseTransmission: KDiffuseTransmission?, val anisotropy: KAnisotropy?,
    val dispersion: Float?, extras: String?, extensions: Array<KExtension>,
) : KProperty(name, extras, extensions)

class KImage(
    name: String?, val uri: String?, val bufferView: Int, val mimeType: String?,
    extras: String?, extensions: Array<KExtension>,
) : KProperty(name, extras, extensions)

class KSampler(
    name: String?, val magFilter: Int, val minFilter: Int, val wrapS: Int, val wrapT: Int,
    extras: String?, extensions: Array<KExtension>,
) : KProperty(name, extras, extensions)

class KTexture(
    name: String?, val image: Int, val sampler: Int, val basisuImage: Int, val webpImage: Int,
    extras: String?, extensions: Array<KExtension>,
) : KProperty(name, extras, extensions)

class KNode(
    name: String?, var parent: Int, val children: IntArray, val mesh: Int, val skin: Int, val camera: Int,
    val light: Int, val weights: FloatArray, val translation: FloatArray, val rotation: FloatArray,
    val scale: FloatArray, val matrix: FloatArray, val hasMatrix: Boolean, val hasTranslation: Boolean,
    val hasRotation: Boolean, val hasScale: Boolean, val instancing: Array<KAttribute>,
    extras: String?, extensions: Array<KExtension>,
) : KProperty(name, extras, extensions)

class KScene(name: String?, val nodes: IntArray, extras: String?, extensions: Array<KExtension>) : KProperty(name, extras, extensions)

class KSkin(
    name: String?, val joints: IntArray, val skeleton: Int, val inverseBindMatrices: Int,
    extras: String?, extensions: Array<KExtension>,
) : KProperty(name, extras, extensions)

class KAnimationSampler(
    val input: Int, val output: Int, val interpolation: Int, extras: String?, extensions: Array<KExtension>,
) : KProperty(null, extras, extensions)

class KAnimationChannel(
    val sampler: Int, val targetNode: Int, val targetPath: Int, extras: String?, extensions: Array<KExtension>,
) : KProperty(null, extras, extensions)

class KAnimation(
    name: String?, val samplers: Array<KAnimationSampler>, val channels: Array<KAnimationChannel>,
    extras: String?, extensions: Array<KExtension>,
) : KProperty(name, extras, extensions)

class KPerspective(val aspectRatio: Float?, val yfov: Float, val zfar: Float?, val znear: Float, val extras: String?)
class KOrthographic(val xmag: Float, val ymag: Float, val zfar: Float, val znear: Float, val extras: String?)

class KCamera(
    name: String?, val type: Int, val perspective: KPerspective?, val orthographic: KOrthographic?,
    extras: String?, extensions: Array<KExtension>,
) : KProperty(name, extras, extensions)

class KLight(
    name: String?, val color: FloatArray, val intensity: Float, val type: Int, val range: Float,
    val innerConeAngle: Float, val outerConeAngle: Float, extras: String?,
) : KProperty(name, extras, emptyArray())

class KVariant(name: String?, extras: String?) : KProperty(name, extras, emptyArray())

class KotlinGltf(
    val asset: KAsset, val buffers: Array<KBuffer>, val bufferViews: Array<KBufferView>,
    val accessors: Array<KAccessor>, val meshes: Array<KMesh>, val materials: Array<KMaterial>,
    val images: Array<KImage>, val textures: Array<KTexture>, val samplers: Array<KSampler>,
    val nodes: Array<KNode>, val scenes: Array<KScene>, val scene: Int, val skins: Array<KSkin>,
    val animations: Array<KAnimation>, val cameras: Array<KCamera>, val lights: Array<KLight>,
    val variants: Array<KVariant>, val extensionsUsed: Array<String>, val extensionsRequired: Array<String>,
    extras: String?, extensions: Array<KExtension>,
) : KProperty(null, extras, extensions) {
    internal var bufferSources: Array<ByteArray> = emptyArray()
    internal var bufferOffsets: IntArray = emptyInts
    internal var vectorized: Boolean = false
    lateinit var source: ByteArray
        internal set
    var binOffset: Int = 0
        internal set
    var binSize: Int = 0
        internal set
}
