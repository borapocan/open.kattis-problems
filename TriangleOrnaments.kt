package com.borapocan.kattis

import kotlin.math.abs
import kotlin.math.atan

class TriangleOrnaments {
}

fun main() {

    val n = readLine()!!.toInt()

    var output = 0.0

    for (i in 1..n) {

        val st = readLine()!!.split(' ').map { it.toInt() }

        var A = st[0].toDouble(); var B = st[1].toDouble(); var C = st[2].toDouble()

        if (A < B) {

            val temp = A

            A = B

            B = temp

        }

        /* val c = Math.acos((A*A + B*B - C*C) / (2*A*B))*/

        val b = Math.acos((A*A + C*C - B*B) / (2*A*C))

        val bx = A * Math.cos(b) + 100

        val by = A * Math.sin(b)

        val Ox = (0 + bx + C + 200) / 3

        val Oy = (0 + by + 0) / 3

        val newAngle = Math.PI / 2 - b

        val degChange = newAngle - atan(abs(Ox - bx) / abs(Oy - by))

        val v = Math.abs(A * Math.sin(degChange))

        output += (v * 2)

    }

    println(output)
}