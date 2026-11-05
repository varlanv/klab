plugins {
    alias(libs.plugins.internalConvention)
}

dependencies {
    api(projects.libs.graphics.rendererApi)
    api(projects.libs.lang.mem)
    implementation(projects.libs.lang.collections)
    implementation(projects.libs.lang.common)
    implementation(projects.libs.graphics.sdl3)
    implementation(projects.shaders.shadersPrimitive)
}
