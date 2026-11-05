plugins {
    alias(libs.plugins.internalConvention)
}

dependencies {
    api(projects.libs.lang.mem)
    implementation(projects.libs.lang.collections)
    implementation(projects.libs.graphics.sdl3FfiGenerated)
}
