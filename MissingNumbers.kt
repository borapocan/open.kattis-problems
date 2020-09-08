package com.borapocan.kattis

fun main() {

    val n = readLine()!!.toInt()

    val list = arrayListOf<Int>()

    for (i in 1..n) {

        val input = readLine()!!.toInt()

        list.add(input)
    }

    val orderList = (1..list.max()!!).toList()

    if (list.sorted() == orderList) {

        println("good job")

    }else {

        val output = orderList - list

        for (i in output.sorted()) println(i)

        
    }

}