package com.borapocan.kattis

class Ostgotska {
}

fun main() {

    val input = readLine()!!.split(' ').map { it.toString() }

    val list = input.toList()

    val count = list.count { it.contains("ae") }

//    println(count)
//    println(list.size)

    if ((count.toDouble()/list.size.toDouble()) >= 40.0/100.0) {

        println("dae ae ju traeligt va")

    }else {

        println("haer talar vi rikssvenska")
    }

}