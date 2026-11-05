package com.varlanv.klab

import com.varlanv.klab.log.Log
import com.varlanv.klab.log.Sink
import com.varlanv.klab.mem.JdkArenaProvider
import com.varlanv.klab.mem.NativeAllocator

fun main() {
    NativeAllocator.Arena(initialSize = 64 * 1024L, arenaProvider = JdkArenaProvider.Confined).use { arena ->
        NativeAllocator.Arena(initialSize = 64 * 1024L, arenaProvider = JdkArenaProvider.Confined).use { frameArena ->
            App.create(
                gpa = arena,
                init = App.Init(
                    mode = RunMode.Debug,
                    log = Log(
                        sink = Sink.stderr,
                        enabled = true,
                    ),
                )
            ).use { app ->
                while (app.frame(frameArena)) {
                    frameArena.deInit()
                }
            }
        }
    }
}
