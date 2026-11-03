package com.varlanv.klab.collections

private val emptyArray = emptyArray<Any>()

@Suppress("UNCHECKED_CAST")
fun <T> stableEmptyArray(): Array<T> = emptyArray as Array<T>
