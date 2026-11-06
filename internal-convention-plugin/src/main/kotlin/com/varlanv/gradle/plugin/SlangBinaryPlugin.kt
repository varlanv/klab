package com.varlanv.gradle.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.api.artifacts.transform.*
import org.gradle.api.artifacts.type.ArtifactTypeDefinition
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.FileSystemLocation
import org.gradle.api.file.FileSystemOperations
import org.gradle.api.plugins.BasePlugin
import org.gradle.api.provider.ListProperty
import org.gradle.api.provider.Property
import org.gradle.api.provider.Provider
import org.gradle.api.tasks.*
import org.gradle.work.DisableCachingByDefault
import java.nio.file.Files
import java.util.zip.ZipFile
import javax.inject.Inject

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

        val runtimeType = "slang-compiler-runtime"
        project.dependencies.registerTransform(ExtractSlang::class.java) { transform ->
            transform.from.attribute(ArtifactTypeDefinition.ARTIFACT_TYPE_ATTRIBUTE, ArtifactTypeDefinition.ZIP_TYPE)
            transform.to.attribute(ArtifactTypeDefinition.ARTIFACT_TYPE_ATTRIBUTE, runtimeType)
            transform.parameters.executableName.set(platform.executableName)
            transform.parameters.runtimeFiles.set(platform.runtimeFiles(version))
            transform.parameters.standardModuleDirectory.set(platform.standardModuleDirectory(version))
        }

        val distribution = project.configurations.create("slangDistribution") {
            it.isCanBeConsumed = false
            it.isCanBeResolved = true
            it.isTransitive = false
            it.attributes.attribute(ArtifactTypeDefinition.ARTIFACT_TYPE_ATTRIBUTE, runtimeType)
        }
        project.dependencies.add(
            distribution.name,
            "org.shader-slang:slang:$version:${platform.classifier}@zip",
        )

        val distributionDirectory = project.layout.dir(distribution.elements.map { it.single().asFile })
        val compilerDirectory = project.layout.buildDirectory.dir("slang/compiler")
        val extractSlang = project.tasks.register("extractSlang", ResolveSlang::class.java) { task ->
            task.group = "build setup"
            task.description = "Resolves the pinned Slang compiler from Gradle's shared cache."
            task.distributionDirectory.set(distributionDirectory)
            task.compilerDirectory.set(compilerDirectory)
            task.executableName.set(platform.executableName)
        }

        val compilerElements = project.configurations.create("slangCompilerElements") {
            it.isCanBeConsumed = true
            it.isCanBeResolved = false
        }
        project.artifacts.add(compilerElements.name, compilerDirectory) {
            it.builtBy(extractSlang)
            it.type = "directory"
        }
        project.tasks.named("assemble") { it.dependsOn(extractSlang) }
    }
}

@CacheableTransform
abstract class ExtractSlang : TransformAction<ExtractSlang.Parameters> {

    interface Parameters : TransformParameters {
        @get:Input
        val executableName: Property<String>

        @get:Input
        val runtimeFiles: ListProperty<String>

        @get:Input
        val standardModuleDirectory: Property<String>
    }

    @get:InputArtifact
    @get:PathSensitive(PathSensitivity.NONE)
    abstract val archiveFile: Provider<FileSystemLocation>

    override fun transform(outputs: TransformOutputs) {
        val outputDirectory = outputs.dir("slang").toPath()
        val runtimeFiles = parameters.runtimeFiles.get().toSet()
        val standardModuleDirectory = parameters.standardModuleDirectory.get()
        ZipFile(archiveFile.get().asFile).use { archive ->
            for (entry in archive.entries()) {
                if (entry.isDirectory || (entry.name !in runtimeFiles &&
                            !entry.name.startsWith(standardModuleDirectory) && entry.name != "LICENSE")
                ) {
                    continue
                }
                val destination = outputDirectory.resolve(entry.name).normalize()
                check(destination.startsWith(outputDirectory)) { "Unexpected Slang archive entry: ${entry.name}" }
                Files.createDirectories(destination.parent)
                archive.getInputStream(entry).use { Files.copy(it, destination) }
            }
        }
        for (name in runtimeFiles) {
            check(Files.isRegularFile(outputDirectory.resolve(name))) { "Slang distribution is missing $name" }
        }
        check(Files.isDirectory(outputDirectory.resolve(standardModuleDirectory))) {
            "Slang distribution is missing its standard modules"
        }
        val executable = outputDirectory.resolve("bin/${parameters.executableName.get()}").toFile()
        if (parameters.executableName.get() != "slangc.exe") {
            check(executable.setExecutable(true, false)) { "Cannot make Slang executable: $executable" }
        }
    }
}

@DisableCachingByDefault(because = "Compiler extraction is cached by an artifact transform.")
abstract class ResolveSlang @Inject constructor(
    private val fileSystemOperations: FileSystemOperations,
) : DefaultTask() {

    @get:InputDirectory
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val distributionDirectory: DirectoryProperty

    @get:OutputDirectory
    abstract val compilerDirectory: DirectoryProperty

    @get:Input
    abstract val executableName: Property<String>

    @TaskAction
    fun resolve() {
        val outputDirectory = compilerDirectory.get().asFile
        fileSystemOperations.delete { it.delete(outputDirectory) }
        fileSystemOperations.copy {
            it.from(distributionDirectory)
            it.into(outputDirectory)
        }
        val executable = compilerDirectory.file("bin/${executableName.get()}").get().asFile
        check(executable.isFile) { "Slang compiler is missing: $executable" }
        logger.info("Slang compiler: {}", executable)
    }
}

internal data class SlangPlatform(val classifier: String, val executableName: String) {

    fun runtimeFiles(version: String): List<String> {
        val libraries = when {
            classifier.startsWith("windows-") -> listOf(
                "bin/slang-compiler.dll", "bin/slang-glslang.dll", "bin/slang-glsl-module.dll",
            )

            classifier.startsWith("macos-") -> listOf(
                "lib/libslang-compiler.0.$version.dylib", "lib/libslang-glslang-$version.dylib",
                "lib/libslang-glsl-module-$version.dylib",
            )

            else -> listOf(
                "lib/libslang-compiler.so.0.$version", "lib/libslang-glslang-$version.so",
                "lib/libslang-glsl-module-$version.so",
            )
        }
        return listOf("bin/$executableName") + libraries
    }

    fun standardModuleDirectory(version: String): String {
        val directory = if (classifier.startsWith("windows-")) "bin" else "lib"
        return "$directory/slang-standard-module-$version/"
    }

    companion object {
        fun current(): SlangPlatform {
            val os = when (Os.current) {
                Os.Windows -> "windows"
                Os.Mac -> "macos"
                Os.Linux -> "linux"
                else -> error("Unsupported Slang operating system: ${Os.jvmString}")
            }
            val arch = when (Arch.current) {
                Arch.X64 -> "x86_64"
                Arch.Arm64 -> "aarch64"
                else -> error("Unsupported Slang architecture: ${Arch.jvmString}")
            }
            return SlangPlatform("$os-$arch", if (os == "windows") "slangc.exe" else "slangc")
        }
    }
}
