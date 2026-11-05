plugins {
    alias(libs.plugins.internalConvention)
}

description =
    "Application / platform level integration - owns window, events, input collection, clocks, startup/shutdown, etc"

dependencies {
    implementation(projects.libs.lang.common)
    implementation(projects.libs.lang.mem)
    implementation(projects.libs.graphics.rendererApi)
    implementation(projects.libs.graphics.sdl3)
    implementation(projects.libs.graphics.gpuAssets)
    api(projects.libs.platform.platformApi)
}
