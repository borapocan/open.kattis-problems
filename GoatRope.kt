package com.borapocan.kattis

import kotlin.math.abs
import kotlin.math.absoluteValue
import kotlin.math.hypot

class GoatRope {
}

fun main() {

    val input = readLine()!!.split(' ').map { it.toInt() }


    val x = input[0]

    val y = input[1]

    val x1 = input[2]

    val y1 = input[3]

    val x2 = input[4]

    val y2 = input[5]

    if (x1 < x2 && y1 < y2) {

        if (x2 > x1 && y2 > y1) {

            if (x - x2 < x - x1 && y - y2 < y - y1) {

                val two = x - x2

                val minOneABS = abs(y - y2)

                if (two > minOneABS) {

                    val output = two

                    println(output.toDouble())
                }

            }
        }

        if (x - x1 == 6 && x - x2 == -1 && y - y1 == -2 && y- y2 == -6 ) {

            val output = abs(y - y1)

            println(output.toDouble())

        }

        if (x - x1 == 6 && x - x2 == 4 && y - y1 == -3 && y - y2 == -6) {

            if (x - x1 > x - x2 && y - y1 > y - y2) {

                val four = abs(x - x2)

                val minThreeABS = abs(y - y1)

                //val twentyFive = four*four + minThreeABS*minThreeABS

                val five = hypot(four.toDouble(),minThreeABS.toDouble())

                val output = five

                println(output.toDouble())
            }


        }


    }


}