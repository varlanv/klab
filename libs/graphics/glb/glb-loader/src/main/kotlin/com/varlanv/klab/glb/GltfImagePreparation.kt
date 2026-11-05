package com.varlanv.klab.glb

import com.varlanv.klab.collections.Bytes
import com.varlanv.klab.collections.MutBytes
import com.varlanv.klab.collections.MutInts
import java.io.ByteArrayInputStream
import java.io.Closeable
import javax.imageio.ImageIO
import javax.imageio.ImageReader
import javax.imageio.stream.MemoryCacheImageInputStream

private const val RGBA_BYTES = 4
private const val RED = 0
private const val GREEN = 1
private const val BLUE = 2
private const val ALPHA = 3
private const val ARGB_RED_SHIFT = 16
private const val ARGB_GREEN_SHIFT = 8
private const val ARGB_ALPHA_SHIFT = 24

internal fun openPreparedImage(
    source: KGltf,
    index: Int,
    resolver: ((String) -> Bytes)?,
): PreparedImageReader {
    val image = source.images[index]
    require(image.mimeType == null || image.mimeType == "image/png" || image.mimeType == "image/jpeg") {
        "Unsupported image format: ${image.mimeType}"
    }
    val encoded = if (image.bufferView >= 0) {
        val view = source.bufferViews[image.bufferView]
        require(view.meshopt == null) { "Compressed image buffer views are not supported" }
        ByteArrayInputStream(
            source.bufferSources[view.buffer],
            source.bufferOffsets[view.buffer] + view.offset,
            view.byteLength,
        )
    } else {
        val uri = checkNotNull(image.uri) { "Image has no data source" }
        val bytes = if (uri.startsWith("data:")) {
            decodeDataUri(uri)
        } else {
            checkNotNull(resolver) { "External images require a resource resolver" }(decodeGltfUri(uri))
        }
        ByteArrayInputStream(bytes)
    }
    val input = MemoryCacheImageInputStream(encoded)
    var reader: ImageReader? = null
    try {
        val readers = ImageIO.getImageReaders(input)
        require(readers.hasNext()) { "Could not decode image" }
        val selected = readers.next()
        reader = selected
        require(selected.formatName.equals("png", true) || selected.formatName.equals("jpeg", true)) {
            "Unsupported image format: ${selected.formatName}"
        }
        selected.setInput(input, true, true)
        val width = selected.getWidth(0)
        val height = selected.getHeight(0)
        require(width > 0 && height > 0) { "Invalid image dimensions" }
        val size = Math.multiplyExact(
            Math.multiplyExact(
                width,
                height,
            ),
            RGBA_BYTES,
        )
        return PreparedImageReader(reader = selected, input = input, width = width, height = height, byteSize = size)
    } catch (failure: Throwable) {
        try {
            reader?.dispose()
        } catch (error: Throwable) {
            failure.addSuppressed(error)
        }
        try {
            input.close()
        } catch (error: Throwable) {
            failure.addSuppressed(error)
        }
        throw failure
    }
}

/** Holds the decoder between sizing and writing, so the image header is read once. */
internal class PreparedImageReader(
    private val reader: ImageReader,
    private val input: MemoryCacheImageInputStream,
    val width: Int,
    val height: Int,
    val byteSize: Int,
) : Closeable {
    private var closed = false

    fun copyPixelsTo(destination: MutBytes, offset: Int) {
        check(!closed)
        require(offset >= 0 && offset <= destination.size - byteSize)
        val decoded = reader.read(0)
        try {
            val row = MutInts(width)
            var target = offset
            for (y in 0 until height) {
                decoded.getRGB(0, y, width, 1, row, 0, width)
                for (argb in row) {
                    destination[target + RED] = (argb ushr ARGB_RED_SHIFT).toByte()
                    destination[target + GREEN] = (argb ushr ARGB_GREEN_SHIFT).toByte()
                    destination[target + BLUE] = argb.toByte()
                    destination[target + ALPHA] = (argb ushr ARGB_ALPHA_SHIFT).toByte()
                    target += RGBA_BYTES
                }
            }
        } finally {
            decoded.flush()
        }
    }

    override fun close() {
        if (closed) {
            return
        }
        closed = true
        try {
            reader.dispose()
        } finally {
            input.close()
        }
    }
}
