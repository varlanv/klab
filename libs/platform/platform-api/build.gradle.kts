plugins {
    alias(libs.plugins.internalConvention)
}

description = "Application / platform level API"

dependencies {
    implementation(projects.libs.lang.common)
    implementation(projects.libs.lang.mem)
    implementation(projects.libs.graphics.assets.assetsApi)
    implementation(projects.libs.graphics.sdl3.sdl3Api)
}
