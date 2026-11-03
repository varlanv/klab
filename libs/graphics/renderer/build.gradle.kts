plugins {
    alias(libs.plugins.internalConvention)
}

dependencies {
    implementation(projects.libs.lang)
    implementation(projects.libs.graphics.sdl3)
}
