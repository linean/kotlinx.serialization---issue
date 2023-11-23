package com.serialization.issue

import kotlinx.serialization.Serializable

@Serializable
data class SomeDataClass(val a: Int)

// run me
fun main() {
    println(SomeDataClass.serializer())
}
