package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_data {

    cgltf_data() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Cgltf.C_INT.withName("file_type"),
        MemoryLayout.paddingLayout(4),
        Cgltf.C_POINTER.withName("file_data"),
        Cgltf.C_SIZE_T.withName("file_size"),
        cgltf_asset.layout().withName("asset"),
        Cgltf.C_POINTER.withName("meshes"),
        Cgltf.C_SIZE_T.withName("meshes_count"),
        Cgltf.C_POINTER.withName("materials"),
        Cgltf.C_SIZE_T.withName("materials_count"),
        Cgltf.C_POINTER.withName("accessors"),
        Cgltf.C_SIZE_T.withName("accessors_count"),
        Cgltf.C_POINTER.withName("buffer_views"),
        Cgltf.C_SIZE_T.withName("buffer_views_count"),
        Cgltf.C_POINTER.withName("buffers"),
        Cgltf.C_SIZE_T.withName("buffers_count"),
        Cgltf.C_POINTER.withName("images"),
        Cgltf.C_SIZE_T.withName("images_count"),
        Cgltf.C_POINTER.withName("textures"),
        Cgltf.C_SIZE_T.withName("textures_count"),
        Cgltf.C_POINTER.withName("samplers"),
        Cgltf.C_SIZE_T.withName("samplers_count"),
        Cgltf.C_POINTER.withName("skins"),
        Cgltf.C_SIZE_T.withName("skins_count"),
        Cgltf.C_POINTER.withName("cameras"),
        Cgltf.C_SIZE_T.withName("cameras_count"),
        Cgltf.C_POINTER.withName("lights"),
        Cgltf.C_SIZE_T.withName("lights_count"),
        Cgltf.C_POINTER.withName("nodes"),
        Cgltf.C_SIZE_T.withName("nodes_count"),
        Cgltf.C_POINTER.withName("scenes"),
        Cgltf.C_SIZE_T.withName("scenes_count"),
        Cgltf.C_POINTER.withName("scene"),
        Cgltf.C_POINTER.withName("animations"),
        Cgltf.C_SIZE_T.withName("animations_count"),
        Cgltf.C_POINTER.withName("variants"),
        Cgltf.C_SIZE_T.withName("variants_count"),
        cgltf_extras.layout().withName("extras"),
        Cgltf.C_SIZE_T.withName("data_extensions_count"),
        Cgltf.C_POINTER.withName("data_extensions"),
        Cgltf.C_POINTER.withName("extensions_used"),
        Cgltf.C_SIZE_T.withName("extensions_used_count"),
        Cgltf.C_POINTER.withName("extensions_required"),
        Cgltf.C_SIZE_T.withName("extensions_required_count"),
        Cgltf.C_POINTER.withName("json"),
        Cgltf.C_SIZE_T.withName("json_size"),
        Cgltf.C_POINTER.withName("bin"),
        Cgltf.C_SIZE_T.withName("bin_size"),
        cgltf_memory_options.layout().withName("memory"),
        cgltf_file_options.layout().withName("file")
    ).withName("cgltf_data");

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt file_type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("file_type"));

    public static final OfInt file_type$layout() {
        return file_type$LAYOUT;
    }

    private static final long file_type$OFFSET = $LAYOUT.byteOffset(groupElement("file_type"));

    public static final long file_type$offset() {
        return file_type$OFFSET;
    }

    public static int file_type(MemorySegment struct) {
        return struct.get(file_type$LAYOUT, file_type$OFFSET);
    }

    public static void file_type(MemorySegment struct, int fieldValue) {
        struct.set(file_type$LAYOUT, file_type$OFFSET, fieldValue);
    }

    private static final AddressLayout file_data$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("file_data"));

    public static final AddressLayout file_data$layout() {
        return file_data$LAYOUT;
    }

    private static final long file_data$OFFSET = $LAYOUT.byteOffset(groupElement("file_data"));

    public static final long file_data$offset() {
        return file_data$OFFSET;
    }

    public static MemorySegment file_data(MemorySegment struct) {
        return struct.get(file_data$LAYOUT, file_data$OFFSET);
    }

    public static void file_data(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(file_data$LAYOUT, file_data$OFFSET, fieldValue);
    }

    private static final OfLong file_size$LAYOUT = (OfLong)$LAYOUT.select(groupElement("file_size"));

    public static final OfLong file_size$layout() {
        return file_size$LAYOUT;
    }

    private static final long file_size$OFFSET = $LAYOUT.byteOffset(groupElement("file_size"));

    public static final long file_size$offset() {
        return file_size$OFFSET;
    }

    public static long file_size(MemorySegment struct) {
        return struct.get(file_size$LAYOUT, file_size$OFFSET);
    }

    public static void file_size(MemorySegment struct, long fieldValue) {
        struct.set(file_size$LAYOUT, file_size$OFFSET, fieldValue);
    }

    private static final GroupLayout asset$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("asset"));

    public static final GroupLayout asset$layout() {
        return asset$LAYOUT;
    }

    private static final long asset$OFFSET = $LAYOUT.byteOffset(groupElement("asset"));

    public static final long asset$offset() {
        return asset$OFFSET;
    }

    public static MemorySegment asset(MemorySegment struct) {
        return struct.asSlice(asset$OFFSET, asset$LAYOUT.byteSize());
    }

    public static void asset(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, asset$OFFSET, asset$LAYOUT.byteSize());
    }

    private static final AddressLayout meshes$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("meshes"));

    public static final AddressLayout meshes$layout() {
        return meshes$LAYOUT;
    }

    private static final long meshes$OFFSET = $LAYOUT.byteOffset(groupElement("meshes"));

    public static final long meshes$offset() {
        return meshes$OFFSET;
    }

    public static MemorySegment meshes(MemorySegment struct) {
        return struct.get(meshes$LAYOUT, meshes$OFFSET);
    }

    public static void meshes(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(meshes$LAYOUT, meshes$OFFSET, fieldValue);
    }

    private static final OfLong meshes_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("meshes_count"));

    public static final OfLong meshes_count$layout() {
        return meshes_count$LAYOUT;
    }

    private static final long meshes_count$OFFSET = $LAYOUT.byteOffset(groupElement("meshes_count"));

    public static final long meshes_count$offset() {
        return meshes_count$OFFSET;
    }

    public static long meshes_count(MemorySegment struct) {
        return struct.get(meshes_count$LAYOUT, meshes_count$OFFSET);
    }

    public static void meshes_count(MemorySegment struct, long fieldValue) {
        struct.set(meshes_count$LAYOUT, meshes_count$OFFSET, fieldValue);
    }

    private static final AddressLayout materials$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("materials"));

    public static final AddressLayout materials$layout() {
        return materials$LAYOUT;
    }

    private static final long materials$OFFSET = $LAYOUT.byteOffset(groupElement("materials"));

    public static final long materials$offset() {
        return materials$OFFSET;
    }

    public static MemorySegment materials(MemorySegment struct) {
        return struct.get(materials$LAYOUT, materials$OFFSET);
    }

    public static void materials(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(materials$LAYOUT, materials$OFFSET, fieldValue);
    }

    private static final OfLong materials_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("materials_count"));

    public static final OfLong materials_count$layout() {
        return materials_count$LAYOUT;
    }

    private static final long materials_count$OFFSET = $LAYOUT.byteOffset(groupElement("materials_count"));

    public static final long materials_count$offset() {
        return materials_count$OFFSET;
    }

    public static long materials_count(MemorySegment struct) {
        return struct.get(materials_count$LAYOUT, materials_count$OFFSET);
    }

    public static void materials_count(MemorySegment struct, long fieldValue) {
        struct.set(materials_count$LAYOUT, materials_count$OFFSET, fieldValue);
    }

    private static final AddressLayout accessors$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("accessors"));

    public static final AddressLayout accessors$layout() {
        return accessors$LAYOUT;
    }

    private static final long accessors$OFFSET = $LAYOUT.byteOffset(groupElement("accessors"));

    public static final long accessors$offset() {
        return accessors$OFFSET;
    }

    public static MemorySegment accessors(MemorySegment struct) {
        return struct.get(accessors$LAYOUT, accessors$OFFSET);
    }

    public static void accessors(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(accessors$LAYOUT, accessors$OFFSET, fieldValue);
    }

    private static final OfLong accessors_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("accessors_count"));

    public static final OfLong accessors_count$layout() {
        return accessors_count$LAYOUT;
    }

    private static final long accessors_count$OFFSET = $LAYOUT.byteOffset(groupElement("accessors_count"));

    public static final long accessors_count$offset() {
        return accessors_count$OFFSET;
    }

    public static long accessors_count(MemorySegment struct) {
        return struct.get(accessors_count$LAYOUT, accessors_count$OFFSET);
    }

    public static void accessors_count(MemorySegment struct, long fieldValue) {
        struct.set(accessors_count$LAYOUT, accessors_count$OFFSET, fieldValue);
    }

    private static final AddressLayout buffer_views$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("buffer_views"));

    public static final AddressLayout buffer_views$layout() {
        return buffer_views$LAYOUT;
    }

    private static final long buffer_views$OFFSET = $LAYOUT.byteOffset(groupElement("buffer_views"));

    public static final long buffer_views$offset() {
        return buffer_views$OFFSET;
    }

    public static MemorySegment buffer_views(MemorySegment struct) {
        return struct.get(buffer_views$LAYOUT, buffer_views$OFFSET);
    }

    public static void buffer_views(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(buffer_views$LAYOUT, buffer_views$OFFSET, fieldValue);
    }

    private static final OfLong buffer_views_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("buffer_views_count"));

    public static final OfLong buffer_views_count$layout() {
        return buffer_views_count$LAYOUT;
    }

    private static final long buffer_views_count$OFFSET = $LAYOUT.byteOffset(groupElement("buffer_views_count"));

    public static final long buffer_views_count$offset() {
        return buffer_views_count$OFFSET;
    }

    public static long buffer_views_count(MemorySegment struct) {
        return struct.get(buffer_views_count$LAYOUT, buffer_views_count$OFFSET);
    }

    public static void buffer_views_count(MemorySegment struct, long fieldValue) {
        struct.set(buffer_views_count$LAYOUT, buffer_views_count$OFFSET, fieldValue);
    }

    private static final AddressLayout buffers$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("buffers"));

    public static final AddressLayout buffers$layout() {
        return buffers$LAYOUT;
    }

    private static final long buffers$OFFSET = $LAYOUT.byteOffset(groupElement("buffers"));

    public static final long buffers$offset() {
        return buffers$OFFSET;
    }

    public static MemorySegment buffers(MemorySegment struct) {
        return struct.get(buffers$LAYOUT, buffers$OFFSET);
    }

    public static void buffers(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(buffers$LAYOUT, buffers$OFFSET, fieldValue);
    }

    private static final OfLong buffers_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("buffers_count"));

    public static final OfLong buffers_count$layout() {
        return buffers_count$LAYOUT;
    }

    private static final long buffers_count$OFFSET = $LAYOUT.byteOffset(groupElement("buffers_count"));

    public static final long buffers_count$offset() {
        return buffers_count$OFFSET;
    }

    public static long buffers_count(MemorySegment struct) {
        return struct.get(buffers_count$LAYOUT, buffers_count$OFFSET);
    }

    public static void buffers_count(MemorySegment struct, long fieldValue) {
        struct.set(buffers_count$LAYOUT, buffers_count$OFFSET, fieldValue);
    }

    private static final AddressLayout images$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("images"));

    public static final AddressLayout images$layout() {
        return images$LAYOUT;
    }

    private static final long images$OFFSET = $LAYOUT.byteOffset(groupElement("images"));

    public static final long images$offset() {
        return images$OFFSET;
    }

    public static MemorySegment images(MemorySegment struct) {
        return struct.get(images$LAYOUT, images$OFFSET);
    }

    public static void images(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(images$LAYOUT, images$OFFSET, fieldValue);
    }

    private static final OfLong images_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("images_count"));

    public static final OfLong images_count$layout() {
        return images_count$LAYOUT;
    }

    private static final long images_count$OFFSET = $LAYOUT.byteOffset(groupElement("images_count"));

    public static final long images_count$offset() {
        return images_count$OFFSET;
    }

    public static long images_count(MemorySegment struct) {
        return struct.get(images_count$LAYOUT, images_count$OFFSET);
    }

    public static void images_count(MemorySegment struct, long fieldValue) {
        struct.set(images_count$LAYOUT, images_count$OFFSET, fieldValue);
    }

    private static final AddressLayout textures$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("textures"));

    public static final AddressLayout textures$layout() {
        return textures$LAYOUT;
    }

    private static final long textures$OFFSET = $LAYOUT.byteOffset(groupElement("textures"));

    public static final long textures$offset() {
        return textures$OFFSET;
    }

    public static MemorySegment textures(MemorySegment struct) {
        return struct.get(textures$LAYOUT, textures$OFFSET);
    }

    public static void textures(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(textures$LAYOUT, textures$OFFSET, fieldValue);
    }

    private static final OfLong textures_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("textures_count"));

    public static final OfLong textures_count$layout() {
        return textures_count$LAYOUT;
    }

    private static final long textures_count$OFFSET = $LAYOUT.byteOffset(groupElement("textures_count"));

    public static final long textures_count$offset() {
        return textures_count$OFFSET;
    }

    public static long textures_count(MemorySegment struct) {
        return struct.get(textures_count$LAYOUT, textures_count$OFFSET);
    }

    public static void textures_count(MemorySegment struct, long fieldValue) {
        struct.set(textures_count$LAYOUT, textures_count$OFFSET, fieldValue);
    }

    private static final AddressLayout samplers$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("samplers"));

    public static final AddressLayout samplers$layout() {
        return samplers$LAYOUT;
    }

    private static final long samplers$OFFSET = $LAYOUT.byteOffset(groupElement("samplers"));

    public static final long samplers$offset() {
        return samplers$OFFSET;
    }

    public static MemorySegment samplers(MemorySegment struct) {
        return struct.get(samplers$LAYOUT, samplers$OFFSET);
    }

    public static void samplers(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(samplers$LAYOUT, samplers$OFFSET, fieldValue);
    }

    private static final OfLong samplers_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("samplers_count"));

    public static final OfLong samplers_count$layout() {
        return samplers_count$LAYOUT;
    }

    private static final long samplers_count$OFFSET = $LAYOUT.byteOffset(groupElement("samplers_count"));

    public static final long samplers_count$offset() {
        return samplers_count$OFFSET;
    }

    public static long samplers_count(MemorySegment struct) {
        return struct.get(samplers_count$LAYOUT, samplers_count$OFFSET);
    }

    public static void samplers_count(MemorySegment struct, long fieldValue) {
        struct.set(samplers_count$LAYOUT, samplers_count$OFFSET, fieldValue);
    }

    private static final AddressLayout skins$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("skins"));

    public static final AddressLayout skins$layout() {
        return skins$LAYOUT;
    }

    private static final long skins$OFFSET = $LAYOUT.byteOffset(groupElement("skins"));

    public static final long skins$offset() {
        return skins$OFFSET;
    }

    public static MemorySegment skins(MemorySegment struct) {
        return struct.get(skins$LAYOUT, skins$OFFSET);
    }

    public static void skins(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(skins$LAYOUT, skins$OFFSET, fieldValue);
    }

    private static final OfLong skins_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("skins_count"));

    public static final OfLong skins_count$layout() {
        return skins_count$LAYOUT;
    }

    private static final long skins_count$OFFSET = $LAYOUT.byteOffset(groupElement("skins_count"));

    public static final long skins_count$offset() {
        return skins_count$OFFSET;
    }

    public static long skins_count(MemorySegment struct) {
        return struct.get(skins_count$LAYOUT, skins_count$OFFSET);
    }

    public static void skins_count(MemorySegment struct, long fieldValue) {
        struct.set(skins_count$LAYOUT, skins_count$OFFSET, fieldValue);
    }

    private static final AddressLayout cameras$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("cameras"));

    public static final AddressLayout cameras$layout() {
        return cameras$LAYOUT;
    }

    private static final long cameras$OFFSET = $LAYOUT.byteOffset(groupElement("cameras"));

    public static final long cameras$offset() {
        return cameras$OFFSET;
    }

    public static MemorySegment cameras(MemorySegment struct) {
        return struct.get(cameras$LAYOUT, cameras$OFFSET);
    }

    public static void cameras(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(cameras$LAYOUT, cameras$OFFSET, fieldValue);
    }

    private static final OfLong cameras_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("cameras_count"));

    public static final OfLong cameras_count$layout() {
        return cameras_count$LAYOUT;
    }

    private static final long cameras_count$OFFSET = $LAYOUT.byteOffset(groupElement("cameras_count"));

    public static final long cameras_count$offset() {
        return cameras_count$OFFSET;
    }

    public static long cameras_count(MemorySegment struct) {
        return struct.get(cameras_count$LAYOUT, cameras_count$OFFSET);
    }

    public static void cameras_count(MemorySegment struct, long fieldValue) {
        struct.set(cameras_count$LAYOUT, cameras_count$OFFSET, fieldValue);
    }

    private static final AddressLayout lights$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lights"));

    public static final AddressLayout lights$layout() {
        return lights$LAYOUT;
    }

    private static final long lights$OFFSET = $LAYOUT.byteOffset(groupElement("lights"));

    public static final long lights$offset() {
        return lights$OFFSET;
    }

    public static MemorySegment lights(MemorySegment struct) {
        return struct.get(lights$LAYOUT, lights$OFFSET);
    }

    public static void lights(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lights$LAYOUT, lights$OFFSET, fieldValue);
    }

    private static final OfLong lights_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("lights_count"));

    public static final OfLong lights_count$layout() {
        return lights_count$LAYOUT;
    }

    private static final long lights_count$OFFSET = $LAYOUT.byteOffset(groupElement("lights_count"));

    public static final long lights_count$offset() {
        return lights_count$OFFSET;
    }

    public static long lights_count(MemorySegment struct) {
        return struct.get(lights_count$LAYOUT, lights_count$OFFSET);
    }

    public static void lights_count(MemorySegment struct, long fieldValue) {
        struct.set(lights_count$LAYOUT, lights_count$OFFSET, fieldValue);
    }

    private static final AddressLayout nodes$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("nodes"));

    public static final AddressLayout nodes$layout() {
        return nodes$LAYOUT;
    }

    private static final long nodes$OFFSET = $LAYOUT.byteOffset(groupElement("nodes"));

    public static final long nodes$offset() {
        return nodes$OFFSET;
    }

    public static MemorySegment nodes(MemorySegment struct) {
        return struct.get(nodes$LAYOUT, nodes$OFFSET);
    }

    public static void nodes(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(nodes$LAYOUT, nodes$OFFSET, fieldValue);
    }

    private static final OfLong nodes_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("nodes_count"));

    public static final OfLong nodes_count$layout() {
        return nodes_count$LAYOUT;
    }

    private static final long nodes_count$OFFSET = $LAYOUT.byteOffset(groupElement("nodes_count"));

    public static final long nodes_count$offset() {
        return nodes_count$OFFSET;
    }

    public static long nodes_count(MemorySegment struct) {
        return struct.get(nodes_count$LAYOUT, nodes_count$OFFSET);
    }

    public static void nodes_count(MemorySegment struct, long fieldValue) {
        struct.set(nodes_count$LAYOUT, nodes_count$OFFSET, fieldValue);
    }

    private static final AddressLayout scenes$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("scenes"));

    public static final AddressLayout scenes$layout() {
        return scenes$LAYOUT;
    }

    private static final long scenes$OFFSET = $LAYOUT.byteOffset(groupElement("scenes"));

    public static final long scenes$offset() {
        return scenes$OFFSET;
    }

    public static MemorySegment scenes(MemorySegment struct) {
        return struct.get(scenes$LAYOUT, scenes$OFFSET);
    }

    public static void scenes(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(scenes$LAYOUT, scenes$OFFSET, fieldValue);
    }

    private static final OfLong scenes_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("scenes_count"));

    public static final OfLong scenes_count$layout() {
        return scenes_count$LAYOUT;
    }

    private static final long scenes_count$OFFSET = $LAYOUT.byteOffset(groupElement("scenes_count"));

    public static final long scenes_count$offset() {
        return scenes_count$OFFSET;
    }

    public static long scenes_count(MemorySegment struct) {
        return struct.get(scenes_count$LAYOUT, scenes_count$OFFSET);
    }

    public static void scenes_count(MemorySegment struct, long fieldValue) {
        struct.set(scenes_count$LAYOUT, scenes_count$OFFSET, fieldValue);
    }

    private static final AddressLayout scene$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("scene"));

    public static final AddressLayout scene$layout() {
        return scene$LAYOUT;
    }

    private static final long scene$OFFSET = $LAYOUT.byteOffset(groupElement("scene"));

    public static final long scene$offset() {
        return scene$OFFSET;
    }

    public static MemorySegment scene(MemorySegment struct) {
        return struct.get(scene$LAYOUT, scene$OFFSET);
    }

    public static void scene(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(scene$LAYOUT, scene$OFFSET, fieldValue);
    }

    private static final AddressLayout animations$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("animations"));

    public static final AddressLayout animations$layout() {
        return animations$LAYOUT;
    }

    private static final long animations$OFFSET = $LAYOUT.byteOffset(groupElement("animations"));

    public static final long animations$offset() {
        return animations$OFFSET;
    }

    public static MemorySegment animations(MemorySegment struct) {
        return struct.get(animations$LAYOUT, animations$OFFSET);
    }

    public static void animations(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(animations$LAYOUT, animations$OFFSET, fieldValue);
    }

    private static final OfLong animations_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("animations_count"));

    public static final OfLong animations_count$layout() {
        return animations_count$LAYOUT;
    }

    private static final long animations_count$OFFSET = $LAYOUT.byteOffset(groupElement("animations_count"));

    public static final long animations_count$offset() {
        return animations_count$OFFSET;
    }

    public static long animations_count(MemorySegment struct) {
        return struct.get(animations_count$LAYOUT, animations_count$OFFSET);
    }

    public static void animations_count(MemorySegment struct, long fieldValue) {
        struct.set(animations_count$LAYOUT, animations_count$OFFSET, fieldValue);
    }

    private static final AddressLayout variants$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("variants"));

    public static final AddressLayout variants$layout() {
        return variants$LAYOUT;
    }

    private static final long variants$OFFSET = $LAYOUT.byteOffset(groupElement("variants"));

    public static final long variants$offset() {
        return variants$OFFSET;
    }

    public static MemorySegment variants(MemorySegment struct) {
        return struct.get(variants$LAYOUT, variants$OFFSET);
    }

    public static void variants(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(variants$LAYOUT, variants$OFFSET, fieldValue);
    }

    private static final OfLong variants_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("variants_count"));

    public static final OfLong variants_count$layout() {
        return variants_count$LAYOUT;
    }

    private static final long variants_count$OFFSET = $LAYOUT.byteOffset(groupElement("variants_count"));

    public static final long variants_count$offset() {
        return variants_count$OFFSET;
    }

    public static long variants_count(MemorySegment struct) {
        return struct.get(variants_count$LAYOUT, variants_count$OFFSET);
    }

    public static void variants_count(MemorySegment struct, long fieldValue) {
        struct.set(variants_count$LAYOUT, variants_count$OFFSET, fieldValue);
    }

    private static final GroupLayout extras$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("extras"));

    public static final GroupLayout extras$layout() {
        return extras$LAYOUT;
    }

    private static final long extras$OFFSET = $LAYOUT.byteOffset(groupElement("extras"));

    public static final long extras$offset() {
        return extras$OFFSET;
    }

    public static MemorySegment extras(MemorySegment struct) {
        return struct.asSlice(extras$OFFSET, extras$LAYOUT.byteSize());
    }

    public static void extras(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, extras$OFFSET, extras$LAYOUT.byteSize());
    }

    private static final OfLong data_extensions_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("data_extensions_count"));

    public static final OfLong data_extensions_count$layout() {
        return data_extensions_count$LAYOUT;
    }

    private static final long data_extensions_count$OFFSET = $LAYOUT.byteOffset(groupElement("data_extensions_count"));

    public static final long data_extensions_count$offset() {
        return data_extensions_count$OFFSET;
    }

    public static long data_extensions_count(MemorySegment struct) {
        return struct.get(data_extensions_count$LAYOUT, data_extensions_count$OFFSET);
    }

    public static void data_extensions_count(MemorySegment struct, long fieldValue) {
        struct.set(data_extensions_count$LAYOUT, data_extensions_count$OFFSET, fieldValue);
    }

    private static final AddressLayout data_extensions$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("data_extensions"));

    public static final AddressLayout data_extensions$layout() {
        return data_extensions$LAYOUT;
    }

    private static final long data_extensions$OFFSET = $LAYOUT.byteOffset(groupElement("data_extensions"));

    public static final long data_extensions$offset() {
        return data_extensions$OFFSET;
    }

    public static MemorySegment data_extensions(MemorySegment struct) {
        return struct.get(data_extensions$LAYOUT, data_extensions$OFFSET);
    }

    public static void data_extensions(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(data_extensions$LAYOUT, data_extensions$OFFSET, fieldValue);
    }

    private static final AddressLayout extensions_used$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("extensions_used"));

    public static final AddressLayout extensions_used$layout() {
        return extensions_used$LAYOUT;
    }

    private static final long extensions_used$OFFSET = $LAYOUT.byteOffset(groupElement("extensions_used"));

    public static final long extensions_used$offset() {
        return extensions_used$OFFSET;
    }

    public static MemorySegment extensions_used(MemorySegment struct) {
        return struct.get(extensions_used$LAYOUT, extensions_used$OFFSET);
    }

    public static void extensions_used(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(extensions_used$LAYOUT, extensions_used$OFFSET, fieldValue);
    }

    private static final OfLong extensions_used_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("extensions_used_count"));

    public static final OfLong extensions_used_count$layout() {
        return extensions_used_count$LAYOUT;
    }

    private static final long extensions_used_count$OFFSET = $LAYOUT.byteOffset(groupElement("extensions_used_count"));

    public static final long extensions_used_count$offset() {
        return extensions_used_count$OFFSET;
    }

    public static long extensions_used_count(MemorySegment struct) {
        return struct.get(extensions_used_count$LAYOUT, extensions_used_count$OFFSET);
    }

    public static void extensions_used_count(MemorySegment struct, long fieldValue) {
        struct.set(extensions_used_count$LAYOUT, extensions_used_count$OFFSET, fieldValue);
    }

    private static final AddressLayout extensions_required$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("extensions_required"));

    public static final AddressLayout extensions_required$layout() {
        return extensions_required$LAYOUT;
    }

    private static final long extensions_required$OFFSET = $LAYOUT.byteOffset(groupElement("extensions_required"));

    public static final long extensions_required$offset() {
        return extensions_required$OFFSET;
    }

    public static MemorySegment extensions_required(MemorySegment struct) {
        return struct.get(extensions_required$LAYOUT, extensions_required$OFFSET);
    }

    public static void extensions_required(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(extensions_required$LAYOUT, extensions_required$OFFSET, fieldValue);
    }

    private static final OfLong extensions_required_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("extensions_required_count"));

    public static final OfLong extensions_required_count$layout() {
        return extensions_required_count$LAYOUT;
    }

    private static final long extensions_required_count$OFFSET = $LAYOUT.byteOffset(groupElement("extensions_required_count"));

    public static final long extensions_required_count$offset() {
        return extensions_required_count$OFFSET;
    }

    public static long extensions_required_count(MemorySegment struct) {
        return struct.get(extensions_required_count$LAYOUT, extensions_required_count$OFFSET);
    }

    public static void extensions_required_count(MemorySegment struct, long fieldValue) {
        struct.set(extensions_required_count$LAYOUT, extensions_required_count$OFFSET, fieldValue);
    }

    private static final AddressLayout json$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("json"));

    public static final AddressLayout json$layout() {
        return json$LAYOUT;
    }

    private static final long json$OFFSET = $LAYOUT.byteOffset(groupElement("json"));

    public static final long json$offset() {
        return json$OFFSET;
    }

    public static MemorySegment json(MemorySegment struct) {
        return struct.get(json$LAYOUT, json$OFFSET);
    }

    public static void json(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(json$LAYOUT, json$OFFSET, fieldValue);
    }

    private static final OfLong json_size$LAYOUT = (OfLong)$LAYOUT.select(groupElement("json_size"));

    public static final OfLong json_size$layout() {
        return json_size$LAYOUT;
    }

    private static final long json_size$OFFSET = $LAYOUT.byteOffset(groupElement("json_size"));

    public static final long json_size$offset() {
        return json_size$OFFSET;
    }

    public static long json_size(MemorySegment struct) {
        return struct.get(json_size$LAYOUT, json_size$OFFSET);
    }

    public static void json_size(MemorySegment struct, long fieldValue) {
        struct.set(json_size$LAYOUT, json_size$OFFSET, fieldValue);
    }

    private static final AddressLayout bin$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("bin"));

    public static final AddressLayout bin$layout() {
        return bin$LAYOUT;
    }

    private static final long bin$OFFSET = $LAYOUT.byteOffset(groupElement("bin"));

    public static final long bin$offset() {
        return bin$OFFSET;
    }

    public static MemorySegment bin(MemorySegment struct) {
        return struct.get(bin$LAYOUT, bin$OFFSET);
    }

    public static void bin(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(bin$LAYOUT, bin$OFFSET, fieldValue);
    }

    private static final OfLong bin_size$LAYOUT = (OfLong)$LAYOUT.select(groupElement("bin_size"));

    public static final OfLong bin_size$layout() {
        return bin_size$LAYOUT;
    }

    private static final long bin_size$OFFSET = $LAYOUT.byteOffset(groupElement("bin_size"));

    public static final long bin_size$offset() {
        return bin_size$OFFSET;
    }

    public static long bin_size(MemorySegment struct) {
        return struct.get(bin_size$LAYOUT, bin_size$OFFSET);
    }

    public static void bin_size(MemorySegment struct, long fieldValue) {
        struct.set(bin_size$LAYOUT, bin_size$OFFSET, fieldValue);
    }

    private static final GroupLayout memory$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("memory"));

    public static final GroupLayout memory$layout() {
        return memory$LAYOUT;
    }

    private static final long memory$OFFSET = $LAYOUT.byteOffset(groupElement("memory"));

    public static final long memory$offset() {
        return memory$OFFSET;
    }

    public static MemorySegment memory(MemorySegment struct) {
        return struct.asSlice(memory$OFFSET, memory$LAYOUT.byteSize());
    }

    public static void memory(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, memory$OFFSET, memory$LAYOUT.byteSize());
    }

    private static final GroupLayout file$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("file"));

    public static final GroupLayout file$layout() {
        return file$LAYOUT;
    }

    private static final long file$OFFSET = $LAYOUT.byteOffset(groupElement("file"));

    public static final long file$offset() {
        return file$OFFSET;
    }

    public static MemorySegment file(MemorySegment struct) {
        return struct.asSlice(file$OFFSET, file$LAYOUT.byteSize());
    }

    public static void file(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, file$OFFSET, file$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    public static long sizeof() { return layout().byteSize(); }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

