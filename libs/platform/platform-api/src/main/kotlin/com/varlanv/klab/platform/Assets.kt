package com.varlanv.klab.platform

import com.varlanv.klab.Std
import com.varlanv.klab.TracedCloseable
import com.varlanv.klab.gpu.assets.PreparedModel
import com.varlanv.klab.mem.NativeAllocator
import com.varlanv.klab.renderer.GpuModel

interface Assets : TracedCloseable {

    /** Assets closes uploaded models. Prepared storage may be released after this call. */
    context(std: Std)
    fun uploadModel(gpa: NativeAllocator, source: PreparedModel): GpuModel
}
