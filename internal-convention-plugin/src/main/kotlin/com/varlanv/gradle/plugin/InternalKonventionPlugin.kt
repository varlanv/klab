package com.varlanv.gradle.plugin

import kotlinx.kover.gradle.plugin.KoverGradlePlugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.api.logging.Logging
import org.gradle.jvm.toolchain.JavaLanguageVersion
import org.gradle.jvm.toolchain.JvmVendorSpec
import org.gradle.plugins.ide.idea.IdeaPlugin
import org.gradle.plugins.ide.idea.model.IdeaModel
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension

class InternalKonventionPlugin : Plugin<Project> {

    companion object {
        private val log = Logging.getLogger("internal-convention.app")
    }

    private class Impl(private val project: Project) {
        private val projectName = project.name
        private val projectLayout = project.layout
        private val extensions = project.extensions
        private val providers = project.providers
        private val pluginManager = project.pluginManager
        private val tasks = project.tasks
        private val repositories = project.repositories
        private val dependencies = project.dependencies
        private val rootDir = project.rootDir.toPath()
        private val internalEnvironment = extensions.findByName(InternalEnvironment.NAME) as InternalEnvironment?
            ?: InternalEnvironment(providers.environmentVariable("CI").isPresent, false)
        private val internalProperties = extensions.findByName(InternalProperties.NAME) as InternalProperties?
            ?: InternalProperties(extensions.getByName("versionCatalogs") as VersionCatalogsExtension)
        private val internalKonventionExtension =
            extensions.findByName(InternalKonventionExtension.NAME) as InternalKonventionExtension?
                ?: extensions.create(InternalKonventionExtension.NAME, InternalKonventionExtension::class.java)
        private val javaVersion = internalProperties.getVersion("javaVersion")
        private val kotlinVersion = internalProperties.getVersion("kotlinVersion")
        private val jvmVendor = JvmVendorSpec.ADOPTIUM
        private val staticAnalyseDir = rootDir.resolve(".config").resolve("static-analyse")

        init {
            internalKonventionExtension.internalModule.convention(false)
        }

        fun run() {
            configureRepositories()
            pluginManager.apply(internalProperties.getPlugin("kotlin-jvm").get().pluginId)
//            pluginManager.apply("org.jetbrains.kotlin.kapt")
            project.afterEvaluate {
                applyCommonPlugins()
                configureKotlin()
                configureCommonDependencies()
                configureTests()
                configureLinters()
            }
        }

        fun applyCommonPlugins() {
            if (internalEnvironment.isLocal()) {
                pluginManager.apply(IdeaPlugin::class.java)
                extensions.configure<IdeaModel>("idea") {
                    it.module.isDownloadJavadoc = true
                    it.module.isDownloadSources = true
                }
            }
            pluginManager.apply(KoverGradlePlugin::class.java)
        }

        fun configureCommonDependencies() {
            if (projectName != "common-test") {
                dependencies.add(
                    "testImplementation",
                    dependencies.project(mapOf("path" to ":testing:common-test"))
                )
            }
        }

        fun configureRepositories() {
            if (internalEnvironment.isLocal()) {
                repositories.add(repositories.mavenLocal())
            }
            repositories.add(repositories.mavenCentral())
        }

        fun configureKotlin() {
            extensions.configure<KotlinJvmProjectExtension>("kotlin") { kotlin ->
                kotlin.compilerOptions {
                    jvmTarget.set(JvmTarget.fromTarget(javaVersion))
                    allWarningsAsErrors.set(false)
                    extraWarnings.set(true)
                    progressiveMode.set(true)
                    freeCompilerArgs.addAll(
                        "-Xjsr305=strict",
                        "-Xadd-modules=jdk.incubator.vector",
                    )
                }
                kotlin.jvmToolchain { jvmToolchain ->
                    jvmToolchain.languageVersion.set(JavaLanguageVersion.of(javaVersion))
                    jvmToolchain.vendor.set(jvmVendor)
                }
            }
        }

        fun configureTests() {
            tasks.withType(org.gradle.api.tasks.testing.Test::class.java).configureEach { test ->
                test.useJUnitPlatform()
//                test.outputs.upToDateWhen { false }
                test.testLogging { logging ->
                    logging.showStandardStreams = true
                    logging.showStackTraces = true
                }
                val xms = providers.gradleProperty("internalKonventionMs").getOrElse("2g")
                val xmx = providers.gradleProperty("internalKonventionMx").getOrElse("4g")
                test.jvmArgs = test.jvmArgs + listOf(
                    "-XX:TieredStopAtLevel=1",
                    "-Xms$xms",
                    "-Xmx$xmx",
                    "-Dfile.encoding=UTF-8",
                    "-Xadd-modules=jdk.incubator.vector",
                )
            }
        }

        fun configureLinters() {
            tasks.register("lint") { task ->
                task.group = "verification"
                // todo
            }
            tasks.register("format") { task ->
                task.group = "verification"
                // todo
            }
        }
    }

    override fun apply(target: Project) {
        Impl(target).run()
    }
}
