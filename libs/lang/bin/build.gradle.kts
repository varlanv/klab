plugins {
    alias(libs.plugins.internalConvention)
}

description = "Binary and bytes utilities"

dependencies {
    api(projects.libs.lang.collections)
}
