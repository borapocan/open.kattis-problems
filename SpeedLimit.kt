package com.borapocan.speedlimit

class SpeedLimit {
}

fun main(args: Array<String>) {

    var n = readLine()!!.toInt()

    while (n != -1) {

        val s = readLine()!!.split(" ").map { it.toInt() }

        var total = s[0] * s[1]

        var firstTime = s[1]

        for (q in 1 until n) {

            val s = readLine()!!.split(' ').map { it.toInt() }

            total += s[0] * (s[1]- firstTime)

            firstTime = s[1]

        }

        println("$total miles")

        n = readLine()!!.toInt()

    }


}