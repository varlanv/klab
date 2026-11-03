package com.varlanv.klab.glb.kotlin

import com.varlanv.klab.longViewHandle

private val emptyJsonBytes = ByteArray(0)

internal class GltfJson {
    private var tokens = IntArray(4096)
    private var used = 0
    private var bytes: ByteArray = emptyJsonBytes
    private var cursor = 0
    private var limit = 0

    fun parse(source: ByteArray, offset: Int, length: Int) {
        bytes = source
        cursor = offset
        limit = Math.addExact(offset, length)
        used = 0
        whitespace()
        require(cursor < limit && bytes[cursor] == '{'.code.toByte()) { "Expected a glTF JSON object" }
        value(0)
        whitespace()
        require(cursor == limit) { "Trailing JSON data" }
    }

    fun release() { bytes = emptyJsonBytes }

    private fun add(start: Int, kind: Int): Int {
        val token = used++
        if (used * 5 > tokens.size) tokens = tokens.copyOf(tokens.size * 2)
        tokens[token * 5] = start
        tokens[token * 5 + 1] = 0
        tokens[token * 5 + 2] = 0
        tokens[token * 5 + 3] = 0
        tokens[token * 5 + 4] = kind
        return token
    }

    private fun value(depth: Int): Int {
        require(depth < 256 && cursor < limit) { "Truncated or excessively nested JSON" }
        val start = cursor
        val ch = bytes[cursor].toInt()
        if (ch == 34) return quoted()
        val token = add(start, ch)
        when (ch) {
            123, 91 -> {
                cursor++
                whitespace()
                val closing = if (ch == 123) 125 else 93
                if (cursor < limit && bytes[cursor].toInt() != closing) {
                    while (true) {
                        if (ch == 123) {
                            require(cursor < limit && bytes[cursor].toInt() == 34) { "Expected JSON key" }
                            quoted()
                            whitespace()
                            require(cursor < limit && bytes[cursor++].toInt() == 58) { "Expected JSON colon" }
                            whitespace()
                        }
                        value(depth + 1)
                        tokens[token * 5 + 3]++
                        whitespace()
                        require(cursor < limit) { "Truncated JSON container" }
                        if (bytes[cursor].toInt() == closing) break
                        require(bytes[cursor++].toInt() == 44) { "Expected JSON comma" }
                        whitespace()
                    }
                }
                require(cursor < limit && bytes[cursor++].toInt() == closing) { "Truncated JSON container" }
            }
            116 -> literal("true")
            102 -> literal("false")
            110 -> literal("null")
            else -> number()
        }
        tokens[token * 5 + 1] = cursor
        tokens[token * 5 + 2] = used
        return token
    }

    private fun quoted(): Int {
        val token = add(++cursor, 34)
        var hash = 0
        var escapedString = false
        while (cursor < limit) {
            if (cursor <= limit - 8) {
                val word = longViewHandle.get(bytes, cursor) as Long
                val quote = word xor 0x2222222222222222L
                val slash = word xor 0x5c5c5c5c5c5c5c5cL
                val special = ((quote - 0x0101010101010101L) and quote.inv()) or
                    ((slash - 0x0101010101010101L) and slash.inv())
                val control = (word and 0x6060606060606060L) + 0x5f5f5f5f5f5f5f5fL
                if ((special and -0x7f7f7f7f7f7f7f80L) == 0L &&
                    (control and -0x7f7f7f7f7f7f7f80L) == -0x7f7f7f7f7f7f80L) {
                    var lane = 0
                    while (lane < 8) {
                        hash = hash * 31 + ((word ushr (lane * 8)).toInt() and 255)
                        lane++
                    }
                    cursor += 8
                    continue
                }
            }
            val ch = bytes[cursor++].toInt() and 255
            if (ch == 34) {
                tokens[token * 5 + 1] = cursor - 1
                tokens[token * 5 + 2] = used
                tokens[token * 5 + 3] = if (escapedString) Int.MIN_VALUE else hash
                return token
            }
            require(ch >= 32) { "Control character in JSON string" }
            hash = hash * 31 + ch
            if (ch == 92) {
                escapedString = true
                require(cursor < limit) { "Truncated JSON escape" }
                val escaped = bytes[cursor++].toInt()
                require(escaped == 34 || escaped == 92 || escaped == 47 || escaped == 98 ||
                    escaped == 102 || escaped == 110 || escaped == 114 || escaped == 116 || escaped == 117) { "Invalid JSON escape" }
                hash = hash * 31 + escaped
                if (escaped == 117) repeat(4) {
                    require(cursor < limit && hex(bytes[cursor++].toInt()) >= 0) { "Invalid Unicode escape" }
                }
            }
        }
        error("Truncated JSON string")
    }

