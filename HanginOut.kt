package com.borapocan.kattis

fun main() {

    val (l,n) = readLine()!!.split(' ').map { it.toInt() }

    var deny = 0

    var total = 0

    for (i in 1..n) {

        val move = readLine()!!.split(' ')

        if (move[0] == "enter") {

            if (total + move[1].toInt() > l) {

                deny ++

            }else {

                total += move[1].toInt()

            }

        }else if (move[0] == "leave") {

            total -= move[1].toInt()

        }

    }

    println(deny)
}