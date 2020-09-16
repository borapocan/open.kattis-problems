package com.borapocan.kattis

fun main() {

    val n = readLine()!!.toInt()

    for (i in 1..n) {

        var (p,b,k) = readLine()!!.split(' ').map { it.toInt() }

        var ssd = 0

        while (k > 0) {

            ssd += (k % b) * (k % b)

            k /= b
        }

        println("$p $ssd")
        
    }


}