package com.droidyue.kdroidext.jvm.type

fun <T> Any.asType(): T? {
    return (this as? T)
}
