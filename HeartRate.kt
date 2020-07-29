package com.borapocan.heartrate

class HeartRate {
}

fun main() {


    val input = readLine()!!.toInt()

    for (i in 1..input) {

        val bp = readLine()!!.split(' ')

        val b = bp[0].toInt()

        val p = bp[1].toDouble()

        val answer = 60 * b / p

        println("${answer - 60 / p} ${answer} ${answer + 60 / p}")

    }
}