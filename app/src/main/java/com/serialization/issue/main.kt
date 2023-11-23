package com.serialization.issue

import kotlinx.serialization.Serializable

@Serializable
data class SomeDataClass(val a: Int)

// remember to build project before running main
fun main() {
    println(SomeDataClass.serializer())
}
