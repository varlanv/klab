package com.varlanv.klab.glb

import com.varlanv.klab.bin.Str
import com.varlanv.klab.bin.toStr
import com.varlanv.klab.collections.*
import com.varlanv.klab.vector.longViewHandle
import java.math.BigDecimal
import java.util.*
import kotlin.math.abs
import kotlin.math.nextDown
import kotlin.math.nextUp

private const val INITIAL_TOKEN_CAPACITY = 4096
internal const val JSON_MISSING_TOKEN = -1
private const val TOKEN_CAPACITY_GROWTH = 2
private const val TOKEN_STRIDE = 5
private const val TOKEN_START = 0
private const val TOKEN_END = 1
private const val TOKEN_NEXT = 2
private const val TOKEN_SIZE_OR_HASH = 3
private const val TOKEN_KIND = 4
private const val MAX_NESTING_DEPTH = 256
private const val ESCAPED_STRING_HASH = Int.MIN_VALUE

private const val JSON_QUOTE = 34
private const val JSON_BACKSLASH = 92
private const val JSON_SLASH = 47
private const val JSON_OBJECT_OPEN = 123
private const val JSON_OBJECT_CLOSE = 125
private const val JSON_ARRAY_OPEN = 91
private const val JSON_ARRAY_CLOSE = 93
private const val JSON_COLON = 58
private const val JSON_COMMA = 44
private const val JSON_TRUE_START = 116
private const val JSON_FALSE_START = 102
private const val JSON_NULL_START = 110
private const val JSON_SPACE = 32
private const val JSON_TAB = 9
private const val JSON_LINE_FEED = 10
private const val JSON_CARRIAGE_RETURN = 13
private const val JSON_ESCAPE_BACKSPACE = 98
private const val JSON_ESCAPE_FORM_FEED = 102
private const val JSON_ESCAPE_LINE_FEED = 110
private const val JSON_ESCAPE_CARRIAGE_RETURN = 114
private const val JSON_ESCAPE_TAB = 116
private const val JSON_ESCAPE_UNICODE = 117
private const val JSON_MINUS = 45
private const val JSON_PLUS = 43
private const val JSON_DECIMAL_POINT = 46
private const val JSON_EXPONENT = 101
private const val DIGIT_ZERO = 48
private const val DIGIT_ONE = 49
private const val DIGIT_NINE = 57
private const val ASCII_CASE_BIT = 32
private const val STRING_DELIMITER_COUNT = 2
private const val STRING_HASH_MULTIPLIER = 31
private const val UNSIGNED_BYTE_MASK = 0xff
private const val UNICODE_ESCAPE_DIGITS = 4
private const val HEX_RADIX = 16
private const val HEX_UPPER_A = 65
private const val HEX_UPPER_F = 70
private const val HEX_LOWER_A = 97
private const val HEX_LOWER_F = 102
private const val HEX_UPPER_OFFSET = 55
private const val HEX_LOWER_OFFSET = 87
private const val DECIMAL_RADIX = 10
private const val MAX_INTEGER_MAGNITUDE = 2147483648L
private const val MAX_FAST_FLOAT_DIGITS = 9
private const val MAX_SIGNIFICANT_DIGITS = 18
private const val MAX_PARSED_EXPONENT = 1000
private const val MAX_PRECISE_EXPONENT = 22
private const val MIDPOINT_FACTOR = 0.5
private const val FLOAT_MIDPOINT_ULPS = 4

private const val REPEATED_QUOTES = 0x2222222222222222L
private const val REPEATED_BACKSLASHES = 0x5c5c5c5c5c5c5c5cL
private const val BYTE_LOW_BITS = 0x0101010101010101L
private const val BYTE_HIGH_BITS = -0x7f7f7f7f7f7f7f80L
private const val CONTROL_EXPECTED_HIGH_BITS = -0x7f7f7f7f7f7f80L
private const val CONTROL_BYTE_MASK = 0x6060606060606060L
private const val CONTROL_BYTE_BIAS = 0x5f5f5f5f5f5f5f5fL

