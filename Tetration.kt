package com.borapocan.heartrate

import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.pow
import kotlin.math.round
import kotlin.math.E

class Tetration {}


fun main() {

    val numb = readLine()!!.toDouble()

    if (numb in 1/E..E) {


        val round = numb.pow(1/numb)

        val output = BigDecimal(round).setScale(6, RoundingMode.HALF_EVEN)

        println(output)

    }


}




