## Kotlin

### Value class

1. Prefer `value class` over `class` where single immutable field needs to be wrapped.
2. When primitive type with a meaning is passed around "naked" without wrapper class for performance reason - consider
   wrapping primitive in `value class` with domain name. E.g. `tokenId: TokenId` instead of `tokenId: Int`. When
   crossing array boundaries, such wrapped primitives should be unwrapped back to primitive types, e.g.
   `tokenIds: Ints` instead of `tokenIds: Array<TokenId>`.

### Maintenance

1. Use `assert` generously for verifying pre/postconditions and invariants. Assertions serve both as
   documentation-as-code, and as additional for multiplier for fuzzing (refer
   to https://github.com/tigerbeetle/tigerbeetle/blob/main/docs/TIGER_STYLE.md#safety). Assertions are enabled in `dev`
   mode and in tests, but omitted in release.
2. Use `check` when verifying expected/documented error paths. Checks are enabled in all modes and tests.
3. Consider debug-logging helpful information via [Io.kt](../libs/lang/src/main/kotlin/com/varlanv/klab/Io.kt) and
   `context(io: Io)`. Debug logs are disabled in `release` mode and are roughly zero-cost after JVM warmup.

### Performance

1. Consider cache locality and data-oriented designs. For example, unlike in low level languages, in JVM it is always
   preferred to have two arrays as SOA instead of array of objects with 2 fields. Additionally, it in some cases it
   might be preferred to pack/unpack multiple values in/from single Long/Int
   via [VarHandles.kt](../libs/lang/src/main/kotlin/com/varlanv/klab/VarHandles.kt).
2. `kotlin.String` usage is discouraged. In most cases, working directly with utf8 byte slices via `Str`, `BytesSlice`
   or `Bytes` will lead to better performance. Consider using `kotlin.String` only for:
    1) debugging
    2) testing
    3) error messages
    4) logging
    5) integrating with JDK / Kotlin SDK APIs. or as an utility
    6) to create immutable utf8 bytes in global scope.

### Style

1. When Kotlin is constructor/function is called with 3 or more parameters, or when there are 2 or more parameters with
   same type - named parameters should be used instead of positional. E.g.
   `foo(param1 = param1, param2 = param2, param3 = param3)` instead of `foo(param1, param2, param3)`
2. For usages related to Java "FFM API", structure code so that upper level own `Arena` lifecycle, and low level code
   receives `gpa: SegmentAllocator` for allocations.
3. As a rule of thumb, storing `gpa: SegmentAllocator` or `arena: Arena` as object field should be avoided. Instead, for
   better visibility of allocations, functions that allocate should receive allocator as context parameter
   `context(gpa: SegmentAllocator)`, while higher level code controls memory lifecycle.
4. Usage of `*Array` types is forbidden. That means types like `ByteArray`, `IntArray` etc.
   Instead, typealiases should be
   used - [PrimitiveCollections.kt](../libs/lang/src/main/kotlin/com/varlanv/klab/collections/PrimitiveCollections.kt),
   [Arrays.kt](../libs/lang/src/main/kotlin/com/varlanv/klab/collections/Arrays.kt).
   By convention, plural primitive collection typealiases like `Bytes` are immutable, and types with `Mut*` prefix are
   mutable.
   For example with bytes:
    1) `MutBytes` is safe to pass into places that receive `MutBytes`, `Bytes`, `ByteArray`.
    2) `Bytes` should never be mutated, and should never be passed to `MutBytes` boundaries, If such usage is
       absolutely required, it probably means either provider `Bytes` should be downgraded to `MutBytes` transitively,
       or array copy is required. For external boundaries (Java/Kotlin SDK) that receives plain `ByteArray`, care should
       be taken to pass `Bytes` only to places where it is trusted that function don't mutate receiver array.
    3) `ByteArray` should never be declared in this codebase.
5. **All** `if`, `else if`, `else`, `for`, `while` bodies should be wrapped with braces.

### Tests

1. All tests should extend [BaseSpec.kt](../testing/common-test/src/main/kotlin/com/varlanv/klab/testing/BaseSpec.kt),
   directly or transitively.
2. Tests should follow BDD structure (think Groovy Spock). Test can be written in 3 styles depending on complexity:
    1) // given <comment>... // when <comment>... // then <comment> with optional // and <comment> blocks in between
    2) // given <comment>... // expect <comment> with optional // and <comment> blocks in between
    3) // expect <comment> with optional // and <comment> blocks

   There should be exactly 1 empty newline between previous line of code and start of next tag (excluding first line
   in test method). For additional conventions refer to `BaseSpec` documentation.

## Shaders

1. One generated .spr file per one .slang source file.

## Gradle

1. Shared logic is written as plugins/tasks in [internal-convention-plugin](../internal-convention-plugin).
2. Minimize amount of Kotlin files in convention plugins, unless logic reuse is needed, or Gradle mandates separate
   file. It is preferred to have one big self-contained configuration file than 3-5 small scattered files.
