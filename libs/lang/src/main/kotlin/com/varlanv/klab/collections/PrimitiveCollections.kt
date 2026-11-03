/**
 * Primitive collections aliases to distinguish between mutable and immutable operations with zero runtime cost.
 * Currently, nothing guarantees immutability except developer's consciousness and usage agreement.
 */
@file:Suppress("NOTHING_TO_INLINE")

package com.varlanv.klab.collections

import com.varlanv.klab.intViewHandle
import com.varlanv.klab.longViewHandle
import com.varlanv.klab.shortViewHandle

val stableEmptyBytes: Bytes = Bytes(0)
val stableMutBytes: MutBytes = stableEmptyBytes
val stableEmptyChars: Chars = Chars(0)
val stableMutChars: MutChars = stableEmptyChars
val stableEmptyInts: Ints = Ints(0)
val stableMutInts: MutInts = stableEmptyInts
val stableEmptyLongs: Longs = Longs(0)
val stableMutLongs: MutLongs = stableEmptyLongs
val stableEmptyShorts: Shorts = Shorts(0)
val stableMutShorts: MutShorts = stableEmptyShorts
val stableEmptyFloats: Floats = Floats(0)
val stableMutFloats: MutFloats = stableEmptyFloats
val stableEmptyDoubles: Doubles = Doubles(0)
val stableMutDoubles: MutDoubles = stableEmptyDoubles

/**
 * Immutable by contract [ByteArray] alias.
 */
typealias Bytes = ByteArray
/**
 * Mutable by contract [ByteArray] alias.
 */
typealias MutBytes = ByteArray

/**
 * Immutable by contract [CharArray] alias.
 */
typealias Chars = CharArray
/**
 * Mutable by contract [CharArray] alias.
 */
typealias MutChars = CharArray

/**
 * Immutable by contract [IntArray] alias.
 */
typealias Ints = IntArray
/**
 * Mutable by contract [IntArray] alias.
 */
typealias MutInts = IntArray

/**
 * Immutable by contract [LongArray] alias.
 */
typealias Longs = LongArray
/**
 * Mutable by contract [LongArray] alias.
 */
typealias MutLongs = LongArray

/**
 * Immutable by contract [ShortArray] alias.
 */
typealias Shorts = ShortArray
/**
 * Mutable by contract [ShortArray] alias.
 */
typealias MutShorts = ShortArray

/**
 * Immutable by contract [FloatArray] alias.
 */
typealias Floats = FloatArray
/**
 * Mutable by contract [FloatArray] alias.
 */
typealias MutFloats = FloatArray

/**
 * Immutable by contract [DoubleArray] alias.
 */
typealias Doubles = DoubleArray
/**
 * Mutable by contract [DoubleArray] alias.
 */
typealias MutDoubles = DoubleArray


inline fun Bytes.getPackedLong(idx: Int): Long = longViewHandle.get(this, idx) as Long

inline fun Bytes.setPackedLong(idx: Int, value: Long) {
    longViewHandle.set(this, idx, value)
}

inline fun Bytes.getPackedInt(idx: Int): Int = intViewHandle.get(this, idx) as Int

inline fun Bytes.setPackedInt(idx: Int, value: Int) {
    intViewHandle.set(this, idx, value)
}

inline fun Bytes.setPackedShort(idx: Int, value: Short) {
    shortViewHandle.set(this, idx, value)
}

inline fun Bytes.getPackedShort(idx: Int): Short = shortViewHandle.get(this, idx) as Short
