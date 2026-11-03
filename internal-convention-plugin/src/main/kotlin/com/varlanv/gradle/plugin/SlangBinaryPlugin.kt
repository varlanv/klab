package com.varlanv.gradle.plugin

import java.util.Locale
import javax.inject.Inject
import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.api.file.ArchiveOperations
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.FileSystemOperations
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.plugins.BasePlugin
import org.gradle.api.provider.Property
import org.gradle.api.tasks.CacheableTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction

class SlangBinaryPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.pluginManager.apply(BasePlugin::class.java)
        val platform = SlangPlatform.current()
        val version = project.extensions.getByType(VersionCatalogsExtension::class.java)
            .named("libs").findVersion("slangVersion").get().requiredVersion

        project.repositories.exclusiveContent { exclusive ->
            exclusive.forRepository {
                project.repositories.ivy { repository ->
                    repository.name = "slangReleases"
                    repository.setUrl("https://github.com/shader-slang/slang/releases/download/")
                    repository.patternLayout { pattern ->
                        pattern.artifact("v[revision]/slang-[revision]-[classifier].[ext]")
                    }
                    repository.metadataSources { it.artifact() }
                }
            }
            exclusive.filter { it.includeModule("org.shader-slang", "slang") }
        }

        val distribution = project.configurations.create("slangDistribution") {
            it.isCanBeConsumed = false
            it.isCanBeResolved = true
            it.isTransitive = false
        }
        project.dependencies.add(
            distribution.name,
            "org.shader-slang:slang:$version:${platform.classifier}@zip",
        )

        val extractSlang = project.tasks.register("extractSlang", ExtractSlang::class.java) { task ->
            task.group = "build setup"
            task.description = "Resolves and extracts the pinned Slang compiler distribution."
            task.archiveFile.set(project.layout.file(distribution.elements.map { it.single().asFile }))
            task.executableName.set(platform.executableName)
            task.outputDirectory.set(project.layout.buildDirectory.dir("slang/$version/${platform.classifier}"))
        }

        val compilerElements = project.configurations.create("slangCompilerElements") {
            it.isCanBeConsumed = true
            it.isCanBeResolved = false
        }
        project.artifacts.add(compilerElements.name, extractSlang.flatMap { it.outputDirectory }) {
            it.builtBy(extractSlang)
            it.type = "directory"
        }
        project.tasks.named("assemble") { it.dependsOn(extractSlang) }
    }
}

@CacheableTask
abstract class ExtractSlang @Inject constructor(
    private val archiveOperations: ArchiveOperations,
    private val fileSystemOperations: FileSystemOperations,
) : DefaultTask() {

    @get:InputFile
    @get:PathSensitive(PathSensitivity.NONE)
    abstract val archiveFile: RegularFileProperty

    @get:Input
    abstract val executableName: Property<String>

    @get:OutputDirectory
    abstract val outputDirectory: DirectoryProperty

    @TaskAction
    fun extract() {
        fileSystemOperations.sync { copy ->
            copy.from(archiveOperations.zipTree(archiveFile))
            copy.into(outputDirectory)
        }
        val executable = outputDirectory.file("bin/${executableName.get()}").get().asFile
        check(executable.isFile) { "Slang distribution is missing ${executable.name}" }
        if (executableName.get() != "slangc.exe") {
            check(executable.setExecutable(true, false)) { "Cannot make Slang executable: $executable" }
        }
    }
}

internal data class SlangPlatform(val classifier: String, val executableName: String) {

    companion object {
        fun current(): SlangPlatform {
            val osName = System.getProperty("os.name").lowercase(Locale.ROOT)
            val os = when {
                osName.startsWith("windows") -> "windows"
                osName.startsWith("mac") || osName.startsWith("darwin") -> "macos"
                osName.startsWith("linux") -> "linux"
                else -> error("Unsupported Slang operating system: $osName")
            }
            val arch = when (val archName = System.getProperty("os.arch").lowercase(Locale.ROOT)) {
                "amd64", "x86_64" -> "x86_64"
                "aarch64", "arm64" -> "aarch64"
                else -> error("Unsupported Slang architecture: $archName")
            }
            return SlangPlatform("$os-$arch", if (os == "windows") "slangc.exe" else "slangc")
        }
    }
}
