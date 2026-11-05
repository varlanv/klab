package com.varlanv.klab.mem

import java.lang.foreign.Arena
import java.util.concurrent.atomic.AtomicInteger

sealed interface JdkArenaProvider {

    fun get(): Arena

    data object Confined : JdkArenaProvider {
        override fun get(): Arena = Arena.ofConfined()
    }

    data object Shared : JdkArenaProvider {
        override fun get(): Arena = Arena.ofShared()
    }

    data object Global : JdkArenaProvider {
        override fun get(): Arena = Arena.global()
    }

    data object Auto : JdkArenaProvider {
        override fun get(): Arena = Arena.ofAuto()
    }

    class Debug(val generator: () -> Arena) : JdkArenaProvider {
        private val getCalls = AtomicInteger()
        override fun get(): Arena {
            getCalls.incrementAndGet()
            return generator()
        }

        fun getCalled(): Int = getCalls.get()
    }
}
