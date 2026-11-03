package com.varlanv.gradle.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.api.artifacts.transform.*
import org.gradle.api.artifacts.type.ArtifactTypeDefinition
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.FileSystemLocation
import org.gradle.api.file.FileSystemOperations
import org.gradle.api.plugins.BasePlugin
import org.gradle.api.plugins.JavaPlugin
import org.gradle.api.provider.Property
import org.gradle.api.provider.Provider
import org.gradle.api.tasks.*
import org.gradle.language.jvm.tasks.ProcessResources
import org.gradle.process.ExecOperations
import org.gradle.work.DisableCachingByDefault
import java.io.File
import java.io.OutputStream
import java.nio.file.Files
import java.nio.file.StandardCopyOption
import java.security.DigestInputStream
import java.security.MessageDigest
import java.util.HexFormat
import java.util.zip.ZipFile
import javax.inject.Inject

fun configureZigCompiler(project: Project) {
    project.pluginManager.apply(BasePlugin::class.java)
    val platform = ZigPlatform(OsArch.requireCurrent())
    val version = project.extensions.getByType(VersionCatalogsExtension::class.java)
        .named("libs").findVersion("zigVersion").get().requiredVersion
    val archiveType = if (platform.osArch.os == Os.Windows) "zip" else "tar.xz"
    val compilerType = "zig-compiler-runtime"
    project.repositories.exclusiveContent { exclusive ->
        exclusive.forRepository {
            project.repositories.ivy { repository ->
                repository.name = "zigReleases"
                repository.setUrl("https://ziglang.org/download/")
                repository.patternLayout { pattern -> pattern.artifact("[revision]/zig-[classifier]-[revision].[ext]") }
                repository.metadataSources { it.artifact() }
            }
        }
        exclusive.filter { it.includeModule("org.ziglang", "zig") }
    }
    project.dependencies.registerTransform(ExtractZig::class.java) { transform ->
        transform.from.attribute(ArtifactTypeDefinition.ARTIFACT_TYPE_ATTRIBUTE, archiveType)
        transform.to.attribute(ArtifactTypeDefinition.ARTIFACT_TYPE_ATTRIBUTE, compilerType)
        transform.parameters.archiveRoot.set("zig-${platform.distributionClassifier}-$version")
        transform.parameters.archiveType.set(archiveType)
        transform.parameters.executableName.set(platform.executableName)
        transform.parameters.sha256.set(platform.checksum(version))
    }
    val distribution = project.configurations.create("zigDistribution") {
        it.isCanBeConsumed = false
        it.isCanBeResolved = true
        it.isTransitive = false
        it.attributes.attribute(ArtifactTypeDefinition.ARTIFACT_TYPE_ATTRIBUTE, compilerType)
    }
    project.dependencies.add(distribution.name, "org.ziglang:zig:$version:${platform.distributionClassifier}@$archiveType")
    val directory = project.layout.dir(distribution.elements.map { it.single().asFile })
    val extract = project.tasks.register("extractZig", ResolveZig::class.java) { task ->
        task.group = "build setup"
        task.description = "Resolves the pinned Zig compiler from Gradle's shared cache."
        task.compilerDirectory.set(directory)
        task.executableName.set(platform.executableName)
    }
    val elements = project.configurations.create("zigCompilerElements") {
        it.isCanBeConsumed = true
        it.isCanBeResolved = false
    }
    project.artifacts.add(elements.name, directory) {
        it.builtBy(extract)
        it.type = "directory"
    }
    project.tasks.named("assemble") { it.dependsOn(extract) }
}

