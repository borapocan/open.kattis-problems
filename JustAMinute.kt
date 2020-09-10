package com.borapocan.kattis

class JustAMinute {
}

fun main() {

    val n = readLine()!!.toInt()

    var s = 0
    var m = 0

    for (i in 1..n) {

        val MS = readLine()!!.split(' ').map { it.toInt() }

        val M = MS[0]

        val S = MS[1]

        s += S

        m += M

//        println(m)
//        println(s)

        val output = s.toDouble() / (m.toDouble() * 60.0)

        if (output <= 1) {

            println("measurement error")

        }else {

            println(output)
        }

    }

}