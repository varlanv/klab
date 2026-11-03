plugins {
    alias(libs.plugins.internalConvention)
}

description = "Shared application entrypoint logic"

internalConvention.mainAppCommonDependencies(project)
