plugins {
    alias(libs.plugins.internalConvention)
}

description = "Concurrency implementation"

dependencies {
    api(projects.libs.lang.concurrency.concurrencyApi)
}
