package com.borapocan.kattis

fun main() {

    var count = 0

    while (true) {

        count ++

        val input = readLine()!!.split(' ').map { it.toInt() }

        val list = input.toMutableList()

        val list2 = list - list.first()

        if (input[0] == input.size - 1 && 1 <= input[0] && input[0] <= 30) {

            println("Case $count: ${list2.min()} ${list2.max()} ${list2.max()!! - list2.min()!!}")

        }

    }

}