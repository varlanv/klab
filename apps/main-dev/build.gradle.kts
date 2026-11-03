plugins {
    alias(libs.plugins.internalConvention)
}

description = "Dev-specific application entrypoint wiring"

internalConvention.mainAppCommonConfiguration(project, "debug")

dependencies {
    implementation(projects.apps.mainShared)
}
