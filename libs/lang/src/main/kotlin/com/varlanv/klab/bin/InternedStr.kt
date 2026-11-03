package com.varlanv.klab.bin

import com.varlanv.klab.collections.Bytes
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment

class InternedStr(source: String) {
    val utf8Bytes: Bytes = source.encodeToByteArray()
    val utf8Memory: MemorySegment = Arena.global().allocateFrom(source, Charsets.UTF_8)
}
