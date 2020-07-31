package com.borapocan.heartrate

class SodaSlurper {
}

fun main() {


    val input = readLine()!!.split(' ').map { it.toInt() }

    var e = input[0]

    val f = input[1]

    val c = input[2]

    var sum = 0

    e += f

    while (e >= c) {

        val newSodas = e / c

        val remainEmpty = e % c

        sum += newSodas

        e = newSodas + remainEmpty
    }

    println(sum)
    
}