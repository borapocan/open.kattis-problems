package com.borapocan.bijele


class Bijele {}

fun main(args: Array<String>) {


    val chessPieces = readLine()!!.split(' ').map { it.toInt() }

    val king = 1 - chessPieces[0]

    val queen = 1 - chessPieces[1]

    val rooks = 2 - chessPieces[2]

    val bishops = 2 - chessPieces[3]

    val knights = 2 - chessPieces[4]

    val pawns = 8 - chessPieces[5]


    println("$king $queen $rooks $bishops $knights $pawns")


}








