plugins {
    alias(libs.plugins.internalConvention)
}

description = "Release-specific application entrypoint wiring"

internalConvention.mainAppCommonConfiguration(project, "fast")
