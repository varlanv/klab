plugins {
    alias(libs.plugins.internalConvention)
}

description = "Shared application entrypoint logic"

internalConvention.mainAppCommonDependencies(project)

dependencies {
    implementation(projects.libs.graphics.glbLoader)
}

tasks.processResources {
    from(rootProject.layout.projectDirectory.dir("assets")) {
        into("assets")
        exclude("tmp/**")
    }
}
