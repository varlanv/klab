package com.varlanv.klab.renderer

import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import kotlin.math.asin
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt
import kotlin.math.tan

private const val MAX_PITCH = (89.0 * Math.PI / 180.0).toFloat()
private const val TWO_PI = 2.0 * Math.PI

class Camera3D(
    x: Float = 4f,
    y: Float = 3f,
    z: Float = 6f,
    yawRadians: Float = atan2(-4f, 6f),
    pitchRadians: Float = asin(-3f / sqrt(61f)),
    verticalFovDegrees: Float = 60f,
    nearPlane: Float = 0.1f,
    farPlane: Float = 100f,
) {

    private var basisInitialized = false

    var x = x
        private set
    var y = y
        private set
    var z = z
        private set
    var yawRadians = yawRadians
        private set
    var pitchRadians = pitchRadians
        private set
    var verticalFovDegrees = verticalFovDegrees
        private set
    var nearPlane = nearPlane
        private set
    var farPlane = farPlane
        private set
    var focal = 0f
        private set
    var forwardX = 0f
        private set
    var forwardY = 0f
        private set
    var forwardZ = 0f
        private set
    var rightX = 0f
        private set
    val rightY: Float
        get() = 0f
    var rightZ = 0f
        private set
    var upX = 0f
        private set
    var upY = 0f
        private set
    var upZ = 0f
        private set

    init {
        setPosition(x = this.x, y = this.y, z = this.z)
        setProjection(
            verticalFovDegrees = this.verticalFovDegrees,
            nearPlane = this.nearPlane,
            farPlane = this.farPlane,
        )
        setRotation(yawRadians = this.yawRadians, pitchRadians = this.pitchRadians)
    }

    internal fun writeUniforms(destination: MemorySegment, width: Int, height: Int) {
        require(width > 0 && height > 0)
        destination.asSlice(0, 80).fill(0)
        destination.set(ValueLayout.JAVA_FLOAT, 0L, width.toFloat())
        destination.set(ValueLayout.JAVA_FLOAT, 4L, height.toFloat())
        destination.set(ValueLayout.JAVA_FLOAT, 8L, nearPlane)
        destination.set(ValueLayout.JAVA_FLOAT, 12L, farPlane)
        destination.set(ValueLayout.JAVA_FLOAT, 16L, x)
        destination.set(ValueLayout.JAVA_FLOAT, 20L, y)
        destination.set(ValueLayout.JAVA_FLOAT, 24L, z)
        destination.set(ValueLayout.JAVA_FLOAT, 28L, focal)
        destination.set(ValueLayout.JAVA_FLOAT, 32L, rightX)
        destination.set(ValueLayout.JAVA_FLOAT, 36L, rightY)
        destination.set(ValueLayout.JAVA_FLOAT, 40L, rightZ)
        destination.set(ValueLayout.JAVA_FLOAT, 48L, upX)
        destination.set(ValueLayout.JAVA_FLOAT, 52L, upY)
        destination.set(ValueLayout.JAVA_FLOAT, 56L, upZ)
        destination.set(ValueLayout.JAVA_FLOAT, 64L, forwardX)
        destination.set(ValueLayout.JAVA_FLOAT, 68L, forwardY)
        destination.set(ValueLayout.JAVA_FLOAT, 72L, forwardZ)
    }

    fun setPosition(x: Float, y: Float, z: Float) {
        require(x.isFinite() && y.isFinite() && z.isFinite())
        this.x = x
        this.y = y
        this.z = z
    }

    fun translate(dx: Float, dy: Float, dz: Float) {
        require(dx.isFinite() && dy.isFinite() && dz.isFinite())
        setPosition(x = x + dx, y = y + dy, z = z + dz)
    }

    fun setProjection(verticalFovDegrees: Float, nearPlane: Float, farPlane: Float) {
        require(verticalFovDegrees.isFinite() && verticalFovDegrees > 0f && verticalFovDegrees < 180f)
        require(nearPlane.isFinite() && farPlane.isFinite() && nearPlane > 0f && farPlane > nearPlane)
        val focal = (1.0 / tan(verticalFovDegrees.toDouble() * Math.PI / 360.0)).toFloat()
        require(focal.isFinite() && focal > 0f)
        this.verticalFovDegrees = verticalFovDegrees
        this.nearPlane = nearPlane
        this.farPlane = farPlane
        this.focal = focal
    }

    fun rotate(yawDelta: Float, pitchDelta: Float) {
        require(yawDelta.isFinite() && pitchDelta.isFinite())
        if (yawDelta == 0f && pitchDelta == 0f) return
        setRotation(yawRadians = yawRadians + yawDelta, pitchRadians = pitchRadians + pitchDelta)
    }

    fun setRotation(yawRadians: Float, pitchRadians: Float) {
        require(yawRadians.isFinite() && pitchRadians.isFinite())
        val wrapped = (yawRadians.toDouble() + Math.PI) % TWO_PI
        val yaw = ((if (wrapped < 0.0) wrapped + TWO_PI else wrapped) - Math.PI).toFloat()
        val pitch = pitchRadians.coerceIn(minimumValue = -MAX_PITCH, maximumValue = MAX_PITCH)
        if (basisInitialized && yaw == this.yawRadians && pitch == this.pitchRadians) return
        this.yawRadians = yaw
        this.pitchRadians = pitch
        val sinYaw = sin(this.yawRadians)
        val cosYaw = cos(this.yawRadians)
        val sinPitch = sin(this.pitchRadians)
        val cosPitch = cos(this.pitchRadians)
        forwardX = sinYaw * cosPitch
        forwardY = sinPitch
        forwardZ = -cosYaw * cosPitch
        rightX = cosYaw
        rightZ = sinYaw
        upX = -sinYaw * sinPitch
        upY = cosPitch
        upZ = cosYaw * sinPitch
        basisInitialized = true
    }
}
