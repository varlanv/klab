plugins {
    alias(libs.plugins.internalConvention)
}

description = "Renderer API for decoupling big rendere complie time dependencies from consumers"

dependencies {
    implementation(projects.libs.lang)
}
