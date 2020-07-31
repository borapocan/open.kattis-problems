package com.borapocan.heartrate

class Soylent {
}

fun main() {

    val t = readLine()!!.toInt()

    for (i in 0 until t) {

        val n = readLine()!!.toInt()

        if (n % 400 != 0) {

            println((n / 400) + 1)

        } else {

            println(n / 400)

        }

    }

}
