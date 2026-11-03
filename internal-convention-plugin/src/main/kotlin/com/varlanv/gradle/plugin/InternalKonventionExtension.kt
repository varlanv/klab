package com.varlanv.gradle.plugin

import org.gradle.api.Project
import org.gradle.api.provider.Property
import org.gradle.api.tasks.testing.Test
import org.gradle.jvm.tasks.Jar
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

interface InternalKonventionExtension {

    companion object {
        const val NAME = "internalConvention"
    }

    val internalModule: Property<Boolean>

    fun mainAppCommonDependencies(project: Project) {
        val dependencies = project.dependencies
        dependencies.add("implementation", dependencies.project(":libs:graphics:renderer"))
        dependencies.add("implementation", dependencies.project(":libs:graphics:vulkan"))
    }

    fun mainAppCommonConfiguration(project: Project, targetOptimize: String) {
        configureOptimize(project, targetOptimize)
        val dependencies = project.dependencies
        dependencies.add("implementation", dependencies.project(":apps:main-shared"))
    }

    fun configureProguard(project: Project, aggressiveOptimizations: Boolean = false) {
//        // todo
//        val kmp = project.extensions.getByType(KotlinMultiplatformExtension::class.java)
//        val jvm = kmp.targets.getByName("jvm") as KotlinJvmTarget
//        val main = jvm.compilations.getByName("main")
//        val jar = project.tasks.named(jvm.artifactsTaskName, Jar::class.java)
//        val runtimeClasspath = project.configurations.named(main.runtimeDependencyConfigurationName)
//        val javaVersion = project.extensions.getByType(VersionCatalogsExtension::class.java)
//            .named("libs").findVersion("javaVersion").get().requiredVersion
//        val toolchains = project.extensions.getByType(JavaToolchainService::class.java)
//        val launcher = toolchains.launcherFor {
//            it.languageVersion.set(JavaLanguageVersion.of(javaVersion))
//            it.vendor.set(JvmVendorSpec.ADOPTIUM)
//        }
//        val javaHome = launcher.get().metadata.installationPath
//        val jmods = javaHome.dir("jmods")
//        val jdkLibraries = if (jmods.asFile.isDirectory) {
//            jmods.asFileTree.matching { it.include("*.jmod") }
//        } else {
//            val extractedModules = project.layout.buildDirectory.dir("proguard/jdk-modules").get()
//            val jimage = if (System.getProperty("os.name").startsWith("Windows")) "jimage.exe" else "jimage"
//            val extractJdk = project.tasks.register("extractProguardJdk", Exec::class.java) { task ->
//                task.description = "Extracts JDK classes for ProGuard."
//                task.inputs.file(javaHome.file("lib/modules"))
//                task.outputs.dir(extractedModules)
//                task.executable(javaHome.file("bin/$jimage").asFile)
//                task.args("extract", "--dir", extractedModules.asFile, javaHome.file("lib/modules").asFile)
//                task.doFirst {
//                    extractedModules.asFile.deleteRecursively()
//                }
//            }
//            val moduleNames = project.providers.fileContents(javaHome.file("release")).asText.get()
//                .lineSequence().first { it.startsWith("MODULES=") }
//                .substringAfter("=").removeSurrounding("\"").split(" ")
//            project.files(moduleNames.map { extractedModules.dir(it) }).builtBy(extractJdk)
//        }
//
//        project.tasks.register("proguard", ProGuardTask::class.java) { task ->
//            task.group = "build"
//            task.description = "Shrinks and optimizes the JVM application and its runtime dependencies."
//            task.dependsOn(jar, runtimeClasspath, jdkLibraries)
//            task.injars(jar.flatMap { it.archiveFile })
//            task.injars(
//                mapOf("filter" to "!module-info.class,!META-INF/versions/**/module-info.class,!META-INF/*.SF,!META-INF/*.RSA,!META-INF/*.DSA,!META-INF/MANIFEST.MF"),
//                runtimeClasspath,
//            )
//            task.outjars(jar.flatMap { it.archiveFile }.map {
//                it.asFile.resolveSibling("${it.asFile.nameWithoutExtension}-optimized.jar")
//            })
//            task.libraryjars(
//                mapOf("jarfilter" to "!**.jar", "filter" to "!module-info.class"),
//                jdkLibraries,
//            )
//            task.dontobfuscate()
//            task.optimizationpasses(10)
//            task.allowaccessmodification()
//            task.optimizations(
//                listOf(
//                    "class/marking/*", "class/unboxing/*",
//                    "field/removal/*", "field/marking/*",
//                    "field/generalization/*", "field/specialization/*", "field/propagation/*",
//                    "method/marking/*", "method/removal/*",
//                    "method/generalization/*", "method/specialization/*", "method/propagation/*",
//                    "method/inlining/*", "code/simplification/*", "code/removal/*",
//                    "code/merging", "code/allocation/*",
//                ).joinToString(","),
//            )
//            if (aggressiveOptimizations) {
//                task.configuration(project.resources.text.fromString("-optimizeaggressively").asFile())
//                task.optimizations("class/merging/*")
//            }
//            task.keepclasseswithmembers(
//                mapOf("allowoptimization" to true),
//                "public class * { public static void main(java.lang.String[]); }",
//            )
//            task.keepattributes("*")
//        }
    }

    private fun configureOptimize(project: Project, targetOptimize: String) {
        require(targetOptimize == "fast" || targetOptimize == "debug") {
            "Only 'fast' and 'release' optimize modes are available"
        }
        val selectedOptimize = project.providers.gradleProperty("com.varlanv.klab.optimize").get()
        val isEnabled = selectedOptimize == targetOptimize

        val tasks = project.tasks
        tasks.withType(KotlinCompile::class.java) {
            it.enabled = isEnabled
        }

        tasks.withType(Jar::class.java) {
            it.enabled = isEnabled
        }

        tasks.withType(Test::class.java) {
            it.enabled = isEnabled
        }

        tasks.withType(org.jetbrains.kotlin.gradle.tasks.KotlinNativeCompile::class.java) {
            it.enabled = isEnabled
        }

        tasks.named("assemble") {
            it.enabled = isEnabled
        }
    }
}
