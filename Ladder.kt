package com.borapocan.ladder

import kotlin.math.*

class Ladder {
}

fun main(args: Array<String>) {

    val (h, v) = readLine()!!.split(' ').map { it.toDouble() }

    val answer = Math.ceil(h / Math.sin(Math.toRadians(v)))

    println(answer.toInt())


}