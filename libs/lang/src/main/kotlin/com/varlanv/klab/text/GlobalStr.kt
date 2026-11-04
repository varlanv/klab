package com.varlanv.klab.text

import com.varlanv.klab.collections.Bytes
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment

/**
 * Readonly String wrapper for different APIs.
 * Should be declared only at top level as global value.
 */
class GlobalStr(val string: String) {
    val utf8Bytes: Bytes = string.encodeToByteArray()
    val utf8CString: MemorySegment = Arena.global().allocateFrom(string, Charsets.UTF_8)

    override fun hashCode(): Int = string.hashCode()

    override fun equals(other: Any?): Boolean = other is GlobalStr && other.string == string
}

fun String.global(): GlobalStr = GlobalStr(this)
