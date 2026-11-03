package com.varlanv.klab.glb

import com.varlanv.klab.glb.kotlin.KotlinGltf
import com.varlanv.klab.glb.kotlin.KotlinGltfLoader
import com.varlanv.klab.glb.kotlin.copyFloatsTo
import com.varlanv.klab.glb.kotlin.copyIndicesTo
import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.BenchmarkMode
import org.openjdk.jmh.annotations.Fork
import org.openjdk.jmh.annotations.Level
import org.openjdk.jmh.annotations.Measurement
import org.openjdk.jmh.annotations.Mode
import org.openjdk.jmh.annotations.OutputTimeUnit
import org.openjdk.jmh.annotations.Param
import org.openjdk.jmh.annotations.Scope
import org.openjdk.jmh.annotations.Setup
import org.openjdk.jmh.annotations.State
import org.openjdk.jmh.annotations.TearDown
import org.openjdk.jmh.annotations.Warmup
import org.openjdk.jmh.infra.Blackhole
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.SegmentAllocator
import java.lang.foreign.ValueLayout
import java.nio.file.Files
import java.nio.file.Path
import java.util.concurrent.TimeUnit

@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@Warmup(iterations = 5, time = 1)
@Measurement(iterations = 5, time = 1)
@Fork(value = 3, jvmArgsAppend = ["--add-modules=jdk.incubator.vector", "--enable-native-access=ALL-UNNAMED", "-Xms512m", "-Xmx512m"])
open class GlbLoaderBenchmark {

    @Param("/var/home/vlad/dev/projects/klab/assets/models/duck/Duck.glb")
    lateinit var path: String

    private lateinit var arena: Arena
    private lateinit var bytes: ByteArray
    private lateinit var source: MemorySegment
    private lateinit var scratch: ScratchAllocator
    private lateinit var outputs: Array<MemorySegment>
    private lateinit var kotlinOutputs: Array<FloatArray>
    private lateinit var kotlinScalar: KotlinGltfLoader
    private lateinit var kotlinVector: KotlinGltfLoader
    private lateinit var geometryAccessors: IntArray
    private lateinit var geometryIndices: BooleanArray
    private lateinit var geometryNativeOutputs: Array<MemorySegment>
    private lateinit var geometryFloatOutputs: Array<FloatArray?>
    private lateinit var geometryIndexOutputs: Array<IntArray?>

    @Setup(Level.Trial)
    fun setup() {
        bytes = Files.readAllBytes(Path.of(path))
        arena = Arena.ofConfined()
        source = arena.allocate(bytes.size.toLong(), 8)
        MemorySegment.copy(MemorySegment.ofArray(bytes), 0, source, 0, bytes.size.toLong())
        scratch = ScratchAllocator(arena.allocate(bytes.size.toLong() + 4096, 16))
        kotlinScalar = KotlinGltfLoader(vectorized = false)
        kotlinVector = KotlinGltfLoader(vectorized = true)
        with(scratch) {
            GlbLoader.load(source).use { model ->
                outputs = Array(model.accessorCount) { index ->
                    val accessor = model.accessor(index)
                    arena.allocate(accessor.count * accessor.elementType.componentCount * 4, 16)
                }
                kotlinOutputs = Array(outputs.size) { index -> FloatArray((outputs[index].byteSize() / 4).toInt()) }
                val kotlin = kotlinScalar.load(bytes)
                verify(kotlin, model)
                verify(kotlinVector.load(bytes), model)
                val accessors = ArrayList<Int>()
                val indices = ArrayList<Boolean>()
                for (mesh in kotlin.meshes) for (primitive in mesh.primitives) {
                    for (attribute in primitive.attributes) {
                        accessors.add(attribute.accessor)
                        indices.add(false)
                    }
                    if (primitive.indices >= 0) {
                        accessors.add(primitive.indices)
                        indices.add(true)
                    }
                }
                geometryAccessors = accessors.toIntArray()
                geometryIndices = BooleanArray(indices.size) { indices[it] }
                geometryNativeOutputs = Array(accessors.size) { position ->
                    val accessor = model.accessor(accessors[position])
                    val count = if (indices[position]) accessor.count else accessor.count * accessor.elementType.componentCount
                    arena.allocate(count * 4, 16)
                }
                geometryFloatOutputs = Array(accessors.size) { position ->
                    if (indices[position]) null else FloatArray((geometryNativeOutputs[position].byteSize() / 4).toInt())
                }
                geometryIndexOutputs = Array(accessors.size) { position ->
                    if (indices[position]) IntArray((geometryNativeOutputs[position].byteSize() / 4).toInt()) else null
                }
            }
        }
        scratch.reset()
    }

    @TearDown(Level.Trial)
    fun teardown() {
        arena.close()
    }

    @Benchmark
    fun ffmParseNative(blackhole: Blackhole) {
        scratch.reset()
        with(scratch) {
            GlbLoader.load(source).use { model ->
                blackhole.consume(model)
            }
        }
    }

    @Benchmark
    fun ffmParseHeap(blackhole: Blackhole) {
        scratch.reset()
        with(scratch) {
            GlbLoader.load(bytes).use { model ->
                blackhole.consume(model)
            }
        }
    }

    @Benchmark
    fun ffmLoadAndUnpackAllFloats(blackhole: Blackhole) {
        scratch.reset()
        with(scratch) {
            GlbLoader.load(source).use { model ->
                var index = 0
                while (index < outputs.size) {
                    model.accessor(index).copyFloatsTo(outputs[index])
                    blackhole.consume(outputs[index])
                    index++
                }
                blackhole.consume(model)
            }
        }
    }

