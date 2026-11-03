package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_material {

    cgltf_material() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Cgltf.C_POINTER.withName("name"),
        Cgltf.C_INT.withName("has_pbr_metallic_roughness"),
        Cgltf.C_INT.withName("has_pbr_specular_glossiness"),
        Cgltf.C_INT.withName("has_clearcoat"),
        Cgltf.C_INT.withName("has_transmission"),
        Cgltf.C_INT.withName("has_volume"),
        Cgltf.C_INT.withName("has_ior"),
        Cgltf.C_INT.withName("has_specular"),
        Cgltf.C_INT.withName("has_sheen"),
        Cgltf.C_INT.withName("has_emissive_strength"),
        Cgltf.C_INT.withName("has_iridescence"),
        Cgltf.C_INT.withName("has_diffuse_transmission"),
        Cgltf.C_INT.withName("has_anisotropy"),
        Cgltf.C_INT.withName("has_dispersion"),
        MemoryLayout.paddingLayout(4),
        cgltf_pbr_metallic_roughness.layout().withName("pbr_metallic_roughness"),
        cgltf_pbr_specular_glossiness.layout().withName("pbr_specular_glossiness"),
        cgltf_clearcoat.layout().withName("clearcoat"),
        cgltf_ior.layout().withName("ior"),
        MemoryLayout.paddingLayout(4),
        cgltf_specular.layout().withName("specular"),
        cgltf_sheen.layout().withName("sheen"),
        cgltf_transmission.layout().withName("transmission"),
        cgltf_volume.layout().withName("volume"),
        cgltf_emissive_strength.layout().withName("emissive_strength"),
        MemoryLayout.paddingLayout(4),
        cgltf_iridescence.layout().withName("iridescence"),
        cgltf_diffuse_transmission.layout().withName("diffuse_transmission"),
        cgltf_anisotropy.layout().withName("anisotropy"),
        cgltf_dispersion.layout().withName("dispersion"),
        MemoryLayout.paddingLayout(4),
        cgltf_texture_view.layout().withName("normal_texture"),
        cgltf_texture_view.layout().withName("occlusion_texture"),
        cgltf_texture_view.layout().withName("emissive_texture"),
        MemoryLayout.sequenceLayout(3, Cgltf.C_FLOAT).withName("emissive_factor"),
        Cgltf.C_INT.withName("alpha_mode"),
        Cgltf.C_FLOAT.withName("alpha_cutoff"),
        Cgltf.C_INT.withName("double_sided"),
        Cgltf.C_INT.withName("unlit"),
        MemoryLayout.paddingLayout(4),
        cgltf_extras.layout().withName("extras"),
        Cgltf.C_SIZE_T.withName("extensions_count"),
        Cgltf.C_POINTER.withName("extensions")
    ).withName("cgltf_material");

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout name$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("name"));

    public static final AddressLayout name$layout() {
        return name$LAYOUT;
    }

    private static final long name$OFFSET = $LAYOUT.byteOffset(groupElement("name"));

    public static final long name$offset() {
        return name$OFFSET;
    }

    public static MemorySegment name(MemorySegment struct) {
        return struct.get(name$LAYOUT, name$OFFSET);
    }

    public static void name(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(name$LAYOUT, name$OFFSET, fieldValue);
    }

    private static final OfInt has_pbr_metallic_roughness$LAYOUT = (OfInt)$LAYOUT.select(groupElement("has_pbr_metallic_roughness"));

    public static final OfInt has_pbr_metallic_roughness$layout() {
        return has_pbr_metallic_roughness$LAYOUT;
    }

    private static final long has_pbr_metallic_roughness$OFFSET = $LAYOUT.byteOffset(groupElement("has_pbr_metallic_roughness"));

    public static final long has_pbr_metallic_roughness$offset() {
        return has_pbr_metallic_roughness$OFFSET;
    }

    public static int has_pbr_metallic_roughness(MemorySegment struct) {
        return struct.get(has_pbr_metallic_roughness$LAYOUT, has_pbr_metallic_roughness$OFFSET);
    }

    public static void has_pbr_metallic_roughness(MemorySegment struct, int fieldValue) {
        struct.set(has_pbr_metallic_roughness$LAYOUT, has_pbr_metallic_roughness$OFFSET, fieldValue);
    }

    private static final OfInt has_pbr_specular_glossiness$LAYOUT = (OfInt)$LAYOUT.select(groupElement("has_pbr_specular_glossiness"));

    public static final OfInt has_pbr_specular_glossiness$layout() {
        return has_pbr_specular_glossiness$LAYOUT;
    }

    private static final long has_pbr_specular_glossiness$OFFSET = $LAYOUT.byteOffset(groupElement("has_pbr_specular_glossiness"));

    public static final long has_pbr_specular_glossiness$offset() {
        return has_pbr_specular_glossiness$OFFSET;
    }

    public static int has_pbr_specular_glossiness(MemorySegment struct) {
        return struct.get(has_pbr_specular_glossiness$LAYOUT, has_pbr_specular_glossiness$OFFSET);
    }

    public static void has_pbr_specular_glossiness(MemorySegment struct, int fieldValue) {
        struct.set(has_pbr_specular_glossiness$LAYOUT, has_pbr_specular_glossiness$OFFSET, fieldValue);
    }

    private static final OfInt has_clearcoat$LAYOUT = (OfInt)$LAYOUT.select(groupElement("has_clearcoat"));

    public static final OfInt has_clearcoat$layout() {
        return has_clearcoat$LAYOUT;
    }

    private static final long has_clearcoat$OFFSET = $LAYOUT.byteOffset(groupElement("has_clearcoat"));

    public static final long has_clearcoat$offset() {
        return has_clearcoat$OFFSET;
    }

    public static int has_clearcoat(MemorySegment struct) {
        return struct.get(has_clearcoat$LAYOUT, has_clearcoat$OFFSET);
    }

    public static void has_clearcoat(MemorySegment struct, int fieldValue) {
        struct.set(has_clearcoat$LAYOUT, has_clearcoat$OFFSET, fieldValue);
    }

    private static final OfInt has_transmission$LAYOUT = (OfInt)$LAYOUT.select(groupElement("has_transmission"));

    public static final OfInt has_transmission$layout() {
        return has_transmission$LAYOUT;
    }

    private static final long has_transmission$OFFSET = $LAYOUT.byteOffset(groupElement("has_transmission"));

    public static final long has_transmission$offset() {
        return has_transmission$OFFSET;
    }

    public static int has_transmission(MemorySegment struct) {
        return struct.get(has_transmission$LAYOUT, has_transmission$OFFSET);
    }

    public static void has_transmission(MemorySegment struct, int fieldValue) {
        struct.set(has_transmission$LAYOUT, has_transmission$OFFSET, fieldValue);
    }

    private static final OfInt has_volume$LAYOUT = (OfInt)$LAYOUT.select(groupElement("has_volume"));

    public static final OfInt has_volume$layout() {
        return has_volume$LAYOUT;
    }

    private static final long has_volume$OFFSET = $LAYOUT.byteOffset(groupElement("has_volume"));

    public static final long has_volume$offset() {
        return has_volume$OFFSET;
    }

    public static int has_volume(MemorySegment struct) {
        return struct.get(has_volume$LAYOUT, has_volume$OFFSET);
    }

    public static void has_volume(MemorySegment struct, int fieldValue) {
        struct.set(has_volume$LAYOUT, has_volume$OFFSET, fieldValue);
    }

    private static final OfInt has_ior$LAYOUT = (OfInt)$LAYOUT.select(groupElement("has_ior"));

    public static final OfInt has_ior$layout() {
        return has_ior$LAYOUT;
    }

    private static final long has_ior$OFFSET = $LAYOUT.byteOffset(groupElement("has_ior"));

    public static final long has_ior$offset() {
        return has_ior$OFFSET;
    }

    public static int has_ior(MemorySegment struct) {
        return struct.get(has_ior$LAYOUT, has_ior$OFFSET);
    }

    public static void has_ior(MemorySegment struct, int fieldValue) {
        struct.set(has_ior$LAYOUT, has_ior$OFFSET, fieldValue);
    }

    private static final OfInt has_specular$LAYOUT = (OfInt)$LAYOUT.select(groupElement("has_specular"));

    public static final OfInt has_specular$layout() {
        return has_specular$LAYOUT;
    }

    private static final long has_specular$OFFSET = $LAYOUT.byteOffset(groupElement("has_specular"));

    public static final long has_specular$offset() {
        return has_specular$OFFSET;
    }

    public static int has_specular(MemorySegment struct) {
        return struct.get(has_specular$LAYOUT, has_specular$OFFSET);
    }

    public static void has_specular(MemorySegment struct, int fieldValue) {
        struct.set(has_specular$LAYOUT, has_specular$OFFSET, fieldValue);
    }

    private static final OfInt has_sheen$LAYOUT = (OfInt)$LAYOUT.select(groupElement("has_sheen"));

    public static final OfInt has_sheen$layout() {
        return has_sheen$LAYOUT;
    }

    private static final long has_sheen$OFFSET = $LAYOUT.byteOffset(groupElement("has_sheen"));

    public static final long has_sheen$offset() {
        return has_sheen$OFFSET;
    }

    public static int has_sheen(MemorySegment struct) {
        return struct.get(has_sheen$LAYOUT, has_sheen$OFFSET);
    }

    public static void has_sheen(MemorySegment struct, int fieldValue) {
        struct.set(has_sheen$LAYOUT, has_sheen$OFFSET, fieldValue);
    }

    private static final OfInt has_emissive_strength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("has_emissive_strength"));

    public static final OfInt has_emissive_strength$layout() {
        return has_emissive_strength$LAYOUT;
    }

    private static final long has_emissive_strength$OFFSET = $LAYOUT.byteOffset(groupElement("has_emissive_strength"));

    public static final long has_emissive_strength$offset() {
        return has_emissive_strength$OFFSET;
    }

    public static int has_emissive_strength(MemorySegment struct) {
        return struct.get(has_emissive_strength$LAYOUT, has_emissive_strength$OFFSET);
    }

    public static void has_emissive_strength(MemorySegment struct, int fieldValue) {
        struct.set(has_emissive_strength$LAYOUT, has_emissive_strength$OFFSET, fieldValue);
    }

    private static final OfInt has_iridescence$LAYOUT = (OfInt)$LAYOUT.select(groupElement("has_iridescence"));

    public static final OfInt has_iridescence$layout() {
        return has_iridescence$LAYOUT;
    }

    private static final long has_iridescence$OFFSET = $LAYOUT.byteOffset(groupElement("has_iridescence"));

    public static final long has_iridescence$offset() {
        return has_iridescence$OFFSET;
    }

    public static int has_iridescence(MemorySegment struct) {
        return struct.get(has_iridescence$LAYOUT, has_iridescence$OFFSET);
    }

    public static void has_iridescence(MemorySegment struct, int fieldValue) {
        struct.set(has_iridescence$LAYOUT, has_iridescence$OFFSET, fieldValue);
    }

    private static final OfInt has_diffuse_transmission$LAYOUT = (OfInt)$LAYOUT.select(groupElement("has_diffuse_transmission"));

    public static final OfInt has_diffuse_transmission$layout() {
        return has_diffuse_transmission$LAYOUT;
    }

    private static final long has_diffuse_transmission$OFFSET = $LAYOUT.byteOffset(groupElement("has_diffuse_transmission"));

    public static final long has_diffuse_transmission$offset() {
        return has_diffuse_transmission$OFFSET;
    }

    public static int has_diffuse_transmission(MemorySegment struct) {
        return struct.get(has_diffuse_transmission$LAYOUT, has_diffuse_transmission$OFFSET);
    }

    public static void has_diffuse_transmission(MemorySegment struct, int fieldValue) {
        struct.set(has_diffuse_transmission$LAYOUT, has_diffuse_transmission$OFFSET, fieldValue);
    }

    private static final OfInt has_anisotropy$LAYOUT = (OfInt)$LAYOUT.select(groupElement("has_anisotropy"));

    public static final OfInt has_anisotropy$layout() {
        return has_anisotropy$LAYOUT;
    }

    private static final long has_anisotropy$OFFSET = $LAYOUT.byteOffset(groupElement("has_anisotropy"));

    public static final long has_anisotropy$offset() {
        return has_anisotropy$OFFSET;
    }

    public static int has_anisotropy(MemorySegment struct) {
        return struct.get(has_anisotropy$LAYOUT, has_anisotropy$OFFSET);
    }

    public static void has_anisotropy(MemorySegment struct, int fieldValue) {
        struct.set(has_anisotropy$LAYOUT, has_anisotropy$OFFSET, fieldValue);
    }

    private static final OfInt has_dispersion$LAYOUT = (OfInt)$LAYOUT.select(groupElement("has_dispersion"));

    public static final OfInt has_dispersion$layout() {
        return has_dispersion$LAYOUT;
    }

    private static final long has_dispersion$OFFSET = $LAYOUT.byteOffset(groupElement("has_dispersion"));

    public static final long has_dispersion$offset() {
        return has_dispersion$OFFSET;
    }

    public static int has_dispersion(MemorySegment struct) {
        return struct.get(has_dispersion$LAYOUT, has_dispersion$OFFSET);
    }

    public static void has_dispersion(MemorySegment struct, int fieldValue) {
        struct.set(has_dispersion$LAYOUT, has_dispersion$OFFSET, fieldValue);
    }

    private static final GroupLayout pbr_metallic_roughness$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("pbr_metallic_roughness"));

    public static final GroupLayout pbr_metallic_roughness$layout() {
        return pbr_metallic_roughness$LAYOUT;
    }

    private static final long pbr_metallic_roughness$OFFSET = $LAYOUT.byteOffset(groupElement("pbr_metallic_roughness"));

    public static final long pbr_metallic_roughness$offset() {
        return pbr_metallic_roughness$OFFSET;
    }

    public static MemorySegment pbr_metallic_roughness(MemorySegment struct) {
        return struct.asSlice(pbr_metallic_roughness$OFFSET, pbr_metallic_roughness$LAYOUT.byteSize());
    }

    public static void pbr_metallic_roughness(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, pbr_metallic_roughness$OFFSET, pbr_metallic_roughness$LAYOUT.byteSize());
    }

    private static final GroupLayout pbr_specular_glossiness$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("pbr_specular_glossiness"));

    public static final GroupLayout pbr_specular_glossiness$layout() {
        return pbr_specular_glossiness$LAYOUT;
    }

    private static final long pbr_specular_glossiness$OFFSET = $LAYOUT.byteOffset(groupElement("pbr_specular_glossiness"));

    public static final long pbr_specular_glossiness$offset() {
        return pbr_specular_glossiness$OFFSET;
    }

    public static MemorySegment pbr_specular_glossiness(MemorySegment struct) {
        return struct.asSlice(pbr_specular_glossiness$OFFSET, pbr_specular_glossiness$LAYOUT.byteSize());
    }

    public static void pbr_specular_glossiness(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, pbr_specular_glossiness$OFFSET, pbr_specular_glossiness$LAYOUT.byteSize());
    }

    private static final GroupLayout clearcoat$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("clearcoat"));

    public static final GroupLayout clearcoat$layout() {
        return clearcoat$LAYOUT;
    }

    private static final long clearcoat$OFFSET = $LAYOUT.byteOffset(groupElement("clearcoat"));

    public static final long clearcoat$offset() {
        return clearcoat$OFFSET;
    }

    public static MemorySegment clearcoat(MemorySegment struct) {
        return struct.asSlice(clearcoat$OFFSET, clearcoat$LAYOUT.byteSize());
    }

    public static void clearcoat(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, clearcoat$OFFSET, clearcoat$LAYOUT.byteSize());
    }

    private static final GroupLayout ior$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ior"));

    public static final GroupLayout ior$layout() {
        return ior$LAYOUT;
    }

    private static final long ior$OFFSET = $LAYOUT.byteOffset(groupElement("ior"));

    public static final long ior$offset() {
        return ior$OFFSET;
    }

    public static MemorySegment ior(MemorySegment struct) {
        return struct.asSlice(ior$OFFSET, ior$LAYOUT.byteSize());
    }

    public static void ior(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ior$OFFSET, ior$LAYOUT.byteSize());
    }

    private static final GroupLayout specular$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("specular"));

    public static final GroupLayout specular$layout() {
        return specular$LAYOUT;
    }

    private static final long specular$OFFSET = $LAYOUT.byteOffset(groupElement("specular"));

    public static final long specular$offset() {
        return specular$OFFSET;
    }

    public static MemorySegment specular(MemorySegment struct) {
        return struct.asSlice(specular$OFFSET, specular$LAYOUT.byteSize());
    }

    public static void specular(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, specular$OFFSET, specular$LAYOUT.byteSize());
    }

    private static final GroupLayout sheen$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("sheen"));

    public static final GroupLayout sheen$layout() {
        return sheen$LAYOUT;
    }

    private static final long sheen$OFFSET = $LAYOUT.byteOffset(groupElement("sheen"));

    public static final long sheen$offset() {
        return sheen$OFFSET;
    }

    public static MemorySegment sheen(MemorySegment struct) {
        return struct.asSlice(sheen$OFFSET, sheen$LAYOUT.byteSize());
    }

    public static void sheen(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, sheen$OFFSET, sheen$LAYOUT.byteSize());
    }

    private static final GroupLayout transmission$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("transmission"));

    public static final GroupLayout transmission$layout() {
        return transmission$LAYOUT;
    }

    private static final long transmission$OFFSET = $LAYOUT.byteOffset(groupElement("transmission"));

    public static final long transmission$offset() {
        return transmission$OFFSET;
    }

    public static MemorySegment transmission(MemorySegment struct) {
        return struct.asSlice(transmission$OFFSET, transmission$LAYOUT.byteSize());
    }

    public static void transmission(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, transmission$OFFSET, transmission$LAYOUT.byteSize());
    }

    private static final GroupLayout volume$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("volume"));

    public static final GroupLayout volume$layout() {
        return volume$LAYOUT;
    }

    private static final long volume$OFFSET = $LAYOUT.byteOffset(groupElement("volume"));

    public static final long volume$offset() {
        return volume$OFFSET;
    }

    public static MemorySegment volume(MemorySegment struct) {
        return struct.asSlice(volume$OFFSET, volume$LAYOUT.byteSize());
    }

    public static void volume(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, volume$OFFSET, volume$LAYOUT.byteSize());
    }

    private static final GroupLayout emissive_strength$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("emissive_strength"));

    public static final GroupLayout emissive_strength$layout() {
        return emissive_strength$LAYOUT;
    }

    private static final long emissive_strength$OFFSET = $LAYOUT.byteOffset(groupElement("emissive_strength"));

    public static final long emissive_strength$offset() {
        return emissive_strength$OFFSET;
    }

    public static MemorySegment emissive_strength(MemorySegment struct) {
        return struct.asSlice(emissive_strength$OFFSET, emissive_strength$LAYOUT.byteSize());
    }

    public static void emissive_strength(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, emissive_strength$OFFSET, emissive_strength$LAYOUT.byteSize());
    }

    private static final GroupLayout iridescence$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("iridescence"));

    public static final GroupLayout iridescence$layout() {
        return iridescence$LAYOUT;
    }

    private static final long iridescence$OFFSET = $LAYOUT.byteOffset(groupElement("iridescence"));

    public static final long iridescence$offset() {
        return iridescence$OFFSET;
    }

    public static MemorySegment iridescence(MemorySegment struct) {
        return struct.asSlice(iridescence$OFFSET, iridescence$LAYOUT.byteSize());
    }

    public static void iridescence(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, iridescence$OFFSET, iridescence$LAYOUT.byteSize());
    }

    private static final GroupLayout diffuse_transmission$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("diffuse_transmission"));

    public static final GroupLayout diffuse_transmission$layout() {
        return diffuse_transmission$LAYOUT;
    }

    private static final long diffuse_transmission$OFFSET = $LAYOUT.byteOffset(groupElement("diffuse_transmission"));

    public static final long diffuse_transmission$offset() {
        return diffuse_transmission$OFFSET;
    }

    public static MemorySegment diffuse_transmission(MemorySegment struct) {
        return struct.asSlice(diffuse_transmission$OFFSET, diffuse_transmission$LAYOUT.byteSize());
    }

    public static void diffuse_transmission(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, diffuse_transmission$OFFSET, diffuse_transmission$LAYOUT.byteSize());
    }

    private static final GroupLayout anisotropy$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("anisotropy"));

    public static final GroupLayout anisotropy$layout() {
        return anisotropy$LAYOUT;
    }

    private static final long anisotropy$OFFSET = $LAYOUT.byteOffset(groupElement("anisotropy"));

    public static final long anisotropy$offset() {
        return anisotropy$OFFSET;
    }

    public static MemorySegment anisotropy(MemorySegment struct) {
        return struct.asSlice(anisotropy$OFFSET, anisotropy$LAYOUT.byteSize());
    }

    public static void anisotropy(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, anisotropy$OFFSET, anisotropy$LAYOUT.byteSize());
    }

    private static final GroupLayout dispersion$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("dispersion"));

    public static final GroupLayout dispersion$layout() {
        return dispersion$LAYOUT;
    }

    private static final long dispersion$OFFSET = $LAYOUT.byteOffset(groupElement("dispersion"));

    public static final long dispersion$offset() {
        return dispersion$OFFSET;
    }

    public static MemorySegment dispersion(MemorySegment struct) {
        return struct.asSlice(dispersion$OFFSET, dispersion$LAYOUT.byteSize());
    }

    public static void dispersion(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, dispersion$OFFSET, dispersion$LAYOUT.byteSize());
    }

    private static final GroupLayout normal_texture$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("normal_texture"));

    public static final GroupLayout normal_texture$layout() {
        return normal_texture$LAYOUT;
    }

    private static final long normal_texture$OFFSET = $LAYOUT.byteOffset(groupElement("normal_texture"));

    public static final long normal_texture$offset() {
        return normal_texture$OFFSET;
    }

    public static MemorySegment normal_texture(MemorySegment struct) {
        return struct.asSlice(normal_texture$OFFSET, normal_texture$LAYOUT.byteSize());
    }

    public static void normal_texture(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, normal_texture$OFFSET, normal_texture$LAYOUT.byteSize());
    }

    private static final GroupLayout occlusion_texture$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("occlusion_texture"));

    public static final GroupLayout occlusion_texture$layout() {
        return occlusion_texture$LAYOUT;
    }

    private static final long occlusion_texture$OFFSET = $LAYOUT.byteOffset(groupElement("occlusion_texture"));

    public static final long occlusion_texture$offset() {
        return occlusion_texture$OFFSET;
    }

    public static MemorySegment occlusion_texture(MemorySegment struct) {
        return struct.asSlice(occlusion_texture$OFFSET, occlusion_texture$LAYOUT.byteSize());
    }

    public static void occlusion_texture(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, occlusion_texture$OFFSET, occlusion_texture$LAYOUT.byteSize());
    }

    private static final GroupLayout emissive_texture$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("emissive_texture"));

    public static final GroupLayout emissive_texture$layout() {
        return emissive_texture$LAYOUT;
    }

    private static final long emissive_texture$OFFSET = $LAYOUT.byteOffset(groupElement("emissive_texture"));

    public static final long emissive_texture$offset() {
        return emissive_texture$OFFSET;
    }

    public static MemorySegment emissive_texture(MemorySegment struct) {
        return struct.asSlice(emissive_texture$OFFSET, emissive_texture$LAYOUT.byteSize());
    }

    public static void emissive_texture(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, emissive_texture$OFFSET, emissive_texture$LAYOUT.byteSize());
    }

    private static final SequenceLayout emissive_factor$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("emissive_factor"));

    public static final SequenceLayout emissive_factor$layout() {
        return emissive_factor$LAYOUT;
    }

    private static final long emissive_factor$OFFSET = $LAYOUT.byteOffset(groupElement("emissive_factor"));

    public static final long emissive_factor$offset() {
        return emissive_factor$OFFSET;
    }

    public static MemorySegment emissive_factor(MemorySegment struct) {
        return struct.asSlice(emissive_factor$OFFSET, emissive_factor$LAYOUT.byteSize());
    }

    public static void emissive_factor(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, emissive_factor$OFFSET, emissive_factor$LAYOUT.byteSize());
    }

    private static long[] emissive_factor$DIMS = { 3 };

    public static long[] emissive_factor$dimensions() {
        return emissive_factor$DIMS;
    }
    private static final VarHandle emissive_factor$ELEM_HANDLE = emissive_factor$LAYOUT.varHandle(sequenceElement());

    public static float emissive_factor(MemorySegment struct, long index0) {
        return (float)emissive_factor$ELEM_HANDLE.get(struct, emissive_factor$OFFSET, index0);
    }

    public static void emissive_factor(MemorySegment struct, long index0, float fieldValue) {
        emissive_factor$ELEM_HANDLE.set(struct, emissive_factor$OFFSET, index0, fieldValue);
    }

    private static final OfInt alpha_mode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("alpha_mode"));

    public static final OfInt alpha_mode$layout() {
        return alpha_mode$LAYOUT;
    }

    private static final long alpha_mode$OFFSET = $LAYOUT.byteOffset(groupElement("alpha_mode"));

    public static final long alpha_mode$offset() {
        return alpha_mode$OFFSET;
    }

    public static int alpha_mode(MemorySegment struct) {
        return struct.get(alpha_mode$LAYOUT, alpha_mode$OFFSET);
    }

    public static void alpha_mode(MemorySegment struct, int fieldValue) {
        struct.set(alpha_mode$LAYOUT, alpha_mode$OFFSET, fieldValue);
    }

    private static final OfFloat alpha_cutoff$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("alpha_cutoff"));

    public static final OfFloat alpha_cutoff$layout() {
        return alpha_cutoff$LAYOUT;
    }

    private static final long alpha_cutoff$OFFSET = $LAYOUT.byteOffset(groupElement("alpha_cutoff"));

    public static final long alpha_cutoff$offset() {
        return alpha_cutoff$OFFSET;
    }

    public static float alpha_cutoff(MemorySegment struct) {
        return struct.get(alpha_cutoff$LAYOUT, alpha_cutoff$OFFSET);
    }

    public static void alpha_cutoff(MemorySegment struct, float fieldValue) {
        struct.set(alpha_cutoff$LAYOUT, alpha_cutoff$OFFSET, fieldValue);
    }

    private static final OfInt double_sided$LAYOUT = (OfInt)$LAYOUT.select(groupElement("double_sided"));

    public static final OfInt double_sided$layout() {
        return double_sided$LAYOUT;
    }

    private static final long double_sided$OFFSET = $LAYOUT.byteOffset(groupElement("double_sided"));

    public static final long double_sided$offset() {
        return double_sided$OFFSET;
    }

    public static int double_sided(MemorySegment struct) {
        return struct.get(double_sided$LAYOUT, double_sided$OFFSET);
    }

    public static void double_sided(MemorySegment struct, int fieldValue) {
        struct.set(double_sided$LAYOUT, double_sided$OFFSET, fieldValue);
    }

    private static final OfInt unlit$LAYOUT = (OfInt)$LAYOUT.select(groupElement("unlit"));

    public static final OfInt unlit$layout() {
        return unlit$LAYOUT;
    }

    private static final long unlit$OFFSET = $LAYOUT.byteOffset(groupElement("unlit"));

    public static final long unlit$offset() {
        return unlit$OFFSET;
    }

    public static int unlit(MemorySegment struct) {
        return struct.get(unlit$LAYOUT, unlit$OFFSET);
    }

    public static void unlit(MemorySegment struct, int fieldValue) {
        struct.set(unlit$LAYOUT, unlit$OFFSET, fieldValue);
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

    private static final OfLong extensions_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("extensions_count"));

    public static final OfLong extensions_count$layout() {
        return extensions_count$LAYOUT;
    }

    private static final long extensions_count$OFFSET = $LAYOUT.byteOffset(groupElement("extensions_count"));

    public static final long extensions_count$offset() {
        return extensions_count$OFFSET;
    }

    public static long extensions_count(MemorySegment struct) {
        return struct.get(extensions_count$LAYOUT, extensions_count$OFFSET);
    }

    public static void extensions_count(MemorySegment struct, long fieldValue) {
        struct.set(extensions_count$LAYOUT, extensions_count$OFFSET, fieldValue);
    }

    private static final AddressLayout extensions$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("extensions"));

    public static final AddressLayout extensions$layout() {
        return extensions$LAYOUT;
    }

    private static final long extensions$OFFSET = $LAYOUT.byteOffset(groupElement("extensions"));

    public static final long extensions$offset() {
        return extensions$OFFSET;
    }

    public static MemorySegment extensions(MemorySegment struct) {
        return struct.get(extensions$LAYOUT, extensions$OFFSET);
    }

    public static void extensions(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(extensions$LAYOUT, extensions$OFFSET, fieldValue);
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

