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
        // apps
        "apps:main-release",
        "apps:main-dev",
        "apps:main-shared",
        // libs
        "libs:lang:common",
        "libs:lang:mem",
        "libs:lang:bin",
        "libs:lang:collections",
        "libs:platform:platform-api",
        "libs:platform:platform-impl",
        "libs:presentation:presentation-api",
        "libs:presentation:presentation-impl",
        "libs:simulation:simulation-api",
        "libs:simulation:simulation-impl",
        // graphics
        "libs:graphics:assets:assets-api",
        "libs:graphics:assets:assets-impl",
        "libs:graphics:renderer:renderer-api",
        "libs:graphics:renderer:renderer-impl",
        "libs:graphics:glb:glb-api",
        "libs:graphics:glb:glb-loader",
        "libs:graphics:sdl3:sdl3-api",
        "libs:graphics:sdl3:sdl3-bindings-generated",
        // shaders
        "shaders:slang-binary",
        "shaders:shaders-primitive",
        // native
//        "native:zig-lib",
//        "native:zig-binary",
        // tests
        "testing:common-test",
    )
)
