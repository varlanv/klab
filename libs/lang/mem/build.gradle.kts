plugins {
    alias(libs.plugins.internalConvention)
}

description = "Memory management utilities"

dependencies {
    implementation(projects.libs.lang.collections)
}
