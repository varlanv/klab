plugins {
    alias(libs.plugins.internalConvention)
}

description = "Kotlin implementation of glTF and GLB loading and parsing"

dependencies {
    implementation(projects.libs.lang.bin)
    implementation(projects.libs.lang.collections)
    implementation(projects.libs.graphics.gpuAssets)
    implementation(projects.libs.graphics.glb.glbApi)
}

tasks.processTestResources {
    from(rootProject.isolated.projectDirectory.dir("assets/models/duck")) {
        into("models/duck")
        include("Duck.glb")
    }
}