fun configureZigLibrary(project: Project) {
    project.pluginManager.apply(JavaPlugin::class.java)
    val compiler = project.configurations.create("zigCompiler") {
        it.isCanBeConsumed = false
        it.isCanBeResolved = true
        it.isTransitive = false
    }
    project.dependencies.add(
        compiler.name,
        project.dependencies.project(mapOf("path" to ":native:zig-binary", "configuration" to "zigCompilerElements")),
    )
    val compilerDirectory = project.layout.dir(compiler.elements.map { it.single().asFile })
    val host = ZigPlatform(OsArch.requireCurrent())
    val mode = RunMode.current(project)
    val targets = if (mode == RunMode.Debug) setOf(host.osArch) else OsArch.supportedForConsumers
    for (target in targets.sortedBy { ZigPlatform(it).resourceClassifier }) {
        val platform = ZigPlatform(target)
        val build = project.tasks.register("buildZig${platform.taskSuffix}", BuildZigLibrary::class.java) { task ->
            task.group = "build"
            task.description = "Builds the native library for ${platform.resourceClassifier}."
            task.compilerDirectory.set(compilerDirectory)
            task.executableName.set(host.executableName)
            task.sourceFiles.from(project.fileTree(project.projectDir) {
                it.include("build.zig", "build.zig.zon", "src/**", "external/**")
            })
            task.workingDirectory.set(project.layout.projectDirectory)
            task.target.set(platform.target)
            task.optimize.set(if (mode == RunMode.Debug) "Debug" else "ReleaseFast")
            task.strip.set(mode == RunMode.Fast)
            task.libraryFileName.set(platform.libraryFileName)
            task.installRelativePath.set(platform.installRelativePath)
            task.resourceClassifier.set(platform.resourceClassifier)
            task.cacheDirectory.set(
                project.rootDir.resolve(".gradle/zig/${project.path.removePrefix(":").replace(':', '/')}/${platform.resourceClassifier}"),
            )
            task.outputDirectory.set(project.layout.buildDirectory.dir("generated/zig/${platform.resourceClassifier}"))
        }
        project.tasks.named("processResources", ProcessResources::class.java) { resources ->
            resources.from(build.flatMap { it.outputDirectory })
        }
    }
}

@CacheableTransform
abstract class ExtractZig @Inject constructor(private val execOperations: ExecOperations) : TransformAction<ExtractZig.Parameters> {
    interface Parameters : TransformParameters {
        @get:Input val archiveRoot: Property<String>
        @get:Input val archiveType: Property<String>
        @get:Input val executableName: Property<String>
        @get:Input val sha256: Property<String>
    }

    @get:InputArtifact
    @get:PathSensitive(PathSensitivity.NONE)
    abstract val archiveFile: Provider<FileSystemLocation>

    override fun transform(outputs: TransformOutputs) {
        val archive = archiveFile.get().asFile
        check(zigSha256(archive) == parameters.sha256.get()) { "Zig distribution checksum mismatch: ${archive.name}" }
        val directory = outputs.dir("zig")
        val root = parameters.archiveRoot.get()
        if (parameters.archiveType.get() == "zip") {
            val prefix = "$root/"
            val destinationRoot = directory.toPath()
            ZipFile(archive).use { zip ->
                for (entry in zip.entries()) {
                    if (entry.isDirectory || !entry.name.startsWith(prefix)) continue
                    val relative = entry.name.removePrefix(prefix)
                    if (relative != parameters.executableName.get() && relative != "LICENSE" && !relative.startsWith("lib/")) continue
                    val destination = destinationRoot.resolve(relative).normalize()
                    check(destination.startsWith(destinationRoot)) { "Unexpected Zig archive entry: ${entry.name}" }
                    Files.createDirectories(destination.parent)
                    zip.getInputStream(entry).use { Files.copy(it, destination) }
                }
            }
        } else {
            execOperations.exec {
                it.executable("tar")
                it.args(
                    "-xJf", archive.absolutePath, "-C", directory.absolutePath, "--strip-components=1",
                    "$root/${parameters.executableName.get()}", "$root/lib", "$root/LICENSE",
                )
            }
        }
        val executable = directory.resolve(parameters.executableName.get())
        check(executable.isFile && directory.resolve("lib").isDirectory) { "Zig distribution is incomplete" }
        if (parameters.executableName.get() != "zig.exe") {
            check(executable.setExecutable(true, false)) { "Cannot make Zig executable: $executable" }
        }
    }
}

@DisableCachingByDefault(because = "Compiler extraction is cached by an artifact transform.")
abstract class ResolveZig : DefaultTask() {
    @get:InputDirectory
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val compilerDirectory: DirectoryProperty
    @get:Input abstract val executableName: Property<String>

    @TaskAction
    fun resolve() {
        val executable = compilerDirectory.file(executableName.get()).get().asFile
        check(executable.isFile) { "Zig compiler is missing: $executable" }
        logger.info("Zig compiler: {}", executable)
    }
}

