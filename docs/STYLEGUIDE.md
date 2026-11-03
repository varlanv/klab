## Kotlin

1. Prefer `value class` over `class` where single immutable field needs to be wrapped.
2. When primitive type with a meaning is passed around "naked" without wrapper class for performance reason - consider
   wrapping primitive in `value class` with domain name. E.g. `tokenId: TokenId` instead of `tokenId: Int`. When
   crossing array boundaries, such wrapped primitives should be unwrapped back to primitive types, e.g.
   `tokenIds: IntArray` instead of `tokenIds: Array<TokenId>`.
3. When Kotlin is constructor/function is called with 3 or more parameters, or when there are 2 or more parameters with
   same type - named parameters should be used instead of positional. E.g.
   `foo(param1 = param1, param2 = param2, param3 = param3)` instead of `foo(param1, param2, param3)`
4. Use `assert` generously for verifying pre/postconditions and invariants. Assertions serve both as
   documentation-as-code, and as additional for multiplier for fuzzing (refer
   to https://github.com/tigerbeetle/tigerbeetle/blob/main/docs/TIGER_STYLE.md#safety). Assertions are enabled in `dev`
   mode and in tests, but omitted in release.
5. Use `check` when verifying expected/documented error paths. Checks are enabled in all modes and tests.
6. Consider cache locality and data-oriented designs. For example, unlike in low level languages, in JVM it is always
   preferred to have two arrays as SOA instead of array of objects with 2 fields. Additionally, it in some cases it
   might be preferred to pack/unpack multiple values in/from single Long/Int
   via [VarHandles.kt](../libs/lang/src/main/kotlin/com/varlanv/klab/VarHandles.kt).
7. Consider debug-logging helpful information via [Io.kt](../libs/lang/src/main/kotlin/com/varlanv/klab/Io.kt) and
   `context(io: Io)`. Debug logs are disabled in `release` mode and are roughly zero-cost after JVM warmup.

## Shaders

1. One generated .spr file per one .slang source file.

## Gradle

1. Shared logic is written as plugins/tasks in [internal-convention-plugin](../internal-convention-plugin).
2. Minimize amount of Kotlin files in convention plugins, unless logic reuse is needed, or Gradle mandates separate
   file. It is preferred to have one big self-contained configuration file than 3-5 small scattered files.
