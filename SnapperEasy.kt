package com.borapocan.kattis

class SnapperEasy {
}

fun main() {

    val times = readLine()!!.toInt()

    var count = 0

    for (i in 1..times) {

        count += 1

        val input = readLine()!!.split(' ').map { it.toInt() }

        val n = input[0]

        var k = input[1]

        val on = k % 2 == 1

        for (j in 1..n) {

            k /= 2

        }

        if (on == true) {

            println("Case #$count: ON")

        }else {

            println("Case #$count: OFF")
        }



    }

}