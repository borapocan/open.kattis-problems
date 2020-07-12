package com.borapocan.fizzbuzz

class FizzBuzz {
}

fun main(args: Array<String>) {

    var input = readLine()!!.split(' ').map { it.toInt() }

    val x = input[0]

    val y = input[1]

    val n = input[2]

    for (i in 1..n) {

        if  (i % x == 0 && i % y == 0) println("FizzBuzz")

        else if (i % y == 0) println("Buzz")

        else if (i % x == 0) println("Fizz")

        else println(i)

    }

}