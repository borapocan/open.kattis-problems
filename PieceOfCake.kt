package com.borapocan.pieceofcake

import kotlin.math.absoluteValue
import kotlin.math.max

class PieceOfCake {
}

fun main(args: Array<String>) {


    val (n, h, v) = readLine()!!.split(' ').map { it.toInt() }

    val depth = 4

    val slice1 = h * v

    val slice2 = h * (n-v)

    val slice3 = v * (n-h)

    val slice4 = (n-h) * (n-v)

    val square = arrayListOf<Int>(slice1,slice2,slice3,slice4)

    println(square.max()!!.times(depth))


}