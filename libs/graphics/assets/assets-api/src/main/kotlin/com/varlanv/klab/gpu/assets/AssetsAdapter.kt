package com.varlanv.klab.gpu.assets

import com.varlanv.klab.collections.Bytes

/**
 * Adapts assets from its protocol representation into common layout [PreparedModel].
 * Does not load prepared model into GPU.
 */
interface AssetsAdapter {
    fun load(source: Bytes): PreparedModel
}
