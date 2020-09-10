package com.borapocan.kattis

class APrizeNoOneCanWin

fun main() {

    fun List<Int>.markForSale(minCost: Int) : Int {

        val items = sorted()

        val noItems = items.size

        for (i in 1..noItems) {

            if (items[i] + items[i - 1] > minCost) {

                return i
            }

        }

        return noItems
    }

    val data = readLine()!!.split(' ').map { it.toInt() }

    val n = data[0]

    val minCost = data[1]

    val itemsInp = readLine()!!.split(' ').map { it.toInt() }

    val items = itemsInp.toList()

    if (items.size == n) {

        println(items.markForSale(minCost))
    }


}