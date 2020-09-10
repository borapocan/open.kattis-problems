package com.borapocan.kattis

import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.math.min

class Sok {
}

fun main() {

    val ABC = readLine()!!.split(' ').map { it.toInt() }

    val A = ABC[0].toDouble()
    val B = ABC[1].toDouble()
    val C = ABC[2].toDouble()

    val IJK = readLine()!!.split(' ').map { it.toInt() }

    val I = IJK[0].toDouble()
    val J = IJK[1].toDouble()
    val K = IJK[2].toDouble()

    val ratio = arrayListOf<Double>(A/I,B/J,C/K)

    val minRatio = ratio.min()!!.toDouble()


    val leftovers = arrayListOf<Double>((A - (minRatio!! * I)),(B - (minRatio!! * J)),(C - (minRatio!! * K)))

    println("${leftovers[0]} ${leftovers[1]} ${leftovers[2]}")
}