@CacheableTask
abstract class BuildZigLibrary @Inject constructor(
    private val execOperations: ExecOperations,
    private val fileSystemOperations: FileSystemOperations,
) : DefaultTask() {
    @get:InputDirectory
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val compilerDirectory: DirectoryProperty
    @get:InputFiles
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val sourceFiles: ConfigurableFileCollection
    @get:Input abstract val executableName: Property<String>
    @get:Input abstract val target: Property<String>
    @get:Input abstract val optimize: Property<String>
    @get:Input abstract val strip: Property<Boolean>
    @get:Input abstract val libraryFileName: Property<String>
    @get:Input abstract val installRelativePath: Property<String>
    @get:Input abstract val resourceClassifier: Property<String>
    @get:Internal abstract val workingDirectory: DirectoryProperty
    @get:LocalState abstract val cacheDirectory: DirectoryProperty
    @get:OutputDirectory abstract val outputDirectory: DirectoryProperty

    @TaskAction
    fun build() {
        val cache = cacheDirectory.get().asFile
        val install = cache.resolve("install")
        fileSystemOperations.delete { it.delete(install) }
        execOperations.exec {
            it.executable(compilerDirectory.file(executableName.get()).get().asFile)
            it.workingDir(workingDirectory.get().asFile)
            it.environment("ZIG_GLOBAL_CACHE_DIR", cache.resolve("global").absolutePath)
            it.args(
                "build", "-Dtarget=${target.get()}", "-Doptimize=${optimize.get()}",
                "-Dstrip=${strip.get()}", "-DlibName=klabZig", "-j1",
                "--cache-dir", cache.resolve("local").absolutePath, "--prefix", install.absolutePath,
            )
        }
        val library = install.resolve(installRelativePath.get())
        check(library.isFile) { "Zig build did not produce $library" }
        val output = outputDirectory.get().asFile
        fileSystemOperations.delete { it.delete(output) }
        val resources = output.resolve("native/${resourceClassifier.get()}")
        check(resources.mkdirs() || resources.isDirectory)
        Files.copy(library.toPath(), resources.resolve(libraryFileName.get()).toPath(), StandardCopyOption.REPLACE_EXISTING)
        resources.resolve("${libraryFileName.get()}.sha256").writeText("${zigSha256(library)}\n")
    }
}

private fun zigSha256(file: File): String {
    val digest = MessageDigest.getInstance("SHA-256")
    DigestInputStream(file.inputStream().buffered(), digest).use { it.transferTo(OutputStream.nullOutputStream()) }
    return HexFormat.of().formatHex(digest.digest())
}

private data class ZigPlatform(val osArch: OsArch) {
    val os: String get() = when (osArch.os) {
        Os.Windows -> "windows"
        Os.Linux -> "linux"
        Os.Mac -> "macos"
    }
    val arch: String get() = if (osArch.arch == Arch.X64) "x86_64" else "aarch64"
    val distributionClassifier: String get() = "$arch-$os"
    val resourceClassifier: String get() = "$os-$arch"
    val executableName: String get() = if (osArch.os == Os.Windows) "zig.exe" else "zig"
    val libraryFileName: String get() = when (osArch.os) {
        Os.Windows -> "klabZig.dll"
        Os.Linux -> "libklabZig.so"
        Os.Mac -> "libklabZig.dylib"
    }
    val installRelativePath: String get() = "${if (osArch.os == Os.Windows) "bin" else "lib"}/$libraryFileName"
    val target: String get() = "$arch-$os-${if (osArch.os == Os.Mac) "none" else "gnu"}"
    val taskSuffix: String get() = "${osArch.os.name}${osArch.arch.name}"

    fun checksum(version: String): String {
        check(version == "0.17.0") { "No pinned Zig checksums for version $version" }
        return when (distributionClassifier) {
            "x86_64-windows" -> "b5663f69581dcf391293fbf16c06cb80d81d806545ce618b4d0bab7f0eb8c428"
            "aarch64-windows" -> "0a59d91fa1cb40cf068e9b0954434ce973500c7a2ea749f1e01af62cdab52d26"
            "x86_64-linux" -> "1cbe9df9f27e6b78d14ccbca43b6703a404ef79ef1c463de901d7f088d4e2026"
            "aarch64-linux" -> "9e8d11661d4ae3bd57702a3832781e23ad151dde5798e16a5ccd503f65234ff8"
            "x86_64-macos" -> "4f9a1c5269aa17ebda5e6d3c2b89d6cbf36f7d2b22a0306e9ab98f25f95529c6"
            "aarch64-macos" -> "b607e9b9234790a008116ae5bdb71c6243b84b9fb42a53a9e70fde41c06c536a"
            else -> error("Unsupported Zig platform: $distributionClassifier")
        }
    }
}
