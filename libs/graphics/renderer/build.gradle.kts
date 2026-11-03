plugins {
    alias(libs.plugins.internalConvention)
}

dependencies {
    implementation(projects.libs.lang)
    implementation(projects.libs.graphics.sdl3)
    implementation(projects.libs.graphics.glbLoader)
    implementation(projects.shaders.shadersPrimitive)
}
