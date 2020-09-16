package com.borapocan.kattis

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {

    while (true) {

        val (a,b,c) = readLine()!!.split(' ').map { it.toBigDecimal()}

        println(a.divide(b, c.toInt() + 1, RoundingMode.DOWN).setScale(c.toInt(), RoundingMode.DOWN))

    }
    
}