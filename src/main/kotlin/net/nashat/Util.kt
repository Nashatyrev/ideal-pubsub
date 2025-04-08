package net.nashat

fun <T : Comparable<T>> max(a: T, b: T): T {
    return if (a >= b) a else b
}
