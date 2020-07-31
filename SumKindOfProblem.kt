package com.borapocan.heartrate

class SumKindOfProblem {
}

fun main() {

    val p = readLine()!!.toInt()

    if (p in 1..10000) {

        for (k in 1..p) {

            val input = readLine()!!.split(' ').map { it.toInt() }

            val n = input[1]

            if (n in 1..10000) {

                val pos = ((n * (n + 1)) / 2)

                val even = (n * (n + 1))

                val odd = ((n * (n + 1)) - n)

                println("$k $pos $odd $even")

            }

        }

    }

}