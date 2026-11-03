import com.varlanv.gradle.plugin.configureZigLibrary

plugins {
    alias(libs.plugins.internalConvention) apply false
}

description = "Native library compiled with Zig"

configureZigLibrary(project)