private val precisePowers: Doubles = doubleArrayOf(
    1e0,
    1e1,
    1e2,
    1e3,
    1e4,
    1e5,
    1e6,
    1e7,
    1e8,
    1e9,
    1e10,
    1e11,
    1e12,
    1e13,
    1e14,
    1e15,
    1e16,
    1e17,
    1e18,
    1e19,
    1e20,
    1e21,
    1e22,
)
private val decimalPowers: Doubles = doubleArrayOf(
    1.0,
    10.0,
    100.0,
    1000.0,
    10000.0,
    100000.0,
    1000000.0,
    10000000.0,
    100000000.0,
    1000000000.0,
)

internal class GltfJson {
    private var tokens: MutInts = MutInts(INITIAL_TOKEN_CAPACITY)
    private var used = 0
    private var bytes: Bytes = stableEmptyBytes
    private var cursor = 0
    private var limit = 0
    private var fieldOffsets: MutInts = MutInts(INITIAL_TOKEN_CAPACITY)
    private var fieldBuckets: MutInts = MutInts(INITIAL_TOKEN_CAPACITY)
    private var fieldUsed = 1

    fun parse(
        source: Bytes,
        offset: Int,
        length: Int,
    ) {
        bytes = source
        cursor = offset
        limit = Math.addExact(offset, length)
        used = 0
        whitespace()
        assert(cursor < limit && bytes[cursor] == '{'.code.toByte()) { "Expected a glTF JSON object" }
        value(0)
        if (fieldOffsets.size < used) {
            fieldOffsets = MutInts(maxOf(used, fieldOffsets.size * 2))
        } else {
            fieldOffsets.fill(0, 0, used)
        }
        fieldUsed = 1
        whitespace()
        assert(cursor == limit) { "Trailing JSON data" }
    }

    fun release() {
        bytes = stableEmptyBytes
    }

    private fun add(start: Int, kind: Int): Int {
        val token = used++
        if (used * TOKEN_STRIDE > tokens.size) {
            tokens = tokens.copyOf(tokens.size * TOKEN_CAPACITY_GROWTH)
        }
        tokens[token * TOKEN_STRIDE + TOKEN_START] = start
        tokens[token * TOKEN_STRIDE + TOKEN_END] = 0
        tokens[token * TOKEN_STRIDE + TOKEN_NEXT] = 0
        tokens[token * TOKEN_STRIDE + TOKEN_SIZE_OR_HASH] = 0
        tokens[token * TOKEN_STRIDE + TOKEN_KIND] = kind
        return token
    }

    private fun value(depth: Int) {
        assert(depth < MAX_NESTING_DEPTH && cursor < limit) { "Truncated or excessively nested JSON" }
        val start = cursor
        val ch = bytes[cursor].toInt()
        if (ch == JSON_QUOTE) {
            quoted(false)
            return
        }
        val token = add(start = start, kind = ch)
        when (ch) {
            JSON_OBJECT_OPEN, JSON_ARRAY_OPEN -> {
                cursor++
                whitespace()
                val closing = if (ch == JSON_OBJECT_OPEN) {
                    JSON_OBJECT_CLOSE
                } else {
                    JSON_ARRAY_CLOSE
                }
                if (cursor < limit && bytes[cursor].toInt() != closing) {
                    while (true) {
                        if (ch == JSON_OBJECT_OPEN) {
                            assert(cursor < limit && bytes[cursor].toInt() == JSON_QUOTE) { "Expected JSON key" }
                            quoted(true)
                            whitespace()
                            assert(cursor < limit && bytes[cursor].toInt() == JSON_COLON) { "Expected JSON colon" }
                            cursor++
                            whitespace()
                        }
                        value(depth + 1)
                        tokens[token * TOKEN_STRIDE + TOKEN_SIZE_OR_HASH]++
                        whitespace()
                        assert(cursor < limit) { "Truncated JSON container" }
                        if (bytes[cursor].toInt() == closing) {
                            break
                        }
                        assert(bytes[cursor].toInt() == JSON_COMMA) { "Expected JSON comma" }
                        cursor++
                        whitespace()
                    }
                }
                assert(cursor < limit && bytes[cursor].toInt() == closing) { "Truncated JSON container" }
                cursor++
            }

            JSON_TRUE_START -> {
                literal("true")
            }
            JSON_FALSE_START -> {
                literal("false")
            }
            JSON_NULL_START -> {
                literal("null")
            }
            else -> {
                number()
            }
        }
        tokens[token * TOKEN_STRIDE + TOKEN_END] = cursor
        tokens[token * TOKEN_STRIDE + TOKEN_NEXT] = used
    }

