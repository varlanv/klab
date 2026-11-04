package com.varlanv.klab.text

import com.varlanv.klab.bin.BytesSlice

typealias Str = BytesSlice

fun String.toStr(): Str {
    val arr = encodeToByteArray()
    return BytesSlice(arr, 0, arr.size)
}
