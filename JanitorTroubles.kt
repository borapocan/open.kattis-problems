package com.borapocan.janitortroubles

import kotlin.math.abs
import kotlin.math.sqrt

class JanitorTroubles {
}

fun main(args: Array<String>) {


    val input = readLine()!!.split(' ').map { it.toInt() }

    val s1 = input[0]
    val s2 = input[1]
    val s3 = input[2]
    val s4 = input[3]

    val siList = arrayOf(s1,s2,s3,s4)

    val si = siList.random()

    if (2 * si < s1 + s2 + s3 + s4) {

        val semiperimeter = ((s1 + s2 + s3 + s4).toDouble() / 2)

        val semi1 = abs(semiperimeter - s1)

        val semi2 = abs(semiperimeter - s2)

        val semi3 = abs(semiperimeter - s3)

        val semi4 = abs(semiperimeter - s4)

        val output = Math.sqrt(semi1 * semi2 * semi3 * semi4)

        if (s1 == s2 && s2 == s3 && s3 == s4) println(output.toInt()) else println(output)

    }




}