package com.borapocan.kattis

import java.text.DecimalFormat
import kotlin.math.roundToInt

class VideoSpeedUp {
}

fun main() {

    val (n,p,k) = readLine()!!.split(' ').map { it.toInt() }

    val y = readLine()!!.split(' ').map { it.toInt() }

    var s = 0

    var m = 1.0

    var ans = 0.0

    if (n == y.size) {

        for (i in y) {

            ans += (m * (i.toDouble() - s.toDouble()))

            s = i

            m += p / 100.0
        }

        ans += m * (k.toDouble() - s.toDouble())

        println(ans)

//        val dec = DecimalFormat("#.000")
//
//        println(dec.format(ans))

    }


}