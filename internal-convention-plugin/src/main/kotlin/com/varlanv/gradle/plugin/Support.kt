package com.varlanv.gradle.plugin

import com.varlanv.gradle.plugin.Arch.Arm64
import com.varlanv.gradle.plugin.Arch.X64
import com.varlanv.gradle.plugin.Os.*
import org.gradle.api.Project
import java.util.*

enum class Os {
    Windows,
    Linux,
    Mac;

    companion object {

        val jvmString = System.getProperty("os.name").lowercase(Locale.ROOT)
        val current: Os? = when {
            jvmString.startsWith("windows") -> Windows
            jvmString.startsWith("mac") || jvmString.startsWith("darwin") -> Mac
            jvmString.startsWith("linux") -> Linux
            else -> null
        }
    }
}

enum class Arch {
    X64,
    Arm64;

    companion object {

        val jvmString = System.getProperty("os.arch").lowercase(Locale.ROOT)
        val current: Arch? = when (jvmString) {
            "amd64", "x86_64" -> X64
            "aarch64", "arm64" -> Arm64
            else -> null
        }
    }
}

data class OsArch(val os: Os, val arch: Arch) {

    companion object {
        /**
         * OS + Arch that is supported for development in this repo.
         */
        val supportedForDevelopment: Set<OsArch> = setOf(Windows, Linux, Mac).flatMapTo(HashSet()) { os ->
            setOf(X64, Arm64).map { arch ->
                OsArch(
                    os = os,
                    arch = arch
                )
            }
        }

        /**
         * OS + Arch that is supported for consumers.
         */
        val supportedForConsumers: Set<OsArch> = supportedForDevelopment

        val current: OsArch? = if (Os.current == null || Arch.current == null) {
            null
        } else {
            OsArch(os = Os.current, arch = Arch.current)
        }

        fun requireCurrent(): OsArch =
            current ?: error("Unsupported Os / Arch - [ ${Os.jvmString} / ${Arch.jvmString} ]")
    }
}

enum class RunMode {
    Debug,
    Fast;

    companion object {

        fun current(project: Project): RunMode {
            val propertyName = "com.varlanv.klab.optimize"
            return when (val prop = project.providers.gradleProperty(propertyName).orNull?.lowercase()) {
                "debug" -> Debug
                "fast" -> Fast
                null -> error("Run mode is not defined in Gradle property [ $propertyName ]")
                else -> error("Unknown [ $propertyName ] value - [ $prop ]")
            }
        }
    }
}
