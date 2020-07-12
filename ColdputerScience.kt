package com.borapocan.cold_puterscience

class ColdPuterScience {
}

fun main(args: Array<String>) {

    val input = readLine()!!.toInt()

    val temp = readLine()!!.split(' ').map { it.toInt() }

    var lessThanZero = 0

    for (i in 0 until input) {


        if (temp[i] < 0) {

            lessThanZero++

        }

    }

    println(lessThanZero)

}