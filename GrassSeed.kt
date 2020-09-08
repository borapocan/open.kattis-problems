package com.borapocan.kattis

import java.text.DecimalFormat

class GrassSeed {
}

fun main() {

    val cost = readLine()!!.toDouble()

    val numberOfLawns = readLine()!!.toInt()

    var area = 0.0

    for (i in 1..numberOfLawns) {

        val (w,l) = readLine()!!.split(' ').map { it.toDouble() }

        area += w * l
    }


    val output = area * cost

    println(DecimalFormat("#0.0000000").format(output))



}