    @Benchmark
    fun kotlinParseScalar(blackhole: Blackhole) {
        blackhole.consume(kotlinScalar.load(bytes))
    }

    @Benchmark
    fun kotlinParseVector(blackhole: Blackhole) {
        blackhole.consume(kotlinVector.load(bytes))
    }

    @Benchmark
    fun kotlinFreshLoader(blackhole: Blackhole) {
        blackhole.consume(KotlinGltfLoader().load(bytes))
    }

    @Benchmark
    fun kotlinLoadAndUnpackAllFloatsScalar(blackhole: Blackhole) {
        unpack(kotlinScalar.load(bytes), blackhole)
    }

    @Benchmark
    fun kotlinLoadAndUnpackAllFloatsVector(blackhole: Blackhole) {
        unpack(kotlinVector.load(bytes), blackhole)
    }

    @Benchmark
    fun ffmLoadGeometryNative(blackhole: Blackhole) {
        scratch.reset()
        with(scratch) {
            GlbLoader.load(source).use { model -> unpackGeometry(model, blackhole) }
        }
    }

    @Benchmark
    fun ffmLoadGeometryHeap(blackhole: Blackhole) {
        scratch.reset()
        with(scratch) {
            GlbLoader.load(bytes).use { model -> unpackGeometry(model, blackhole) }
        }
    }

    @Benchmark
    fun kotlinLoadGeometryScalar(blackhole: Blackhole) {
        unpackGeometry(kotlinScalar.load(bytes), blackhole)
    }

    @Benchmark
    fun kotlinLoadGeometryVector(blackhole: Blackhole) {
        unpackGeometry(kotlinVector.load(bytes), blackhole)
    }

    private fun unpackGeometry(model: GlbModel, blackhole: Blackhole) {
        var position = 0
        while (position < geometryAccessors.size) {
            val accessor = model.accessor(geometryAccessors[position])
            if (geometryIndices[position]) accessor.copyIndicesTo(geometryNativeOutputs[position])
            else accessor.copyFloatsTo(geometryNativeOutputs[position])
            blackhole.consume(geometryNativeOutputs[position])
            position++
        }
        blackhole.consume(model)
    }

    private fun unpackGeometry(model: KotlinGltf, blackhole: Blackhole) {
        var position = 0
        while (position < geometryAccessors.size) {
            if (geometryIndices[position]) {
                val output = geometryIndexOutputs[position]!!
                model.copyIndicesTo(geometryAccessors[position], output)
                blackhole.consume(output)
            } else {
                val output = geometryFloatOutputs[position]!!
                model.copyFloatsTo(geometryAccessors[position], output)
                blackhole.consume(output)
            }
            position++
        }
        blackhole.consume(model)
    }

    private fun unpack(model: KotlinGltf, blackhole: Blackhole) {
        var index = 0
        while (index < kotlinOutputs.size) {
            model.copyFloatsTo(index, kotlinOutputs[index])
            blackhole.consume(kotlinOutputs[index])
            index++
        }
        blackhole.consume(model)
    }

    private fun verify(kotlin: KotlinGltf, native: GlbModel) {
        check(kotlin.accessors.size == native.accessorCount)
        check(kotlin.meshes.size == native.meshCount)
        check(kotlin.nodes.size == native.nodeCount)
        check(kotlin.scenes.size == native.sceneCount)
        check(kotlin.materials.size == native.materialCount)
        check(kotlin.textures.size == native.textureCount)
        check(kotlin.images.size == native.imageCount)
        check(kotlin.animations.size == native.animationCount)
        check(kotlin.skins.size == native.skinCount)
        check(kotlin.scene == (native.defaultSceneIndex ?: -1))
        check(kotlin.asset.generator == native.generator)
        var index = 0
        while (index < outputs.size) {
            native.accessor(index).copyFloatsTo(outputs[index])
            kotlin.copyFloatsTo(index, kotlinOutputs[index])
            var component = 0
            while (component < kotlinOutputs[index].size) {
                check(kotlinOutputs[index][component].toBits() == outputs[index].getAtIndex(ValueLayout.JAVA_FLOAT, component.toLong()).toBits()) {
                    "Accessor $index component $component differs"
                }
                component++
            }
            index++
        }
        var meshIndex = 0
        while (meshIndex < native.meshCount) {
            val mesh = native.mesh(meshIndex)
            var primitiveIndex = 0
            while (primitiveIndex < mesh.primitiveCount) {
                val accessor = mesh.primitive(primitiveIndex).indices
                if (accessor != null) {
                    val expected = arena.allocate(accessor.count * 4, 4)
                    accessor.copyIndicesTo(expected)
                    val actual = IntArray(accessor.count.toInt())
                    val kotlinIndex = kotlin.meshes[meshIndex].primitives[primitiveIndex].indices
                    kotlin.copyIndicesTo(kotlinIndex, actual)
                    var element = 0
                    while (element < actual.size) {
                        check(actual[element] == expected.getAtIndex(ValueLayout.JAVA_INT, element.toLong()))
                        element++
                    }
                }
                primitiveIndex++
            }
            meshIndex++
        }
    }

    private class ScratchAllocator(private val memory: MemorySegment) : SegmentAllocator {
        private var position = 0L

        fun reset() {
            position = 0
        }

        override fun allocate(byteSize: Long, byteAlignment: Long): MemorySegment {
            val offset = (position + byteAlignment - 1) and -byteAlignment
            val result = memory.asSlice(offset, byteSize)
            position = offset + byteSize
            return result
        }
    }
}
