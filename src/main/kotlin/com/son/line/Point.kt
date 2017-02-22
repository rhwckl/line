package com.son.line

/**
 * Created by son on 2/22/17.
 */
data class Point(val x: Float, val y: Float) {
    fun cross(other: Point): Float = x * other.y - y * other.x

    operator fun plus(other: Point): Point = Point(x + other.x, y + other.y)
    operator fun minus(other: Point): Point = Point(x - other.x, y - other.y)
}