    private fun literal(value: String) {
        require(cursor <= limit - value.length) { "Truncated JSON literal" }
        for (ch in value) require(bytes[cursor++].toInt() == ch.code) { "Invalid JSON literal" }
    }

    private fun number() {
        if (bytes[cursor].toInt() == 45) cursor++
        require(cursor < limit) { "Truncated JSON number" }
        if (bytes[cursor].toInt() == 48) cursor++ else {
            require(bytes[cursor].toInt() in 49..57) { "Invalid JSON number" }
            digits()
        }
        if (cursor < limit && bytes[cursor].toInt() == 46) {
            cursor++
            require(cursor < limit && bytes[cursor].toInt() in 48..57) { "Invalid JSON fraction" }
            digits()
        }
        if (cursor < limit && (bytes[cursor].toInt() or 32) == 101) {
            cursor++
            if (cursor < limit && (bytes[cursor].toInt() == 43 || bytes[cursor].toInt() == 45)) cursor++
            require(cursor < limit && bytes[cursor].toInt() in 48..57) { "Invalid JSON exponent" }
            digits()
        }
    }

    private fun digits() { while (cursor < limit && bytes[cursor].toInt() in 48..57) cursor++ }
    private fun whitespace() {
        while (cursor < limit) {
            when (bytes[cursor].toInt()) { 32, 9, 10, 13 -> cursor++; else -> return }
        }
    }

    fun next(token: Int): Int = tokens[token * 5 + 2]
    fun size(token: Int): Int = if (token < 0) 0 else tokens[token * 5 + 3]
    fun element(token: Int, index: Int): Int {
        require(token >= 0 && index >= 0 && index < size(token))
        var result = token + 1
        repeat(index) { result = next(result) }
        return result
    }

    fun field(obj: Int, name: String): Int {
        if (obj < 0) return -1
        require(tokens[obj * 5 + 4] == 123) { "Expected JSON object" }
        var key = obj + 1
        val end = next(obj)
        val hash = name.hashCode()
        while (key < end) {
            if ((tokens[key * 5 + 3] == hash && equals(key, name)) ||
                (tokens[key * 5 + 3] == Int.MIN_VALUE && string(key) == name)) return key + 1
            key = next(key + 1)
        }
        return -1
    }

    fun isObject(token: Int): Boolean = token >= 0 && tokens[token * 5 + 4] == 123
    fun requireArray(token: Int) { require(token >= 0 && tokens[token * 5 + 4] == 91) { "Expected JSON array" } }
    fun requireObject(token: Int) { require(token >= 0 && tokens[token * 5 + 4] == 123) { "Expected JSON object" } }
    fun matches(token: Int, text: String): Boolean = token >= 0 && tokens[token * 5 + 4] == 34 &&
        (equals(token, text) || (tokens[token * 5 + 3] == Int.MIN_VALUE && string(token) == text))

    private fun equals(token: Int, text: String): Boolean {
        val start = tokens[token * 5]
        if (tokens[token * 5 + 1] - start != text.length) return false
        for (index in text.indices) if ((bytes[start + index].toInt() and 255) != text[index].code) return false
        return true
    }

    fun int(token: Int, default: Int = 0): Int {
        if (token < 0) return default
        var pos = tokens[token * 5]
        val end = tokens[token * 5 + 1]
        var sign = 1
        if (bytes[pos].toInt() == 45) { sign = -1; pos++ }
        var result = 0L
        require(pos < end) { "Expected JSON integer" }
        while (pos < end) {
            val digit = bytes[pos++].toInt() - 48
            require(digit in 0..9) { "Expected JSON integer" }
            result = result * 10 + digit
            require(result <= 2147483648L) { "Integer exceeds supported size" }
        }
        return Math.toIntExact(result * sign)
    }

    fun float(token: Int, default: Float = 0f): Float {
        if (token < 0) return default
        var pos = tokens[token * 5]
        val end = tokens[token * 5 + 1]
        val negative = bytes[pos].toInt() == 45
        if (negative) pos++
        var value = 0
        var digits = 0
        var fraction = 0
        var decimal = false
        while (pos < end) {
            val ch = bytes[pos++].toInt()
            if (ch == 46 && !decimal) { decimal = true; continue }
            if (ch !in 48..57 || digits == 9) { pos = -1; break }
            value = value * 10 + ch - 48
            digits++
            if (decimal) fraction++
        }
        if (pos == end && digits <= 9 && bytes[end - 1].toInt() in 48..57) {
            val result = (value.toDouble() / decimalPowers[fraction]).toFloat()
            return if (negative) -result else result
        }
        return preciseFloat(token)
    }