    private fun quoted(hashKey: Boolean) {
        val token = add(start = ++cursor, kind = JSON_QUOTE)
        var hash = 0
        var escapedString = false
        while (cursor < limit) {
            if (cursor <= limit - Long.SIZE_BYTES) {
                val word = longViewHandle.get(bytes, cursor) as Long
                val quote = word xor REPEATED_QUOTES
                val slash = word xor REPEATED_BACKSLASHES
                val special = ((quote - BYTE_LOW_BITS) and quote.inv()) or ((slash - BYTE_LOW_BITS) and slash.inv())
                val control = (word and CONTROL_BYTE_MASK) + CONTROL_BYTE_BIAS
                if ((word and BYTE_HIGH_BITS) == 0L &&
                    (special and BYTE_HIGH_BITS) == 0L &&
                    (control and BYTE_HIGH_BITS) == CONTROL_EXPECTED_HIGH_BITS
                ) {
                    if (hashKey) {
                        var lane = 0
                        while (lane < Long.SIZE_BYTES) {
                            hash =
                                hash * STRING_HASH_MULTIPLIER +
                                    ((word ushr (lane * Byte.SIZE_BITS)).toInt() and UNSIGNED_BYTE_MASK)
                            lane++
                        }
                    }
                    cursor += Long.SIZE_BYTES
                    continue
                }
            }
            val ch = bytes[cursor++].toInt() and UNSIGNED_BYTE_MASK
            if (ch == JSON_QUOTE) {
                tokens[token * TOKEN_STRIDE + TOKEN_END] = cursor - 1
                tokens[token * TOKEN_STRIDE + TOKEN_NEXT] = used
                tokens[token * TOKEN_STRIDE + TOKEN_SIZE_OR_HASH] = if (escapedString) {
                    ESCAPED_STRING_HASH
                } else {
                    hash
                }
                return
            }
            assert(ch >= JSON_SPACE) { "Control character in JSON string" }
            if (ch >= 0x80) {
                escapedString = true
                val continuation = when (ch) {
                    in 0xc2..0xdf -> 1
                    in 0xe0..0xef -> 2
                    in 0xf0..0xf4 -> 3
                    else -> error("Invalid UTF-8 in JSON string")
                }
                assert(cursor <= limit - continuation) { "Truncated UTF-8" }
                val second = bytes[cursor].toInt() and 0xff
                assert(
                    second in 0x80..0xbf &&
                        (ch != 0xe0 || second >= 0xa0) &&
                        (ch != 0xed || second < 0xa0) &&
                        (ch != 0xf0 || second >= 0x90) &&
                        (ch != 0xf4 || second < 0x90),
                ) { "Invalid UTF-8" }
                repeat(continuation) {
                    assert((bytes[cursor].toInt() and 0xc0) == 0x80) { "Invalid UTF-8" }
                    cursor++
                }
                continue
            }
            if (hashKey) {
                hash = hash * STRING_HASH_MULTIPLIER + ch
            }
            if (ch == JSON_BACKSLASH) {
                escapedString = true
                assert(cursor < limit) { "Truncated JSON escape" }
                val escaped = bytes[cursor++].toInt()
                assert(
                    escaped == JSON_QUOTE ||
                        escaped == JSON_BACKSLASH ||
                        escaped == JSON_SLASH ||
                        escaped == JSON_ESCAPE_BACKSPACE ||
                        escaped == JSON_ESCAPE_FORM_FEED ||
                        escaped == JSON_ESCAPE_LINE_FEED ||
                        escaped == JSON_ESCAPE_CARRIAGE_RETURN ||
                        escaped == JSON_ESCAPE_TAB ||
                        escaped == JSON_ESCAPE_UNICODE,
                ) { "Invalid JSON escape" }
                if (hashKey) {
                    hash = hash * STRING_HASH_MULTIPLIER + escaped
                }
                if (escaped == JSON_ESCAPE_UNICODE) {
                    val code = unicodeEscape()
                    assert(code !in 0xdc00..0xdfff) { "Unpaired Unicode surrogate" }
                    if (code in 0xd800..0xdbff) {
                        assert(
                            cursor <= limit - 6 &&
                                bytes[cursor].toInt() == JSON_BACKSLASH &&
                                bytes[cursor + 1].toInt() == JSON_ESCAPE_UNICODE,
                        ) { "Unpaired Unicode surrogate" }
                        cursor += 2
                        val lowSurrogate = unicodeEscape()
                        assert(lowSurrogate in 0xdc00..0xdfff) { "Unpaired Unicode surrogate" }
                    }
                }
            }
        }
        error("Truncated JSON string")
    }

