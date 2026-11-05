package com.varlanv.klab.bin

import com.varlanv.klab.collections.BytesSlice

typealias Str = BytesSlice

fun String.toStr(): Str {
    val arr = encodeToByteArray()
    return BytesSlice(arr, 0, arr.size)
}
