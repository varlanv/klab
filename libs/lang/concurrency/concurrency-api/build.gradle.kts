plugins {
    alias(libs.plugins.internalConvention)
}

description = "Concurrency API"

dependencies {
    api(projects.libs.lang.collections)
}