    private fun unicodeEscape(): Int {
        var code = 0
        repeat(UNICODE_ESCAPE_DIGITS) {
            assert(cursor < limit) { "Truncated Unicode escape" }
            val digit = hex(bytes[cursor++].toInt())
            assert(digit >= 0) { "Invalid Unicode escape" }
            code = code * 16 + digit
        }
        return code
    }

    private fun literal(value: String) {
        assert(cursor <= limit - value.length) { "Truncated JSON literal" }
        for (ch in value) {
            assert(bytes[cursor].toInt() == ch.code) { "Invalid JSON literal" }
            cursor++
        }
    }

    private fun number() {
        if (bytes[cursor].toInt() == JSON_MINUS) {
            cursor++
        }
        assert(cursor < limit) { "Truncated JSON number" }
        if (bytes[cursor].toInt() == DIGIT_ZERO) {
            cursor++
        } else {
            assert(bytes[cursor].toInt() in DIGIT_ONE..DIGIT_NINE) { "Invalid JSON number" }
            digits()
        }
        if (cursor < limit && bytes[cursor].toInt() == JSON_DECIMAL_POINT) {
            cursor++
            assert(cursor < limit && bytes[cursor].toInt() in DIGIT_ZERO..DIGIT_NINE) { "Invalid JSON fraction" }
            digits()
        }
        if (cursor < limit && (bytes[cursor].toInt() or ASCII_CASE_BIT) == JSON_EXPONENT) {
            cursor++
            if (cursor < limit && (bytes[cursor].toInt() == JSON_PLUS || bytes[cursor].toInt() == JSON_MINUS)) {
                cursor++
            }
            assert(cursor < limit && bytes[cursor].toInt() in DIGIT_ZERO..DIGIT_NINE) { "Invalid JSON exponent" }
            digits()
        }
    }

    private fun digits() {
        while (cursor < limit && bytes[cursor].toInt() in DIGIT_ZERO..DIGIT_NINE) cursor++
    }

    private fun whitespace() {
        while (cursor < limit) {
            when (bytes[cursor].toInt()) {
                JSON_SPACE, JSON_TAB, JSON_LINE_FEED, JSON_CARRIAGE_RETURN -> cursor++
                else -> return
            }
        }
    }

    fun next(token: Int): Int = tokens[token * TOKEN_STRIDE + TOKEN_NEXT]

    fun size(token: Int): Int = if (token < 0) {
        0
    } else {
        tokens[token * TOKEN_STRIDE + TOKEN_SIZE_OR_HASH]
    }

    fun element(token: Int, index: Int): Int {
        assert(token >= 0 && index >= 0 && index < size(token))
        var result = token + 1
        repeat(index) { result = next(result) }
        return result
    }

    fun field(obj: Int, name: GltfName): Int {
        if (obj < 0) {
            return JSON_MISSING_TOKEN
        }
        requireObject(obj)
        val count = size(obj)
        if (count == 0) {
            return JSON_MISSING_TOKEN
        }
        val capacity = Integer.highestOneBit(Math.multiplyExact(count, 2)) shl 1
        assert(capacity > 0) { "JSON object is too large" }
        var offset = fieldOffsets[obj]
        if (offset == 0) {
            offset = fieldUsed
            fieldUsed = Math.addExact(fieldUsed, capacity)
            if (fieldUsed > fieldBuckets.size) {
                fieldBuckets = fieldBuckets.copyOf(maxOf(fieldUsed, fieldBuckets.size * 2))
            }
            fieldBuckets.fill(0, offset, fieldUsed)
            fieldOffsets[obj] = offset
            var key = obj + 1
            val end = next(obj)
            while (key < end) {
                val storedHash = tokens[key * TOKEN_STRIDE + TOKEN_SIZE_OR_HASH]
                val hash = if (storedHash == ESCAPED_STRING_HASH) {
                    requireNotNull(string(key)).hashCode()
                } else {
                    storedHash
                }
                var slot = hash and (capacity - 1)
                while (fieldBuckets[offset + slot] != 0) {
                    slot = (slot + 1) and (capacity - 1)
                }
                fieldBuckets[offset + slot] = key + 1
                key = next(key + 1)
            }
        }
        var slot = name.keyHash and (capacity - 1)
        var result = JSON_MISSING_TOKEN
        while (true) {
            val entry = fieldBuckets[offset + slot]
            if (entry == 0) {
                return result
            }
            val key = entry - 1
            val hash = tokens[key * TOKEN_STRIDE + TOKEN_SIZE_OR_HASH]
            if ((hash == name.keyHash || hash == ESCAPED_STRING_HASH) && matchesBytes(token = key, text = name.utf8)) {
                result = key + 1
            }
            slot = (slot + 1) and (capacity - 1)
        }
    }

