plugins {
    alias(libs.plugins.internalConvention)
}

description = "Application / platform level API"

dependencies {
    api(projects.libs.lang.common)
    api(projects.libs.lang.mem)
    api(projects.libs.graphics.rendererApi)
    api(projects.libs.graphics.gpuAssets)
    api(projects.libs.graphics.sdl3)
}
