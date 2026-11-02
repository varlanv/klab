plugins {
    alias(libs.plugins.internalMultiplatform)
}

internalConvention.configureMainTargets(kotlin)
internalConvention.mainAppCommonDependencies(kotlin)
