package com.varlanv.klab.graphics.vulkan

import com.varlanv.klab.graphics.vulkan.generated.*
import java.lang.foreign.*

val linker: Linker = Linker.nativeLinker()
val vulkanVersion = Vulkan.VK_API_VERSION_1_1()
val vkDestroyInstanceName: MemorySegment = Arena.global().allocateFrom("vkDestroyInstance")
val vkCreateInstanceName: MemorySegment = Arena.global().allocateFrom("vkCreateInstance")

fun main() {
    val arena = Arena.global()
    val vulkan = SymbolLookup.libraryLookup("libvulkan.so.1", arena)
    val getProcAddr = vulkan.find("vkGetInstanceProcAddr").orElseThrow()

    val createInstance = PFN_vkGetInstanceProcAddr.invoke(
        getProcAddr,
        MemorySegment.NULL,
        vkCreateInstanceName,
    ).let {
        check(it.address() != 0L)
        linker.downcallHandle(it, PFN_vkCreateInstance.descriptor())
    }

    val createInfo = arena.allocate(VkInstanceCreateInfo.layout())
    VkInstanceCreateInfo.sType(createInfo, Vulkan.VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO())
    VkInstanceCreateInfo.pNext(createInfo, MemorySegment.NULL)
    VkInstanceCreateInfo.flags(createInfo, 0)
    VkInstanceCreateInfo.pApplicationInfo(createInfo, MemorySegment.NULL)
    VkInstanceCreateInfo.enabledLayerCount(createInfo, 0)
    VkInstanceCreateInfo.ppEnabledLayerNames(createInfo, MemorySegment.NULL)
    VkInstanceCreateInfo.enabledExtensionCount(createInfo, 0)
    VkInstanceCreateInfo.ppEnabledExtensionNames(createInfo, MemorySegment.NULL)

    val addr = arena.allocate(ValueLayout.ADDRESS.byteSize())
    val res = createInstance.invokeExact(createInfo, MemorySegment.NULL, addr) as Int
    check(res == Vulkan.VK_SUCCESS()) { "vkCreateInstance failed: $res" }
    val instance = addr.get(ValueLayout.ADDRESS, 0L)

    val destroyAddress = PFN_vkGetInstanceProcAddr.invoke(
        getProcAddr,
        instance,
        vkDestroyInstanceName,
    )
    check(destroyAddress.address() != 0L)

    val destroyInstance = linker.downcallHandle(
        destroyAddress,
        PFN_vkDestroyInstance.descriptor(),
    )

    try {
        println(instance.address())
    } finally {
        destroyInstance.invokeExact(instance, MemorySegment.NULL) as Unit
    }

//    PFN_vkEnumeratePhysicalDevices.invoke()

//    val vkGetDeviceProcAddr = PFN_vkGetDeviceProcAddr.invoke(
//        getProcAddr,
//        MemorySegment.NULL,
//        arena.allocateFrom("vkGetDeviceProcAddr"),
//    ).let {
//        check(it.address() != 0L)
//        linker.downcallHandle(it, VkDeviceInfo.descriptor())
//    }

//    vkGetDeviceProcAddr.invokeExact()
}
