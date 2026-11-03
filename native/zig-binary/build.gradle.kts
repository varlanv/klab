import com.varlanv.gradle.plugin.configureZigCompiler

plugins {
    alias(libs.plugins.internalConvention) apply false
}

description = "Zig compiler binary installer"

configureZigCompiler(project)
