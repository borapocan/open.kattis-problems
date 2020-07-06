package com.borapocan.stuckinatimeloop

class StuckInATimeLoop {
}
fun main(args: Array<String>) {

    val n = readLine()!!.toInt()

    for (i in 1..n) {

        println("$i Abracadabra")

        if (i == 101) {

            break

        }

    }

}