import kotlin.jvm.optionals.getOrNull

plugins {
    alias(libs.plugins.kotlin.jvm)
    `java-gradle-plugin`
}

val isCiBuild = providers.environmentVariable("CI").orNull != null

kotlin {
    jvmToolchain {
        vendor.set(JvmVendorSpec.ADOPTIUM)
        languageVersion.set(JavaLanguageVersion.of(versionCatalogs.named("libs").findVersion("javaVersion").getOrNull()?.requiredVersion!!))
    }
}

if (!isCiBuild) {
    pluginManager.apply(IdeaPlugin::class.java)
    val idea = extensions.getByName("idea") as org.gradle.plugins.ide.idea.model.IdeaModel
    idea.module.isDownloadJavadoc = true
    idea.module.isDownloadSources = true
}

repositories {
    if (!isCiBuild) {
        mavenLocal()
    }
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation(libs.jmh.gradle)
    implementation(libs.kotlin.gradle.allopen)
    implementation(libs.kotlin.gradle.benchmark)
    implementation(libs.kotlin.gradle.kover)
    implementation(libs.kotlin.gradle.main)
    implementation(libs.proguard.gradle)
    testImplementation(libs.kotlin.test.junit5)
    testRuntimeOnly(libs.junit.jupiter.engine)
    testRuntimeOnly(libs.junit.platform.launcher)
}

gradlePlugin {
    plugins {
        create("internalGradleConventionPlugin") {
            id = libs.plugins.internalConvention.get().pluginId
            implementationClass = "com.varlanv.gradle.plugin.InternalKonventionPlugin"
        }
        create("internalGradleShadersPlugin") {
            id = libs.plugins.shadersConvention.get().pluginId
            implementationClass = "com.varlanv.gradle.plugin.SlangShaderPlugin"
        }
        create("internalGradleSlangBinaryPlugin") {
            id = libs.plugins.slangBinaryConvention.get().pluginId
            implementationClass = "com.varlanv.gradle.plugin.SlangBinaryPlugin"
        }
    }
}

tasks.test {
    useJUnitPlatform()
}
