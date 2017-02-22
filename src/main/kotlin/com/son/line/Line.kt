package com.son.line

/**
 * Created by son on 2/22/17.
 */
data class Line(val start: Point, val stop: Point) {
    fun doIntersect(other: Line): Boolean =
            (stop - start).cross(other.start - start) * (stop - start).cross(other.stop - start) <= 0.0f &&
                    (other.stop - other.start).cross(start - other.start) * (other.stop - other.start).cross(stop - other.start) <= 0.0f

    fun doIntersect(lines: Iterable<Line>) = lines.any { it.doIntersect(this) }
}

