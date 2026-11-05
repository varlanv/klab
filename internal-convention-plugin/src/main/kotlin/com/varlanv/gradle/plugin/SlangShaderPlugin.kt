package com.varlanv.gradle.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.FileSystemOperations
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.plugins.JavaLibraryPlugin
import org.gradle.api.plugins.JavaPlatformExtension
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.api.provider.ListProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.*
import org.gradle.jvm.toolchain.JavaLanguageVersion
import org.gradle.jvm.toolchain.JvmVendorSpec
import org.gradle.language.jvm.tasks.ProcessResources
import org.gradle.process.ExecOperations
import org.gradle.workers.WorkAction
import org.gradle.workers.WorkParameters
import org.gradle.workers.WorkerExecutor
import javax.inject.Inject

class SlangShaderPlugin : Plugin<Project> {


    override fun apply(project: Project) {
        val extensions = project.extensions
        val internalProperties = InternalProperties(extensions.getByName("versionCatalogs") as VersionCatalogsExtension)
        val javaVersion = internalProperties.getVersion("javaVersion")
        val jvmVendor = JvmVendorSpec.ADOPTIUM

        // java-library is needed so that consumers can receive plugin into classpath resources
        project.pluginManager.apply(JavaLibraryPlugin::class.java)
        extensions.configure(JavaPluginExtension::class.java) {
            it.toolchain.languageVersion.set(JavaLanguageVersion.of(javaVersion))
            it.toolchain.vendor.set(jvmVendor)
        }
        val platform = SlangPlatform.current()
        val projectDirectory = project.layout.projectDirectory
        val sources = project.objects.sourceDirectorySet("slang", "Slang shader sources")
        sources.srcDir("src/main/slang")
        sources.include("**/*.slang")
        project.extensions.add("slang", sources)
        project.extensions.getByType(SourceSetContainer::class.java).named("main") {
            it.extensions.add("slang", sources)
        }

        val compiler = project.configurations.create("slangCompiler") {
            it.isCanBeConsumed = false
            it.isCanBeResolved = true
            it.isTransitive = false
        }
        project.dependencies.add(
            compiler.name,
            project.dependencies.project(
                mapOf("path" to ":shaders:slang-binary", "configuration" to "slangCompilerElements"),
            ),
        )

        val compileShaders = project.tasks.register("compileShaders", CompileSlangShaders::class.java) { task ->
            task.group = "build"
            task.description = "Compiles Slang sources to SPIR-V."
            task.shaderSources.from(sources)
            task.sourceDependencies.from(sources.sourceDirectories)
            task.sourceRoots.set(sources.sourceDirectories.elements.map { directories ->
                directories.map { it.asFile.relativeTo(projectDirectory.asFile).invariantSeparatorsPath }
            })
            task.compilerDirectory.set(project.layout.dir(compiler.elements.map { it.single().asFile }))
            task.executableName.set(platform.executableName)
            task.workingDirectory.set(projectDirectory)
            task.outputDirectory.set(project.layout.buildDirectory.dir("generated/shaders/main"))
        }
        val resourcePath = "shaders/${project.name}"
        project.tasks.named("processResources", ProcessResources::class.java) { resources ->
            resources.from(compileShaders.flatMap { it.outputDirectory }) { it.into(resourcePath) }
        }
    }
}

@CacheableTask
abstract class CompileSlangShaders @Inject constructor(
    private val workerExecutor: WorkerExecutor,
    private val fileSystemOperations: FileSystemOperations,
) : DefaultTask() {

    @get:InputFiles
    @get:SkipWhenEmpty
    @get:IgnoreEmptyDirectories
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val shaderSources: ConfigurableFileCollection

    @get:InputFiles
    @get:IgnoreEmptyDirectories
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val sourceDependencies: ConfigurableFileCollection

    @get:InputDirectory
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val compilerDirectory: DirectoryProperty

    @get:Input
    abstract val executableName: Property<String>

    @get:Input
    abstract val sourceRoots: ListProperty<String>

    @get:Input
    abstract val compilerArguments: ListProperty<String>

    @get:Internal
    abstract val workingDirectory: DirectoryProperty

    @get:OutputDirectory
    abstract val outputDirectory: DirectoryProperty

    init {
        compilerArguments.convention(
            listOf("-target", "spirv", "-emit-spirv-directly", "-fvk-use-entrypoint-name"),
        )
    }

    @TaskAction
    fun compile() {
        val workingDirectory = workingDirectory.get().asFile
        val roots = sourceRoots.get().map { workingDirectory.resolve(it).normalize() }
        val outputDirectory = outputDirectory.get().asFile
        val outputs = shaderSources.files.sorted().map { source ->
            val root = roots.firstOrNull { source.startsWith(it) }
                ?: error("Shader source is outside the configured source directories: $source")
            val relativePath = source.relativeTo(root)
            val output =
                outputDirectory.resolve(relativePath).resolveSibling("${relativePath.nameWithoutExtension}.spv")
            source to output
        }
        check(outputs.map { it.second }.distinct().size == outputs.size) {
            "Shader source directories contain duplicate output paths"
        }
        fileSystemOperations.delete { it.delete(outputDirectory) }
        outputDirectory.mkdirs()

        val compiler = compilerDirectory.get().file("bin/${executableName.get()}")
        val arguments = compilerArguments.get() + sourceRoots.get().flatMap { listOf("-I", it) }
        val queue = workerExecutor.noIsolation()
        for ((source, output) in outputs) {
            queue.submit(SlangCompileWork::class.java) { parameters ->
                parameters.executable.set(compiler)
                parameters.workingDirectory.set(workingDirectory)
                parameters.sourceFile.set(source)
                parameters.outputFile.set(output)
                parameters.arguments.set(arguments)
            }
        }
    }
}

abstract class SlangCompileWork @Inject constructor(
    private val execOperations: ExecOperations,
) : WorkAction<SlangCompileWork.Parameters> {

    interface Parameters : WorkParameters {
        val executable: RegularFileProperty
        val workingDirectory: DirectoryProperty
        val sourceFile: RegularFileProperty
        val outputFile: RegularFileProperty
        val arguments: ListProperty<String>
    }

    override fun execute() {
        val workingDirectory = parameters.workingDirectory.get().asFile
        val output = parameters.outputFile.get().asFile
        output.parentFile.mkdirs()
        execOperations.exec { spec ->
            spec.executable(parameters.executable.get().asFile)
            spec.workingDir(workingDirectory)
            spec.args(parameters.arguments.get())
            spec.args(
                parameters.sourceFile.get().asFile.relativeTo(workingDirectory).invariantSeparatorsPath,
                "-o", output.absolutePath,
            )
        }
        check(output.isFile) { "Slang did not create shader output: $output" }
    }
}
