package com.varlanv.klab.glb

import java.lang.foreign.Arena
import java.lang.foreign.SymbolLookup
import java.nio.file.FileAlreadyExistsException
import java.nio.file.Files
import java.nio.file.Path
import java.security.DigestOutputStream
import java.security.MessageDigest
import java.util.*

object GlbNative {

    private val symbols: SymbolLookup by lazy {
        val os = System.getProperty("os.name").lowercase(Locale.ROOT)
        val platform = when {
            os.startsWith("windows") -> "windows"
            os.startsWith("mac") || os.startsWith("darwin") -> "macos"
            os.startsWith("linux") -> "linux"
            else -> error("Unsupported native GLB platform: $os")
        }
        val arch = when (val name = System.getProperty("os.arch").lowercase(Locale.ROOT)) {
            "amd64", "x86_64" -> "x86_64"
            "aarch64", "arm64" -> "aarch64"
            else -> error("Unsupported native GLB architecture: $name")
        }
        val filename = when (platform) {
            "windows" -> "klabZig.dll"
            "macos" -> "libklabZig.dylib"
            else -> "libklabZig.so"
        }
        val resource = "/native/$platform-$arch/$filename"
        val checksum = resource("$resource.sha256").bufferedReader(Charsets.US_ASCII).use { it.readText().trim() }
        check(checksum.length == 64 && checksum.all { it in '0'..'9' || it in 'a'..'f' }) {
            "Invalid checksum for native GLB library"
        }
        val cache = when (platform) {
            "windows" -> System.getenv("LOCALAPPDATA")?.let { Path.of(it) }
                ?: Path.of(System.getProperty("user.home"), "AppData", "Local")

            "macos" -> Path.of(System.getProperty("user.home"), "Library", "Caches")
            else -> System.getenv("XDG_CACHE_HOME")?.takeIf { it.isNotBlank() }?.let { Path.of(it) }
                ?: Path.of(System.getProperty("user.home"), ".cache")
        }
        val directory = cache.resolve("klab/native/$platform-$arch/$checksum")
        Files.createDirectories(directory)
        val library = directory.resolve(filename)
        if (!Files.isRegularFile(library)) {
            val temporary = Files.createTempFile(directory, "extract-", ".tmp")
            try {
                val digest = MessageDigest.getInstance("SHA-256")
                resource(resource).use { input ->
                    DigestOutputStream(Files.newOutputStream(temporary), digest).use { output -> input.copyTo(output) }
                }
                check(HexFormat.of().formatHex(digest.digest()) == checksum) { "Native GLB library checksum mismatch" }
                try {
                    Files.move(temporary, library)
                } catch (_: FileAlreadyExistsException) {
                    check(Files.isRegularFile(library)) { "Invalid native GLB cache entry: $library" }
                }
            } finally {
                Files.deleteIfExists(temporary)
            }
        }
        SymbolLookup.libraryLookup(library, Arena.global())
    }

    @JvmStatic
    fun lookup(): SymbolLookup = symbols

    private fun resource(path: String) = checkNotNull(GlbNative::class.java.getResourceAsStream(path)) {
        "Missing native GLB library resource: $path"
    }
}
