@file:Suppress("UnstableApiUsage")

plugins {
    alias(libs.plugins.internalConvention)
}

description = "Shared application entrypoint logic"

internalConvention.mainAppCommonDependencies(project)

dependencies {
    implementation(projects.libs.graphics.glb.glbLoader)
    implementation(projects.libs.platform.platformLogic)
}

tasks.processResources {
    from(rootProject.isolated.projectDirectory.dir("assets")) {
        into("assets")
        exclude("tmp/**")
    }
}
