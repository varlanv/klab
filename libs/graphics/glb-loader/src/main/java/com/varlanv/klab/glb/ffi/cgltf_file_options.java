package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_file_options {

    cgltf_file_options() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Cgltf.C_POINTER.withName("read"),
        Cgltf.C_POINTER.withName("release"),
        Cgltf.C_POINTER.withName("user_data")
    ).withName("cgltf_file_options");

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public final static class read {

        private read() {
        }

        public interface Function {
            int apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, MemorySegment _x3, MemorySegment _x4);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            Cgltf.C_INT,
            Cgltf.C_POINTER,
            Cgltf.C_POINTER,
            Cgltf.C_POINTER,
            Cgltf.C_POINTER,
            Cgltf.C_POINTER
        );

        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = Cgltf.upcallHandle(read.Function.class, "apply", $DESC);

        public static MemorySegment allocate(read.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        public static int invoke(MemorySegment funcPtr, MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, MemorySegment _x3, MemorySegment _x4) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3, _x4);
            } catch (Error | RuntimeException ex) {
                throw ex;
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout read$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("read"));

    public static final AddressLayout read$layout() {
        return read$LAYOUT;
    }

    private static final long read$OFFSET = $LAYOUT.byteOffset(groupElement("read"));

    public static final long read$offset() {
        return read$OFFSET;
    }

    public static MemorySegment read(MemorySegment struct) {
        return struct.get(read$LAYOUT, read$OFFSET);
    }

    public static void read(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(read$LAYOUT, read$OFFSET, fieldValue);
    }

    public final static class release {

        private release() {
        }

        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, long _x3);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            Cgltf.C_POINTER,
            Cgltf.C_POINTER,
            Cgltf.C_POINTER,
            Cgltf.C_SIZE_T
        );

        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = Cgltf.upcallHandle(release.Function.class, "apply", $DESC);

        public static MemorySegment allocate(release.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        public static void invoke(MemorySegment funcPtr, MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, long _x3) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3);
            } catch (Error | RuntimeException ex) {
                throw ex;
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout release$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("release"));

    public static final AddressLayout release$layout() {
        return release$LAYOUT;
    }

    private static final long release$OFFSET = $LAYOUT.byteOffset(groupElement("release"));

    public static final long release$offset() {
        return release$OFFSET;
    }

    public static MemorySegment release(MemorySegment struct) {
        return struct.get(release$LAYOUT, release$OFFSET);
    }

    public static void release(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(release$LAYOUT, release$OFFSET, fieldValue);
    }

    private static final AddressLayout user_data$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("user_data"));

    public static final AddressLayout user_data$layout() {
        return user_data$LAYOUT;
    }

    private static final long user_data$OFFSET = $LAYOUT.byteOffset(groupElement("user_data"));

    public static final long user_data$offset() {
        return user_data$OFFSET;
    }

    public static MemorySegment user_data(MemorySegment struct) {
        return struct.get(user_data$LAYOUT, user_data$OFFSET);
    }

    public static void user_data(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(user_data$LAYOUT, user_data$OFFSET, fieldValue);
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