    private fun preciseFloat(token: Int): Float {
        val start = tokens[token * 5]
        val end = tokens[token * 5 + 1]
        var pos = start
        val negative = bytes[pos].toInt() == 45
        if (negative) pos++
        var mantissa = 0L
        var significant = 0
        var fraction = 0
        var decimal = false
        while (pos < end) {
            val ch = bytes[pos].toInt()
            if (ch == 46) { decimal = true; pos++; continue }
            if (ch !in 48..57) break
            if (mantissa != 0L || ch != 48) significant++
            if (significant > 18) return slowFloat(start, end)
            mantissa = mantissa * 10 + ch - 48
            if (decimal) fraction++
            pos++
        }
        var exponent = 0
        if (pos < end) {
            pos++
            var exponentSign = 1
            if (bytes[pos].toInt() == 45) { exponentSign = -1; pos++ }
            else if (bytes[pos].toInt() == 43) pos++
            while (pos < end) {
                exponent = exponent * 10 + bytes[pos++].toInt() - 48
                if (exponent > 1000) return slowFloat(start, end)
            }
            exponent *= exponentSign
        }
        if (mantissa == 0L) return if (negative) -0f else 0f
        exponent -= fraction
        if (exponent !in -22..22) return slowFloat(start, end)
        val value = if (exponent < 0) mantissa.toDouble() / precisePowers[-exponent]
            else mantissa.toDouble() * precisePowers[exponent]
        val rounded = value.toFloat()
        if (!rounded.isFinite()) return slowFloat(start, end)
        val neighbor = if (value > rounded.toDouble()) Math.nextUp(rounded) else Math.nextDown(rounded)
        val midpoint = (rounded.toDouble() + neighbor.toDouble()) * 0.5
        if (kotlin.math.abs(value - midpoint) <= Math.ulp(value) * 4) return slowFloat(start, end)
        return if (negative) -rounded else rounded
    }

    private fun slowFloat(start: Int, end: Int): Float {
        return java.lang.Float.parseFloat(String(bytes, start, end - start, Charsets.US_ASCII))
    }

    fun bool(token: Int, default: Boolean = false): Boolean {
        if (token < 0) return default
        return when (tokens[token * 5 + 4]) { 116 -> true; 102 -> false; else -> error("Expected JSON boolean") }
    }

    fun string(token: Int): String? {
        if (token < 0 || tokens[token * 5 + 4] == 110) return null
        require(tokens[token * 5 + 4] == 34) { "Expected JSON string" }
        val start = tokens[token * 5]
        val end = tokens[token * 5 + 1]
        var pos = start
        while (pos < end && bytes[pos].toInt() != 92) pos++
        if (pos == end) return String(bytes, start, end - start, Charsets.UTF_8)
        val result = StringBuilder(end - start)
        result.append(String(bytes, start, pos - start, Charsets.UTF_8))
        while (pos < end) {
            val run = pos
            while (pos < end && bytes[pos].toInt() != 92) pos++
            result.append(String(bytes, run, pos - run, Charsets.UTF_8))
            if (pos == end) break
            when (val escaped = bytes[++pos].toInt()) {
                98 -> result.append('\b'); 102 -> result.append('\u000c'); 110 -> result.append('\n')
                114 -> result.append('\r'); 116 -> result.append('\t')
                117 -> {
                    var code = 0
                    repeat(4) { code = code * 16 + hex(bytes[++pos].toInt()) }
                    result.append(code.toChar())
                }
                else -> result.append(escaped.toChar())
            }
            pos++
        }
        return result.toString()
    }

    fun ints(token: Int): IntArray {
        if (token < 0) return emptyInts
        requireArray(token)
        if (size(token) == 0) return emptyInts
        var child = token + 1
        return IntArray(size(token)) { int(child).also { child = next(child) } }
    }
    fun floats(token: Int): FloatArray {
        if (token < 0) return emptyFloats
        requireArray(token)
        if (size(token) == 0) return emptyFloats
        var child = token + 1
        return FloatArray(size(token)) { float(child).also { child = next(child) } }
    }
    fun raw(token: Int): String? {
        if (token < 0) return null
        val quote = if (tokens[token * 5 + 4] == 34) 1 else 0
        return String(bytes, tokens[token * 5] - quote, tokens[token * 5 + 1] - tokens[token * 5] + quote * 2, Charsets.UTF_8)
    }

    private val precisePowers = doubleArrayOf(1e0, 1e1, 1e2, 1e3, 1e4, 1e5, 1e6, 1e7, 1e8, 1e9, 1e10, 1e11, 1e12, 1e13, 1e14, 1e15, 1e16, 1e17, 1e18, 1e19, 1e20, 1e21, 1e22)
    private val decimalPowers = doubleArrayOf(1.0, 10.0, 100.0, 1000.0, 10000.0, 100000.0, 1000000.0, 10000000.0, 100000000.0, 1000000000.0)

    private fun hex(ch: Int): Int = when (ch) { in 48..57 -> ch - 48; in 65..70 -> ch - 55; in 97..102 -> ch - 87; else -> -1 }
}
