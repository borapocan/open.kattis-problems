package com.borapocan.kattis

import java.lang.Math.floor
import java.lang.Math.pow



class Crne {
}

fun main() {

    var input = readLine()!!.toInt()

    if (input in 1..1000000000) {

        if (input % 2 == 0) {

            input += 2

            input = floor(input.toDouble() / 2.0).toInt()

            input *= input

        } else {

            input += 3

            input = floor(input.toDouble() / 2.0).toInt()

            input = (input * input) - input

        }

        println(input)

    }

}