    fun matches(token: Int, name: GltfName): Boolean =
        token >= 0 &&
            tokens[token * TOKEN_STRIDE + TOKEN_KIND] == JSON_QUOTE &&
            matchesBytes(token = token, text = name.utf8)

    private fun matchesBytes(token: Int, text: Str): Boolean {
        if (tokens[token * TOKEN_STRIDE + TOKEN_SIZE_OR_HASH] == ESCAPED_STRING_HASH) {
            return requireNotNull(string(token)).toStr() == text
        }
        val start = tokens[token * TOKEN_STRIDE + TOKEN_START]
        val end = tokens[token * TOKEN_STRIDE + TOKEN_END]
        return end - start == text.len &&
            Arrays.mismatch(bytes, start, end, text.bytes, text.offset, text.offset + text.len) == -1
    }

    fun field(obj: Int, nameToken: Int): Int {
        requireObject(obj)
        var key = obj + 1
        val end = next(obj)
        var result = JSON_MISSING_TOKEN
        val start = tokens[nameToken * TOKEN_STRIDE + TOKEN_START]
        val limit = tokens[nameToken * TOKEN_STRIDE + TOKEN_END]
        val hash = tokens[nameToken * TOKEN_STRIDE + TOKEN_SIZE_OR_HASH]
        while (key < end) {
            val candidateHash = tokens[key * TOKEN_STRIDE + TOKEN_SIZE_OR_HASH]
            val equal = if (hash == ESCAPED_STRING_HASH || candidateHash == ESCAPED_STRING_HASH) {
                string(key) == string(nameToken)
            } else {
                hash == candidateHash &&
                    Arrays.mismatch(
                        bytes,
                        start,
                        limit,
                        bytes,
                        tokens[key * TOKEN_STRIDE + TOKEN_START],
                        tokens[key * TOKEN_STRIDE + TOKEN_END],
                    ) == -1
            }
            if (equal) {
                result = key + 1
            }
            key = next(key + 1)
        }
        return result
    }

    fun field(obj: Int, name: String): Int {
        if (obj < 0) {
            return JSON_MISSING_TOKEN
        }
        assert(tokens[obj * TOKEN_STRIDE + TOKEN_KIND] == JSON_OBJECT_OPEN) { "Expected JSON object" }
        var key = obj + 1
        val end = next(obj)
        val hash = name.hashCode()
        var result = JSON_MISSING_TOKEN
        while (key < end) {
            if ((tokens[key * TOKEN_STRIDE + TOKEN_SIZE_OR_HASH] == hash && equals(token = key, text = name)) ||
                (tokens[key * TOKEN_STRIDE + TOKEN_SIZE_OR_HASH] == ESCAPED_STRING_HASH && string(key) == name)
            ) {
                result = key + 1
            }
            key = next(key + 1)
        }
        return result
    }

    fun isObject(token: Int): Boolean = token >= 0 && tokens[token * TOKEN_STRIDE + TOKEN_KIND] == JSON_OBJECT_OPEN

    fun requireArray(token: Int) {
        assert(token >= 0 && tokens[token * TOKEN_STRIDE + TOKEN_KIND] == JSON_ARRAY_OPEN) { "Expected JSON array" }
    }

