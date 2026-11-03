package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class Cgltf extends Cgltf$shared {

    Cgltf() {
    }

    static final SymbolLookup SYMBOL_LOOKUP = com.varlanv.klab.glb.GlbNative.lookup();

    public static final OfLong cgltf_size = Cgltf.C_SIZE_T;

    public static final OfLong cgltf_ssize = Cgltf.C_LONG_LONG;

    public static final OfFloat cgltf_float = Cgltf.C_FLOAT;

    public static final OfInt cgltf_int = Cgltf.C_INT;

    public static final OfInt cgltf_uint = Cgltf.C_INT;

    public static final OfInt cgltf_bool = Cgltf.C_INT;
    private static final int cgltf_file_type_invalid = (int)0L;

    public static int cgltf_file_type_invalid() {
        return cgltf_file_type_invalid;
    }
    private static final int cgltf_file_type_gltf = (int)1L;

    public static int cgltf_file_type_gltf() {
        return cgltf_file_type_gltf;
    }
    private static final int cgltf_file_type_glb = (int)2L;

    public static int cgltf_file_type_glb() {
        return cgltf_file_type_glb;
    }
    private static final int cgltf_file_type_max_enum = (int)3L;

    public static int cgltf_file_type_max_enum() {
        return cgltf_file_type_max_enum;
    }
    private static final int cgltf_result_success = (int)0L;

    public static int cgltf_result_success() {
        return cgltf_result_success;
    }
    private static final int cgltf_result_data_too_short = (int)1L;

    public static int cgltf_result_data_too_short() {
        return cgltf_result_data_too_short;
    }
    private static final int cgltf_result_unknown_format = (int)2L;

    public static int cgltf_result_unknown_format() {
        return cgltf_result_unknown_format;
    }
    private static final int cgltf_result_invalid_json = (int)3L;

    public static int cgltf_result_invalid_json() {
        return cgltf_result_invalid_json;
    }
    private static final int cgltf_result_invalid_gltf = (int)4L;

    public static int cgltf_result_invalid_gltf() {
        return cgltf_result_invalid_gltf;
    }
    private static final int cgltf_result_invalid_options = (int)5L;

    public static int cgltf_result_invalid_options() {
        return cgltf_result_invalid_options;
    }
    private static final int cgltf_result_file_not_found = (int)6L;

    public static int cgltf_result_file_not_found() {
        return cgltf_result_file_not_found;
    }
    private static final int cgltf_result_io_error = (int)7L;

    public static int cgltf_result_io_error() {
        return cgltf_result_io_error;
    }
    private static final int cgltf_result_out_of_memory = (int)8L;

    public static int cgltf_result_out_of_memory() {
        return cgltf_result_out_of_memory;
    }
    private static final int cgltf_result_legacy_gltf = (int)9L;

    public static int cgltf_result_legacy_gltf() {
        return cgltf_result_legacy_gltf;
    }
    private static final int cgltf_result_max_enum = (int)10L;

    public static int cgltf_result_max_enum() {
        return cgltf_result_max_enum;
    }
    private static final int cgltf_buffer_view_type_invalid = (int)0L;

    public static int cgltf_buffer_view_type_invalid() {
        return cgltf_buffer_view_type_invalid;
    }
    private static final int cgltf_buffer_view_type_indices = (int)1L;

    public static int cgltf_buffer_view_type_indices() {
        return cgltf_buffer_view_type_indices;
    }
    private static final int cgltf_buffer_view_type_vertices = (int)2L;

    public static int cgltf_buffer_view_type_vertices() {
        return cgltf_buffer_view_type_vertices;
    }
    private static final int cgltf_buffer_view_type_max_enum = (int)3L;

    public static int cgltf_buffer_view_type_max_enum() {
        return cgltf_buffer_view_type_max_enum;
    }
    private static final int cgltf_attribute_type_invalid = (int)0L;

    public static int cgltf_attribute_type_invalid() {
        return cgltf_attribute_type_invalid;
    }
    private static final int cgltf_attribute_type_position = (int)1L;

    public static int cgltf_attribute_type_position() {
        return cgltf_attribute_type_position;
    }
    private static final int cgltf_attribute_type_normal = (int)2L;

    public static int cgltf_attribute_type_normal() {
        return cgltf_attribute_type_normal;
    }
    private static final int cgltf_attribute_type_tangent = (int)3L;

    public static int cgltf_attribute_type_tangent() {
        return cgltf_attribute_type_tangent;
    }
    private static final int cgltf_attribute_type_texcoord = (int)4L;

    public static int cgltf_attribute_type_texcoord() {
        return cgltf_attribute_type_texcoord;
    }
    private static final int cgltf_attribute_type_color = (int)5L;

    public static int cgltf_attribute_type_color() {
        return cgltf_attribute_type_color;
    }
    private static final int cgltf_attribute_type_joints = (int)6L;

    public static int cgltf_attribute_type_joints() {
        return cgltf_attribute_type_joints;
    }
    private static final int cgltf_attribute_type_weights = (int)7L;

    public static int cgltf_attribute_type_weights() {
        return cgltf_attribute_type_weights;
    }
    private static final int cgltf_attribute_type_custom = (int)8L;

    public static int cgltf_attribute_type_custom() {
        return cgltf_attribute_type_custom;
    }
    private static final int cgltf_attribute_type_max_enum = (int)9L;

    public static int cgltf_attribute_type_max_enum() {
        return cgltf_attribute_type_max_enum;
    }
    private static final int cgltf_component_type_invalid = (int)0L;

    public static int cgltf_component_type_invalid() {
        return cgltf_component_type_invalid;
    }
    private static final int cgltf_component_type_r_8 = (int)1L;

    public static int cgltf_component_type_r_8() {
        return cgltf_component_type_r_8;
    }
    private static final int cgltf_component_type_r_8u = (int)2L;

    public static int cgltf_component_type_r_8u() {
        return cgltf_component_type_r_8u;
    }
    private static final int cgltf_component_type_r_16 = (int)3L;

    public static int cgltf_component_type_r_16() {
        return cgltf_component_type_r_16;
    }
    private static final int cgltf_component_type_r_16u = (int)4L;

    public static int cgltf_component_type_r_16u() {
        return cgltf_component_type_r_16u;
    }
    private static final int cgltf_component_type_r_32u = (int)5L;

    public static int cgltf_component_type_r_32u() {
        return cgltf_component_type_r_32u;
    }
    private static final int cgltf_component_type_r_32f = (int)6L;

    public static int cgltf_component_type_r_32f() {
        return cgltf_component_type_r_32f;
    }
    private static final int cgltf_component_type_max_enum = (int)7L;

    public static int cgltf_component_type_max_enum() {
        return cgltf_component_type_max_enum;
    }
    private static final int cgltf_type_invalid = (int)0L;

    public static int cgltf_type_invalid() {
        return cgltf_type_invalid;
    }
    private static final int cgltf_type_scalar = (int)1L;

    public static int cgltf_type_scalar() {
        return cgltf_type_scalar;
    }
    private static final int cgltf_type_vec2 = (int)2L;

    public static int cgltf_type_vec2() {
        return cgltf_type_vec2;
    }
    private static final int cgltf_type_vec3 = (int)3L;

    public static int cgltf_type_vec3() {
        return cgltf_type_vec3;
    }
    private static final int cgltf_type_vec4 = (int)4L;

    public static int cgltf_type_vec4() {
        return cgltf_type_vec4;
    }
    private static final int cgltf_type_mat2 = (int)5L;

    public static int cgltf_type_mat2() {
        return cgltf_type_mat2;
    }
    private static final int cgltf_type_mat3 = (int)6L;

    public static int cgltf_type_mat3() {
        return cgltf_type_mat3;
    }
    private static final int cgltf_type_mat4 = (int)7L;

    public static int cgltf_type_mat4() {
        return cgltf_type_mat4;
    }
    private static final int cgltf_type_max_enum = (int)8L;

    public static int cgltf_type_max_enum() {
        return cgltf_type_max_enum;
    }
    private static final int cgltf_primitive_type_invalid = (int)0L;

    public static int cgltf_primitive_type_invalid() {
        return cgltf_primitive_type_invalid;
    }
    private static final int cgltf_primitive_type_points = (int)1L;

    public static int cgltf_primitive_type_points() {
        return cgltf_primitive_type_points;
    }
    private static final int cgltf_primitive_type_lines = (int)2L;

    public static int cgltf_primitive_type_lines() {
        return cgltf_primitive_type_lines;
    }
    private static final int cgltf_primitive_type_line_loop = (int)3L;

    public static int cgltf_primitive_type_line_loop() {
        return cgltf_primitive_type_line_loop;
    }
    private static final int cgltf_primitive_type_line_strip = (int)4L;

    public static int cgltf_primitive_type_line_strip() {
        return cgltf_primitive_type_line_strip;
    }
    private static final int cgltf_primitive_type_triangles = (int)5L;

    public static int cgltf_primitive_type_triangles() {
        return cgltf_primitive_type_triangles;
    }
    private static final int cgltf_primitive_type_triangle_strip = (int)6L;

    public static int cgltf_primitive_type_triangle_strip() {
        return cgltf_primitive_type_triangle_strip;
    }
    private static final int cgltf_primitive_type_triangle_fan = (int)7L;

    public static int cgltf_primitive_type_triangle_fan() {
        return cgltf_primitive_type_triangle_fan;
    }
    private static final int cgltf_primitive_type_max_enum = (int)8L;

    public static int cgltf_primitive_type_max_enum() {
        return cgltf_primitive_type_max_enum;
    }
    private static final int cgltf_alpha_mode_opaque = (int)0L;

    public static int cgltf_alpha_mode_opaque() {
        return cgltf_alpha_mode_opaque;
    }
    private static final int cgltf_alpha_mode_mask = (int)1L;

    public static int cgltf_alpha_mode_mask() {
        return cgltf_alpha_mode_mask;
    }
    private static final int cgltf_alpha_mode_blend = (int)2L;

    public static int cgltf_alpha_mode_blend() {
        return cgltf_alpha_mode_blend;
    }
    private static final int cgltf_alpha_mode_max_enum = (int)3L;

    public static int cgltf_alpha_mode_max_enum() {
        return cgltf_alpha_mode_max_enum;
    }
    private static final int cgltf_animation_path_type_invalid = (int)0L;

    public static int cgltf_animation_path_type_invalid() {
        return cgltf_animation_path_type_invalid;
    }
    private static final int cgltf_animation_path_type_translation = (int)1L;

    public static int cgltf_animation_path_type_translation() {
        return cgltf_animation_path_type_translation;
    }
    private static final int cgltf_animation_path_type_rotation = (int)2L;

    public static int cgltf_animation_path_type_rotation() {
        return cgltf_animation_path_type_rotation;
    }
    private static final int cgltf_animation_path_type_scale = (int)3L;

    public static int cgltf_animation_path_type_scale() {
        return cgltf_animation_path_type_scale;
    }
    private static final int cgltf_animation_path_type_weights = (int)4L;

    public static int cgltf_animation_path_type_weights() {
        return cgltf_animation_path_type_weights;
    }
    private static final int cgltf_animation_path_type_max_enum = (int)5L;

    public static int cgltf_animation_path_type_max_enum() {
        return cgltf_animation_path_type_max_enum;
    }
    private static final int cgltf_interpolation_type_linear = (int)0L;

    public static int cgltf_interpolation_type_linear() {
        return cgltf_interpolation_type_linear;
    }
    private static final int cgltf_interpolation_type_step = (int)1L;

    public static int cgltf_interpolation_type_step() {
        return cgltf_interpolation_type_step;
    }
    private static final int cgltf_interpolation_type_cubic_spline = (int)2L;

    public static int cgltf_interpolation_type_cubic_spline() {
        return cgltf_interpolation_type_cubic_spline;
    }
    private static final int cgltf_interpolation_type_max_enum = (int)3L;

    public static int cgltf_interpolation_type_max_enum() {
        return cgltf_interpolation_type_max_enum;
    }
    private static final int cgltf_camera_type_invalid = (int)0L;

    public static int cgltf_camera_type_invalid() {
        return cgltf_camera_type_invalid;
    }
    private static final int cgltf_camera_type_perspective = (int)1L;

    public static int cgltf_camera_type_perspective() {
        return cgltf_camera_type_perspective;
    }
    private static final int cgltf_camera_type_orthographic = (int)2L;

    public static int cgltf_camera_type_orthographic() {
        return cgltf_camera_type_orthographic;
    }
    private static final int cgltf_camera_type_max_enum = (int)3L;

    public static int cgltf_camera_type_max_enum() {
        return cgltf_camera_type_max_enum;
    }
    private static final int cgltf_light_type_invalid = (int)0L;

    public static int cgltf_light_type_invalid() {
        return cgltf_light_type_invalid;
    }
    private static final int cgltf_light_type_directional = (int)1L;

    public static int cgltf_light_type_directional() {
        return cgltf_light_type_directional;
    }
    private static final int cgltf_light_type_point = (int)2L;

    public static int cgltf_light_type_point() {
        return cgltf_light_type_point;
    }
    private static final int cgltf_light_type_spot = (int)3L;

    public static int cgltf_light_type_spot() {
        return cgltf_light_type_spot;
    }
    private static final int cgltf_light_type_max_enum = (int)4L;

    public static int cgltf_light_type_max_enum() {
        return cgltf_light_type_max_enum;
    }
    private static final int cgltf_data_free_method_none = (int)0L;

    public static int cgltf_data_free_method_none() {
        return cgltf_data_free_method_none;
    }
    private static final int cgltf_data_free_method_file_release = (int)1L;

    public static int cgltf_data_free_method_file_release() {
        return cgltf_data_free_method_file_release;
    }
    private static final int cgltf_data_free_method_memory_free = (int)2L;

    public static int cgltf_data_free_method_memory_free() {
        return cgltf_data_free_method_memory_free;
    }
    private static final int cgltf_data_free_method_max_enum = (int)3L;

    public static int cgltf_data_free_method_max_enum() {
        return cgltf_data_free_method_max_enum;
    }
    private static final int cgltf_meshopt_compression_mode_invalid = (int)0L;

    public static int cgltf_meshopt_compression_mode_invalid() {
        return cgltf_meshopt_compression_mode_invalid;
    }
    private static final int cgltf_meshopt_compression_mode_attributes = (int)1L;

    public static int cgltf_meshopt_compression_mode_attributes() {
        return cgltf_meshopt_compression_mode_attributes;
    }
    private static final int cgltf_meshopt_compression_mode_triangles = (int)2L;

    public static int cgltf_meshopt_compression_mode_triangles() {
        return cgltf_meshopt_compression_mode_triangles;
    }
    private static final int cgltf_meshopt_compression_mode_indices = (int)3L;

    public static int cgltf_meshopt_compression_mode_indices() {
        return cgltf_meshopt_compression_mode_indices;
    }
    private static final int cgltf_meshopt_compression_mode_max_enum = (int)4L;

    public static int cgltf_meshopt_compression_mode_max_enum() {
        return cgltf_meshopt_compression_mode_max_enum;
    }
    private static final int cgltf_meshopt_compression_filter_none = (int)0L;

    public static int cgltf_meshopt_compression_filter_none() {
        return cgltf_meshopt_compression_filter_none;
    }
    private static final int cgltf_meshopt_compression_filter_octahedral = (int)1L;

    public static int cgltf_meshopt_compression_filter_octahedral() {
        return cgltf_meshopt_compression_filter_octahedral;
    }
    private static final int cgltf_meshopt_compression_filter_quaternion = (int)2L;

    public static int cgltf_meshopt_compression_filter_quaternion() {
        return cgltf_meshopt_compression_filter_quaternion;
    }
    private static final int cgltf_meshopt_compression_filter_exponential = (int)3L;

    public static int cgltf_meshopt_compression_filter_exponential() {
        return cgltf_meshopt_compression_filter_exponential;
    }
    private static final int cgltf_meshopt_compression_filter_color = (int)4L;

    public static int cgltf_meshopt_compression_filter_color() {
        return cgltf_meshopt_compression_filter_color;
    }
    private static final int cgltf_meshopt_compression_filter_max_enum = (int)5L;

    public static int cgltf_meshopt_compression_filter_max_enum() {
        return cgltf_meshopt_compression_filter_max_enum;
    }
    private static final int cgltf_filter_type_undefined = (int)0L;

    public static int cgltf_filter_type_undefined() {
        return cgltf_filter_type_undefined;
    }
    private static final int cgltf_filter_type_nearest = (int)9728L;

    public static int cgltf_filter_type_nearest() {
        return cgltf_filter_type_nearest;
    }
    private static final int cgltf_filter_type_linear = (int)9729L;

    public static int cgltf_filter_type_linear() {
        return cgltf_filter_type_linear;
    }
    private static final int cgltf_filter_type_nearest_mipmap_nearest = (int)9984L;

    public static int cgltf_filter_type_nearest_mipmap_nearest() {
        return cgltf_filter_type_nearest_mipmap_nearest;
    }
    private static final int cgltf_filter_type_linear_mipmap_nearest = (int)9985L;

    public static int cgltf_filter_type_linear_mipmap_nearest() {
        return cgltf_filter_type_linear_mipmap_nearest;
    }
    private static final int cgltf_filter_type_nearest_mipmap_linear = (int)9986L;

    public static int cgltf_filter_type_nearest_mipmap_linear() {
        return cgltf_filter_type_nearest_mipmap_linear;
    }
    private static final int cgltf_filter_type_linear_mipmap_linear = (int)9987L;

    public static int cgltf_filter_type_linear_mipmap_linear() {
        return cgltf_filter_type_linear_mipmap_linear;
    }
    private static final int cgltf_wrap_mode_clamp_to_edge = (int)33071L;

    public static int cgltf_wrap_mode_clamp_to_edge() {
        return cgltf_wrap_mode_clamp_to_edge;
    }
    private static final int cgltf_wrap_mode_mirrored_repeat = (int)33648L;

    public static int cgltf_wrap_mode_mirrored_repeat() {
        return cgltf_wrap_mode_mirrored_repeat;
    }
    private static final int cgltf_wrap_mode_repeat = (int)10497L;

    public static int cgltf_wrap_mode_repeat() {
        return cgltf_wrap_mode_repeat;
    }

    private static class cgltf_parse {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_INT,
            Cgltf.C_POINTER,
            Cgltf.C_POINTER,
            Cgltf.C_SIZE_T,
            Cgltf.C_POINTER
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_parse");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_parse$descriptor() {
        return cgltf_parse.DESC;
    }

    public static MethodHandle cgltf_parse$handle() {
        return cgltf_parse.HANDLE;
    }

    public static MemorySegment cgltf_parse$address() {
        return cgltf_parse.ADDR;
    }

    public static int cgltf_parse(MemorySegment options, MemorySegment data, long size, MemorySegment out_data) {
        var mh$ = cgltf_parse.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_parse", options, data, size, out_data);
            }
            return (int)mh$.invokeExact(options, data, size, out_data);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_parse_file {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_INT,
            Cgltf.C_POINTER,
            Cgltf.C_POINTER,
            Cgltf.C_POINTER
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_parse_file");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_parse_file$descriptor() {
        return cgltf_parse_file.DESC;
    }

    public static MethodHandle cgltf_parse_file$handle() {
        return cgltf_parse_file.HANDLE;
    }

    public static MemorySegment cgltf_parse_file$address() {
        return cgltf_parse_file.ADDR;
    }

    public static int cgltf_parse_file(MemorySegment options, MemorySegment path, MemorySegment out_data) {
        var mh$ = cgltf_parse_file.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_parse_file", options, path, out_data);
            }
            return (int)mh$.invokeExact(options, path, out_data);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_load_buffers {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_INT,
            Cgltf.C_POINTER,
            Cgltf.C_POINTER,
            Cgltf.C_POINTER
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_load_buffers");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_load_buffers$descriptor() {
        return cgltf_load_buffers.DESC;
    }

    public static MethodHandle cgltf_load_buffers$handle() {
        return cgltf_load_buffers.HANDLE;
    }

    public static MemorySegment cgltf_load_buffers$address() {
        return cgltf_load_buffers.ADDR;
    }

    public static int cgltf_load_buffers(MemorySegment options, MemorySegment data, MemorySegment gltf_path) {
        var mh$ = cgltf_load_buffers.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_load_buffers", options, data, gltf_path);
            }
            return (int)mh$.invokeExact(options, data, gltf_path);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_load_buffer_base64 {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_INT,
            Cgltf.C_POINTER,
            Cgltf.C_SIZE_T,
            Cgltf.C_POINTER,
            Cgltf.C_POINTER
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_load_buffer_base64");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_load_buffer_base64$descriptor() {
        return cgltf_load_buffer_base64.DESC;
    }

    public static MethodHandle cgltf_load_buffer_base64$handle() {
        return cgltf_load_buffer_base64.HANDLE;
    }

    public static MemorySegment cgltf_load_buffer_base64$address() {
        return cgltf_load_buffer_base64.ADDR;
    }

    public static int cgltf_load_buffer_base64(MemorySegment options, long size, MemorySegment base64, MemorySegment out_data) {
        var mh$ = cgltf_load_buffer_base64.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_load_buffer_base64", options, size, base64, out_data);
            }
            return (int)mh$.invokeExact(options, size, base64, out_data);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_decode_string {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_SIZE_T,
            Cgltf.C_POINTER
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_decode_string");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_decode_string$descriptor() {
        return cgltf_decode_string.DESC;
    }

    public static MethodHandle cgltf_decode_string$handle() {
        return cgltf_decode_string.HANDLE;
    }

    public static MemorySegment cgltf_decode_string$address() {
        return cgltf_decode_string.ADDR;
    }

    public static long cgltf_decode_string(MemorySegment string) {
        var mh$ = cgltf_decode_string.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_decode_string", string);
            }
            return (long)mh$.invokeExact(string);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_decode_uri {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_SIZE_T,
            Cgltf.C_POINTER
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_decode_uri");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_decode_uri$descriptor() {
        return cgltf_decode_uri.DESC;
    }

    public static MethodHandle cgltf_decode_uri$handle() {
        return cgltf_decode_uri.HANDLE;
    }

    public static MemorySegment cgltf_decode_uri$address() {
        return cgltf_decode_uri.ADDR;
    }

    public static long cgltf_decode_uri(MemorySegment uri) {
        var mh$ = cgltf_decode_uri.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_decode_uri", uri);
            }
            return (long)mh$.invokeExact(uri);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_validate {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_INT,
            Cgltf.C_POINTER
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_validate");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_validate$descriptor() {
        return cgltf_validate.DESC;
    }

    public static MethodHandle cgltf_validate$handle() {
        return cgltf_validate.HANDLE;
    }

    public static MemorySegment cgltf_validate$address() {
        return cgltf_validate.ADDR;
    }

    public static int cgltf_validate(MemorySegment data) {
        var mh$ = cgltf_validate.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_validate", data);
            }
            return (int)mh$.invokeExact(data);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_free {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
            Cgltf.C_POINTER
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_free");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_free$descriptor() {
        return cgltf_free.DESC;
    }

    public static MethodHandle cgltf_free$handle() {
        return cgltf_free.HANDLE;
    }

    public static MemorySegment cgltf_free$address() {
        return cgltf_free.ADDR;
    }

    public static void cgltf_free(MemorySegment data) {
        var mh$ = cgltf_free.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_free", data);
            }
            mh$.invokeExact(data);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_node_transform_local {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
            Cgltf.C_POINTER,
            Cgltf.C_POINTER
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_node_transform_local");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_node_transform_local$descriptor() {
        return cgltf_node_transform_local.DESC;
    }

    public static MethodHandle cgltf_node_transform_local$handle() {
        return cgltf_node_transform_local.HANDLE;
    }

    public static MemorySegment cgltf_node_transform_local$address() {
        return cgltf_node_transform_local.ADDR;
    }

    public static void cgltf_node_transform_local(MemorySegment node, MemorySegment out_matrix) {
        var mh$ = cgltf_node_transform_local.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_node_transform_local", node, out_matrix);
            }
            mh$.invokeExact(node, out_matrix);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_node_transform_world {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
            Cgltf.C_POINTER,
            Cgltf.C_POINTER
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_node_transform_world");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_node_transform_world$descriptor() {
        return cgltf_node_transform_world.DESC;
    }

    public static MethodHandle cgltf_node_transform_world$handle() {
        return cgltf_node_transform_world.HANDLE;
    }

    public static MemorySegment cgltf_node_transform_world$address() {
        return cgltf_node_transform_world.ADDR;
    }

    public static void cgltf_node_transform_world(MemorySegment node, MemorySegment out_matrix) {
        var mh$ = cgltf_node_transform_world.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_node_transform_world", node, out_matrix);
            }
            mh$.invokeExact(node, out_matrix);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_buffer_view_data {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_POINTER,
            Cgltf.C_POINTER
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_buffer_view_data");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_buffer_view_data$descriptor() {
        return cgltf_buffer_view_data.DESC;
    }

    public static MethodHandle cgltf_buffer_view_data$handle() {
        return cgltf_buffer_view_data.HANDLE;
    }

    public static MemorySegment cgltf_buffer_view_data$address() {
        return cgltf_buffer_view_data.ADDR;
    }

    public static MemorySegment cgltf_buffer_view_data(MemorySegment view) {
        var mh$ = cgltf_buffer_view_data.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_buffer_view_data", view);
            }
            return (MemorySegment)mh$.invokeExact(view);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_find_accessor {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_POINTER,
            Cgltf.C_POINTER,
            Cgltf.C_INT,
            Cgltf.C_INT
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_find_accessor");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_find_accessor$descriptor() {
        return cgltf_find_accessor.DESC;
    }

    public static MethodHandle cgltf_find_accessor$handle() {
        return cgltf_find_accessor.HANDLE;
    }

    public static MemorySegment cgltf_find_accessor$address() {
        return cgltf_find_accessor.ADDR;
    }

    public static MemorySegment cgltf_find_accessor(MemorySegment prim, int type, int index) {
        var mh$ = cgltf_find_accessor.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_find_accessor", prim, type, index);
            }
            return (MemorySegment)mh$.invokeExact(prim, type, index);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_accessor_read_float {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_INT,
            Cgltf.C_POINTER,
            Cgltf.C_SIZE_T,
            Cgltf.C_POINTER,
            Cgltf.C_SIZE_T
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_accessor_read_float");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_accessor_read_float$descriptor() {
        return cgltf_accessor_read_float.DESC;
    }

    public static MethodHandle cgltf_accessor_read_float$handle() {
        return cgltf_accessor_read_float.HANDLE;
    }

    public static MemorySegment cgltf_accessor_read_float$address() {
        return cgltf_accessor_read_float.ADDR;
    }

    public static int cgltf_accessor_read_float(MemorySegment accessor, long index, MemorySegment out, long element_size) {
        var mh$ = cgltf_accessor_read_float.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_accessor_read_float", accessor, index, out, element_size);
            }
            return (int)mh$.invokeExact(accessor, index, out, element_size);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_accessor_read_uint {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_INT,
            Cgltf.C_POINTER,
            Cgltf.C_SIZE_T,
            Cgltf.C_POINTER,
            Cgltf.C_SIZE_T
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_accessor_read_uint");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_accessor_read_uint$descriptor() {
        return cgltf_accessor_read_uint.DESC;
    }

    public static MethodHandle cgltf_accessor_read_uint$handle() {
        return cgltf_accessor_read_uint.HANDLE;
    }

    public static MemorySegment cgltf_accessor_read_uint$address() {
        return cgltf_accessor_read_uint.ADDR;
    }

    public static int cgltf_accessor_read_uint(MemorySegment accessor, long index, MemorySegment out, long element_size) {
        var mh$ = cgltf_accessor_read_uint.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_accessor_read_uint", accessor, index, out, element_size);
            }
            return (int)mh$.invokeExact(accessor, index, out, element_size);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_accessor_read_index {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_SIZE_T,
            Cgltf.C_POINTER,
            Cgltf.C_SIZE_T
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_accessor_read_index");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_accessor_read_index$descriptor() {
        return cgltf_accessor_read_index.DESC;
    }

    public static MethodHandle cgltf_accessor_read_index$handle() {
        return cgltf_accessor_read_index.HANDLE;
    }

    public static MemorySegment cgltf_accessor_read_index$address() {
        return cgltf_accessor_read_index.ADDR;
    }

    public static long cgltf_accessor_read_index(MemorySegment accessor, long index) {
        var mh$ = cgltf_accessor_read_index.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_accessor_read_index", accessor, index);
            }
            return (long)mh$.invokeExact(accessor, index);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_num_components {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_SIZE_T,
            Cgltf.C_INT
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_num_components");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_num_components$descriptor() {
        return cgltf_num_components.DESC;
    }

    public static MethodHandle cgltf_num_components$handle() {
        return cgltf_num_components.HANDLE;
    }

    public static MemorySegment cgltf_num_components$address() {
        return cgltf_num_components.ADDR;
    }

    public static long cgltf_num_components(int type) {
        var mh$ = cgltf_num_components.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_num_components", type);
            }
            return (long)mh$.invokeExact(type);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_component_size {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_SIZE_T,
            Cgltf.C_INT
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_component_size");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_component_size$descriptor() {
        return cgltf_component_size.DESC;
    }

    public static MethodHandle cgltf_component_size$handle() {
        return cgltf_component_size.HANDLE;
    }

    public static MemorySegment cgltf_component_size$address() {
        return cgltf_component_size.ADDR;
    }

    public static long cgltf_component_size(int component_type) {
        var mh$ = cgltf_component_size.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_component_size", component_type);
            }
            return (long)mh$.invokeExact(component_type);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_calc_size {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_SIZE_T,
            Cgltf.C_INT,
            Cgltf.C_INT
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_calc_size");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_calc_size$descriptor() {
        return cgltf_calc_size.DESC;
    }

    public static MethodHandle cgltf_calc_size$handle() {
        return cgltf_calc_size.HANDLE;
    }

    public static MemorySegment cgltf_calc_size$address() {
        return cgltf_calc_size.ADDR;
    }

    public static long cgltf_calc_size(int type, int component_type) {
        var mh$ = cgltf_calc_size.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_calc_size", type, component_type);
            }
            return (long)mh$.invokeExact(type, component_type);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_accessor_unpack_floats {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_SIZE_T,
            Cgltf.C_POINTER,
            Cgltf.C_POINTER,
            Cgltf.C_SIZE_T
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_accessor_unpack_floats");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_accessor_unpack_floats$descriptor() {
        return cgltf_accessor_unpack_floats.DESC;
    }

    public static MethodHandle cgltf_accessor_unpack_floats$handle() {
        return cgltf_accessor_unpack_floats.HANDLE;
    }

    public static MemorySegment cgltf_accessor_unpack_floats$address() {
        return cgltf_accessor_unpack_floats.ADDR;
    }

    public static long cgltf_accessor_unpack_floats(MemorySegment accessor, MemorySegment out, long float_count) {
        var mh$ = cgltf_accessor_unpack_floats.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_accessor_unpack_floats", accessor, out, float_count);
            }
            return (long)mh$.invokeExact(accessor, out, float_count);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_accessor_unpack_indices {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_SIZE_T,
            Cgltf.C_POINTER,
            Cgltf.C_POINTER,
            Cgltf.C_SIZE_T,
            Cgltf.C_SIZE_T
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_accessor_unpack_indices");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_accessor_unpack_indices$descriptor() {
        return cgltf_accessor_unpack_indices.DESC;
    }

    public static MethodHandle cgltf_accessor_unpack_indices$handle() {
        return cgltf_accessor_unpack_indices.HANDLE;
    }

    public static MemorySegment cgltf_accessor_unpack_indices$address() {
        return cgltf_accessor_unpack_indices.ADDR;
    }

    public static long cgltf_accessor_unpack_indices(MemorySegment accessor, MemorySegment out, long out_component_size, long index_count) {
        var mh$ = cgltf_accessor_unpack_indices.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_accessor_unpack_indices", accessor, out, out_component_size, index_count);
            }
            return (long)mh$.invokeExact(accessor, out, out_component_size, index_count);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_copy_extras_json {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_INT,
            Cgltf.C_POINTER,
            Cgltf.C_POINTER,
            Cgltf.C_POINTER,
            Cgltf.C_POINTER
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_copy_extras_json");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_copy_extras_json$descriptor() {
        return cgltf_copy_extras_json.DESC;
    }

    public static MethodHandle cgltf_copy_extras_json$handle() {
        return cgltf_copy_extras_json.HANDLE;
    }

    public static MemorySegment cgltf_copy_extras_json$address() {
        return cgltf_copy_extras_json.ADDR;
    }

    public static int cgltf_copy_extras_json(MemorySegment data, MemorySegment extras, MemorySegment dest, MemorySegment dest_size) {
        var mh$ = cgltf_copy_extras_json.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_copy_extras_json", data, extras, dest, dest_size);
            }
            return (int)mh$.invokeExact(data, extras, dest, dest_size);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_mesh_index {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_SIZE_T,
            Cgltf.C_POINTER,
            Cgltf.C_POINTER
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_mesh_index");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_mesh_index$descriptor() {
        return cgltf_mesh_index.DESC;
    }

    public static MethodHandle cgltf_mesh_index$handle() {
        return cgltf_mesh_index.HANDLE;
    }

    public static MemorySegment cgltf_mesh_index$address() {
        return cgltf_mesh_index.ADDR;
    }

    public static long cgltf_mesh_index(MemorySegment data, MemorySegment object) {
        var mh$ = cgltf_mesh_index.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_mesh_index", data, object);
            }
            return (long)mh$.invokeExact(data, object);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_material_index {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_SIZE_T,
            Cgltf.C_POINTER,
            Cgltf.C_POINTER
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_material_index");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_material_index$descriptor() {
        return cgltf_material_index.DESC;
    }

    public static MethodHandle cgltf_material_index$handle() {
        return cgltf_material_index.HANDLE;
    }

    public static MemorySegment cgltf_material_index$address() {
        return cgltf_material_index.ADDR;
    }

    public static long cgltf_material_index(MemorySegment data, MemorySegment object) {
        var mh$ = cgltf_material_index.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_material_index", data, object);
            }
            return (long)mh$.invokeExact(data, object);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_accessor_index {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_SIZE_T,
            Cgltf.C_POINTER,
            Cgltf.C_POINTER
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_accessor_index");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_accessor_index$descriptor() {
        return cgltf_accessor_index.DESC;
    }

    public static MethodHandle cgltf_accessor_index$handle() {
        return cgltf_accessor_index.HANDLE;
    }

    public static MemorySegment cgltf_accessor_index$address() {
        return cgltf_accessor_index.ADDR;
    }

    public static long cgltf_accessor_index(MemorySegment data, MemorySegment object) {
        var mh$ = cgltf_accessor_index.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_accessor_index", data, object);
            }
            return (long)mh$.invokeExact(data, object);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_buffer_view_index {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_SIZE_T,
            Cgltf.C_POINTER,
            Cgltf.C_POINTER
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_buffer_view_index");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_buffer_view_index$descriptor() {
        return cgltf_buffer_view_index.DESC;
    }

    public static MethodHandle cgltf_buffer_view_index$handle() {
        return cgltf_buffer_view_index.HANDLE;
    }

    public static MemorySegment cgltf_buffer_view_index$address() {
        return cgltf_buffer_view_index.ADDR;
    }

    public static long cgltf_buffer_view_index(MemorySegment data, MemorySegment object) {
        var mh$ = cgltf_buffer_view_index.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_buffer_view_index", data, object);
            }
            return (long)mh$.invokeExact(data, object);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_buffer_index {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_SIZE_T,
            Cgltf.C_POINTER,
            Cgltf.C_POINTER
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_buffer_index");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_buffer_index$descriptor() {
        return cgltf_buffer_index.DESC;
    }

    public static MethodHandle cgltf_buffer_index$handle() {
        return cgltf_buffer_index.HANDLE;
    }

    public static MemorySegment cgltf_buffer_index$address() {
        return cgltf_buffer_index.ADDR;
    }

    public static long cgltf_buffer_index(MemorySegment data, MemorySegment object) {
        var mh$ = cgltf_buffer_index.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_buffer_index", data, object);
            }
            return (long)mh$.invokeExact(data, object);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_image_index {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_SIZE_T,
            Cgltf.C_POINTER,
            Cgltf.C_POINTER
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_image_index");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_image_index$descriptor() {
        return cgltf_image_index.DESC;
    }

    public static MethodHandle cgltf_image_index$handle() {
        return cgltf_image_index.HANDLE;
    }

    public static MemorySegment cgltf_image_index$address() {
        return cgltf_image_index.ADDR;
    }

    public static long cgltf_image_index(MemorySegment data, MemorySegment object) {
        var mh$ = cgltf_image_index.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_image_index", data, object);
            }
            return (long)mh$.invokeExact(data, object);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_texture_index {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_SIZE_T,
            Cgltf.C_POINTER,
            Cgltf.C_POINTER
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_texture_index");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_texture_index$descriptor() {
        return cgltf_texture_index.DESC;
    }

    public static MethodHandle cgltf_texture_index$handle() {
        return cgltf_texture_index.HANDLE;
    }

    public static MemorySegment cgltf_texture_index$address() {
        return cgltf_texture_index.ADDR;
    }

    public static long cgltf_texture_index(MemorySegment data, MemorySegment object) {
        var mh$ = cgltf_texture_index.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_texture_index", data, object);
            }
            return (long)mh$.invokeExact(data, object);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_sampler_index {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_SIZE_T,
            Cgltf.C_POINTER,
            Cgltf.C_POINTER
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_sampler_index");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_sampler_index$descriptor() {
        return cgltf_sampler_index.DESC;
    }

    public static MethodHandle cgltf_sampler_index$handle() {
        return cgltf_sampler_index.HANDLE;
    }

    public static MemorySegment cgltf_sampler_index$address() {
        return cgltf_sampler_index.ADDR;
    }

    public static long cgltf_sampler_index(MemorySegment data, MemorySegment object) {
        var mh$ = cgltf_sampler_index.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_sampler_index", data, object);
            }
            return (long)mh$.invokeExact(data, object);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_skin_index {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_SIZE_T,
            Cgltf.C_POINTER,
            Cgltf.C_POINTER
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_skin_index");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_skin_index$descriptor() {
        return cgltf_skin_index.DESC;
    }

    public static MethodHandle cgltf_skin_index$handle() {
        return cgltf_skin_index.HANDLE;
    }

    public static MemorySegment cgltf_skin_index$address() {
        return cgltf_skin_index.ADDR;
    }

    public static long cgltf_skin_index(MemorySegment data, MemorySegment object) {
        var mh$ = cgltf_skin_index.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_skin_index", data, object);
            }
            return (long)mh$.invokeExact(data, object);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_camera_index {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_SIZE_T,
            Cgltf.C_POINTER,
            Cgltf.C_POINTER
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_camera_index");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_camera_index$descriptor() {
        return cgltf_camera_index.DESC;
    }

    public static MethodHandle cgltf_camera_index$handle() {
        return cgltf_camera_index.HANDLE;
    }

    public static MemorySegment cgltf_camera_index$address() {
        return cgltf_camera_index.ADDR;
    }

    public static long cgltf_camera_index(MemorySegment data, MemorySegment object) {
        var mh$ = cgltf_camera_index.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_camera_index", data, object);
            }
            return (long)mh$.invokeExact(data, object);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_light_index {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_SIZE_T,
            Cgltf.C_POINTER,
            Cgltf.C_POINTER
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_light_index");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_light_index$descriptor() {
        return cgltf_light_index.DESC;
    }

    public static MethodHandle cgltf_light_index$handle() {
        return cgltf_light_index.HANDLE;
    }

    public static MemorySegment cgltf_light_index$address() {
        return cgltf_light_index.ADDR;
    }

    public static long cgltf_light_index(MemorySegment data, MemorySegment object) {
        var mh$ = cgltf_light_index.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_light_index", data, object);
            }
            return (long)mh$.invokeExact(data, object);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_node_index {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_SIZE_T,
            Cgltf.C_POINTER,
            Cgltf.C_POINTER
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_node_index");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_node_index$descriptor() {
        return cgltf_node_index.DESC;
    }

    public static MethodHandle cgltf_node_index$handle() {
        return cgltf_node_index.HANDLE;
    }

    public static MemorySegment cgltf_node_index$address() {
        return cgltf_node_index.ADDR;
    }

    public static long cgltf_node_index(MemorySegment data, MemorySegment object) {
        var mh$ = cgltf_node_index.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_node_index", data, object);
            }
            return (long)mh$.invokeExact(data, object);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_scene_index {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_SIZE_T,
            Cgltf.C_POINTER,
            Cgltf.C_POINTER
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_scene_index");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_scene_index$descriptor() {
        return cgltf_scene_index.DESC;
    }

    public static MethodHandle cgltf_scene_index$handle() {
        return cgltf_scene_index.HANDLE;
    }

    public static MemorySegment cgltf_scene_index$address() {
        return cgltf_scene_index.ADDR;
    }

    public static long cgltf_scene_index(MemorySegment data, MemorySegment object) {
        var mh$ = cgltf_scene_index.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_scene_index", data, object);
            }
            return (long)mh$.invokeExact(data, object);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_animation_index {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_SIZE_T,
            Cgltf.C_POINTER,
            Cgltf.C_POINTER
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_animation_index");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_animation_index$descriptor() {
        return cgltf_animation_index.DESC;
    }

    public static MethodHandle cgltf_animation_index$handle() {
        return cgltf_animation_index.HANDLE;
    }

    public static MemorySegment cgltf_animation_index$address() {
        return cgltf_animation_index.ADDR;
    }

    public static long cgltf_animation_index(MemorySegment data, MemorySegment object) {
        var mh$ = cgltf_animation_index.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_animation_index", data, object);
            }
            return (long)mh$.invokeExact(data, object);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_animation_sampler_index {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_SIZE_T,
            Cgltf.C_POINTER,
            Cgltf.C_POINTER
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_animation_sampler_index");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_animation_sampler_index$descriptor() {
        return cgltf_animation_sampler_index.DESC;
    }

    public static MethodHandle cgltf_animation_sampler_index$handle() {
        return cgltf_animation_sampler_index.HANDLE;
    }

    public static MemorySegment cgltf_animation_sampler_index$address() {
        return cgltf_animation_sampler_index.ADDR;
    }

    public static long cgltf_animation_sampler_index(MemorySegment animation, MemorySegment object) {
        var mh$ = cgltf_animation_sampler_index.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_animation_sampler_index", animation, object);
            }
            return (long)mh$.invokeExact(animation, object);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class cgltf_animation_channel_index {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_SIZE_T,
            Cgltf.C_POINTER,
            Cgltf.C_POINTER
        );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("cgltf_animation_channel_index");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor cgltf_animation_channel_index$descriptor() {
        return cgltf_animation_channel_index.DESC;
    }

    public static MethodHandle cgltf_animation_channel_index$handle() {
        return cgltf_animation_channel_index.HANDLE;
    }

    public static MemorySegment cgltf_animation_channel_index$address() {
        return cgltf_animation_channel_index.ADDR;
    }

    public static long cgltf_animation_channel_index(MemorySegment animation, MemorySegment object) {
        var mh$ = cgltf_animation_channel_index.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("cgltf_animation_channel_index", animation, object);
            }
            return (long)mh$.invokeExact(animation, object);
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class klab_glb_abi_version {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_INT    );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("klab_glb_abi_version");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor klab_glb_abi_version$descriptor() {
        return klab_glb_abi_version.DESC;
    }

    public static MethodHandle klab_glb_abi_version$handle() {
        return klab_glb_abi_version.HANDLE;
    }

    public static MemorySegment klab_glb_abi_version$address() {
        return klab_glb_abi_version.ADDR;
    }

    public static int klab_glb_abi_version() {
        var mh$ = klab_glb_abi_version.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("klab_glb_abi_version");
            }
            return (int)mh$.invokeExact();
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class klab_cgltf_data_size {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Cgltf.C_SIZE_T    );

        public static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("klab_cgltf_data_size");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    public static FunctionDescriptor klab_cgltf_data_size$descriptor() {
        return klab_cgltf_data_size.DESC;
    }

    public static MethodHandle klab_cgltf_data_size$handle() {
        return klab_cgltf_data_size.HANDLE;
    }

    public static MemorySegment klab_cgltf_data_size$address() {
        return klab_cgltf_data_size.ADDR;
    }

    public static long klab_cgltf_data_size() {
        var mh$ = klab_cgltf_data_size.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("klab_cgltf_data_size");
            }
            return (long)mh$.invokeExact();
        } catch (Error | RuntimeException ex) {
           throw ex;
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }
}

