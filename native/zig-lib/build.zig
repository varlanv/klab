const std = @import("std");

pub fn build(b: *std.Build) !void {
    const target = b.standardTargetOptions(.{});
    const optimize = b.standardOptimizeOption(.{});
    const strip = b.option(
        bool,
        "strip",
        "Remove debug information",
    ) orelse false;
    const libName = b.option(
        []const u8,
        "libName",
        "Library name",
    ) orelse "klabZig";

    const module = b.createModule(.{
        .strip = strip,
        .root_source_file = b.path("src/root.zig"),
        .target = target,
        .optimize = optimize,
        .link_libc = true,
    });
    module.addIncludePath(b.path("external"));
    module.addCSourceFile(.{
        .file = b.path("src/cgltf.c"),
        .flags = &.{"-std=c99"},
    });
    const lib = b.addLibrary(.{
        .linkage = .dynamic,
        .name = libName,
        .root_module = module,
        .win32_module_definition = if (target.result.os.tag == .windows) b.path("src/klabZig.def") else null,
    });
    lib.rdynamic = true;
    b.installArtifact(lib);
}
