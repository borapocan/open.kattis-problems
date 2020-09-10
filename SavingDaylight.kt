package com.borapocan.kattis

class SavingDaylight {
}

fun main() {

    while (true) {

        val input1 = readLine()!!.split(' ', ':').map { it.toString() }

        val timeH = input1[3].toInt()
        val timeM = input1[4].toInt()

//    println(timeH)
//    println(timeM)

        var sunH = input1[5].toInt()

        val sunM = input1[6].toInt()

        if (sunM - timeM < 0) {

            sunH -= 1

            val finalH = sunH - timeH

            val finalM = sunM + 60 - timeM

            println("${input1[0]} ${input1[1]} ${input1[2]} ${finalH} hours ${finalM} minutes ")

        } else {

            println("${input1[0]} ${input1[1]} ${input1[2]} ${sunH - timeH} hours ${sunM - timeM} minutes ")
        }

    }
}