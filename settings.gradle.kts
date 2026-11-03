pluginManagement {
    repositories {
        if (providers.environmentVariable("CI").getOrNull() == null) {
            mavenLocal()
        }
        gradlePluginPortal()
    }
    plugins {
        id("org.gradle.toolchains.foojay-resolver-convention").version(
            providers.gradleProperty("foojayToolchainPluginVersion").get()
        )
    }
    includeBuild("internal-convention-plugin")
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention")
}

rootProject.name = "klab"

val isCi = providers.environmentVariable("CI").getOrNull() != null

buildCache {
    local {
        isEnabled = !isCi
        isPush = !isCi
    }
}

enableFeaturePreview("STABLE_CONFIGURATION_CACHE")
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include(
    listOf(
        "apps:main-release",
        "apps:main-dev",
        "apps:main-shared",
        "libs:lang",
        "libs:graphics:renderer",
        "libs:graphics:sdl3",
        "libs:graphics:sdl3-ffi-generated",
        "testing:common-test",
    )
)
