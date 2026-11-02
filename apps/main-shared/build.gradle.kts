plugins {
    alias(libs.plugins.internalMultiplatform)
}

kotlin {
    internalConvention.configureMainTargets(this)
}
