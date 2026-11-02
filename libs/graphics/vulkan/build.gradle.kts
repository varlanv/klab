plugins {
    alias(libs.plugins.internalMultiplatform)
}

kotlin {
    internalConvention.configureMainTargets(this)

    sourceSets {
        commonMain {
            dependencies {
                implementation(projects.libs.lang)
            }
        }
    }
}
