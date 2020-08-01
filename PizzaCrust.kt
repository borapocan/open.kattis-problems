package com.borapocan.kattis

import kotlin.math.PI
import kotlin.math.pow

class PizzaCrust {
}

fun main() {

    val rc = readLine()!!.split(' ').map { it.toInt() }

    val r = rc[0]

    val c = rc[1]

    val full = PI * r * r

    val inner = PI * (r-c) * (r-c)

    println(100 * (inner / full))


}