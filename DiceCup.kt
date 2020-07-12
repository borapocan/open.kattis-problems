package com.borapocan.dicecup

class DiceCup {
}
fun main(args: Array<String>) {

    val (a, b) = readLine()!!.split(' ').map(String::toInt)

    if (a >= b) {

        for (i in b + 1..a + 1) {

            print("$i\n")

        }

    } else {

        for (i in a + 1..b + 1) {

            print("$i\n")

        }

    }

}

