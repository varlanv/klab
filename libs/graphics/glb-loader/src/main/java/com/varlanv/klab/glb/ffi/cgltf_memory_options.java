package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_memory_options {

    cgltf_memory_options() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Cgltf.C_POINTER.withName("alloc_func"),
        Cgltf.C_POINTER.withName("free_func"),
        Cgltf.C_POINTER.withName("user_data")
    ).withName("cgltf_memory_options");

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public final static class alloc_func {

        private alloc_func() {
        }

        public interface Function {
            MemorySegment apply(MemorySegment _x0, long _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            Cgltf.C_POINTER,
            Cgltf.C_POINTER,
            Cgltf.C_SIZE_T
        );

        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = Cgltf.upcallHandle(alloc_func.Function.class, "apply", $DESC);

        public static MemorySegment allocate(alloc_func.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        public static MemorySegment invoke(MemorySegment funcPtr, MemorySegment _x0, long _x1) {
            try {
                return (MemorySegment) DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Error | RuntimeException ex) {
                throw ex;
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout alloc_func$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("alloc_func"));

    public static final AddressLayout alloc_func$layout() {
        return alloc_func$LAYOUT;
    }

    private static final long alloc_func$OFFSET = $LAYOUT.byteOffset(groupElement("alloc_func"));

    public static final long alloc_func$offset() {
        return alloc_func$OFFSET;
    }

    public static MemorySegment alloc_func(MemorySegment struct) {
        return struct.get(alloc_func$LAYOUT, alloc_func$OFFSET);
    }

    public static void alloc_func(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(alloc_func$LAYOUT, alloc_func$OFFSET, fieldValue);
    }

    public final static class free_func {

        private free_func() {
        }

        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            Cgltf.C_POINTER,
            Cgltf.C_POINTER
        );

        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = Cgltf.upcallHandle(free_func.Function.class, "apply", $DESC);

        public static MemorySegment allocate(free_func.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        public static void invoke(MemorySegment funcPtr, MemorySegment _x0, MemorySegment _x1) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Error | RuntimeException ex) {
                throw ex;
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout free_func$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("free_func"));

    public static final AddressLayout free_func$layout() {
        return free_func$LAYOUT;
    }

    private static final long free_func$OFFSET = $LAYOUT.byteOffset(groupElement("free_func"));

    public static final long free_func$offset() {
        return free_func$OFFSET;
    }

    public static MemorySegment free_func(MemorySegment struct) {
        return struct.get(free_func$LAYOUT, free_func$OFFSET);
    }

    public static void free_func(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(free_func$LAYOUT, free_func$OFFSET, fieldValue);
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