    fun requireObject(token: Int) {
        assert(token >= 0 && tokens[token * TOKEN_STRIDE + TOKEN_KIND] == JSON_OBJECT_OPEN) { "Expected JSON object" }
    }

    fun matches(token: Int, text: String): Boolean =
        token >= 0 &&
            tokens[token * TOKEN_STRIDE + TOKEN_KIND] == JSON_QUOTE &&
            (equals(token = token, text = text) ||
                (tokens[token * TOKEN_STRIDE + TOKEN_SIZE_OR_HASH] == ESCAPED_STRING_HASH && string(token) == text))

    private fun equals(token: Int, text: String): Boolean {
        val start = tokens[token * TOKEN_STRIDE + TOKEN_START]
        if (tokens[token * TOKEN_STRIDE + TOKEN_END] - start != text.length) {
            return false
        }
        for (index in text.indices) {
            if ((bytes[start + index].toInt() and UNSIGNED_BYTE_MASK) != text[index].code) {
                return false
            }
        }
        return true
    }

    fun int(
        token: Int,
        default: Int = 0,
    ): Int {
        if (token < 0) {
            return default
        }
        requireNumber(token)
        var pos = tokens[token * TOKEN_STRIDE + TOKEN_START]
        val start = pos
        val end = tokens[token * TOKEN_STRIDE + TOKEN_END]
        var sign = 1
        if (bytes[pos].toInt() == JSON_MINUS) {
            sign = -1
            pos++
        }
        var result = 0L
        assert(pos < end) { "Expected JSON integer" }
        while (pos < end) {
            val digit = bytes[pos++].toInt() - DIGIT_ZERO
            if (digit !in 0..< DECIMAL_RADIX) {
                return decimalInt(start = start, end = end)
            }
            result = result * DECIMAL_RADIX + digit
            if (result > MAX_INTEGER_MAGNITUDE) {
                return decimalInt(start = start, end = end)
            }
        }
        return Math.toIntExact(result * sign)
    }

    private fun zeroCoefficient(start: Int, end: Int): Boolean {
        var index = start
        while (index < end) {
            val ch = bytes[index++].toInt()
            if ((ch or ASCII_CASE_BIT) == JSON_EXPONENT) {
                break
            }
            if (ch in DIGIT_ONE..DIGIT_NINE) {
                return false
            }
        }
        return true
    }

    private fun decimalInt(start: Int, end: Int): Int {
        if (zeroCoefficient(start = start, end = end)) {
            return 0
        }
        try {
            return BigDecimal(String(bytes, start, end - start, Charsets.US_ASCII)).intValueExact()
        } catch (exception: ArithmeticException) {
            throw IllegalArgumentException("Expected an in-range JSON integer", exception)
        }
    }

    private fun requireNumber(token: Int) {
        val kind = tokens[token * TOKEN_STRIDE + TOKEN_KIND]
        assert(kind == JSON_MINUS || kind in DIGIT_ZERO..DIGIT_NINE) { "Expected JSON number" }
    }

    fun validateIntegerBounds(token: Int, componentType: Int) {
        if (token < 0 || componentType == GLTF_COMPONENT_FLOAT) {
            return
        }
        val minimum: Long
        val maximum: Long
        when (componentType) {
            GLTF_COMPONENT_BYTE -> {
                minimum = -128
                maximum = 127
            }

            GLTF_COMPONENT_UNSIGNED_BYTE -> {
                minimum = 0
                maximum = 255
            }

            GLTF_COMPONENT_SHORT -> {
                minimum = -32768
                maximum = 32767
            }

            GLTF_COMPONENT_UNSIGNED_SHORT -> {
                minimum = 0
                maximum = 65535
            }

            GLTF_COMPONENT_UNSIGNED_INT -> {
                minimum = 0
                maximum = 4294967295L
            }

            else -> {
                throw IllegalArgumentException("Invalid component type")
            }
        }
        var child = token + 1
        repeat(size(token)) {
            requireNumber(child)
            val start = tokens[child * TOKEN_STRIDE + TOKEN_START]
            val end = tokens[child * TOKEN_STRIDE + TOKEN_END]
            val value = try {
                if (zeroCoefficient(start = start, end = end)) {
                    0L
                } else {
                    BigDecimal(String(bytes, start, end - start, Charsets.US_ASCII)).longValueExact()
                }
            } catch (exception: ArithmeticException) {
                throw IllegalArgumentException("Invalid integer accessor bound", exception)
            }
            assert(value in minimum..maximum) { "Accessor bound exceeds component range" }
            child = next(child)
        }
    }

