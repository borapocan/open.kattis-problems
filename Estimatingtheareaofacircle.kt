package com.borapocan.kattis

fun main() {


    while (true) {

        val (r,m,c) = readLine()!!.split(' ').map { it.toDouble() }

        if (r.toInt() == 0 && m.toInt() == 0 && c.toInt() == 0) break

        val area = Math.PI * r * r

        val estimatedArea = ((c * 2 * r * 2 * r) / m)

        println("$area $estimatedArea")


    }
}