package com.borapocan.kattis

import java.text.DecimalFormat

fun main() {

    val radius = readLine()!!.toInt()

    val euclidian = Math.PI * radius.toDouble() * radius.toDouble()

    val taxicab = (radius.toDouble() * radius.toDouble()) * 2.0

    println(DecimalFormat("#0.000000").format(euclidian))

    println(DecimalFormat("#0.000000").format(taxicab))
}