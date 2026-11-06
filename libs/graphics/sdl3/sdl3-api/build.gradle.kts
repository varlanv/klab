plugins {
    alias(libs.plugins.internalConvention)
}

description = "Lightweight Kotlin wrapper for SDL3"

dependencies {
    implementation(projects.libs.lang.mem)
    implementation(projects.libs.lang.collections)
    implementation(projects.libs.graphics.sdl3.sdl3BindingsGenerated)
}
