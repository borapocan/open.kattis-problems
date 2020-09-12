package com.borapocan.kattis

fun main() {

    val abcd = readLine()!!.split(' ').map { it.toInt() }

    val listSorted = abcd.sorted()

    println(listSorted[0] * listSorted[2])

}