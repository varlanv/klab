plugins {
    alias(libs.plugins.internalConvention)
}

dependencies {
    api(projects.libs.graphics.sdl3)
    api(projects.libs.lang.common)
    api(projects.libs.lang.collections)
}
