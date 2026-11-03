package com.varlanv.klab.glb.kotlin

import com.varlanv.klab.shortViewHandle
import jdk.incubator.vector.ByteVector
import jdk.incubator.vector.IntVector
import jdk.incubator.vector.ShortVector
import jdk.incubator.vector.VectorOperators
import java.nio.ByteOrder

internal object GltfIndexDecoder {
    private val bytesSpecies = ByteVector.SPECIES_PREFERRED
    private val shortsSpecies = ShortVector.SPECIES_PREFERRED
    private val intsSpecies = IntVector.SPECIES_PREFERRED
    private val swapBytes = ByteOrder.nativeOrder() != ByteOrder.LITTLE_ENDIAN

    fun copyShorts(bytes: ByteArray, start: Int, count: Int, out: IntArray) {
        var index = 0
        val end = shortsSpecies.loopBound(count)
        val half = intsSpecies.length()
        while (index < end) {
            var lanes = ByteVector.fromArray(bytesSpecies, bytes, start + index * 2).reinterpretAsShorts()
            if (swapBytes) lanes = lanes.lanewise(VectorOperators.REVERSE_BYTES)
            (lanes.convertShape(VectorOperators.ZERO_EXTEND_S2I, intsSpecies, 0) as IntVector).intoArray(out, index)
            (lanes.convertShape(VectorOperators.ZERO_EXTEND_S2I, intsSpecies, 1) as IntVector).intoArray(out, index + half)
            index += shortsSpecies.length()
        }
        while (index < count) {
            out[index] = (shortViewHandle.get(bytes, start + index * 2) as Short).toInt() and 65535
            index++
        }
    }

    fun copyBytes(bytes: ByteArray, start: Int, count: Int, out: IntArray) {
        var index = 0
        val end = bytesSpecies.loopBound(count)
        val quarter = intsSpecies.length()
        while (index < end) {
            val lanes = ByteVector.fromArray(bytesSpecies, bytes, start + index)
            (lanes.convertShape(VectorOperators.ZERO_EXTEND_B2I, intsSpecies, 0) as IntVector).intoArray(out, index)
            (lanes.convertShape(VectorOperators.ZERO_EXTEND_B2I, intsSpecies, 1) as IntVector).intoArray(out, index + quarter)
            (lanes.convertShape(VectorOperators.ZERO_EXTEND_B2I, intsSpecies, 2) as IntVector).intoArray(out, index + quarter * 2)
            (lanes.convertShape(VectorOperators.ZERO_EXTEND_B2I, intsSpecies, 3) as IntVector).intoArray(out, index + quarter * 3)
            index += bytesSpecies.length()
        }
        while (index < count) {
            out[index] = bytes[start + index].toInt() and 255
            index++
        }
    }
}
