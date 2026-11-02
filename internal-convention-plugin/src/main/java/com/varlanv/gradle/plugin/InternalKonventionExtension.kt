package com.varlanv.gradle.plugin

import org.gradle.api.Project
import org.gradle.api.provider.Property
import org.gradle.api.tasks.testing.Test
import org.gradle.jvm.tasks.Jar
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

interface InternalKonventionExtension {

    companion object {
        const val NAME = "internalConvention"
    }

    val internalModule: Property<Boolean>

    fun configureMainTargets(kmp: KotlinMultiplatformExtension) {
        kmp.jvm()
        kmp.linuxX64()
    }

    fun mainAppCommonConfiguration(project: Project, targetOptimize: String) {
        configureOptimize(project, targetOptimize)
        val kmp = project.extensions.getByType(KotlinMultiplatformExtension::class.java)
        configureMainTargets(kmp)
        kmp.sourceSets.named("commonMain") { commonMain->
            commonMain.dependencies {dependencies ->
                dependencies.implementation(dependencies.project(":apps:main-shared"))
            }

        }
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
