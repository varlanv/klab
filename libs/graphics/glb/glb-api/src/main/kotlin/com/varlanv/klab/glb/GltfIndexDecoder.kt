package com.varlanv.klab.glb

import com.varlanv.klab.collections.Bytes
import com.varlanv.klab.collections.MutInts
import com.varlanv.klab.vector.shortViewHandle
import jdk.incubator.vector.ByteVector
import jdk.incubator.vector.IntVector
import jdk.incubator.vector.ShortVector
import jdk.incubator.vector.VectorOperators
import java.nio.ByteOrder

internal const val VECTOR_PART_0 = 0
internal const val VECTOR_PART_1 = 1
internal const val VECTOR_PART_2 = 2
internal const val VECTOR_PART_3 = 3

internal object GltfIndexDecoder {
    private val bytesSpecies = ByteVector.SPECIES_PREFERRED
    private val shortsSpecies = ShortVector.SPECIES_PREFERRED
    private val intsSpecies = IntVector.SPECIES_PREFERRED
    private val swapBytes = ByteOrder.nativeOrder() != ByteOrder.LITTLE_ENDIAN

    fun copyShorts(bytes: Bytes, start: Int, count: Int, out: MutInts) {
        var index = 0
        val end = shortsSpecies.loopBound(count)
        val half = intsSpecies.length()
        while (index < end) {
            var lanes =
                ByteVector.fromArray(bytesSpecies, bytes, start + index * Short.SIZE_BYTES).reinterpretAsShorts()
            if (swapBytes) {
                lanes = lanes.lanewise(VectorOperators.REVERSE_BYTES)
            }
            (lanes.convertShape(
                VectorOperators.ZERO_EXTEND_S2I,
                intsSpecies,
                VECTOR_PART_0
            ) as IntVector).intoArray(out, index)
            (lanes.convertShape(VectorOperators.ZERO_EXTEND_S2I, intsSpecies, VECTOR_PART_1) as IntVector).intoArray(
                out,
                index + half
            )
            index += shortsSpecies.length()
        }
        while (index < count) {
            out[index] =
                (shortViewHandle.get(bytes, start + index * Short.SIZE_BYTES) as Short).toInt() and UNSIGNED_SHORT_MASK
            index++
        }
    }

    fun copyBytes(bytes: Bytes, start: Int, count: Int, out: MutInts) {
        var index = 0
        val end = bytesSpecies.loopBound(count)
        val quarter = intsSpecies.length()
        while (index < end) {
            val lanes = ByteVector.fromArray(bytesSpecies, bytes, start + index)
            (lanes.convertShape(
                VectorOperators.ZERO_EXTEND_B2I,
                intsSpecies,
                VECTOR_PART_0
            ) as IntVector).intoArray(out, index)
            (lanes.convertShape(VectorOperators.ZERO_EXTEND_B2I, intsSpecies, VECTOR_PART_1) as IntVector).intoArray(
                out,
                index + quarter
            )
            (lanes.convertShape(VectorOperators.ZERO_EXTEND_B2I, intsSpecies, VECTOR_PART_2) as IntVector).intoArray(
                out,
                index + quarter * VECTOR_PART_2
            )
            (lanes.convertShape(VectorOperators.ZERO_EXTEND_B2I, intsSpecies, VECTOR_PART_3) as IntVector).intoArray(
                out,
                index + quarter * VECTOR_PART_3
            )
            index += bytesSpecies.length()
        }
        while (index < count) {
            out[index] = bytes[start + index].toInt() and UNSIGNED_BYTE_MASK
            index++
        }
    }
}
