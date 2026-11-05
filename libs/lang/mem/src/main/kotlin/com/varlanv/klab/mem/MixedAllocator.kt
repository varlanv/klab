package com.varlanv.klab.mem

import com.varlanv.klab.collections.MutBytes

/**
 * Provides capability of off-heap [NativeAllocator] for integrating with native memory via FFM; as well as
 * allocator heap allocator [HeapAllocator] of [MutBytes] to allow efficient reuse of heap byte buffers.
 *
 * Not threadsafe unless explicitly specified.
 */
interface MixedAllocator : HeapAllocator, NativeAllocator
