package com.borapocan.kattis

fun main() {

    val input = readLine()!!

    val checked = arrayListOf<String>()

    for (i in input.indices) {

        if (checked.contains(input.substring(i, i + 1))) {

            checked.removeAt(checked.indexOf(input.substring(i,i + 1)))

        }else {

            checked.add(input.substring(i, i + 1))

        }

    }

    if (checked.size == 0) {

        println(0)

    }else {

        println(checked.size - 1)

    }

}