    fun float(
        token: Int,
        default: Float = 0f,
    ): Float {
        if (token < 0) {
            return default
        }
        requireNumber(token)
        var pos = tokens[token * TOKEN_STRIDE + TOKEN_START]
        val end = tokens[token * TOKEN_STRIDE + TOKEN_END]
        val negative = bytes[pos].toInt() == JSON_MINUS
        if (negative) {
            pos++
        }
        var value = 0
        var digits = 0
        var fraction = 0
        var decimal = false
        while (pos < end) {
            val ch = bytes[pos++].toInt()
            if (ch == JSON_DECIMAL_POINT && !decimal) {
                decimal = true
                continue
            }
            if (ch !in DIGIT_ZERO..DIGIT_NINE || digits == MAX_FAST_FLOAT_DIGITS) {
                pos = -1
                break
            }
            value = value * DECIMAL_RADIX + ch - DIGIT_ZERO
            digits++
            if (decimal) {
                fraction++
            }
        }
        if (pos == end && digits <= MAX_FAST_FLOAT_DIGITS && bytes[end - 1].toInt() in DIGIT_ZERO..DIGIT_NINE) {
            val result = (value.toDouble() / decimalPowers[fraction]).toFloat()
            return if (negative) {
                -result
            } else {
                result
            }
        }
        return preciseFloat(token)
    }

    private fun preciseFloat(token: Int): Float {
        val start = tokens[token * TOKEN_STRIDE + TOKEN_START]
        val end = tokens[token * TOKEN_STRIDE + TOKEN_END]
        var pos = start
        val negative = bytes[pos].toInt() == JSON_MINUS
        if (negative) {
            pos++
        }
        var mantissa = 0L
        var significant = 0
        var fraction = 0
        var decimal = false
        while (pos < end) {
            val ch = bytes[pos].toInt()
            if (ch == JSON_DECIMAL_POINT) {
                decimal = true
                pos++
                continue
            }
            if (ch !in DIGIT_ZERO..DIGIT_NINE) {
                break
            }
            if (mantissa != 0L || ch != DIGIT_ZERO) {
                significant++
            }
            if (significant > MAX_SIGNIFICANT_DIGITS) {
                return slowFloat(start = start, end = end)
            }
            mantissa = mantissa * DECIMAL_RADIX + ch - DIGIT_ZERO
            if (decimal) {
                fraction++
            }
            pos++
        }
        var exponent = 0
        if (pos < end) {
            pos++
            var exponentSign = 1
            if (bytes[pos].toInt() == JSON_MINUS) {
                exponentSign = -1
                pos++
            } else if (bytes[pos].toInt() == JSON_PLUS) {
                pos++
            }
            while (pos < end) {
                exponent = exponent * DECIMAL_RADIX + bytes[pos++].toInt() - DIGIT_ZERO
                if (exponent > MAX_PARSED_EXPONENT) {
                    return slowFloat(start = start, end = end)
                }
            }
            exponent *= exponentSign
        }
        if (mantissa == 0L) {
            return if (negative) {
                -0f
            } else {
                0f
            }
        }
        exponent -= fraction
        if (exponent !in -MAX_PRECISE_EXPONENT..MAX_PRECISE_EXPONENT) {
            return slowFloat(start = start, end = end)
        }
        val value = if (exponent < 0) {
            mantissa.toDouble() / precisePowers[-exponent]
        } else {
            mantissa.toDouble() * precisePowers[exponent]
        }
        val rounded = value.toFloat()
        if (!rounded.isFinite()) {
            return slowFloat(start = start, end = end)
        }
        val neighbor = if (value > rounded.toDouble()) {
            rounded.nextUp()
        } else {
            rounded.nextDown()
        }
        val midpoint = (rounded.toDouble() + neighbor.toDouble()) * MIDPOINT_FACTOR
        if (abs(value - midpoint) <= Math.ulp(value) * FLOAT_MIDPOINT_ULPS) {
            return slowFloat(start = start, end = end)
        }
        return if (negative) {
            -rounded
        } else {
            rounded
        }
    }

