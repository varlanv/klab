package com.varlanv.klab.renderer

import com.varlanv.klab.sdl3.Sdl3Input
import com.varlanv.klab.sdl3.Sdl3Scancode
import kotlin.math.sqrt

class FlyCameraController(
    private val camera: Camera3D,
    private val moveSpeed: Float = 4f,
    private val mouseSensitivity: Float = 0.0025f,
) {
    init {
        require(moveSpeed.isFinite() && moveSpeed >= 0f)
        require(mouseSensitivity.isFinite() && mouseSensitivity >= 0f)
    }

    fun update(input: Sdl3Input, deltaSeconds: Float) {
        require(deltaSeconds.isFinite() && deltaSeconds >= 0f)
        val mouseX = input.mouseDeltaX
        val mouseY = input.mouseDeltaY
        require(mouseX.isFinite() && mouseY.isFinite())
        camera.rotate(yawDelta = mouseX * mouseSensitivity, pitchDelta = -mouseY * mouseSensitivity)
        val forward = (if (input.isKeyDown(Sdl3Scancode.W)) {
            1f
        } else {
            0f
        }) - (if (input.isKeyDown(Sdl3Scancode.S)) {
            1f
        } else {
            0f
        })
        val right = (if (input.isKeyDown(Sdl3Scancode.D)) {
            1f
        } else {
            0f
        }) - (if (input.isKeyDown(Sdl3Scancode.A)) {
            1f
        } else {
            0f
        })
        val magnitudeSquared = forward * forward + right * right
        if (magnitudeSquared == 0f || deltaSeconds == 0f || moveSpeed == 0f) {
            return
        }
        val distance = moveSpeed * minOf(deltaSeconds, 0.1f) / sqrt(magnitudeSquared)
        camera.translate(
            dx = (forward * camera.forwardX + right * camera.rightX) * distance,
            dy = (forward * camera.forwardY + right * camera.rightY) * distance,
            dz = (forward * camera.forwardZ + right * camera.rightZ) * distance,
        )
    }
}
