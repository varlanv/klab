plugins {
    alias(libs.plugins.internalConvention)
}

description = "GLB loading through cgltf"

dependencies {
    implementation(projects.libs.lang)
    runtimeOnly(project(":native:zig-lib"))
}
