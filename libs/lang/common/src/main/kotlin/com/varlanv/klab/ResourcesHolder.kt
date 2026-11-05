package com.varlanv.klab

class ResourcesHolder {

    private val mutResources = mutableListOf<TracedCloseable>()
    val resources: List<TracedCloseable> = mutResources

    fun <T : TracedCloseable> register(closeable: T): T {
        mutResources.add(closeable)
        return closeable
    }

    context(std: Std)
    fun release() {
        for (index in resources.indices.reversed()) {
            resources[index].close()
        }
    }

    companion object {

        context(std: Std)
        inline fun <T> safeAllocate(block: (ResourcesHolder) -> T): T {
            val holder = ResourcesHolder()
            try {
                return block(holder)
            } catch (t: Throwable) {
                holder.release()
                throw t
            }
        }
    }
}
