package com.borapocan.kattis

fun main() {

    val input = readLine()!!.toInt()

    when (input % 4) {

        0 -> { println("Even") }

        2 -> { println("Odd") }

        else -> { println("Either") }

    }

}