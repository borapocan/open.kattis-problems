package com.borapocan.heartrate

class MixedFractions {
}

fun main() {

    while (true) {

        val input = readLine()!!.split(' ').map { it.toInt() }

//        val numerator = input[0]
//
//        val denumerator = input[1]

//        val fraction = numerator / denumerator
//
//        val remain = numerator % denumerator


        if (input[0] == 0) {


            break


        }

//        println("${fraction} ${remain} / ${denumerator}")
        println("${input[0] / input[1]} ${input[0] % input[1]} / ${input[1]}")

    }



}