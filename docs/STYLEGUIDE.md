## Shaders

1. One generated .spr file per one .slang source file.

## Gradle

1. Shared logic is written as plugins/tasks in [internal-convention-plugin](../internal-convention-plugin).
2. Minimize amount of Kotlin files in convention plugins, unless logic reuse is needed, or Gradle mandates separate
   file. It is preferred to have one big self-contained configuration file than 3-5 small scattered files.
