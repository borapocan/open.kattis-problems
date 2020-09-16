package com.borapocan.kattis

fun main() {

    val (a,b,c) = readLine()!!.split(' ').map { it.toInt() }

    val diff1 = b - a; val diff2 = c - b

    if (diff1 < diff2) {

        println(diff2 - 1)

    }else {

        println(diff1 - 1)
    }
    
}