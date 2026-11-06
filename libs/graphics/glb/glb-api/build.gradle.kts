plugins {
    alias(libs.plugins.internalConvention)
}

description = "Kotlin glTF and GLB models"

dependencies {
    implementation(projects.libs.graphics.assets.assetsApi)
    implementation(projects.libs.lang.collections)
}
