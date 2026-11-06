plugins {
    alias(libs.plugins.internalConvention)
}

dependencies {
    implementation(projects.libs.lang.collections)
    implementation(projects.libs.lang.common)
    implementation(projects.libs.lang.mem)
    implementation(projects.libs.graphics.renderer.rendererApi)
}
