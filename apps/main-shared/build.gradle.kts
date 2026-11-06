@file:Suppress("UnstableApiUsage")

plugins {
    alias(libs.plugins.internalConvention)
}

description = "Shared application entrypoint logic"

internalConvention.mainAppCommonDependencies(project)

dependencies {
    implementation(projects.libs.graphics.glb.glbLoader)
    implementation(projects.libs.lang.collections)
    implementation(projects.libs.lang.bin)
    implementation(projects.libs.lang.common)
    implementation(projects.libs.lang.mem)
    implementation(projects.libs.graphics.assets.assetsApi)
    implementation(projects.libs.graphics.assets.assetsImpl)
    implementation(projects.libs.platform.platformApi)
    implementation(projects.libs.platform.platformImpl)
    implementation(projects.libs.simulation.simulationApi)
    implementation(projects.libs.simulation.simulationImpl)
    implementation(projects.libs.presentation.presentationApi)
    implementation(projects.libs.presentation.presentationImpl)
}

tasks.processResources {
    from(rootProject.isolated.projectDirectory.dir("assets")) {
        into("assets")
        exclude("tmp/**")
    }
}
