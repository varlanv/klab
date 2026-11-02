package com.varlanv.klab.graphics.vulkan

import com.varlanv.klab.testing.BaseSpec
import java.lang.foreign.Arena

class VkBindingsSpec : BaseSpec({

    should("load bindings without errors") {
        Arena.ofConfined().use { arena ->
            VkBindings.load(arena)
        }
    }

    should("load bindings ") {
        Arena.ofConfined().use { arena ->
        }
    }
})
