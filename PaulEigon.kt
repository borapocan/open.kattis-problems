package com.borapocan.kattis

import kotlin.math.floor

class Floor {
}

fun main() {

    val NPQ = readLine()!!.split(' ').map { it.toInt() }

    val N = NPQ[0]
    val P = NPQ[1]
    val Q = NPQ[2]

    if ((( P + Q ) / N ) % 2 == 0) {

        println("paul")

    }else {

        println("opponent")

    }

}