package com.borapocan.sibice


class Sibice {
}
fun main(args: Array<String>) {

    val (N,W,H) = readLine()!!.split(' ').map { it.toInt() }

    for (i in 1..N) {

        val n = readLine()!!.toInt()

        val hypotenuse = (W*W + H*H)/n

        if (n <= W || n <= H || hypotenuse >= n) {

            println("DA")

        }else{

            println("NE")

        }

    }

}