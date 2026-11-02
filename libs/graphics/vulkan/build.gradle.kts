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
        jvmMain {
            dependencies {
                implementation(projects.libs.graphics.vulkanFfiGenerated)
            }
        }
    }
}
