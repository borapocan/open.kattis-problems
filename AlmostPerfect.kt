package com.borapocan.kattis

fun main(args: Array<String>) {

    while (true) {

        val p = readLine()!!.toInt()

        val list = arrayListOf<Int>()

        for (i in 1..p) {

            if (p % i == 0 && i != p) {

                list.add(i)

            }

        }

        if (list.sum() == p) {

            println("$p perfect")

        } else if (list.sum() == p + 2 || list.sum() == p - 2) {

            println("$p almost perfect")

        } else {

            println("$p not perfect")

        }

    }

}