    private fun slowFloat(start: Int, end: Int): Float {
        val value = java.lang.Float.parseFloat(String(bytes, start, end - start, Charsets.US_ASCII))
        assert(value.isFinite()) {
            "Nonfinite JSON number"
        }
        return value
    }

    fun bool(
        token: Int,
        default: Boolean = false,
    ): Boolean {
        if (token < 0) {
            return default
        }
        return when (tokens[token * TOKEN_STRIDE + TOKEN_KIND]) {
            JSON_TRUE_START -> true
            JSON_FALSE_START -> false
            else -> error("Expected JSON boolean")
        }
    }

    fun string(token: Int): String? {
        if (token < 0) {
            return null
        }
        assert(tokens[token * TOKEN_STRIDE + TOKEN_KIND] == JSON_QUOTE) { "Expected JSON string" }
        val start = tokens[token * TOKEN_STRIDE + TOKEN_START]
        val end = tokens[token * TOKEN_STRIDE + TOKEN_END]
        if (tokens[token * TOKEN_STRIDE + TOKEN_SIZE_OR_HASH] != ESCAPED_STRING_HASH) {
            return String(bytes, start, end - start, Charsets.UTF_8)
        }
        var pos = start
        while (pos < end && bytes[pos].toInt() != JSON_BACKSLASH) {
            pos++
        }
        if (pos == end) {
            return String(bytes, start, end - start, Charsets.UTF_8)
        }
        val result = StringBuilder(end - start)
        result.append(String(bytes, start, pos - start, Charsets.UTF_8))
        while (pos < end) {
            val run = pos
            while (pos < end && bytes[pos].toInt() != JSON_BACKSLASH) {
                pos++
            }
            result.append(String(bytes, run, pos - run, Charsets.UTF_8))
            if (pos == end) {
                break
            }
            when (val escaped = bytes[++pos].toInt()) {
                JSON_ESCAPE_BACKSPACE -> {
                    result.append('\b')
                }
                JSON_ESCAPE_FORM_FEED -> {
                    result.append('\u000c')
                }
                JSON_ESCAPE_LINE_FEED -> {
                    result.append('\n')
                }
                JSON_ESCAPE_CARRIAGE_RETURN -> {
                    result.append('\r')
                }
                JSON_ESCAPE_TAB -> {
                    result.append('\t')
                }
                JSON_ESCAPE_UNICODE -> {
                    var code = 0
                    repeat(UNICODE_ESCAPE_DIGITS) { code = code * HEX_RADIX + hex(bytes[++pos].toInt()) }
                    result.append(code.toChar())
                }

                else -> {
                    result.append(escaped.toChar())
                }
            }
            pos++
        }
        return result.toString()
    }

    fun ints(token: Int): Ints {
        if (token < 0) {
            return stableEmptyInts
        }
        requireArray(token)
        if (size(token) == 0) {
            return stableEmptyInts
        }
        var child = token + 1
        return Ints(size(token)) { int(token = child).also { child = next(child) } }
    }

    fun floats(token: Int): Floats {
        if (token < 0) {
            return stableEmptyFloats
        }
        requireArray(token)
        if (size(token) == 0) {
            return stableEmptyFloats
        }
        var child = token + 1
        return Floats(size(token)) { float(token = child).also { child = next(child) } }
    }

    fun raw(token: Int): String? {
        if (token < 0) {
            return null
        }
        val quote = if (tokens[token * TOKEN_STRIDE + TOKEN_KIND] == JSON_QUOTE) {
            1
        } else {
            0
        }
        return String(
            bytes,
            tokens[token * TOKEN_STRIDE + TOKEN_START] - quote,
            tokens[token * TOKEN_STRIDE + TOKEN_END] -
                tokens[token * TOKEN_STRIDE + TOKEN_START] +
                quote * STRING_DELIMITER_COUNT,
            Charsets.UTF_8,
        )
    }

    private fun hex(ch: Int): Int = when (ch) {
        in DIGIT_ZERO..DIGIT_NINE -> ch - DIGIT_ZERO
        in HEX_UPPER_A..HEX_UPPER_F -> ch - HEX_UPPER_OFFSET
        in HEX_LOWER_A..HEX_LOWER_F -> ch - HEX_LOWER_OFFSET
        else -> -1
    }
}
