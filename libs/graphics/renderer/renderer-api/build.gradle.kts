plugins {
    alias(libs.plugins.internalConvention)
}

dependencies {
    implementation(projects.libs.lang.common)
    implementation(projects.libs.lang.collections)
    implementation(projects.libs.graphics.sdl3.sdl3Api)
}
