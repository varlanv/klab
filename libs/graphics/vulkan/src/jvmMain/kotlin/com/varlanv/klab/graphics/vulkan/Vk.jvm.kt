package com.varlanv.klab.graphics.vulkan

import java.lang.foreign.*
import java.lang.invoke.MethodHandle

val linker: Linker = Linker.nativeLinker()

class Vk {

    companion object {

        fun load() {
            val getVkGetInstanceProcAddr = vkGetInstanceProcAddr()
        }
    }
}

fun vkGetInstanceProcAddr(): MethodHandle {
    val vulkan = SymbolLookup.libraryLookup(
        "libvulkan.so.1",
        Arena.global()
    )

    return linker.downcallHandle(
        // PFN_vkVoidFunction vkGetInstanceProcAddr(
        // VkInstance instance,
        // const char* pName);
        vulkan.findOrThrow("vkGetInstanceProcAddr"),
        FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        )
    )
}
