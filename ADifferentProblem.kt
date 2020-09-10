package com.borapocan.kattis

import java.util.*
import kotlin.math.abs

class DifferentProblem {
}

fun main() {

    val sc = Scanner(System.`in`)

    while (sc.hasNextLong()) {

        println(abs(sc.nextLong() - sc.nextLong()))

    }

//    while (true) {
//
//        val input = readLine()!!.split(' ').map { it.toInt() }
//
//        val first = input[0].toLong()
//
//        val second = input[1].toLong()
//
//        val result = first - second
//
//        if (result > 0) {
//
//            println(result.toInt())
//
//        }else {
//
//            println(abs(result).toInt())
//        }
//
//    }

}